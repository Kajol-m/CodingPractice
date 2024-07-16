class Solution {
    public String reverseWords(String s) {
        String[] res = s.split(" ");
        String result = "";
        for(int i=res.length-1;i>=0;i--){
            if(!res[i].equals("")){
                result += res[i] + " ";
            }
        }
        return result.trim();
    }
}
//In:"a good   example"
//out:"example good a"
