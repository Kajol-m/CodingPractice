// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class HelloWorld {
    public static boolean isPalindrome(String s) {
        int n=s.length();
        if(s==""){
            return true;
        }
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static int noPalindrome(String name){
        char one='1';
        char zero='0';
        int count=0;
        ArrayList<Integer> index=new ArrayList<>();
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='?'){
                name=name.replace('?',zero);
                index.add(i);
            }
        }
        int j=0;
        while(isPalindrome(name)==true && j<index.size()){
            int in=index.get(j);
            name=name.replace(name.charAt(in),one);
              count++;
              j++;
        }
        return count;
    }
    public static void main(String[] args) {
        String name="1001??1";
        int res=noPalindrome(name);
        System.out.println(res);
    }
}
