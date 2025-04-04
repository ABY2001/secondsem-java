package javalab;

import java.util.Scanner;

public class palindrome {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        sc.close();
	        int originalNum = num;
	        int reversedNum = 0;
	        while (num > 0) {
	            int digit = num % 10; 
	            reversedNum = reversedNum * 10 + digit; 
	            num /= 10;
	        }
	        if (originalNum == reversedNum) {
	            System.out.println(originalNum + " is a Palindrome number.");
	        } else {
	            System.out.println(originalNum + " is not a Palindrome number.");
	        }
	    }

}
