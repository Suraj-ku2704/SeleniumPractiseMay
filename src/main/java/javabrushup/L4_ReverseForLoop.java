package javabrushup;

public class L4_ReverseForLoop {

	public static void main(String[] args) {
		// create an array of 5 number
		
		int[] elements = {1,2,4,8,16,32};
	
		// print the first and last values of the array
		
		System.out.println(elements[0]);
		System.out.println(elements[elements.length-1]);
		
		// print the array with reverse order
		
		for (int i = elements.length-1; i > 0; i--) {
			
			System.out.println(elements[i]);
		}
		// print the total number of elements in that array
		
		System.out.println(elements.length);

	}

}
