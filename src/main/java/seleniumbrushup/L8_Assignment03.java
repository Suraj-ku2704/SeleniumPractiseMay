package seleniumbrushup;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class L8_Assignment03 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			String userName = driver.findElement(By.cssSelector("b:nth-child(1) i:nth-child(1)")).getText();
			String passWord = driver.findElement(By.cssSelector("b:nth-child(2) i:nth-child(1)")).getText();

			driver.findElement(By.id("username")).sendKeys(userName);
			driver.findElement(By.id("password")).sendKeys(passWord);

			driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

			WebElement alertElement = driver.findElement(By.xpath("//div[@class='modal-body']"));

			WebDriverWait WDW = new WebDriverWait(driver, Duration.ofSeconds(10));

			WDW.until(ExpectedConditions.visibilityOf(alertElement));

			System.out.println(alertElement.getText());

			driver.findElement(By.id("okayBtn")).click();

			WebElement selectDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));

			Select dropDown = new Select(selectDropDown);
			

			dropDown.selectByValue("consult");

			driver.findElement(By.name("terms"));
			driver.findElement(By.cssSelector("input#signInBtn")).click();

			// String[] expectedDevices = { "iphone X", "Samsung Note 8", "Nokia Edge",
			// "Blackberry" };
			// addToCart(driver, expectedDevices);
			addToCart(driver);

			driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
			WebElement checkOut = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
			Actions action = new Actions(driver);
			action.moveToElement(checkOut).click().perform();

			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@id='country'])[1]")).sendKeys("India");
			driver.findElement(By.xpath("//a[contains(text(),'India')]")).click();
			driver.findElement(By.id("checkbox2")).click();
			driver.findElement(By.xpath("//input[contains(@class,'btn-success')]")).click();
			System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());

		} catch (Exception e) {
			
			System.out.println("Testing Failed due to below error:");
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}

	}

	// private static void addToCart(WebDriver driver, String[] expectedDevices)
	private static void addToCart(WebDriver driver) {

		List<WebElement> allDevices = driver.findElements(By.cssSelector("h4.card-title"));

		for (int i = 0; i < allDevices.size(); i++) {

//			@SuppressWarnings("rawtypes")
//			List expectedDevicesList = Arrays.asList(expectedDevices);

			// String productName = allDevices.get(i).getText();
			driver.findElements(By.xpath("//div[1]//div[2]//button")).get(i).click();

//			if (expectedDevicesList.contains(productName)) {
//
//				driver.findElements(By.xpath("//div[1]//div[2]//button")).get(i).click();
//			}

		}

	}

}
