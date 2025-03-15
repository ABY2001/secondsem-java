package javalab;

import java.util.Scanner;

public class amstrong {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        sc.close();

	        int originalNum = num;
	        int sum = 0;
	        int length = String.valueOf(num).length();
	        while (num > 0) {
	            int digit = num % 10; 
	            sum += Math.pow(digit, length); 
	            num /= 10; 
	        }
	        if (sum == originalNum) {
	            System.out.println(originalNum + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNum + " is not an Armstrong number.");
	        }
	    }

}
