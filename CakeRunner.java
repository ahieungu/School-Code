package CakeShop;

//Student Name: Anthony Nguyen
//LSU ID: 891473078
//Assignment: Lab4Objects

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CakeRunner {
	public static void main(String[] args) throws FileNotFoundException{
		Inventory cakes = populate();

		char option = 'a';
		Scanner in = new Scanner(System.in);
		while(option != 'q'){
			menuList();

			option = in.next().charAt(0);
			switch(option){
				case '1':
					// Add a Cake
					promptAddCake(cakes);
					break;
				case '2':
					// List Inventory
					cakes.listInventory();
					break;
				case '3':
					// Change Price
					promptChangePrice(cakes);
					break;
			}
		}

		cakes.saveInventory();
		in.close();
	}

	public static void menuList(){
		System.out.println("Please select one of the following:");
		System.out.println("\t1- Make a new cake");
		System.out.println("\t2- List Inventory");
		System.out.println("\t3- Change Price");
		System.out.println("\tq- Exit");
	}

	public static Inventory populate() throws FileNotFoundException{
		Inventory cakes = new Inventory();

		File inFile;
		Scanner in;

		// TODO - implement a try-catch to make the Scanner in
		try {
			inFile = new File("inventory.csv"); // read from inventory.csv if it exists
			in = new Scanner(inFile);
		} catch (Exception e) {
			inFile = new File("cakes.csv"); // or read from cakes.csv if the first doesn't
			in = new Scanner(inFile);
		}
		
		in.nextLine();

		while(in.hasNextLine()){
			String line = in.nextLine();
			String[] values = line.split(",");

			cakes.addCake(new Cake(Integer.parseInt(values[0]), values[1], Double.parseDouble(values[2])));
		}

		in.close();
		return cakes;
	}

	public static void promptAddCake(Inventory i){
		// TODO - Implement the prompt and adding of a new cake to the passed Inventory i
		Scanner scan = new Scanner(System.in);
		// The prompts should be:
		// 		How many tiers is this cake?
		System.out.println("How many tiers is this cake?");
		int tiers = scan.nextInt();
		scan.nextLine();
		//  	What is the flavor of your cake?
		System.out.println("What is the flavor of your cake?");
		String flavor = scan.nextLine();
		//  	How much is this cake?
		System.out.println("How much is this cake?");
		double price = scan.nextDouble();
		scan.nextLine();
		// NOTE - This will add it to the 'cakes' variable in main
		i.addCake(new Cake(tiers, flavor, price));
	}

	public static void promptChangePrice(Inventory i){
		// TODO - Implement the prompt and changing of all prices to the passed
		Scanner scan = new Scanner(System.in);
		// Inventory i
		// The prompt should be:
		// 		Enter percent price change:
		System.out.println("Enter percent price change:");
		double percent = scan.nextDouble();
		scan.nextLine();
		// The input percent will be passed to i.priceChange(percent);
		// to change the prices of all cakes
		i.priceChange(percent);
		// NOTE - This will add it to the 'cakes' variable in main

	}

}
