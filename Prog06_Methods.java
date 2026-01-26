package Prog06_Methods;

import java.util.Scanner;

/**
 * This program collects a message, displays it in a decorative box,
 * analyzes vowels and spaces, and does a countdown to print the message.
 *
 * CSC 1350 Programming Project No 6

 * 
 * @author Anthony Nguyen
 * @since 10/23/25
 *
 */

public class Prog06_Methods {
	
	public static int Spaces(String message) {
		int count = 0;
		for (int i = 0; i <message.length(); i++) {
			if (message.charAt(i) == ' ') {
				count++;
		}
	}
	return count;
}
	
	public static int Vowels(String message, char ch) {
		int count = 0;
		
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) == ch) {
			count++;
		}
	}
	return count;
}
	
	public static void countdown(int n, String message) {
		if (n <= 0) {
			System.out.println(message);
			return;
		}
		System.out.println(n);
		countdown(n - 1, message);
	}
	
	public static void main(String[] args) {
			
		String message;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your message: ");
		message = in.nextLine();
		
		int n = message.length();
		System.out.println();
		for (int i = 0; i < n + 2; i++) System.out.print("*");
		System.out.println();
		System.out.println("*" + message + "*");
		for (int i = 0; i < n + 2; i++) System.out.print("*");
		
		String input = message;
		int spaces = Spaces(input);
		int vowels = Vowels(input, 'a') + Vowels(input, 'e') + Vowels(input, 'i') + Vowels(input, 'o') + Vowels(input, 'u') + Vowels(input, 'A') + Vowels(input, 'E') + Vowels(input, 'I') + Vowels(input, 'O') + Vowels(input, 'U');
		System.out.println();
		System.out.println();
		System.out.println("Vowels: " + vowels);
		System.out.println("Spaces: " + spaces);
		System.out.println();
		System.out.println("Launching in...");
	
		countdown(5, message);
	}
	
}
