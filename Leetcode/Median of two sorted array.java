class Solution {
    public int[] merge(int[] L,int[] R){
		int[] arr=new int[R.length+L.length];
		int i=0,j=0;
		
		int k=0;
		
		while(i<L.length && j<R.length) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<L.length) {
			arr[k]=L[i];
			i++;
			k++;
		}
		
		while(j<R.length) {
			arr[k]=R[j];
			j++;
			k++;
		}
        return arr;
		
	}
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ar[]=merge(nums1,nums2);
        int n=ar.length;
        if(n%2==0){
            return (ar[n/2-1]+ar[n/2])/2.0;
        }
        else{
            return ar[n/2];
        }
        
    }
}
/* Merge and sort two sorted array and find,median.*/
