package methods;

import java.util.Scanner;

public class Shopping {
	Scanner sc = new Scanner(System.in);
	int tprice;

	public static void main(String[] args) {

		Shopping sa = new Shopping();

		sa.wellCome();

		sa.coustmerName();
		System.out.println("enther the mobilenumber");
		long m = sa.sc.nextLong();

		sa.mobilNo(m);

		sa.displayproduct();

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
		System.out.println("enter the mobile number : " + m);
	}

	void displayproduct() {
		System.out.println("enter the product name : ");
		String product = sc.nextLine();
		System.out.println(" product name is : " + product);
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
