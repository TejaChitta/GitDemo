package SeleniumProject.SeleniumAssignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment5 extends BaseTest {
	
	WebDriver driver;

	@Test
	public void registerCompany() throws Exception {
		
		
		driver = launchBrowser();
		
		driver.get("https://www.vitshr.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.name("companyName")).sendKeys("Labcorp Private Limited");
		driver.findElement(By.name("companyWebsite")).sendKeys("www.labcorp.com");
		driver.findElement(By.name("phoneNo")).sendKeys("612 576 6772");

		
//		driver.findElement(By.xpath("//div[4]//div[1]//div[1]//input[1]")).click();
//		
//		Set<String> windows = driver.getWindowHandles();
//		Iterator<String> it = windows.iterator();
//		String parentId = it.next();
//		String childId = it.next();
//		
//		driver.switchTo().window(childId);
//		driver.findElement(By.cssSelector("input[placeholder='Enter a location']")).sendKeys("abcd");


		driver.findElement(By.name("zipcode")).sendKeys("55311");
		driver.findElement(By.name("fein")).sendKeys("11-11111111");
		driver.findElement(By.name("employerIdentificationNumber")).sendKeys("111111");
		driver.findElement(By.name("email")).sendKeys("hema.dp05@gmail.com");
		driver.findElement(By.name("loginId")).sendKeys("labcorp2023");
		driver.findElement(By.name("password")).sendKeys("labcorp2023");
		driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]")).click();
	
		//driver.quit();
	}


}
