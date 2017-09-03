package _30daysofcode;

import java.util.Scanner;

public class Day2_Operators {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		// Write your calculation code here.
		double tip = (mealCost * (tipPercent / 100.00));
		double tax = (mealCost * (taxPercent / 100.00));
		int total = (int) (mealCost + tip + tax);
		// cast the result of the rounding operation to an int and save it as totalCost
		int totalCost = (int) Math.round(total);

		// Print your result
		System.out.println("The total meal cost is " + totalCost + " dollars.");

	}
}

// 12.00
// 20
// 8
// double mealCost = 15.50;
// int tipPercent = 15;
// int taxPercent = 10;