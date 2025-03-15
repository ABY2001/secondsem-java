package javalab;

class product{
	int memberspcode;
	String pname;
	int price;
	
	public product(int memberspcode, String pname, int price) {
		this.memberspcode = memberspcode;
		this.pname = pname;
		this.price = price;
	}
	public void display() {
		 System.out.println("Product Name: " + this.pname + 
                 ", product Code: " + this.memberspcode + 
                 ", productPrice: " + this.price);
	}
}

public class productClass {
	public static void main(String[] args) {
		product p1 = new product(1,"bike",2000);
	    product p2 = new product(2,"phone",3000);
		product p3 = new product(3,"car",4000);
		p1.display();
		p2.display();
		p3.display();
		
		if (p1.price < p2.price && p1.price < p3.price) {
            System.out.println("Lowest Price: " + p1.price);
        } else if (p2.price < p1.price && p2.price < p3.price) {
            System.out.println("Lowest Price: " + p2.price);
        } else {
            System.out.println("Lowest Price: " + p3.price);
        }

	}

}
