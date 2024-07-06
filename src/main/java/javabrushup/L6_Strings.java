package javabrushup;

import org.openqa.selenium.devtools.v115.memory.Memory;

public class L6_Strings {

	public static void main(String[] args) {
		
		//String is an object of char elements
		//String can be declared in two ways
		/*1. By String literal -- By String literal, 
		 * Java will check whether the same String value is already exist in the memory.
		 * if exist it will not allocate any new memory for that object, it will reuse the existing Memory.*/
		
		String s1 = "Hello Suraj";
		String s2 = "Hello Suraj";
		
		//2. By "New" keyword
		
		String s3 = new String ("Hello Suraj");
		
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1 == s3: " + (s1 == s3));
		
		System.out.println("s1.equals(s2): " + s1.equals(s2)); 
        System.out.println("s1.equals(s3): " + s1.equals(s3));
		
		/*str1 and str2 are declared using string literals "hello". 
		 * When string literals are used, Java checks if there's already a string with the same value 
		 * in the string pool (a pool of unique strings in memory). 
		 * If yes, it reuses the reference to that string. 
		 * Therefore, str1 and str2 refer to the same memory location, and (str1 == str2) evaluates to true.
		 */
		
		/*str3 is explicitly created using the new keyword, 
		 * which creates a new string object in the heap memory, 
		 * even if there's already a string with the same value in the string pool. 
		 * Therefore, (str1 == str3) evaluates to false.*/
		
		/*However, when comparing the contents of the strings using the equals() method, 
		 * all three strings have the same content, so (str1.equals(str2)) 
		 * and (str1.equals(str3)) both evaluate to true.*/
        
        String s4 = new String ("Selenium is awesome");
        String[] splittedstring = s4.split("is");
        
        int len =  splittedstring.length;
        System.out.println(len);
        
        for (String s : splittedstring) {
			
        	System.out.println(s);
		}
        System.out.println(splittedstring[1].trim());
        
        //how to reverse a string
      
        for (int i = s4.length()-1; i >= 0 ; i--) {
			
        	System.out.println(s4.charAt(i));
		}
	

	}
}
