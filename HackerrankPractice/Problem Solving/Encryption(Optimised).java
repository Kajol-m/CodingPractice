import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
    s = s.replaceAll("\\s", "");
    int row = (int) Math.floor(Math.sqrt(s.length()));
    int column = (int) Math.ceil(Math.sqrt(s.length()));
    if((row*column)<s.length()){
        row=row+1;
    }
    String result="";
    int k=0;
    for(int i=0;i<column;i++){
        for(int j=0;j<row;j++){
            if(k<s.length()){
                char ch=s.charAt(k);
                result=result+ch;
                k=k+column;
            }
        }
        k=i+1;
        result=result+" ";
    }
    return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
