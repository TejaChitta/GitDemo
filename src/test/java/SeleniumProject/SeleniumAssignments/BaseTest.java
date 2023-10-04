package SeleniumProject.SeleniumAssignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	WebDriver driver;
	
	public WebDriver launchBrowser() throws InterruptedException, IOException {
		
			Properties prop = new Properties();
			FileInputStream fis;
			try {
				fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\SeleniumProject\\SeleniumAssignments\\GlobalData.properties");
				prop.load(fis);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String browser = prop.getProperty("browser");
			//System.out.println(browser);
			
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
				
				System.out.println("Invalid Browser Name");
				
			}
			
			Thread.sleep(10);
			driver.manage().window().maximize();
			
			return driver;
			
			
		}
		
		

}
