/*class Solution {
    public String longestPalindrome(String s) {
        String substr=""; String finalsubstr="";
        int maxlen=0,k=0;
        //substr+=s.charAt(0);
        for(int i=0;i<s.length();i++){
            //int templen=substr.length();
            substr+=s.charAt(i);
            //if(templen<maxlen){
                String reversestr="";
                for(int j=0;j<substr.length();j++){
                    reversestr=substr.charAt(j)+reversestr;
                }
                if(substr.equals(reversestr)){
                    maxlen=substr.length();
                    finalsubstr=substr;
                }
                else{
                    substr=substr.substring(k);
                    
                    //finalsubstr=substr;
                }
            //}
        }
        return finalsubstr;
    }
}*/
class Solution {
    public String longestPalindrome(String s) {
        String substr = "";
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check for even length palindrome
            int j = i, k = i;
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                if (k - j + 1 > maxlen) {
                    substr = s.substring(j, k + 1);
                    maxlen = k - j + 1;
                }
                j--;
                k++;
            }

            // Check for odd length palindrome
            j = i;
            k = i + 1;
            while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
                if (k - j + 1 > maxlen) {
                    substr = s.substring(j, k + 1);
                    maxlen = k - j + 1;
                }
                j--;
                k++;
            }
        }
        return substr;
    }
}
/*
class Solution {

    int start = 0;
    int end = 0;

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        getString(chars, 0);
        return s.substring(start, end + 1);
    }

    public void getString(char[] chars, int i) {
        int left = i;
        int right = i;
        int n = chars.length;
        if (i >= n - 1 ) {
            return;
        }
        // 1. expand middle
        while (right < n - 1 && chars[right] == chars[right + 1]) {
            right++;
        }
        i = right;
        // 2. expand left and right
        while (left > 0 && right < n - 1 && chars[left - 1] == chars[right + 1]) {
            left--;
            right++;
        }
        if (right - left > end - start) {
            end = right;
            start = left;
        }
        getString(chars, i + 1);
    }
}*/
