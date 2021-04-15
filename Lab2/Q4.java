package Lab2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
//  Write a program that asks user for the number of males and females registered in a class.
//		The program should display the percentage of males and females in the class.
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("How many boys are in the class? ");
		double boys = scn.nextInt();
		
		System.out.println("How many girls are in the class? ");
		double girls = scn.nextInt();
		
		double totalNumberOfBoysAndGirls = boys + girls;
		
		
		double amountBoysPercent = boys / (boys+girls) *100 ;
		double amountGirlsPercent = girls / totalNumberOfBoysAndGirls * 100;
		
		System.out.println("In  your class there are " + amountBoysPercent + "% of boys"
				+ " and " + amountGirlsPercent + "% of girls");
	}

}
