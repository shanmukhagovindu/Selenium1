package activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity_3 {
	// in testNG we never create main function.
	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void setUp() {
		// initialize driver
		driver = new FirefoxDriver();

		// initialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// open the page
		driver.get("https://training-support.net/webelements/login-form/");
	}

	@Test(priority=1)
	public void loginFailForm() {
		driver.findElement(By.id("username")).sendKeys("adm");
		driver.findElement(By.id("password")).sendKeys("pass");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String message = driver.findElement(By.id("subheading")).getText();
		assertEquals(message, "Invalid credentials");
	}

	@Test(priority = 2)
	public void loginSuccessForm() {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		String message = driver.getTitle();
		assertEquals(message, "Selenium: Login Success!");
	}


	@AfterClass
	public void testDown() {
		// close browser irrespective of test passed/ failed
		driver.quit();
	}
}
