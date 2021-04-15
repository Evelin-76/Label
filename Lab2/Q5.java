package Lab2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
//		Write a program that computes the tax and tip on a restaurant bill. The program should ask
//		the user to enter the charge for the meal. The tax should be 6.75 percent of the meal.
//		the tip should be 20 percent of the total after adding tax. Display the meal charge, tax
//		amount, tip amount and total bill on the screen

		
		Scanner scn = new Scanner(System.in);
		
		double tax= 6.75;
		System.out.print("How much is the bill? ");
		
		double bill = scn.nextDouble();
		double billTax = (bill / 100 * 6.75) + bill;
		double billTip = (billTax / 100) * 20;
		double totalBill = bill + billTax + billTip;
		
		
		System.out.printf("Tax: " + billTax + "\nTip: " + billTip + "\nTotal bill: " + totalBill);
		
		
		
		
	}

}
