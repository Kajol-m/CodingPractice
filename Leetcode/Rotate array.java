class Solution {
    public static void reverse(int [] ar,int start,int end) {
		while(start<end) {
			int temp=ar[start];
			ar[start]=ar[end];
			ar[end]=temp;
			start++;
			end--;
		}
	}
    public void rotate(int[] ar, int k) {
        k%=ar.length;
		reverse(ar,0,ar.length-1);
		reverse(ar,0,k-1);
		reverse(ar,k,ar.length-1);
}
}
