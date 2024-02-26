import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();//used to consume newLine by nextInt()
        Map<String,Integer> m=new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            String na=sc.nextLine();
            int ph=sc.nextInt();
            sc.nextLine();//used to consume newLine by nextInt()
            m.put(na,ph);
        }
        while(sc.hasNext()) {
            String s = sc.nextLine();
            if (m.containsKey(s)) {
                System.out.println(s + "=" + m.get(s));
            } else {
                System.out.println("Not found");
            }
    }
    }
}
