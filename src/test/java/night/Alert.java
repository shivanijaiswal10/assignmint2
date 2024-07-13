package night;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alert {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html#google_vignette");
		
	}
	@Test
	public void testCase1() throws InterruptedException {
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(2000);
         driver.switchTo().alert().accept();
         
         driver.findElement(By.id("confirmBox")).click();
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
         Thread.sleep(2000);
         driver.findElement(By.id("promptBox")).click();
         Thread.sleep(2000);
//         Alert al  = driver.switchTo().alert().accept();
         driver.switchTo().alert().accept();
         Thread.sleep(4000);
        
         Thread.sleep(2000);
         driver.switchTo().alert().accept();
         driver.close();
         
         
         
	 
	}
		


}

