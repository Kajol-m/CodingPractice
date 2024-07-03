// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.*;
class HelloWorld {
    public static int reverse(int num){
        int rev=0;
        while(num!=0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        return rev;
    }
    public static int oddeven(int dice,int num){
        
        num=Integer.reverse(num);
        int sumOdd=0,sumEven=0;
        int i=0;
        while(num>0){
            if(i%2==0){
                sumOdd+=num%10;
                num=num/10;
                i++;
            }
            else{
                sumEven+=num%10;
                num=num/10;
                i++;
            }
        }
        if(dice%2==0){
            return sumOdd;
        }
        else{
            return sumEven;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dice=sc.nextInt();
        int num=sc.nextInt();
        System.out.println(oddeven(dice,num));
    }
}
