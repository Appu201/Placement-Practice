package Basic;

import java.util.Scanner;

public class CharOfAscii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

        if (n < 0 || n > 255) { // from 32 to 126 visible
            System.out.print("Invalid Ascii Value");
        } 
        else {
            System.out.print((char) n);
        }
    }
}