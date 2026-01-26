package javaPractice2;

import java.util.Scanner;

/**
 * This program asks the user to input two integers, and using a method calls max
 * which returns the larger input from two integers, displays the larger number.
 *
 * CSC 1350 Java Practice Problem 7

 * 
 * @author Anthony Nguyen
 * @since 10/30/25
 *
 */

public class Problem7 {
	// TODO: Write a method named max that takes two int parameters
	// and returns the larger of the two numbers.
	// Example: if a = 4 and b = 9, the method should return 9.
	public static int max(int num1, int num2) {
		int larger;
		if (num1 > num2) {
			larger = num1;
		} else {
			larger = num2;
		}
		return larger;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1;
		int num2;
		int larger;
		
		// TODO: Prompt and read two integers from the user
		System.out.println("Enter the first number:");
		num1 = in.nextInt();
		System.out.println("Enter the second number:");
		num2 = in.nextInt();
				
		// TODO: Call the max method and store the result in variable 'larger'
		larger = max(num1, num2);
		// TODO: Print the result in the format:
		// "The larger number is: X"
		System.out.println("The larger number is: " + larger);
	}
}
