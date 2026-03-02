package CakeShop;

//Student Name: Anthony Nguyen
//LSU ID: 891473078
//Assignment: Lab4Objects

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
	private ArrayList<Cake> cakes;

	public Inventory(){
		cakes = new ArrayList<>();
	}

	public void addCake(Cake c){
		cakes.add(c);
	}

	public void listInventory(){
		Collections.sort(cakes);
		for(Cake cake : cakes){
			cake.printCard();
		}
	}


	// TODO - implement functions below
	public void priceChange(double percent){
		// TODO - change the price of every cake in cakes
		// using percent as a percent change
		for (Cake c : cakes) {
			// In other words: price = price * percent
			c.setPrice(c.getPrice() * percent);
		}
	}

		// TODO - save the current Inventory to a csv file called 'inventory.csv'
	public void saveInventory() throws FileNotFoundException{
			PrintWriter out = new PrintWriter("inventory.csv");
			// This should have the same structure as 'cakes.csv',
			// so the first row of the csv should be 'Tiers,Flavor,Price'
			out.println("Tiers, Flavor, Price");
			for (Cake c : cakes) {
				out.println(c.getTiers() + "," + c.getFlavor() + "," + c.getPrice());
			// NOTE - this file should be compatible with the 'populate' function in the runner class
			}
			out.close();
		}
	}
