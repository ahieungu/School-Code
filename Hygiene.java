package Congo.Products;

import Congo.Enums.HealthLocale;

public class Hygiene extends Product{
	private HealthLocale area;
	private int dailyUse;
	private String purpose;

	public Hygiene(String n, double p, HealthLocale a, int d, String pu){
		super(n, p);
		area = a;
		dailyUse = d;
		purpose = pu;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Usage::");
		System.out.printf("\tArea of use: %s%n", area);
		System.out.printf("\tUse %d times a day%n", dailyUse);
		System.out.printf("\tPurpose: %s%n", purpose);
	}

}
