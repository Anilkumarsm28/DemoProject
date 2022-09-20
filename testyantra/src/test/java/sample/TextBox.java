package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("Megha");
		driver.findElement(By.id("userEmail")).sendKeys("meghadmeghad@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Katreguppe");
		driver.findElement(By.id("permanentAddress")).sendKeys("Chitradurga");
		driver.findElement(By.id("submit")).click();
	}
}
