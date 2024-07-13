package night;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebayShoes {
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		



}
	@Test
	public void tastcase1() throws InterruptedException {
      JavascriptExecutor js = (JavascriptExecutor)driver;
      
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("gh-ac")));
        
		driver.findElement(By.id("gh-ac")).sendKeys("Shoes");
		
		Thread.sleep(2000);
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-btn")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("gh-btn")));
		
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(2000);
		
		
		
//		js.executeScript("document.getElementById('gh-ac').value='Shoes'");
//		js.executeScript("document.getElementById('gh-btn').click()");
		
		js.executeScript("window.scrollBy(0,4000)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,4000)");
		
		Thread.sleep(2000);
		
		
		
		js.executeScript("window.scrollBy(0,-4000)");
		
		Thread.sleep(2000);
		
	    js.executeScript("window.scrollBy(0,-4000)");
	    
	    Thread.sleep(2000);
	    
	    
	    
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
	    
	    driver.findElement(By.id("gh-ac")).clear();
	    
	    
	    
	    Thread.sleep(2000);
	    
	    driver.close();
	}
}

