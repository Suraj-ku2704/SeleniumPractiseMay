package javabrushup;

public class L7_Method1 {

	public static void main(String[] args) {
		
		L7_Method1 method1 = new L7_Method1();
		method1.getInternalData();
		
		L7_Method2 method2 = new L7_Method2();
		method2.getExternalData();

	}
	
	public void getInternalData() {
		System.out.println("This Line is coming from method inside the same class L7_Method1");
	}

}
