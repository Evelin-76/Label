package Lab2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
//		Write a program that task the user for a positive nonzero integer value. The program
//		should use a loop to get the sum of all the integers from 1 up to the number entered.
		
		Scanner scn = new Scanner(System.in);
		
		int sum = 0;
		int num = 0;
		
		do{
			System.out.print("Enter a number up to 0: ");
			num = scn.nextInt();
			
			if(num < 0) {
				break;
			}else {
				sum = sum + num;
			}
			
		}while (true);
		
		System.out.println("Total is " + sum);
	
}
		
}

	