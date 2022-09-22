package sample;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_05_Achyut_Webtable extends Basetest {

	@Test
	public void testcase1() throws InterruptedException{
		//launching the application
		driver.get("https://demoqa.com/automation-practice-form");
		Reporter.log("Url is triggered");
		WebElement text = driver.findElement(By.xpath("//div[text()='Practice Form']"));
	    assertTrue(text.isDisplayed(),"Url is not triggered");
		
	    //Clicking the element Button
	    driver.findElement(By.xpath("//div[text()='Elements']")).click();
	    Reporter.log("Elements option is clicked");
	    Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        assertTrue(option.isDisplayed(),"Element button is not clicked");
        
        //Clicking the Web Tables Option 
		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		Reporter.log("Webtables Option is clicked");
		WebElement Button = driver.findElement(By.id("addNewRecordButton"));
		assertTrue(Button.isDisplayed(),"Webtables button is not clicked");
		
         //Clicking on addNewRecord Button
		driver.findElement(By.id("addNewRecordButton")).click();
		Reporter.log("add New Record Button is clicked");
		WebElement text1 = driver.findElement(By.xpath("//div[text()='Registration Form']"));
		assertTrue(text1.isDisplayed(),"add new record Button is not clicked");
		
		//Entering the data in First name textfeild
		driver.findElement(By.id("firstName")).sendKeys("Achyut");
		Reporter.log("user is able to enter the data into firstname textfeild");
		WebElement data1 = driver.findElement(By.id("firstName"));
		String ExpectedResult="Achyut";
		String ActualResult=data1.getAttribute("value");
		assertEquals( ExpectedResult, ActualResult,"user is not able to enter the data into firstname textfeild");

		//Entering the data into last name Textfeild
		driver.findElement(By.id("lastName")).sendKeys("kembhavi");
		Reporter.log("user is able to enter data into lastname textfeild");
		WebElement data2 = driver.findElement(By.id("lastName"));
		String ExpectedResult1="kembhavi";
		String ActualResult1=data2.getAttribute("value");
		assertEquals(ExpectedResult1, ActualResult1, "user is not able to enter the data into lastname textfeild");
		
        //Entering the data into the userEmail Textfeild
		driver.findElement(By.id("userEmail")).sendKeys("achyutkembhavi7@gmail.com");
		Reporter.log("user is able to enter data into the useremail textfeild");
		WebElement data3 = driver.findElement(By.id("userEmail"));
		String ExpectedResult2="achyutkembhavi7@gmail.com";
		String ActualResult2=data3.getAttribute("value");
		assertEquals(ExpectedResult2, ActualResult2, "user is not able to enter the data into useremail textfeild");
		
        //Entering the data into the age textfeild
		driver.findElement(By.id("age")).sendKeys("22");
		Reporter.log("user is able to enter the data into the age textfeild");
		WebElement data4 = driver.findElement(By.id("age"));
		String ExpectedResult3="22";
		String ActualResult3=data4.getAttribute("value");
		assertEquals(ExpectedResult3, ActualResult3, "user is not able to enter the data into the age textfeild");
		
        //Entering the data into the salary textfeild
		driver.findElement(By.id("salary")).sendKeys("1000000");
		Reporter.log("user is able to enter the data into the salary textfeild");
		WebElement data5 = driver.findElement(By.id("salary"));
		String ExpectedResult4="1000000";
		String ActualResult4=data5.getAttribute("value");
		assertEquals(ExpectedResult4, ActualResult4, "user is not able to enter the data into the salary textfeild");
		
          //Entering the data into the department textfeild
       driver.findElement(By.id("department")).sendKeys("Testing");
         Reporter.log("user is able to enter the data into the salary textfeild");
         WebElement data6 = driver.findElement(By.id("department"));
         String ExpectedResult5="Testing";
         String ActualResult5=data6.getAttribute("value");
         assertEquals(ExpectedResult5, ActualResult5, "user is able not to enter the data into the salary textfeild");

		//Clicking on Submit Button
         driver.findElement(By.id("submit")).click();
         Reporter.log("Submit button is clicked");
 		WebElement addbutton = driver.findElement(By.id("addNewRecordButton"));
 		assertTrue(addbutton.isDisplayed(),"Submit button is not clicked");

         
		
		
	}


	}


