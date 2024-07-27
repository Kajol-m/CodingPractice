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
/*
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
*/
