package javalab;
import java.util.Scanner;

public class empSalary {

	public static void main(String[] args) {
//		        double salary1=0;
//		        double updatedSalary1 = 0;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter your Jobe-role \n 1 for manager \n 2 for Developer \n 3 for intern");
		        int role = sc.nextInt();
		        int devsalary = 30000;
		        int managersalary = 50000;
		        int internsalary = 10000;
		        System.out.println("enter your experience");
		        int exp = sc.nextInt();
		        switch (role){
		            case 1:
		                System.out.println("ROLE: MANAGER");
		                System.out.println("present salary 50000");
		                break;
		            case 2:
		                System.out.println("ROLE: DEVELOPER");
		                System.out.println("present salary 30000");
		                break;
		            case 3:
		                System.out.println("ROLE INTERN");
		                System.out.println("present salary 15000");
		                break;
		            default:
		                System.out.println("No post");
		        }
		        if (exp < 2){
		            System.out.println("Not eligible for hike");
		        } else if (exp >2 && exp<5) {
		            System.out.println("eligible for 10% hike :" + 30000 *0.10);
                    double hike1 =  30000 *0.10;
		            hike1 += 30000;
		            System.out.println("updated salary" + hike1);
		        } else if (exp>=5) {
		        	double hike2 =  50000 *0.20;
		            hike2 += 50000;
		            System.out.println("eligible for 20% hike :" + (50000 *0.10));
		            System.out.println("updated salary :" + hike2);
		        }
	}

}
