import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       String namePattern = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
        Pattern userPattern = Pattern.compile(namePattern);

        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        for(int i = 0; i < totalNumbers +1; i++) {
            String username = sc.nextLine();

            Matcher validName = userPattern.matcher(username);
            boolean isValidUsername = validName.matches();

            if (isValidUsername && i != 0){
                System.out.println("Valid");
            } else if(i!=0){
                System.out.println("Invalid");
            }
        }


    }
}

