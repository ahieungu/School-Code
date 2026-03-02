package Congo;

import java.util.ArrayList;
import java.util.Collections;

import Congo.Products.Product;

public class Inventory {
	private ArrayList<Product> products;

	public Inventory(){
		products = new ArrayList<>();
	}

	public void addProduct(Product p){
		products.add(p);
	}

	public Product getProduct(int i){
		return products.get(i);
	}

	public void listInventory(){
		Collections.sort(products);
		for(Product prod: products){
			prod.printInfo();
		}
	}
}

