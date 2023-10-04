package Cucumber.stepdefinition;

import java.io.FileReader;
import java.time.Duration;
import java.io.BufferedReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.opencsv.CSVReader;

import SeleniumProject.SeleniumAssignments.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionAssignment8 {
	
	 WebDriver driver;

	
	@Given("^User navigates to Facebook website$")
	public void user_navigates_to_facebook_website() throws Exception {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16122\\OneDrive\\Desktop\\Courses\\CPT\\TRAINING\\SOFTWARES\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("^User reads username and password from testdatafile (.+) and clicks on the login button$")
	public void user_enters_username_and_password_from_testdatafile_and_clicks_on_the_login_button(String file) throws Exception {
	   
		CSVReader reader = new CSVReader(new FileReader(file));
		String[] cell;
		reader.skip(1);
		while((cell=reader.readNext())!=null) {
			
			for(int i=0; i<1;i++) {
				
				System.out.println(cell.length);
				
				String username = cell[i];
				String password = cell[i+1];
				
				driver.findElement(By.id("email")).sendKeys(username);
				driver.findElement(By.name("pass")).sendKeys(password);
				driver.findElement(By.name("login")).click();
				driver.findElement(By.className(".x1b0d499.xi3auck")).click();
				driver.findElement(By.name("Log Out")).click();
				
			}
			
		}
		
	}

	@Then("{string} title should be displayed")
	public void title_should_be_displayed(String string) {
	    
		String actualValue = driver.getTitle();
		Assert.assertTrue(actualValue.equalsIgnoreCase(string));
		
	}

}
