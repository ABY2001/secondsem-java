package javalab;
import java.util.*;

public class circle {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the radius of the circle: ");
	        double radius = sc.nextDouble();
	        sc.close();
	        double area = Math.PI * radius * radius;
	        double perimeter = 2 * Math.PI * radius;
	        System.out.println("Area of the circle: " + area);
	        System.out.println("Perimeter of the circle: " + perimeter);
	    }
}
