package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_10 {
	public static void main(String[] args) throws InterruptedException {
			
			
			// Initialize driver
			WebDriver driver = new FirefoxDriver();
			Actions builder = new Actions(driver);
			
			//open the browser
			
			driver.get("https://training-support.net/webelements/drag-drop");
			
			//page interactions
			//print the page title
			System.out.println(driver.getTitle());
			
			WebElement ball = driver.findElement(By.id("ball"));
			WebElement dropZone1 = driver.findElement(By.id("dropzone1"));
			WebElement dropZone2 = driver.findElement(By.id("dropzone2"));
			builder.dragAndDrop(ball, dropZone1).build().perform();
			System.out.println(driver.findElement(By.className("dropzone-text")).getText());
			
//			builder.dragAndDrop(ball, dropZone2).build().perform();
			
			builder.clickAndHold(ball).moveToElement(dropZone2).release().build().perform();
			System.out.println(dropZone2.getText());
			
//			builder.click().moveToElement(null);
			driver.quit();
	}
}
