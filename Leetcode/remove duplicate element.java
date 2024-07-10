class Solution {
    public int removeDuplicates(int[] a) {
        int curr=0;
        int prev=a[0];
        int count=1;
        int j=1;
        for(int i=1;i<a.length;i++){
            curr=a[i];
            if(curr!=prev){
                int temp=a[j];
                a[j++]=curr;
                a[i]=temp;
                prev=curr;
                count+=1;
            }
        }
        return count;
    }
}

//doesn't create a new array, the solution takes the distinct element in the begining of array and return "k"-the unique elements. The hidden code conversts the other values of indexex to underscore so it doesn't actually matters.
