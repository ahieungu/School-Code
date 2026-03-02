package Congo.Products;

import Congo.Interfaces.Displayable;

public class Product implements Comparable<Product>, Displayable{
	protected String name;
	protected double price;

	public Product(String n, double p){
		name = n;
		price = p;
	}

	public void printInfo(){
		System.out.printf("%s goes for $%.2f%n", name, price);
	}

	@Override
	public int compareTo(Product p) {
		if(name.compareTo(p.name) != 0){
			return name.compareTo(p.name);
		}

		if(price > p.price){
			return 1;
		}
		else if (price < p.price){
			return -1;
		}
		return 0;
	}

}
