package Array;

import java.util.Scanner;

public class FindDuplicates {    
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }

    System.out.println("Duplicate elements are:");

    for (int i = 0; i < n; i++) {
        boolean isDuplicate = false;

        for (int j = i + 1; j < n; j++) {
            if (a[i] == a[j]) {
                isDuplicate = true;
                break;
            }
        }

        boolean alreadyPrinted = false;
        
        for (int k = 0; k < i; k++) {
            if (a[i] == a[k]) {
                alreadyPrinted = true;
                break;
            }
        }

        if (isDuplicate && !alreadyPrinted) {
            System.out.println(a[i]);
        	}
    	}
	}
}

