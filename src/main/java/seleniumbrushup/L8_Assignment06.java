package seleniumbrushup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L8_Assignment06 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			WebElement checkBox = driver.findElement(By.xpath("//input[@name='checkBoxOption2']"));
			String checkBoxText = checkBox.getAttribute("value");
			System.out.println(checkBoxText);
			checkBox.click();
			
			WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
			Select dropDownSelect = new Select(dropDown);
			dropDownSelect.selectByValue(checkBoxText);
			driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys(checkBoxText);
			driver.findElement(By.cssSelector("input#alertbtn")).click();
			
			Alert a = driver.switchTo().alert();
			String alertText = a.getText();
			
			if (alertText.contains(checkBoxText)) {
				
				System.out.println("Alert contains the expected text :"+" "+ checkBoxText);
			};
			a.accept();
			
		} finally {
			driver.quit();
		}

	}

}
