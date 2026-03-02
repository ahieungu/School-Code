package Congo.Products;

import Congo.Enums.PortTypes;
import Congo.Interfaces.Displayable;

public class Technology extends Product{
	private int batteryLife;
	private PortTypes portType;
	private int storageSizeGB;

	public Technology(String n, double p, int b, PortTypes pt, int s){
		super(n, p);
		batteryLife = b;
		portType = pt;
		storageSizeGB = s;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Specifications::");
		System.out.printf("\tBattery Life: %dmWh%n", batteryLife);
		System.out.printf("\tPort: %s%n", portType);
		System.out.printf("\tBattery Life: %dGB%n", storageSizeGB);
	}
}
