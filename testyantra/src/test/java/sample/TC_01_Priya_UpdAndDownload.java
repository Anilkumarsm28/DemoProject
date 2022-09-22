package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01_Priya_UpdAndDownload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		System.out.println("Browser maximised successfully");

		driver.get("https://demoqa.com/links");
		System.out.println("Application launched successfully");

		driver.findElement(By.xpath("//div[@class='element-group']")).click();
		System.out.println("Clicked on Element button successfully");

		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		System.out.println("Action performed succesfully");

		driver.findElement(By.xpath("//span[text()='Upload and Download']")).click();
		System.out.println("Clicked on Upload and Download");
		driver.findElement(By.id("uploadFile")).click();

		driver.close();
		

	}

}
