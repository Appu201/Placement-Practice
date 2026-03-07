package Loop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of terms: ");
	        int n = sc.nextInt();
	        for (int num = 2; num <= n; num++) {
	        	boolean isPrime = true;
	        	for (int div = 2; div <= num / 2; div++) {
	        		if (num % div == 0) {
	        			isPrime = false;
	        			break;
	        		}
	        	}
	        	if (isPrime) System.out.print(num + " ");
	        }
		}
}