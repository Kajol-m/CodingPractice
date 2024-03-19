package ArrayQuestion;
import java.util.*;

public class printingSubsets {
	
	public static List<ArrayList<Integer>> calcSubset(int[] a,List<ArrayList<Integer>> res,List<Integer> subset,int index){
		
		res.add(new ArrayList<>(subset));
		//Adds the current subset to the result
		
		for(int i=index;i<a.length;i++) {
			subset.add(a[i]);
			
			calcSubset(a,res,subset,i+1);
			
			subset.remove(subset.size()-1);
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		List<ArrayList<Integer>> res =new ArrayList<ArrayList<Integer>>();
		List<Integer> subset=new ArrayList<>();
		System.out.println(calcSubset(a,res,subset,0));
			

	}

}
