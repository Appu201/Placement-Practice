package Basic;

import java.util.Scanner;

public class HiHello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        int n = sc.nextInt();                // Read an integer

        if ((n % 3 == 0) && (n % 5 != 0))
            System.out.println("Hi");
        else if ((n % 3 != 0) && (n % 5 == 0))
            System.out.println("Hello");
        else if ((n % 3 == 0) && (n % 5 == 0))
            System.out.println("HiHello");
        else
            System.out.println("Neither divisible by 3 nor 5");
    }
}
