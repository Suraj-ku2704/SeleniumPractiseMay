package javabrushup;

import java.util.Scanner;

public class L8_Javaexercises04 {

	public static void main(String[] args) {
		// Java Program to Find Factorial on Number
		
		// factorial = n(n-1)
		// 4! = 1*2*3*4
		System.out.println("Enter a number");
		@SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
		int num = number.nextInt();
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			
			fact = fact * i;
			
		}
		
		System.out.println(fact);
		

	}

}
