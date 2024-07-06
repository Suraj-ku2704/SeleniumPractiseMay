package javabrushup;

import java.util.Arrays;

public class L8_JavaExercises05 {

	public static void main(String[] args) {

		int[] num = { 2, 5, 4, 6, 7, 1, 9 };

		Arrays.sort(num);

		int[] sortedNum = num;

		System.out.println(Arrays.toString(sortedNum));

		for (int i = 0; i < sortedNum.length; i++) {

			if (sortedNum[i] % 2 == 0) {
				System.out.println("The number" + " " + sortedNum[i] + " " + "is even number");
			}
		}

		System.out.println("*********************************************");

		for (int i : num) {

			if (i % 2 == 0) {
				System.out.println("Foreach: The number" + " " + i + " " + "is even number");
			}
		}

		// Print String in reverse

		String text = "LearningJava";

		char[] charArray = text.toCharArray();

		int leftIndex = 0, rightIndex = charArray.length - 1;
		char temp ;

		while (leftIndex < rightIndex) {

			temp = charArray[leftIndex];
			charArray[leftIndex] = charArray[rightIndex];
			charArray[rightIndex] = temp ;

			leftIndex++;
			rightIndex--;
		}

		String reversedString = new String(charArray);
		System.out.println("Reveresed String is :" +" "+reversedString);
		

	}
}
