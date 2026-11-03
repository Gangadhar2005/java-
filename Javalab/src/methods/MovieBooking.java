package methods;

import java.util.Scanner;

public class MovieBooking {

	Scanner sc = new Scanner(System.in);

	int quantity;
	int price;
	int total;

	public static void main(String[] args) {

		MovieBooking mb = new MovieBooking();

		mb.welcome();
		mb.customerName();

		mb.movieDetails();

		mb.finalBill();

	}

	void welcome() {
		System.out.println("Welcome to Movie Ticket Booking");
	}

	String customerName() {

		System.out.println("Enter customer name:");
		String name = sc.nextLine();

		return name;
	}

	void movieDetails() {

		System.out.println("Enter movie name:");
		String movie = sc.nextLine();

		System.out.println("Movie Name: " + movie);

		System.out.println("Enter number of tickets:");
		quantity = sc.nextInt();
	}

	int ticketPrice() {

		System.out.println("Enter ticket price:");
		price = sc.nextInt();

		return price;
	}

	int totalAmount() {

		int ticket = ticketPrice();

		total = ticket * quantity;

		return total;
	}

	int discount() {

		System.out.println("Enter discount percentage:");
		int percentage = sc.nextInt();

		int discountAmount = total * percentage / 100;

		return discountAmount;
	}

	double finalBill() {

		int amount = totalAmount();

		int discountAmount = discount();

		double finalAmount = amount - discountAmount;

		System.out.println("Total Amount: " + amount);
		System.out.println("Discount: " + discountAmount);
		System.out.println("Final Bill: " + finalAmount);

		return finalAmount;
	}
}