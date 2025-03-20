package javalab;

import java.util.Scanner;

class account {
	 int accountNumber;
	 String accountHolder;
	 double balance;

	public account(int accountNumber , String accountHolder ,double balance )
	{
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("account Balance:"+ this.balance);
	}
	
	public void withdraw(double amount) {
		if(this.balance<amount) {
			System.out.println("insufficent amount");
		} else {
			this.balance=this.balance-amount;
			System.out.println("Withdrawn amount"+ amount);
			System.out.println("Balance amount"+ this.balance);
		}
	}
	
	public void displayAccountInfo() {
		System.out.println("account Number :"+ accountNumber);
		System.out.println("account Holder :" + accountHolder);
		System.out.println("Balance amount :"+ balance);
		
	}
}

public class bankaccount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account holder name");
		String name= sc.next();
		
		System.out.println("Enter Account Number");
		int accountNumber=sc.nextInt();
		
		System.out.println("Enter Amount");
		int balance=sc.nextInt();
		
		account a = new account(accountNumber, name, balance);  //object instance creation
		a.displayAccountInfo();
		while(true) {
		System.out.println("1 for deposit\n"
				+ "2 for withdraw\n"
				+"3 for display amount\n"
				+"4 for exit");
		int choice = sc.nextInt();
		switch(choice) {   // user choice for actions(withdraw ,deposit, account details)
		case 1:
			System.out.print("Enter amount to deposit");
			int depositAmount = sc.nextInt();
			a.deposit(depositAmount);
			break;
	    case 2:
		    System.out.print("Enter amount to withdraw");
		    int withdrawAmount = sc.nextInt();
		    a.withdraw(withdrawAmount);
		    break;
        case 3:
        	a.displayAccountInfo();
        	break;
        case 4:
        	System.out.print("Exiting....");
        	sc.close();
        	return;
        default:
        	System.out.print("Enter valid choice");
     }
  }
	}
}
