package javalab;

import java.util.Scanner;

class rect {
   
    public double length;
    public double width;
    // Parameterized constructor
    public rect(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }
    
    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Rectangleclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your length: ");
        double len = sc.nextDouble();
        System.out.print("Enter your width: ");
        double width = sc.nextDouble();
        
        rect r1 = new rect(len, width);
        
        // Print the results
        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());
        
        sc.close(); 
    }
}
