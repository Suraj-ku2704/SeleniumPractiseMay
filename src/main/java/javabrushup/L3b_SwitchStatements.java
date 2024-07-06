package javabrushup;

public class L3b_SwitchStatements {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
		switch (browser) {
		
		case "chrome": System.out.println("Launch chrome browser");
		break;
		case "firefox": System.out.println("Launch firefox browser");
		break;
		case "safari": System.out.println("Launch safari browser");
		break;
		default : System.out.println("Launcg edge");
		break;
		
		}

	}

}
