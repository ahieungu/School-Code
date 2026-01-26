package Prog05_GradeStats;

import java.util.Scanner;

/**
 * This program collects grades, counts students, gives min/max,
 * calculates the average, and tallies the amount of letter grades.
 *
 * CSC 1350 Programming Project No 5

 * 
 * @author Anthony Nguyen
 * @since 10/2/25
 *
 */

public class Prog05_GradeStats {

	public static void main(String[] args) {
		
		final int A=90;
		final int B=80;
		final int C=70;
		final int D=60;
		
	int sum = 0;
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	int students = 0;
	int score;
	
	int aCount = 0;
	int bCount = 0;
	int cCount = 0;
	int dCount = 0;
	int fCount = 0;
		
	Scanner in = new Scanner(System.in);

	while (true) {
		System.out.print("Enter a score from 0-100, or -1 to stop.");
		score = in.nextInt();
	
	if (score == -1) {
		break;
	}
	
	if (score < 0 || score > 100) {
		System.out.println("Invalid Score. Try Again.");	
		}	
	
	if (score >= 0) {
		if (score <= 100) {
			sum += score;
			students++;
	
	if (score<min)
		min=score;
	if (score>max)
		max=score;
	if (score >= A)
		aCount++;
	else if (score >= B)
		bCount++;
	else if (score >= C)
		cCount++;
	else if (score >= D)
		dCount++;
	else if (score < D)
		fCount++;
		
			}
		}
	}
	
	
	if (students==0) {
		System.out.println("No scores were entered.");
	} else {
		double average = sum / (double) students;
		System.out.println("Students: " + students);
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.printf("Average: %.2f", average);
		
		System.out.println();
		System.out.println();
		
		System.out.println("A: " + aCount);
		System.out.println("B: " + bCount);
		System.out.println("C: " + cCount);
		System.out.println("D: " + dCount);
		System.out.println("F: " + fCount);
		
			}

		}
	
	}
