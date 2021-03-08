package com.R177219104.q1;
import java.util.Scanner;
public class combination {
	public static void main(String[] args) {
		int a,b,c;
            Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number between 0-9");
            a=sc.nextInt();
           if(a>9) {
        	   System.out.println("Invalid Input");
               System.exit(a);
           }
		System.out.println("Enter 2nd Number between 0-9");
             b=sc.nextInt();
             if(b>9) {
          	   System.out.println("Invalid Input");
                 System.exit(b);
             }
		System.out.println("Enter 3rd Number between 0-9");
            c=sc.nextInt();
            if(c>9) {
         	   System.out.println("Invalid Input");
                System.exit(c);
            }
        int arr[]= {a,b,c};
        for (int i = 0; i < 3; i++) {
        	   for (int j = 0; j < 3; j++) {
        	    for (int k = 0; k < 3; k++) {
        	     if (i != j && j != k && k != i) {
        	      System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
        	     }
        	    }
        	   }
        	  }
        	 
     sc.close();        
	}
}