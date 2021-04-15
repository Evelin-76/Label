package Lab2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int maxNum, minNum, lastNum;

		System.out.print("Enter your first number: ");
		lastNum = scn.nextInt();
		maxNum = 0;
		minNum = 0;
		if (maxNum < lastNum) {
			maxNum = lastNum;
		}
		System.out.print("Enter your next number:");
		lastNum = scn.nextInt();
		if (lastNum >minNum && maxNum < lastNum) {
			if(true) minNum = maxNum;
				maxNum = lastNum;
				
			}else {
				minNum = lastNum;
		}
		do {
			System.out.print("Do you want to enter another number: 0-No, 1-Yes: ");
			int yesOrnot = scn.nextInt();
			if (yesOrnot == 1) {
				getnextNum();System.out.print("Enter your next number:");
				lastNum = scn.nextInt();
				if (lastNum >minNum && maxNum < lastNum) {
					if(true) minNum = maxNum;
						maxNum = lastNum;
						
					}else {
						minNum = lastNum;}

			} else if (yesOrnot == 0) {
				if (maxNum < lastNum) {
					maxNum = lastNum;
				}
				
				System.out.println("Largest number is: " + maxNum);
				System.out.println("Smallest number is: " + minNum);

				break;
			}

		} while (true);

	}

	private static int getnextNum() {
		System.out.println("Enter next number: ");
		Scanner scn = new Scanner(System.in);
		return scn.nextInt();
//		
	}
}
//	public static void wannaContinue() {
//		
//		Scanner scn = new Scanner(System.in);
//		int maxNum = scn.nextInt(), minNum = scn.nextInt(), lastNum = scn.nextInt();
//		int yes = 1;
//	
//		System.out.print("Do you want to enter another number: 0-No, 1-Yes: ");
//		if(scn.nextInt() == 1){
//			getnextNum();
//		}else if (scn.nextInt() == 0) {
//			if (maxNum < lastNum) {
//                maxNum = lastNum;
//            }
//            if (lastNum < minNum) {
//                minNum = lastNum;
//			System.out.println();
//		}else {
//		wannaContinue();
////				System.out.println("");
//		return;
//		}
//	}
//}//(scn.nextInt() != 1 || scn.nextInt() != 0)
//
