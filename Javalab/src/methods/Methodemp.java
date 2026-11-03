package methods;

public class Methodemp {
	void units() {
		int presentreadings = 850;
		int previousreadings = 600;
		System.out.println(presentreadings - previousreadings);
	}

	void energy() {
		int rate = 5;
		int unit = 250;
		System.out.println(unit * rate);
	}

	static void fixedCharge() {
		System.out.println("100");
	}

	void totalBill() {
		System.out.println("Total bill method called");

		int energy = 1250;
		int fixed = 100;

		System.out.println(energy + fixed);
	}

	void tax() {
		System.out.println("Tax method called");

		int total = 1350;
		int tax = total * 5 / 100;

		System.out.println(tax);
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Methodemp e = new Methodemp();
		e.units();
		e.energy();
		fixedCharge();
		e.totalBill();
		e.tax();

	}

}
