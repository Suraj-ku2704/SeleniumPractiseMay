package seleniumbrushup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class L8_Assignment01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		WebElement checkBoxOption1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));		
		checkBoxOption1.click();	
		Assert.assertTrue(checkBoxOption1.isSelected());
		
		Thread.sleep(2000);
		checkBoxOption1.click();
		Assert.assertFalse(checkBoxOption1.isSelected());
		
		List<WebElement> checkBoxList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(checkBoxList.size());
	}

}
