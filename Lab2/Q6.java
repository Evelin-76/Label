package Lab2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

//Write a program that will ask the user to enter the amount of a purchase. The program should 
//		then compute the state and county tax sales tax. Assume the state sales tax is  4 %
//		and the county sales tax is 2%. The program should display the amount of the purchase
//		the state sales tax, the local sales tax, and teh total of the sale (which is the sum 
//		of the amount of purchase plus the totals saldes tax)

		Scanner scn = new Scanner(System.in);
		
		System.out.println("How much it cost? ");
		
		double price = scn.nextDouble();
		double  saleTax = price / 100 * 4;
		double countyTax = price / 100 * 2;
		double totalTaxes = saleTax + countyTax;
		double totalPrice = price + saleTax + countyTax;
		
		System.out.println("Price: " + price + " without taxes");
		System.out.println("Sale tax: " + saleTax);
		System.out.println("County tax: " + countyTax);
		System.out.println("Total taxes: " +totalTaxes );
		System.out.println("Total price: " +totalPrice );
		
		
	}

}
