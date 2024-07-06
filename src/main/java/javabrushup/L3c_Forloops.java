package javabrushup;

public class L3c_Forloops {

	public static void main(String[] args) {
		
		//For loop declaration can be done in 2 ways
		//1. basic for loop as below
		
		int[] days = {1,2,3,4,5,6,7};
		
		for (int i = 0; i < days.length; i++) {
			
			System.out.println(days[i]);
		}
		
		String[] weekdays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		for (int i = 0; i < weekdays.length; i++) {
			
			System.out.println(weekdays[i]);
		}
		
		//advance for loop
		
		for ( String w: weekdays)
		{
			System.out.println(w);
		}
		
		//for loop with conditional statements
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < arr1.length; i++) {
			
			if (arr1[i] % 2 == 0)
			{
				System.out.println(arr1[i]);
				break;
			}
			else
			{
				System.out.println("Odd number");
			}
		}

	}

}
