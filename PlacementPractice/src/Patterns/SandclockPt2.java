package Patterns;

public class SandclockPt2 {
	    public static void main(String[] args) {
	        int n = 5;

	        for (int row = 0; row < n; row++) {
	            for (int col = 0; col < row; col++) {
	                System.out.print("#");
	            }
	            for (int col = 0; col < 2 * (n - row) - 1; col++) {
	                System.out.print("*");
	            }
	            for (int col = 0; col < row; col++) {
	                System.out.print("#");
	            }
	            System.out.println();
	        }

	        for (int row = n - 2; row >= 0; row--) {
	            for (int col = 0; col < row; col++) {
	                System.out.print("#");
	            }
	            for (int col = 0; col < 2 * (n - row) - 1; col++) {
	                System.out.print("*");
	            }
	            for (int col = 0; col < row; col++) {
	                System.out.print("#");
	            }
	            System.out.println();
	        }
	    }
	}

