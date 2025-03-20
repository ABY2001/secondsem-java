package javalab;
import java.util.Scanner;

public class empSalary {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter your Jobe-role \n 1 for manager \n 2 for Developer \n 3 for intern");
		        int role = sc.nextInt();
		        int devsalary = 30000;
		        int managersalary = 50000;
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
		                System.out.println("Not Eligible for hike");
		                break;
		            default:
		                System.out.println("No post");
		        }
		        if (exp < 2){
		            System.out.println("Not eligible for hike");
		        } if ((role==1) && (exp < 5)) {
		        	 System.out.println("eligible for 10% hike :" + managersalary *0.10);
	                 double hike1 =  managersalary *0.10;
			         managersalary+=hike1;
			         System.out.println("updated salary" + managersalary);
		        } else if((role==1) && exp>5) {
		        	 System.out.println("eligible for 10% hike :" + managersalary *0.20);
                     double hike1 =  managersalary *0.20;
		             managersalary+=hike1;
		             System.out.println("updated salary" + managersalary);
		        } else if((role==2) && exp < 5) {
		        	 System.out.println("eligible for 10% hike :" + devsalary *0.10);
                     double hike2 =  devsalary *0.10;
                     devsalary+=hike2;
		             System.out.println("updated salary" + devsalary);
		        } else if((role==2) && exp > 5) {
		        	 System.out.println("eligible for 20% hike :" + devsalary *0.20);
                     double hike2 =  devsalary *0.20;
                     devsalary+=hike2;
		             System.out.println("updated salary" + devsalary);
		        }
		        sc.close();
	}

}
