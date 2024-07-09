class Solution {
    public boolean isPalindrome(int n) {
        int x=n;
        int rev=0;int rem=0;
        while(n>0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return (rev==x)? true:false;
    }
}
