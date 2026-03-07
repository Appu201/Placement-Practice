package Patterns;

import java.util.Scanner;

public class Pattern1357 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<n;row++){
        	for(int col=0;col<(2*row-1);col++){
        			System.out.print("*");
        	}
        	System.out.println();
        }
	}
}
