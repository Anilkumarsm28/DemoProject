package sample;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_07_Anil_Links {
	@Test
	public void Linkspage() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Browser launched successfully");

		// opening links page
		driver.get("https://demoqa.com/links");
		System.out.println("Links page opened successfully");

		// clicking on "Home" link
		driver.findElement(By.id("simpleLink")).click();
		System.out.println("clicked on Home link susccessfully");

		driver.close();

	}
}
