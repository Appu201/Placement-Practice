package Array;

import java.util.Scanner;
import java.util.Arrays;

public class NoOfEvenOdd {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int ce=0,co=0;
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	     for(int i=0;i<n;i++){
	         if(a[i]%2==0){
	             ce++;
	         }
	         else {
	             co++;
	         }
	     }
	     System.out.println(ce);
	     System.out.println(co);
	}
}
