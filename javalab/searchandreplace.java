package javalab;

import java.util.Scanner;

public class searchandreplace {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String original = sc.nextLine();
        System.out.print("Enter the pattern to search: ");
        String pattern = sc.nextLine();
        System.out.print("Enter the replacement string: ");
        String replacement = sc.nextLine();
        sc.close();
        String result = original.replaceAll(pattern, replacement);
        System.out.println("Modified string: " + result);
    }
}
