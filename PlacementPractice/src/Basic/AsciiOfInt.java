package Basic;

import java.util.Scanner;

public class AsciiOfInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch = (char)(n + '0');
		int ascii = (int)ch;
		System.out.println(ascii);
	}

}
