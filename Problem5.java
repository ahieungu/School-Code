package javaPractice2;

import java.util.Scanner;

/**
 * This program receives inputs of integers and finds the maximum
 * and average to the hundredths place of the numbers inputted.
 *
 * CSC 1350 Java Practice Problem 5

 * 
 * @author Anthony Nguyen
 * @since 10/30/25
 *
 */

public class Problem5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		int sum = 0;
		int count = 0;
		int max = Integer.MIN_VALUE; // Set max to start with the smallest possible value

		// Prompt user for input and read the first number
		System.out.println("Enter a number:");
		num = in.nextInt();

		// TODO: Write a loop that continues while num is non-negative
		while (num >= 0) {
		// Inside the loop:
		//   - Add num to sum
		sum += num;
		//   - Increase count
		count++;
		//   - Compare num with max, and update max if num is larger
		if (num > max) {
			max = num;
		}
		
		//   - Prompt and read the next number
		System.out.println("Enter a number:");
		num = in.nextInt(); }
		
		
		// TODO: After the loop, calculate the average as a double
		// and print the max and average with two decimal places.
		if (count > 0) {
		double average = (double) sum / count;
		System.out.printf("Max is: %d Average is %.2f\n", max, average);
		} else {
		System.out.print("No non-negative integers were entered.");
		}
		  
	}
}
