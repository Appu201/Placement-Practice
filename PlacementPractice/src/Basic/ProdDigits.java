package Basic;
import java.util.Scanner;

public class ProdDigits {
	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num:");
		int num = sc.nextInt();
		int dig=0,prod=1;
		while(num!=0) {
			dig=num%10;
			prod*=dig;
			num/=10;
		}
	System.out.println(prod);
	}

}
