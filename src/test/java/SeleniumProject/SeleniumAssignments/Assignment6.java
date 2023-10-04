package SeleniumProject.SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment6 extends BaseTest{
	
	WebDriver driver;
	
	@Test
	public void dragAndDrop() throws Exception {
		
		try {
			driver = launchBrowser();
			
			driver.get("https://jqueryui.com/droppable/");
			
			Actions act = new Actions(driver);
			
			driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			
			String beforeColor = target.getCssValue("color");
			String hexColorValue = Color.fromString(beforeColor).asHex();
			
			String beforeText = target.getText();
			
			System.out.println("Color before draganddrop : " + hexColorValue);
			System.out.println("Text before draganddrop : " + beforeText);
					
			act.dragAndDrop(source, target).build().perform();
			
			String afterColor = target.getCssValue("color");
			String afterHexColorValue = Color.fromString(afterColor).asHex();
			
			String afterText = target.getText();
			
			System.out.println("Color after draganddrop : "+ afterHexColorValue);
			System.out.println("Text after draganddrop : "+ afterText);
			
			Assert.assertEquals(afterHexColorValue,"#777620");
			Assert.assertEquals(afterText,"Dropped!");
			
			
			driver.quit();
		}catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
		
		
	}
	

}
