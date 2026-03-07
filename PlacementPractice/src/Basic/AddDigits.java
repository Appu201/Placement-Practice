package Basic;
	import java.util.Scanner;

public class AddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("num:");
		int num= sc.nextInt();
		int dig=0;

		while(num>=10) {
			int sum=0;
			while(num!=0) {
				dig = num%10;
				sum = sum+dig;
				num = num/10;
			}
			num = sum;
		}
		System.out.println(num);
	}
}
