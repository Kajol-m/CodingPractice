package ArrayQuestion;

public class reverseArray {
	
	public static void reverse(int[] ar) {
		int n=ar.length-1;
		int a=0;
		while(a<n) {
			int temp=ar[a];
			ar[a]=ar[n];
			ar[n]=temp;
			a++;
			n--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,4,5};
		reverse(ar);
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		

	}

}
