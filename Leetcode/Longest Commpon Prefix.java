class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String cPrefix = "";
        ArrayList<Character>[] a = new ArrayList[strs.length];
        for (int i = 0; i < strs.length; i++) {
            a[i] = new ArrayList<>();
            for (char c : strs[i].toCharArray()) {
                a[i].add(c);
            }
        }
        int minLength = a[0].size();
        for (int i = 1; i < a.length; i++) {
            minLength = Math.min(minLength, a[i].size());
        }
        for (int i = 0; i < minLength; i++) {
            char b = a[0].get(i);
            for (int j = 1; j < a.length; j++) {
                if (b != a[j].get(i)) {
                    return cPrefix;
                }
            }
            cPrefix += b;
        }
        return cPrefix;
    }
}
