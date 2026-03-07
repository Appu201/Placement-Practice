package Array;

import java.util.Scanner;

public class MinValueIndexPos {
	public static void main(String[] args) {
		
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    int min=Integer.MAX_VALUE;
	    int index=0,pos=0;
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        if(a[i]<min){
	            min=a[i];
	            index=i;
	            pos=i+1;
	        }
	    }
	        System.out.println(min);
	        System.out.println(index);
	        System.out.print(pos);
	    }
	}
