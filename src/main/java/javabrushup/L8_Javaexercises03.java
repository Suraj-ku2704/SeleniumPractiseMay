package javabrushup;

import java.util.Scanner;

public class L8_Javaexercises03 {

	public static void main(String[] args) {
		// Write a java program to find Prime number
		
		System.out.println("Enter the Number =");
		@SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
	
		
		if(isPrime(num)) {
			System.out.println("The given number"+" "+num+" "+"is prime");
		}
		else {
			System.out.println("The given number"+" "+num+" "+"is not prime");
		}

	}

	private static boolean isPrime(int num) {
		
		for (int i = 2; i <= Math.sqrt(num) ; i++) {
			
			if (num%i == 0) {
				return false;
			}
			
		}
		return true;

	
	}

}
