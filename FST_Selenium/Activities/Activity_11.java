/*
Open a new browser to https://training-support.net/webelements/tables
Get the title of the page and print it to the console.
Using xpaths on the table:
Find the number of rows and columns in the table and print them.
Find and print the Book Name in the 5th row.
Click the header of the Price column to sort it in ascending order.
Find and print the Book Name in the 5th row again.
Close the browser.
 */
package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_11 {
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
		
		// return third row
		List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]"));
		for(WebElement cell: thirdRow) {
			System.out.println(cell.getText());
		}
		
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());
		
		//sort by price
		driver.findElement(By.xpath("//table/thead/tr/th[5]"));
				
		//book name in fifth row
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")).getText());
		
		
		
		
	}
}
