package javalab;

import java.util.Scanner;

public class studentEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for Math, Physics, and Chemistry
        System.out.print("Enter marks for Math: ");
        int math = scanner.nextInt();

        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();

        // Calculate total marks
        int total = math + physics + chemistry;

        // Check eligibility conditions
        boolean condition1 = (math >= 60) && (physics >= 50) && (chemistry >= 40) && (total >= 200);
        boolean condition2 = (math + physics) >= 150;

        // Determine eligibility
        if (condition1 || condition2) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        // Close the scanner
        scanner.close();
    }
}