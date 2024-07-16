class Solution {
    public String reverseWords(String s) {
        String[] res = s.split("\\s+");//\\s+ mathers one or more whitespace
        StringBuilder result = new StringBuilder();
        for(int i=res.length-1;i>=0;i--){
            result.append(res[i]).append(" ");
        }
        return result.toString().trim();
    }
}
