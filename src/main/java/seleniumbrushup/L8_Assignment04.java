package seleniumbrushup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L8_Assignment04 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement multipleWindows = driver.findElement(By.linkText("Multiple Windows"));

		Actions a = new Actions(driver);
		a.moveToElement(multipleWindows).click().build().perform();

		driver.findElement(By.linkText("Click Here")).click();

		String parentWindowId = driver.getWindowHandle();

		Set<String> windowsList = driver.getWindowHandles();

		for (String str : windowsList) {

			if (!parentWindowId.equals(str)) {

				driver.switchTo().window(str);

				System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());

				driver.switchTo().window(parentWindowId);

				System.out.println(
						driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());

			}
		}

		driver.quit();

	}

}
