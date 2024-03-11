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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    
    for (int i = 0; i < arr.size(); i++) {
        int sum = 0;
        for (int j = 0; j < arr.size(); j++) {
            if (j != i) {
                sum += arr.get(j);
            }
        }
        if (sum > max) {
            max = sum;
        }
        if (sum < min) {
            min = sum;
        }
    }
    System.out.print(min);
    System.out.print(" ");
    System.out.print(max);
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
