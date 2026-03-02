package Congo.Products;

import Congo.Enums.Sizes;

public class Clothing extends Product{
	private Sizes size;
	private String material;

	public Clothing(String n, double p, Sizes s, String m){
		// TODO - make the constructor for a clothing object
		super(n, p);
		name = n;
		price = p;
		size = s;
		material = m;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		// TODO - add extra printouts to display the size and material in the following format:
		System.out.printf("%s goes for %d%n", name, price);
		// [Clothes item] goes for [price]
		System.out.printf("\tSize: %s%n", size);
		//		Size: [size]
		System.out.printf("\tMaterial: %s%n", material);
		//  	Material: [material]

		// NOTE: the first line is part of the parent class
	}
}
