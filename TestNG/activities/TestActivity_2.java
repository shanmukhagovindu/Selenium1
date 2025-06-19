package activities;


import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity_2 {
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
	
	@Test(priority=1)
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=2)
	public void verifyingPageTitle() {
		assertEquals(driver.getTitle(), "Target Practice");
	}
	
	@Test(priority = 3, enabled=false)
	public void verifyHeadingText() {
		String headingText = driver.findElement(By.tagName("h1")).getText();
		assertEquals(headingText, "Heading #1");
	}
	
	@Test(priority=4)
	public void verifyFooterTest() {
		throw new SkipException("This test is Skipped");
	}
	
	@AfterClass
	public void testDown() {
		//close browser irrespective of test passed/ failed
		driver.quit();
	}
}
