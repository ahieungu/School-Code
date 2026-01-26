package Prog09_BubbleSort;

/**
 * This program creates an array of 8 movie titles using input from the user. Then, 
 * it prints the movie titles in the same order that it was input. Finally, using 
 * the bubble sort method, the five movie titles are then printed again but in
 * alphabetical order.
 *
 * CSC 1350 Programming Project No 9

 * 
 * @author Anthony Nguyen
 * @since 11/13/25
 *
 */

import java.util.Scanner;

public class Prog09_BubbleSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// TODO: Create an array for 5 movie titles called movies.
		String[] movies = new String[5];
		
		// TODO: Use a loop to ask for 5 movie names from the user.
		// Example prompt: Enter movie 1:
		for (int i = 0; i < movies.length; i++) {
			System.out.print("Enter movie " + (i+1) + ": ");
			movies[i] = in.nextLine();
		}
		
		// TODO: Print the list as entered.
		// Example output:
		// Movies entered:
		// Star Wars
		// Frozen
		// Toy Story
		System.out.println();
		System.out.println("Movies entered:");
		for (String movie: movies) {
				System.out.println(movie);
		}

		// TODO: Call bubbleSort(movies);
		bubbleSort(movies);
		
		// TODO: Print the sorted list.
		// Example output:
		// Movies sorted alphabetically:
		// Frozen
		// Star Wars
		// Toy Story
		System.out.println();
		System.out.println("Movies sorted alphabetically:");
		for (String movie: movies) {
			System.out.println(movie);
		}
		
	}
	
	// -------------------------
	// Bubble Sort method (provided)
	// -------------------------
	public static void bubbleSort(String[] list) {
		for (int pass = 0; pass < list.length - 1; pass++) {
			for (int i = 0; i < list.length - 1 - pass; i++) {
				if (list[i].compareToIgnoreCase(list[i + 1]) > 0) {
					// swap
					String temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
				}
			}
		}
	}
}

// #1
// The new output of Movies sorted alphabetically is flipped: 
// Toy Story, Star Wars, Frozen, Bambi, then lastly Avatar

// #2
// No, because the outer loop will only run once instead of five times,
// therefore not all of the elements will be completely sorted.

// #3
// The only thing that has to be changed is the array size.
// No other changes are required.

// #4
// If you use uppercase and lowercase titles, it treats uppercase letters as having
// lower numerical values than lowercase letters, even if the lowercase letter was an a
// and the uppercase was a Z. Therefore, no matter the letter, the uppercase letter
// will always be before the lowercase alphabetically.
