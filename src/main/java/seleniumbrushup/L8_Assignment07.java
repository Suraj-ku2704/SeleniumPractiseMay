package seleniumbrushup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L8_Assignment07 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,550)");
		
		Thread.sleep(2000);
		List<WebElement> listOfRows = driver.findElements(By.xpath("//fieldset/table/tbody/tr"));
		int SizeOfRows = listOfRows.size();
		System.out.println(SizeOfRows);
		
		List<WebElement> listOfColumns = driver.findElements(By.xpath("//fieldset/table/tbody/tr/th"));
		int SizeOfColumns = listOfColumns.size();		
		System.out.println(SizeOfColumns);
		
		System.out.println(driver.findElement(By.xpath("//fieldset/table/tbody/tr[3]")).getText());
		
		driver.quit();
	}

}
