package ArrayQuestion;

public class shiftRight {
	
	public static void shift(int ar[],int k) {
		k%=ar.length;
		reverse(ar,0,ar.length-1);
		reverse(ar,0,k-1);
		reverse(ar,k,ar.length-1);
	}
	
	public static void reverse(int [] ar,int start,int end) {
		while(start<end) {
			int temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,3,4,5,6};
		int k=2;
		shift(ar,k);
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
