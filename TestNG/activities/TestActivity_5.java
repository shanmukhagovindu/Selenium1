package activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.Color;
public class TestActivity_5 {
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
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test(groups= {"HeaderTests"})
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	@Test(groups= {"HeaderTests"})
	public void verifyingPageTitle() {
		assertEquals(driver.getTitle(), "Selenium: Target Practice");
	}
	
	@Test(groups = {"ButtonTests"})
	public void thirdHeaderVerify() {
		String msg2=driver.findElement(By.cssSelector("button.rounded-xl.bg-emerald-200")).getText();
		assertEquals(msg2, "Emerald");
	}
	
	@Test(groups = {"ButtonTests"})
	public void fifthHeaderVerify() {
		Color msg3=Color.fromString(driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color"));
		assertEquals(msg3.asHex(), "#9333ea");
	}
	@AfterClass
	public void testDown() {
		//close browser irrespective of test passed/ failed
		driver.quit();
	}
}
