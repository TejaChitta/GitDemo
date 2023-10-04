package SeleniumProject.SeleniumAssignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16122\\OneDrive\\Desktop\\Courses\\CPT\\TRAINING\\SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.fb.com");
		
		String expectedUrl = "https://www.facebook.com/";
		
		Assert.assertEquals(expectedUrl, driver.getCurrentUrl(),"Url is not as expected");
		
		//Checking for the Create new account element in the webpage
		driver.findElement(By.linkText("Create new account")).isDisplayed();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
	
		driver.findElement(By.name("firstname")).sendKeys("Shravani");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Reddy");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("hema.dp05@gmail.com");
		
		Thread.sleep(5);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("hema.dp05@gmail.com");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("#abcd123A");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select month_dropdown = new Select(month);
		month_dropdown.selectByValue("12");
		
		WebElement day = driver.findElement(By.cssSelector("select[title='Day']"));
		Select day_dropdown = new Select(day);
		day_dropdown.selectByVisibleText("25");
		
		WebElement year = driver.findElement(By.cssSelector("select[title='Year']"));
		Select year_dropdown = new Select(year);
		year_dropdown.selectByValue("1992");
		
		driver.findElement(By.cssSelector("label[class='_58mt']")).click();
		driver.findElement(By.name("websubmit")).click();
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Continue')]")));
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		
		
		
		driver.quit();
		
		
	}

}
