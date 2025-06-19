package examples;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
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
	
	@Test
	public void testMethod1() {
		System.out.println("Test method 1 executed");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("Test method 2 executed");
	}
	
	@AfterClass
	public void testDown() {
		//close browser irrespective of test passed/ failed
		driver.quit();
	}
}
