package Prog04_TicketKiosk;

import java.util.Scanner;

/**
 * This program computes a ticket price based on age and student status
 * using if/else, then prints the category, base price, and final price.
 *
 * CSC 1350 Programming Project No 4

 * 
 * @author Anthony Nguyen
 * @since 9/26/25
 *
 */

public class Prog04_TicketKiosk {

	public static void main(String[] args) {
		final int ADULT_PRICE = 20;
		final int CHILD_PRICE = 12;
		final int SENIOR_PRICE = 15;
		final double STUDENT_DISCOUNT_RATE = 0.10;
	
	// Step 3: Declare and initialize variables
	int age;                     // customer age (input)
	String studentAnswer;        // "Y" or "N" from input
	boolean isStudent = false;   // derived from studentAnswer (initialized!)
	String category = "";        // "Infant" | "Child" | "Adult" | "Senior"
	double basePrice = 0.0;      // price before discount
	double finalPrice = 0.0;     // price after discount
	boolean hasError = false;    // track any input error (no early return)

	//Step 5: Collect input and avoid input errors
	Scanner in = new Scanner(System.in);


	System.out.print("Enter age: ");
	age = in.nextInt();

	if (age < 0) {
	    System.out.println("Error: age cannot be negative.");
	    hasError = true;
	}

	System.out.print("Student (Y/N): ");
	studentAnswer = in.next(); // read one word (token)

	if (studentAnswer.equals("Y") || studentAnswer.equals("y")) {
	    isStudent = true;
	} else if (studentAnswer.equals("N") || studentAnswer.equals("n")) {
	    isStudent = false;
	} else {
	    System.out.println("Error: please enter Y or N for student.");
	    hasError = true;
	}

	//Step 6: Age Category and ticket price
	if (!hasError) {
	    // ----- Age category and base price -----
	    if (age < 3) {
	        category = "Infant";
	        basePrice = 0;
	    } else if (age <= 12) {
	        category = "Child";
	        basePrice = CHILD_PRICE;
	    } else if (age >= 65) {
	        category = "Senior";
	        basePrice = SENIOR_PRICE;
	    } else {
	        category = "Adult";
	        basePrice = ADULT_PRICE;
	    }

	    //Step 7: Student discount 
	    if (isStudent && basePrice > 0) {
	        finalPrice = basePrice - (basePrice * STUDENT_DISCOUNT_RATE);
	    } else {
	        finalPrice = basePrice;
	    }

	  //Step 8: Print Results
	    System.out.println();
	    System.out.println("Age: " + age);

	    if (isStudent) {
	        System.out.println("Student: Yes");
	    } else {
	        System.out.println("Student: No");
	    }

	    System.out.println("Category: " + category);
	    System.out.println("Base price: $" + basePrice);
	    System.out.println("Final price: $" + finalPrice);
	}

	
	}

}
