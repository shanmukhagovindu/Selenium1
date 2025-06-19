package examples;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
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
	
	@Test(groups = { "Car" })
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	@Test(groups = { "Car" })
	public void verifyingPageTitle() {
		assertEquals(driver.getTitle(), "Training Support");
	}
	
	@AfterClass
	public void testDown() {
		//close browser irrespective of test passed/ failed
		driver.quit();
	}
}
