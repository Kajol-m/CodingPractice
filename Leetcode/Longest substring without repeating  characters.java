/*class Solution {
    public int lengthOfLongestSubstring(String s) {
        String substr="";
        int maxlen=0;
        substr=s.substring(0,1);
        for(int i=1;i<s.length()-1;i++){
            int n=substr.length();
            for(int j=0;j<n;j++){
                if((s.substring(i,i+1)).equals(substr.substring(j,j+1))){
                    substr=s.substring(i,i+1);
                }
                else{
                    substr+=s.substring(i,i+1);
                }
            }
        }
        return substr.length();

    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            String substr = "";
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!set.contains(c)) {
                    set.add(c);
                    substr += c;
                    maxlen = Math.max(maxlen, substr.length());
                } else {
                    break;
                }
            }
        }
        return maxlen;
    }
}
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // Try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
