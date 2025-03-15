package javalab;
import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		System.out.println("Enter your marks");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
	    if(marks >=90) {
	    	System.out.println("Excellent work!");
	    	System.out.println("GRADE: A");
	    } else if(marks >80 && marks <90) {
	    	System.out.println("Good job!");
	    	System.out.println("GRADE:B");
	    } else if(marks >70 && marks <79) {
	    	System.out.println("You can do better");
	    	System.out.println("C");
	    } else if(marks >60 && marks <69) {
	    	System.out.println("Work harder");
	    	System.out.println("D");
	    } else {
	    	System.out.println("Failed. Try again");
	    }
	    sc.close();

	}

}
