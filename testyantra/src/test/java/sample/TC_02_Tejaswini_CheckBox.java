package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_02_Tejaswini_CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		driver.get("https://demoqa.com/checkbox");
		System.out.println("Application launched successfully");
		driver.findElement(By.className("rct-checkbox")).click();
		System.out.println("successfully clicked on checkbox module");
		driver.close();
		System.out.println("Application closed successfully");

	}
}
