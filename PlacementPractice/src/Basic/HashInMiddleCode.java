package Basic;

import java.util.Scanner;

public class HashInMiddleCode {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int row,col;
	    for(row=0;row<n;row++){
	        for(col=0;col<=row;col++){
	           System.out.print("*"); 
	        }
	        for(col=0;col<n-1-row;col++){
	           System.out.print("#"); 
	        }
	        for(col=0;col<=row;col++){
	           System.out.print("*"); 
	        }
	        System.out.println();
	        }
	   }
}


