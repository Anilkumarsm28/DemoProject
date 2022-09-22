package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_03_Vani_Radiobutton 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.manage().window().maximize();
		
		//browser launched
		driver.get("https://demoqa.com/dynamic-properties");
		System.out.println("Browser successfully launched");
		//To scroll page down
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		//clicking on Radio button element
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		System.out.println("Successfully clicked on Radio button Element");
		
		//clicking on yes Radio button
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		System.out.println("Successfully clicked on yes Radio button");
	}
	


	}


