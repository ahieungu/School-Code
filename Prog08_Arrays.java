package Prog08_Arrays;

/**
 * This program creates a double array of 8 prices using a for loop to set prices that
 * start at $5.00 and increases by $1.25 for each index. Finally, it uses a enhanced
 * for loop to calculate the total which is then printed after the array.
 *
 * CSC 1350 Programming Project No 8

 * 
 * @author Anthony Nguyen
 * @since 11/06/25
 *
 */

public class Prog08_Arrays {

	   public static void main(String[] args)
	   {
	      // Step 1: Create a double array named prices with 8 elements.
		   double[] prices = new double[8];

	      // Step 2: Use a REGULAR for loop to fill the array.
	      // Start at 5.00 and increase by 1.25 each time.
		   double initial = 5.00;
		   double increase = 1.25;
		   for (int i = 0; i < prices.length; i++) {
			   prices[i] = initial + i * increase;
		   }

	      // Step 3: Use another REGULAR for loop to print each index 
	      // and its corresponding price formatted to 2 decimal places.
		// needs to match example expected output
		   for (int i = 0; i < prices.length; i++) {
			   System.out.printf("Index %d: $%.2f%n", i, prices[i]);
		   }

	      // Step 4: Create a variable named total = 0.0.
	      // Use an ENHANCED for loop (for-each) to add all prices together.
		   double total = 0.0;
		   for (double price : prices) {
			   total += price;
		   }

	      // Step 5: Print the total formatted as $XX.XX.
		   System.out.printf("Total: $%.2f%n", total);
	   }
	}

