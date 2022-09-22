package sample;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_04_Megha_TextBox {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser Launching Successfully");

		driver.manage().window().maximize();
		System.out.println("Browser window maximized");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/text-box");
		System.out.println("demoqa launched Successfully");

		driver.findElement(By.id("userName")).sendKeys("Megha");
		System.out.println("Username entered Successfully");

		driver.findElement(By.id("userEmail")).sendKeys("meghadmeghad@gmail.com");
		System.out.println("Usermail entered Successfully");

		driver.findElement(By.id("currentAddress")).sendKeys("Katreguppe");
		System.out.println("Current Address entered Successfully");

		driver.findElement(By.id("permanentAddress")).sendKeys("Chitradurga");
		System.out.println("Permanent Address entered Successfully");

//	    driver.findElement(By.id("submit")).click();
//	    System.out.println("Submitted Successfully");

		driver.quit();
		System.out.println("demoqa closed Successfully");

	}
}
