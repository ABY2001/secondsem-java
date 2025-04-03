package javalab;
import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor to initialize Person data members
    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Employee class inherits from Person
class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    // Constructor to initialize Employee and Person data members
    public Employee(String name, String gender, String address, int age, 
                   int empId, String companyName, String qualification, double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Teacher class inherits from Employee
class Teacher extends Employee {
    String subject;
    String department;
    String teacherId;

    // Constructor to initialize Teacher, Employee and Person data members
    public Teacher(String name, String gender, String address, int age, 
                  int empId, String companyName, String qualification, double salary,
                  String subject, String department, String teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    // Method to display teacher details
    public void display() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empId);
        System.out.println("Company Name: " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacherId);
        System.out.println("----------------------------------");
    }
}

public class personClassInheritance {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of teachers: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // consume newline

	        // Create an array of Teacher objects
	        Teacher[] teachers = new Teacher[n];

	        // Input details for each teacher
	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for Teacher " + (i + 1) + ":");
	            
	            System.out.print("Name: ");
	            String name = scanner.nextLine();
	            
	            System.out.print("Gender: ");
	            String gender = scanner.nextLine();
	            
	            System.out.print("Address: ");
	            String address = scanner.nextLine();
	            
	            System.out.print("Age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // consume newline
	            
	            System.out.print("Employee ID: ");
	            int empId = scanner.nextInt();
	            scanner.nextLine(); // consume newline
	            
	            System.out.print("Company Name: ");
	            String companyName = scanner.nextLine();
	            
	            System.out.print("Qualification: ");
	            String qualification = scanner.nextLine();
	            
	            System.out.print("Salary: ");
	            double salary = scanner.nextDouble();
	            scanner.nextLine(); // consume newline
	            
	            System.out.print("Subject: ");
	            String subject = scanner.nextLine();
	            
	            System.out.print("Department: ");
	            String department = scanner.nextLine();
	            
	            System.out.print("Teacher ID: ");
	            String teacherId = scanner.nextLine();
	            
	            // Create Teacher object and store in array
	            teachers[i] = new Teacher(name, gender, address, age, empId, companyName, 
	                                     qualification, salary, subject, department, teacherId);
	        }

	        // Display all teacher details
	        System.out.println("\n TEACHER DETAILS: ");
	        for (int i = 0; i < teachers.length; i++) {
	            teachers[i].display();
	        }

	        scanner.close();
	    }
}
