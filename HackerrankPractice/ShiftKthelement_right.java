package ArrayQuestion;
import java.util.*;

import java.util.Scanner;

public class ShiftKthelement_right {
	
	public static void rightshiftK(int[] a,int k) {
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length-k;i++) {
			b[i+k]=a[i];
		}
		int x=a.length;
		for(int i=0;i<k;i++) {
			b[i]=a[x-k];
			x++;
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value of K: ");
		int k=sc.nextInt();
		
		rightshiftK(a,k);

	}

}
