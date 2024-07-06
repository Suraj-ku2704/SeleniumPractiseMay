package seleniumbrushup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L8_Assignment05 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
	
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://the-internet.herokuapp.com/");
			
			WebElement listItem = driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]"));
			
			Actions a = new Actions(driver);
			 
			a.moveToElement(listItem).click().perform();
			
			driver.switchTo().frame(0);
			driver.switchTo().frame(1);
			System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
			driver.switchTo().defaultContent();
			driver.navigate().back();
			
			//driver.quit();
		

	}

}
   