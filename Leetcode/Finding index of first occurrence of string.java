class Solution {
    public int strStr(String h, String ne) {
        int n=h.length();
        int m=ne.length();
        if(m == 0) return 0;
        for(int i=0; i<=n-m; i++){
            int j=0;
            while(j<m){
                if(h.charAt(i+j) != ne.charAt(j)){
                    break;
                }
                j++;
            }
            if(j == m){
                return i;
            }
        }
        return -1;
    }
}
