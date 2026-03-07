package Basic;
import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num:");
		int num = sc.nextInt();
		int org=num;
		int rev=0, dig=0;
		while(num!=0) {
			dig = num%10;
			rev= rev*10+dig;
			num/=10;
		}
		if(rev==org) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
}
