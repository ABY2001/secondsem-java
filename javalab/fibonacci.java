package javalab;

import java.util.Scanner;

public class fibonacci {
	

	public static void main(String[] args) {
		 System.out.println("Enter your limit:");
	        Scanner sc = new Scanner(System.in);
	        int limit = sc.nextInt();
	        sc.close();

	        int first = 0, second = 1;
	        
	        System.out.println("Fibonacci sequence up to " + limit + " terms:");
	        for (int i = 0; i < limit; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }
		
	}

}
