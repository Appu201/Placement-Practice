package Patterns;

import java.util.Scanner;

public class Pattern55555 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=0;row<n;row++){
        	for(int col=0;col<n;col++){
        			System.out.print("*");
        	}
        	System.out.println();
        }
	}
}


//n=5
//row=0 0<5 col=0 0<5 col=1 1<5 col=3 2<5 col=4 3<5 col=5 4<5 5<5 x
//row=1 0<5 col=0 0<5 col=1 1<5 col=3 2<5 col=4 3<5 col=5 4<5 
//row=2 0<5 col=0 0<5 col=1 1<5 col=3 2<5 col=4 3<5 col=5 4<5 
//row=3 0<5 col=0 0<5 col=1 1<5 col=3 2<5 col=4 3<5 col=5 4<5 
//row=4 0<5 col=0 0<5 col=1 1<5 col=3 2<5 col=4 3<5 col=5 4<5 
// row=5 5<5 x