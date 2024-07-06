package javabrushup;

import java.util.Scanner;

public class L8_Javaexercises02 {

	public static void main(String[] args) {
		// Java Program to Swap two numbers
		
		System.out.println("Enter the 1st number");
		@SuppressWarnings("resource")
		Scanner firstVariable = new Scanner(System.in);
		int a = firstVariable.nextInt();
		
		System.out.println("Enter the 2nd number");
		@SuppressWarnings("resource")
		Scanner secondVariable = new Scanner(System.in);
		int b = secondVariable.nextInt();
			
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("now 1st number is" +" "+a);
		System.out.println("now 2nd number is" +" "+ b);
		
		// Java Program to Swap two numbers without using third variable
		
		System.out.println("Enter the 3rd number");
		@SuppressWarnings("resource")
		Scanner thirdVariable = new Scanner(System.in);
		int c = thirdVariable.nextInt();
		
		System.out.println("Enter the 4th number");
		@SuppressWarnings("resource")
		Scanner forthVariable = new Scanner(System.in);
		int d = forthVariable.nextInt();
		
		c = c + d;
		d = c - d;
		c = c - d;
		
		System.out.println("now 3rd number is" +" "+ c);
		System.out.println("now 4th number is" +" "+ d);
		
		

	}

}
