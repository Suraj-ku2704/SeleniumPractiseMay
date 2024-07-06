package seleniumbrushup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class L8_Locators01 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		//Thread.sleep(2000);
		driver.findElement(By.className("search-keyword")).sendKeys("Beetroot");
		//Thread.sleep(2000);
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='increment']")));
		

		for (int i = 0; i < 4; i++) {
			driver.findElement(By.xpath("//a[@class='increment']")).click();
		}

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoInfo")));
		String promoInfo = driver.findElement(By.className("promoInfo")).getText();
		System.out.println(promoInfo);

		// input[@class='promoCode']

		String totalDiscountAmount = driver.findElement(By.xpath("//span[@class='discountAmt']")).getText();
		System.out.println("Total Amount after discount is " + " " + totalDiscountAmount);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		//Thread.sleep(2000);
		WebElement countryDropdown = driver.findElement(By.xpath("//div[@class='wrapperTwo']/div/select"));
		Select staticDropdown1 = new Select(countryDropdown);
		staticDropdown1.selectByValue("Australia");
		staticDropdown1.selectByVisibleText("India");
		staticDropdown1.selectByIndex(1);

//		WebElement firstSelected = staticDropdown1.getFirstSelectedOption();
//		String firstValue = firstSelected.getText();
//		System.out.println(firstValue);

		// Above code can be written in one line as shown below

		System.out.println(staticDropdown1.getFirstSelectedOption().getText());

		WebElement agreeCheckbox = driver.findElement(By.xpath("//input[@class='chkAgree']"));

		Assert.assertEquals((agreeCheckbox.isSelected()), false);

		if (agreeCheckbox.isSelected()) {
			System.out.println("Terms & conditions already selected");
		} else {
			agreeCheckbox.click();
		}
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		//Thread.sleep(3000);
		driver.quit();
	}

}
