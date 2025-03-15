package javalab;

import java.util.Scanner;

public class studentet {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter marks in Math: ");
	        int math = sc.nextInt();
	        System.out.print("Enter marks in Physics: ");
	        int physics = sc.nextInt();
	        System.out.print("Enter marks in Chemistry: ");
	        int chemistry = sc.nextInt();
	        sc.close();
	        int totalMarks = math + physics + chemistry;
	        int mathPhysicsTotal = math + physics;
	        if ((math >= 60 && physics >= 50 && chemistry >= 40 && totalMarks >= 200) || mathPhysicsTotal >= 150) {
	            System.out.println("The student is eligible.");
	        } else {
	            System.out.println("The student is not eligible.");
	        }

}
}
