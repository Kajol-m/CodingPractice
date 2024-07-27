class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[]=new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n && k<result.length){
            if(nums1[i]<nums2[j]){
                result[k++]=nums1[i];
                i++;
            }
            else{
               result[k++]=nums2[j];
               j++; 
            }
        }
        while(i<m && k<result.length){
            result[k++]=nums1[i];
            i++;
        }
        while(j<n && k<result.length){
            result[k++]=nums2[j];
            j++;
        }
        for(int l=0;l<nums1.length;l++){
            nums1[l]=result[l];
        }
    }
}
