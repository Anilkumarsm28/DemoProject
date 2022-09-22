package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
   
    WebDriver driver;
    @BeforeClass
    public void launchbrowser() {
    	//launching the browser
    	WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 Reporter.log("Browser is launched"); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Reporter.log("Browser is maxmixed");
    	
    }
    @AfterClass
    public void closeBrowser() {
    	//Closing the browser
    	driver.close();
    	Reporter.log("Browser is successfully closed");
    }
}
