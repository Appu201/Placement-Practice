package Patterns;

import java.util.Scanner;

public class Pattern12345 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<n;row++){
        	for(int col=0;col<=row;col++){
        			System.out.print("*");
        	}
        	System.out.println();
        }
	}
}

//n=5
//row=0  col=0 0<=0  col=1  0<=1(x)
//row=1 col=0 0<=1 col=1 1<=1 col=2 2<=1(X)
//row=2 col=0 ....