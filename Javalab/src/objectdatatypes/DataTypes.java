package objectdatatypes;

public class DataTypes {
	Integer sal = 5000;
	Double gst =  sal * 0.03;
	Double pf = sal * 0.02;
	
	Double  monthsal1 =  gst + pf;
	Double  monthsal3 =  sal -  monthsal1;

	Double yearsal = 12 * monthsal3;
	Double allow = monthsal3 * 0.02;
	Double   yearsal1 = yearsal + allow;


	public static void main(String[] args) {
		DataTypes year = new DataTypes();
		System.out.println(year.pf);
		System.out.println(year.allow);
		System.out.println(year. monthsal1);
		System.out.println(year.monthsal3);
		System.out.println(year.yearsal1);

	}

}
