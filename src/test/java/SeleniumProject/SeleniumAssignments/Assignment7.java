package SeleniumProject.SeleniumAssignments;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Assignment7 extends BaseTest{
	
	WebDriver driver;
	
	@Test
	public void sendEmail() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\16122\\eclipse-workspace\\SeleniumAssignments\\src\\test\\java\\SeleniumProject\\SeleniumAssignments\\msedgedriver.exe");
		driver = new EdgeDriver();
		
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys("hema.dp05@gmail.com");
		
		Thread.sleep(10);
		
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.name("Passwd")).sendKeys("apple@2015");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		
		
		
		
		
		
		
	}

}
