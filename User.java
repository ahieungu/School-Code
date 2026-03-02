package Congo;

import java.util.ArrayList;

import Congo.Interfaces.Displayable;
import Congo.Products.Product;

public class User implements Displayable{
	private ArrayList<Product> cart = new ArrayList<>();
	private String username;
	private int UID;

	private static int id = 1;

	public User(){
		username = "John Doe";
		UID = id++;
	}

	public User(String u){
		username = u;
		UID = id++;
	}

	public User(String u, int i){
		username = u;
		UID = i;

		if(i > id){
			id = i+1;
		}
	}

	public void addToCart(Product p){
		cart.add(p);
	}

	@Override
	public void printInfo() {
		System.out.printf("%s's cart:%n", username);
		for(Product p : cart){
			p.printInfo();
		}
	}
}
