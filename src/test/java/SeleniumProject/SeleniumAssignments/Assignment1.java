package SeleniumProject.SeleniumAssignments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1 {

	WebDriver driver;
	
	@BeforeTest
	public void setBrowser() {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\16122\\OneDrive\\Desktop\\Courses\\CPT\\TRAINING\\SOFTWARES\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16122\\OneDrive\\Desktop\\Courses\\CPT\\TRAINING\\SOFTWARES\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.vitshr.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	
	@Test
	public void validTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		//Method 1
				/*if(actualTitle.equals("VITS HR")) {
					System.out.println("PASS");
				}
				else {
					System.out.println("FAIL");
				}*/
				
				//Method 2
		Assert.assertEquals(actualTitle, "VITS HR");
		
		driver.get("https://www.facebook.com");
		driver.navigate().back();
	    System.out.println("URL of the current page : " + driver.getCurrentUrl());
	    driver.navigate().forward();
	    driver.navigate().refresh();
			
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}

}
