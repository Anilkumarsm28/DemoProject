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

public class UploadAndDownload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		driver.findElement(By.xpath("//div[@class='element-group']")).click();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		//action.sendKeys(Keys.PAGE_DOWN).perform();	
		 driver.findElement(By.xpath("//span[text()='Upload and Download']")).click();
		 //action.sendKeys(Keys.PAGE_UP).perform();
		 driver.findElement(By.id("uploadFile")).click();
	
	}

	}


