import java.io.*;
import java.util.*;
import java.security.*;
import java.math.*;

public class Solution {
    public static String getSHA256(String s){
        try{
        MessageDigest md=MessageDigest.getInstance("SHA-256");
        
        byte[] calcmd=md.digest(s.getBytes());
        
        BigInteger no=new BigInteger(1,calcmd);
        
        String hashtext=no.toString(16);
        while(hashtext.length()<64){
            hashtext="0"+hashtext;
        }
        return hashtext;
    }
    
    catch(NoSuchAlgorithmException e){
        throw new RuntimeException(e);
    }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(getSHA256(s));
    }
}
