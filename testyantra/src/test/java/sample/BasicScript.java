package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicScript {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//div[text()='Elements']")).click();
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys("Achyut");
		driver.findElement(By.id("lastName")).sendKeys("kembhavi");
		driver.findElement(By.id("userEmail")).sendKeys("achyutkembhavi7@gmail.com");
		driver.findElement(By.id("age")).sendKeys("22");
		driver.findElement(By.id("salary")).sendKeys("1000000");
		driver.findElement(By.id("department")).sendKeys("Testing");
		driver.close();
		driver.get("https://www.pepsi.com");
		
	}


	}


