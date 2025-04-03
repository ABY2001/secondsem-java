package javalab;


class Student {
	
		private int studentId;
	    private String name;
	    private double marks;
	    
	    public Student(int studentId, String name, double marks) {
	        this.studentId = studentId;
	        this.name = name;
	        this.marks = marks;
	    }
         
	    // method to print details
	    public void displayDetails() {
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	    }
	    
	    // method to check if student passed
	    public boolean isPassed() {
	        if( marks >= 40) {
	        	return true;
	        } else {
	        	return false;
	        }
	    }
		
 }

public class staudentclass {

	public static void main(String[] args) {
        Student student1 = new Student(101, "Aby", 85.5);
        Student student2 = new Student(102, "Anu", 39.0);
        Student student3 = new Student(103, "Aju", 40.0);
        Student student4 = new Student(104, "Abu", 72.3);
        
        // Test the students
        System.out.println("Student 1 :");
        student1.displayDetails();
        System.out.println("Passed: " + student1.isPassed());
        
        System.out.println("\ntudent 2 :");
        student2.displayDetails();
        System.out.println("Passed: " + student2.isPassed());
        
        System.out.println("\nStudent 3 :");
        student3.displayDetails();
        System.out.println("Passed: " + student3.isPassed());
        
        System.out.println("\nStudent 4 :");
        student4.displayDetails();
        System.out.println("Passed: " + student4.isPassed());

 
	}

}
