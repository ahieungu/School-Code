package Congo.Products;

public class Food extends Product{
	private String[] ingredients;
	private int calories;
	private int numServings;

	public Food(String n, double p, String[] i, int c, int nS){
		super(n, p);
		ingredients = i;
		calories = c;
		numServings = nS;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Health Information::");
		System.out.printf("\tNumber of servings: %d%n", numServings);
		System.out.printf("\tCalories: %d%n", calories);
		System.out.print("\tContains:");
		for(String ingredient : ingredients){
			System.out.printf("%s,", ingredient);
		}
		System.out.println();
	}
}
