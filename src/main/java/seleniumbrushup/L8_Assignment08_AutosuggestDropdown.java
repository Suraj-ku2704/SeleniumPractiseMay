package seleniumbrushup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L8_Assignment08_AutosuggestDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String country = "australia";

		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("aus");

		List<WebElement> option = driver.findElements(By.cssSelector("ul li div"));

		for (WebElement suggestion : option) {

			if (suggestion.getText().equalsIgnoreCase(country)) {

				suggestion.click();
				break;
			}

		}
		


	}
}
