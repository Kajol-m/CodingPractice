import java.io.*;
import java.util.*;
import java.security.*;
import java.math.*;

public class Solution {
    
    public static String getMD5(String s){
        try{
          //Static geteInstance is called with hashing MD5
            MessageDigest md=MessageDigest.getInstance("MD5");

          //digest() is called to calculate message digest of input and resturns byte array
            byte[] messageDigest=md.digest(s.getBytes());

          //convert byte array to signum representation
            BigInteger no=new BigInteger(1,messageDigest);

          //convert message to hex value
            String hashtext=no.toString(16);
            while(hashtext.length()<32){
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
        System.out.println(getMD5(s));
    }
}
