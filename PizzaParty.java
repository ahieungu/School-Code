package PizzaParty;

public class PizzaParty {

	public static void main(String[] args) {
		int people = 100;
		
		final int SLICES_PER_PERSON = 3;
		final int SLICES_PER_PIZZA = 8;
		final int COST_PER_PIZZA = 12;
		
		int totalSlicesNeeded = SLICES_PER_PERSON * people;
		
		int numberOfPizzas = totalSlicesNeeded / SLICES_PER_PIZZA;
		int remainder = (totalSlicesNeeded % SLICES_PER_PIZZA);
		
		int totalCost = numberOfPizzas * COST_PER_PIZZA;
		
		System.out.println("Number of people: " + people);
		
		System.out.println("Slices needed: " + totalSlicesNeeded);
		
		if (remainder > 0) {
			System.out.println("Pizzas needed: " + (numberOfPizzas + 1));
			System.out.println("Total Cost: $" + (totalCost + 12));
		} else {
			System.out.println("Pizzas needed: " + numberOfPizzas);
			System.out.println("Total Cost: $" + totalCost);
		}

	}
	
}
