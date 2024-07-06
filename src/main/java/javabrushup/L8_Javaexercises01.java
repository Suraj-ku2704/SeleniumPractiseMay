package javabrushup;

import java.util.Scanner;

public class L8_Javaexercises01 {

	public static void main(String[] args) {
		// Java Program to Find Odd or Even number
		
		System.out.println("Enter the number");
		@SuppressWarnings("resource")
		Scanner value = new Scanner(System.in);
		
		int number ;
		number = value.nextInt();
		
		if(number%2 == 0) 
		{
			System.out.println("The number is even number");
		}
		else {
			System.out.println("The number is odd number");
		}

	}

}
