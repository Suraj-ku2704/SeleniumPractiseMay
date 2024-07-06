package seleniumbrushup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L8_Assignment02 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("name")).sendKeys("Ajay");
		driver.findElement(By.name("email")).sendKeys("Ajay@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test123");

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		if (checkbox.isSelected()) {
			System.out.println("Checkbox is already selected");

		} else {

			checkbox.click();
		}

		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));

		Select selectDropDown = new Select(dropdown);
		selectDropDown.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("27-04-1993");
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		String successMsg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"))
				.getText();

		System.out.println(successMsg);

		 driver.quit();
	}

}
