package javabrushup;

public class L8_JavaExercises06 {

	public static void main(String[] args) {

		
		// find string is palindrome or not
		
		String givenText = "Malayalam";
		
		char[] charArray = givenText.toCharArray();
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
		
		if (reversedString.equalsIgnoreCase(givenText)) {
			System.out.println(givenText+" "+ "is a palindrome");
		}
		else {
			System.out.println("Given text is not a palindrome");
		}

	}

}
