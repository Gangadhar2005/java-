package methods;

import java.util.Scanner;

public class Shopping {
	Scanner sc = new Scanner(System.in);
	int tprice;

	public static void main(String[] args) {

		Shopping sa = new Shopping();

		sa.wellCome();

		sa.coustmerName();
//		null, 0 are just initial arguments; the values entered by the user are used inside the method.

		sa.mobilNo(0);

		sa.displayproduct(null);

		sa.finalAmount();
	}

	void wellCome() {
		System.out.println("Wellcome to shopping");

	}

	String coustmerName() {
		System.out.println(" coustmer name : ");
		String name = sc.nextLine();
		return name;
	}

	void mobilNo(long m) {
	
		System.out.println("enther the mobilenumber");
		long m1 = sc.nextLong();
		System.out.println("enter the mobile number : " + m1);
	}

	void displayproduct(String product) {
		System.out.println("enter the product name : ");
		sc.nextLine();
		String product1 = sc.nextLine();
		System.out.println("product name is : " +  (product1));
	}

	int totalPrice() {
		System.out.println("enter the price of product : ");
		int price = sc.nextInt();
		System.out.println("enter the quntity ");
		int quntity = sc.nextInt();
		tprice = price * quntity;
		return tprice;
	}

	int discount() {
		System.out.println("enter the discount ammount ..");
		int dis = sc.nextInt();
		int disco = tprice * dis / 100;
		System.out.println("mount is ... " + disco);
		return disco;
	}

	double finalAmount() {
		int total = totalPrice();
		int discountAmount = discount();
		int finalamount = total - discountAmount;
		System.out.println("show the final ammount " + finalamount);
		return finalamount;

	}

}
