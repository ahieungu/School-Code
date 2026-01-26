package file;

// Student Name: Anthony Nguyen
// LSU ID: 891473078
// Assignment: Lab Assignment 1 - Files

import java.io.File; // Import the File Class
import java.io.FileNotFoundException; // Import the FileNotFoundException Class
import java.io.PrintWriter; // Import the PrintWriter Class
import java.util.Scanner; // Import the Scanner Class

public class file {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.print("Number of random integer numbers: ");
		// Print the message for the user to input the quantity of random integer numbers
		Scanner in = new Scanner(System.in); 
		// Create Scanner
		int quantity = in.nextInt();
		// Assign user input to quantity
		PrintWriter file = new PrintWriter("numbers.txt");
		for (int i = 0; i < quantity; i++) {
			int randomNum = (int)(Math.random() * 1001);
		// Create for loop to print random numbers based off user input
			file.println(randomNum);
		// Print random numbers from 0-1000 in text file
		}
		
		file.close(); // Close the text file
		
		in.close();
		
		Scanner numberfile = new Scanner(new File("numbers.txt"));
		// Create a new scanner to read the integers created in the text file
		 
		int min= 1000;
		int max= -1;
		int sum = 0;
		int count = 0;
		// Declare variables
		
		while (numberfile.hasNextInt()) {
			int number = numberfile.nextInt();
			if (number > max) {
				max = number; // Replace max with the highest number
			}
			if (number < min) {
				min = number; // Replace min with the lowest number
			}
			sum += number; // Add the random integers together to create a sum
			count++; // Increase the count by one every time a new integer is read
		}
		double average = (double) sum / count; // Calculate the average by dividing the sum by count
		
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
		System.out.printf("Average: %.2f%n", average);
		
		numberfile.close(); // Close the scanner
	}

}
