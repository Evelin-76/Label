package Lab2;

import java.util.Scanner;

public class Q2Cookies {

	public static void main(String[] args) {

// A bag cookies holds 40 cookies. The calorie information on the bag claims that there are 10
// serving in the bag and that a serving equals 300 calories.
// Write a program that lets the user enter the number of coolies he or she ate and then report
// the number of total calories consumed.

		Scanner scn = new Scanner(System.in);

		System.out.println("Write the number of cookies you ate: ");

		int consumedCookies = scn.nextInt();

		int totalCookies = 40 / 10;

		int cookeeCalories = 300 / totalCookies;

		int totalCalories = consumedCookies * cookeeCalories;

		System.out.println("You have consumed: " + totalCalories + " calories");

	}

}
