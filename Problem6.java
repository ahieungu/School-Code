package javaPractice2;

import java.util.Scanner;

/**
 * This program calculates and prints n numbers in the 
 * Fibonacci sequence, where n is the input of the user.
 *
 * CSC 1350 Java Practice Problem 6

 * 
 * @author Anthony Nguyen
 * @since 10/30/25
 *
 */

public class Problem6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;			// How many Fibonacci numbers to print
		int first;		// First number in the sequence
		int second;		// Second number in the sequence
		int next;		// Next number in the sequence
		
		// TODO: Prompt the user for how many Fibonacci numbers to print (n)
		System.out.println("Enter how many Fibonacci numbers to print:");
		n = in.nextInt();
		
		// TODO: Initialize first to 0 and second to 1
		first = 0;
		second = 1;
		
		// TODO: Write a for loop that runs n times
		for (int i = 0; i < n; i++) {
			// Inside the loop:
			//   - Print the current number (first) followed by a space
			System.out.print(first + " ");
			//   - Set next = first + second
			next = first + second;
			//   - Update first = second
			first = second;
			//   - Update second = next
			second = next;
		}
		
		// TODO: After the loop ends, print "Sequence complete!"
		System.out.println();
		System.out.println("Sequence complete!");
	}

}
