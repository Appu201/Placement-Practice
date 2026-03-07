package Array;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int s=0;
	    int e=n-1;
	    int temp=0;
	    while(s<e){
	        temp=a[s];
	        a[s]=a[e];
	        a[e]=temp;
	        s++;
	        e--;
	    }
	    for(int i=0;i<n;i++){
	    	System.out.print(a[i]+" "); 
	    }
	}
}