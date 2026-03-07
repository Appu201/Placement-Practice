package Array;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int d = sc.nextInt();
        
        // Left rotation
        int[] leftRotated = new int[n];
        for (int i = 0; i < n; i++) {
            leftRotated[i] = arr[(i + d) % n];
        }
        for (int i = 0; i < n; i++) System.out.print(leftRotated[i] + " ");
        System.out.println();
        
        // Right rotation
        int[] rightRotated = new int[n];
        for (int i = 0; i < n; i++) {
            rightRotated[(i + d) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) System.out.print(rightRotated[i] + " ");
    }
}

