package Congo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Congo.Products.ProductFactory;

public class CongoRunner {
	public static void main(String[] args) throws FileNotFoundException{
		Inventory products = populateProducts();
		ArrayList<User> users = populateUsers(products);

		char option = 'a';
		Scanner in = new Scanner(System.in);
		while(option != 'q'){
			menuList();

			option = in.next().charAt(0);
			switch(option){
				case '1':
					// View User details
					for(User u : users){
						u.printInfo();
					}
					break;
				case '2':
					// Display Products
					products.listInventory();
					break;
			}
		}
		in.close();
	}

	public static void menuList(){
		System.out.println("Please select one of the following:");
		System.out.println("\t1- View User details");
		System.out.println("\t2- Display Products");
		System.out.println("\tq- Exit");
	}

	public static Inventory populateProducts() throws FileNotFoundException{
		Inventory i = new Inventory();
		File infile = new File("./Data/Products.tsv");
		Scanner input = new Scanner(infile);

		while(input.hasNextLine()){
			String productInfo = input.nextLine();
			i.addProduct(ProductFactory.makeProduct(productInfo));
		}

		return i;
	}

	public static ArrayList<User> populateUsers(Inventory i) throws FileNotFoundException{
		ArrayList<User> users = new ArrayList<>();
		File infile = new File("./Data/Users.tsv");
		Scanner input = new Scanner(infile);

		while(input.hasNextLine()){
			String[] userInfo = input.nextLine().split("\t");

			if(userInfo.length < 3){
				System.out.println("Bad User Data");
				continue;
			}

			User newUser;

			if(userInfo[0].isBlank()){
				newUser = new User();
			}
			else if(userInfo[1].isBlank()){
				newUser = new User(userInfo[0]);
			}
			else{
				newUser = new User(userInfo[0], Integer.parseInt(userInfo[1]));
			}

			String[] productIndexes = userInfo[2].split(",");
			for(String index : productIndexes){
				int p = Integer.parseInt(index);
				newUser.addToCart(i.getProduct(p));
			}

			users.add(newUser);
		}

		return users;
	}
}
