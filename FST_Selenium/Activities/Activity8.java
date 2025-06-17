package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity8 {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
									
		//Open browser on the page
		driver.get("https://training-support.net/webelements/mouse-events/");
											
		//Page Interactions
		//Page Title
		System.out.println(driver.getTitle());
		
		Actions builder = new Actions(driver);
		WebElement cargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement cargoToml = driver.findElement(By.xpath("//h1[text() = 'Cargo.toml']"));
		WebElement srcFile = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement target = driver.findElement(By.xpath("//h1[text()='target']"));
//		WebElement open = driver.findElement(By.xpath("//"))
		builder.click(cargoLock).pause(5000).click(cargoToml).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		builder.doubleClick(srcFile).pause(5000).contextClick(target).perform();
		builder.click(driver.findElement(By.cssSelector("span.ml-3"))).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		driver.quit();
		//Find all the buttons
		
		//driver.quit();
		
		
		
		
	}

}