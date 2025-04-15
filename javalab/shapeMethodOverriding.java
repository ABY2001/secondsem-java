package javalab;

import java.util.Scanner;

interface Shape {
    double calculateArea();
    void inputDimensions(Scanner scanner);
}

class Triangle implements Shape {
    double base;
    double height;

    @Override
    public void inputDimensions(Scanner scanner) {
        System.out.print("Enter base of triangle: ");
        this.base = scanner.nextDouble();
        System.out.print("Enter height of triangle: ");
        this.height = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Shape {
    double length;
    double width;

    @Override
    public void inputDimensions(Scanner scanner) {
        System.out.print("Enter length of rectangle: ");
        this.length = scanner.nextDouble();
        System.out.print("Enter width of rectangle: ");
        this.width = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;

    @Override
    public void inputDimensions(Scanner scanner) {
        System.out.print("Enter radius of circle: ");
        this.radius = scanner.nextDouble();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shape Area Calculator");
        System.out.println("1. Triangle");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        Shape shape = null;

        switch (choice) {
            case 1:
                shape = new Triangle();
                break;
            case 2:
                shape = new Rectangle();
                break;
            case 3:
                shape = new Circle();
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }

        shape.inputDimensions(scanner);
        System.out.printf("Area: %.2f%n", shape.calculateArea());

        scanner.close();
    }
}
