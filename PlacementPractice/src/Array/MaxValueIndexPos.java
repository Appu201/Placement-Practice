package Array;

import java.util.Scanner;

public class MaxValueIndexPos {
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int max=Integer.MIN_VALUE;
	    int index=0,pos=0;
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        if(a[i]>max){
	            max=a[i];
	            index=i;
	            pos=i+1;
	        }
	    }
	        System.out.println(max);
	        System.out.println(index);
	        System.out.print(pos);
	    }
	}