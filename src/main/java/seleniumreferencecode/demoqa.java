package seleniumreferencecode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class demoqa {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().window().maximize();
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
//		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//		
//		driver.findElement(By.id("userName")).sendKeys("Suraj Unnikrishnan");
//		driver.findElement(By.id("userEmail")).sendKeys("SurajUnnikrishnan@gmail.com");
//		driver.findElement(By.id("currentAddress")).sendKeys("No.2 Jawaharlal street,New Delhi");
//		driver.findElement(By.id("permanentAddress")).sendKeys("No.2 Jawaharlal street,New Delhi");
//		driver.findElement(By.id("submit")).click();
//		String resultTextBox = driver.findElement(By.xpath("//div[contains(@class,'border')]")).getText();
//		System.out.println(resultTextBox);
//		
//		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
//		driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
//		driver.findElement(By.xpath("//span[text()='Desktop']")).click();
//		String resultCheckBox = driver.findElement(By.xpath("//div[@class='display-result mt-4']")).getText();
//		System.out.println(resultCheckBox);
//		
//		Thread.sleep(2000);
		
//		WebElement radioButtonTab = driver.findElement(By.xpath("//span[text()='Radio Button']"));
////		Actions act = new Actions(driver);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioButtonTab);
//		//act.scrollToElement(radioButtonTab).click().perform();
//		//act.click().perform();
//		radioButtonTab.click();
//		Thread.sleep(2000);
//		//driver.findElement(By.xpath("//div[contains(@class,'mb')]")).getText();
//		WebElement radioButton = driver.findElement(By.id("impressiveRadio"));
//		boolean checkSelected = radioButton.isSelected();
//		
//		
//		if (checkSelected == false)
//		radioButton.click();
//		driver.findElement(By.xpath("//span[@class='text-success']")).getText();
		

		
		
	}

}
