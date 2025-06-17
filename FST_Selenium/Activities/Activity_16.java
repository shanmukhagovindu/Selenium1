/*
 * find the number of rows and columns in the table and print them
 * find and click the add row button
 * find the newly added row and add the following data
 * 		id: 10
 * 		book name: Hover Car Racer
 * 		Author: Matthew Reilly
 * 		ASIN:  0330440160
 * 		Price: $ 7
 * print the data from the newly added row
 */
package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_16 {
	public static void main(String[] args) throws InterruptedException {
			
			
			// Initialize driver
			WebDriver driver = new FirefoxDriver();
			Actions builder = new Actions(driver);
			
			//open the browser
			
			driver.get("https://training-support.net/webelements/tables");
			
			//page interactions
			//print the page title
			System.out.println(driver.getTitle());
			
			List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
			List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
			System.out.println("rows: "+ rows.size()); //no of rows
			System.out.println("cols: " + cols.size()); //no of cols
			
			driver.findElement(By.xpath("//button[contains(text(),'Add Row')]")).click();
			String[] dataToAdd = {"10", "Hover Car Racer", "Mathew Reilly", "0330440160", "$7.99"};
			for(int i=0; i<dataToAdd.length;i++) {
				By lastRowCells = By.xpath("//table/tbody/tr[last()]/td["+(i+1)+"]");
				driver.findElement(lastRowCells).clear();
	        	driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
	        }
			//ID:10 Book Name: Hover Car Racer
			//Author: Mathew Reilly ASIN: 0330440160
			//price: $7.99
			//print the data from the newly added row
	        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());
	}
}
