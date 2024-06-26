class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        ArrayList<Character> a=new ArrayList<Character>();
        a.add('(');a.add('{');a.add('[');
        ArrayList<Character> b=new ArrayList<Character>();
        b.add(')');b.add('}');b.add(']');
        HashMap<Character,Character> map=new HashMap<Character,Character>();
        map.put(']','[');map.put(')','(');map.put('}','{');
        char prev='\0';
        if(s.length()%2!=0){
            return false;
        }
        else{
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(a.contains(ch)){
                stack.add(ch);
                prev=ch;
            }
            else{
                int n=stack.size();
                if(n==0 || map.get(ch)!=stack.get(n-1)){
                    return false;
                }
                else{
                    stack.pop();
                    if(i>=2){
                        prev=s.charAt(i-2);
                    }
                }
            }
        }
        }
        if(stack.size()==0){
            return true;
        }
        else{return false;}
        
    }
}
