package activities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity_1  {
	//in testNG we never create main function.
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setUp() {
		//initialize driver
		driver = new FirefoxDriver();
		
		//initialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//open the page
		driver.get("https://training-support.net");
	}
	
	
	@Test(priority=0)
	public void verifyingPageTitle() {
		assertEquals(driver.getTitle(), "Training Support");
	}
	@Test(priority=1)
	public void verifyingAboutPage() {
		driver.findElement(By.linkText("About Us")).click();
		wait.until(ExpectedConditions.titleContains("About"));
		assertEquals(driver.getTitle(), "About Training Support");
	}
	
	@AfterClass
	public void testDown() {
		//close browser irrespective of test passed/ failed
		driver.quit();
	}
}
