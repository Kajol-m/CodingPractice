import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>(n);
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            ArrayList<Integer> ar=new ArrayList<>(d);
            for(int j=0;j<d;j++){
                ar.add(sc.nextInt());
            }
            a.add(ar);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if((x<0 || x> a.size()) || (y<0 || y> a.get(x-1).size())){ 
                System.out.println("ERROR!");
            }
            else{
                System.out.println(a.get(x-1).get(y-1));
            }
            
            
        }
        
    }
}
