package Patterns;

import java.util.Scanner;

public class Pattern5555512345 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int row,col;
	    for(row=0;row<n;row++){
	        for(col=0;col<=row;col++){
	           System.out.print("#"); 
	        }
	    for(col=0;col<n;col++){
	           System.out.print("*"); 
	        }
	        System.out.println();
	    }
	}
}
