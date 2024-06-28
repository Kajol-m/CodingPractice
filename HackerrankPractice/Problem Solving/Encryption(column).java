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

public static String encryption(String s) {
    s = s.replaceAll("\\s", "");
    int row = (int) Math.floor(Math.sqrt(s.length()));
    int column = (int) Math.ceil(Math.sqrt(s.length()));
    if((row*column)<s.length()){
        row=row+1;
    }

    ArrayList<ArrayList<Character>> mat = new ArrayList<>();
    for (int i = 0; i < row; i++) {
        mat.add(new ArrayList<>());
    }

    int k = 0;
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < column; j++) {
            if (k < s.length()) {
                char ch = s.charAt(k);
                mat.get(i).add(ch);
                k++;
            }
        }
    }

    String result = "";
    for (int l = 0; l < column; l++) {
        for (int m = 0; m < row; m++) {
            if (l < mat.get(m).size()) {
                char ch = mat.get(m).get(l);
                result = result + ch;
            }
        }
        result = result + " ";
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
