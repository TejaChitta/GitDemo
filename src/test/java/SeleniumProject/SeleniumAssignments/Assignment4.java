package SeleniumProject.SeleniumAssignments;

import java.util.List;
import java.util.Properties;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment4 extends BaseTest{
	
	WebDriver driver;

	@Test
	public void searchProduct() throws Exception {
		
		driver = launchBrowser();
		
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(10);
		driver.findElement(By.cssSelector("input[placeholder='Search for anything']")).sendKeys("Apple Watches");
		WebElement dropDown = driver.findElement(By.id("gh-cat"));
		Select category = new Select(dropDown);
		category.selectByValue("15032");;
		driver.findElement(By.cssSelector("input#gh-btn")).click();
		
		driver.quit();
	}
	
}
