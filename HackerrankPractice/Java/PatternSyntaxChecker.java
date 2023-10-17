import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class Solution {

    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
          try{
              Pattern p = Pattern.compile(pattern);
              System.out.println("Valid");
          }catch(Throwable t){
              System.out.println("Invalid");
          }
          testCases--;
      }
   }
}
