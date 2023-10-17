import java.io.*;
import java.util.*;


 class Solution{   
 
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String ip=sc.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }
    }
}
    
    class MyRegex{
        String num="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";//Regex Character classes
        String pattern=num+"."+num+"."+num+"."+num;        
}

