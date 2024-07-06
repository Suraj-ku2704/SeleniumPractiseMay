package javabrushup;

public class L2_Arrays {

	public static void main(String[] args) {
		
		/*array can we declared in either of the 2 ways below:
		int[] ar 
		int ar[]*/
		
		int[] ar1 = new int[5];
		ar1[0] = 11;
		ar1[1] = 22;
		ar1[2] = 33;
		ar1[3] = 44;
		ar1[4] = 55;
		
		for (int i = 0; i < ar1.length; i++) {
			
			System.out.println(ar1[i]);
			
		}
		
		System.out.println("******************");
		
		int ar2[];
		ar2 = new int[4];
		ar2[0] = 23;
		ar2[1] = 26;
		ar2[2] = 28;
		ar2[3] = 30;
		
		for (int i = 0; i < ar2.length; i++) {
			
			System.out.println(ar2[i]);
		}
		
		System.out.println("******************");
		
		//array can also be initialized in one line as below
		
		int[] ar3 = {24,36,48,60};
		

		for (int i = 0; i < ar3.length; i++) {
			
			System.out.println(ar3[i]);
		}
		
		//default values of an array will be zero..run below
		
		System.out.println("******************");
		
		int[] ar4 = new int[5];
		
		for (int i = 0; i < ar4.length; i++) {
			
			System.out.println(ar4[i]);
		}
	}

}
