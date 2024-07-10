import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int i = 0;
        int minLength = Math.min(first.length(), last.length());
        for (i = 0; i < minLength; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
        }
        return first.substring(0, i);
    }
}
//match the prefix of first and last string.
