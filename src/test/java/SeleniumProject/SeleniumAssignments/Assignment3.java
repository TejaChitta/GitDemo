package SeleniumProject.SeleniumAssignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment3 {
	
	WebDriver driver;
	List<WebElement> allLinksCount;
	
	@Parameters("browser")
	@BeforeTest
	public void setBrowser(String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\16122\\OneDrive\\Desktop\\Courses\\CPT\\TRAINING\\SOFTWARES\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			
			System.setProperty("webdriver.edge.driver", "C:\\Users\\16122\\OneDrive\\Desktop\\Courses\\CPT\\TRAINING\\SOFTWARES\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\16122\\OneDrive\\Desktop\\Courses\\CPT\\TRAINING\\SOFTWARES\\geckodriver.exe");
			driver = new FirefoxDriver();	
		
		}
		else {
			
			throw new Exception("Invalid Browser Name");
			
		}
		
		Thread.sleep(10);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

   }
	
	@Test
	public void getLinkCount() {
		
		allLinksCount = driver.findElements(By.tagName("a"));
		System.out.println("Count of links in the flipkart homepage : "+ allLinksCount.size());
		for(WebElement link : allLinksCount) {
			System.out.println("Text of each link: "+ link.getText());
			System.out.println("URL of each link : "+ link.getAttribute("href"));
			
		driver.quit();
			
		}
		
		
	}
	
	
}
