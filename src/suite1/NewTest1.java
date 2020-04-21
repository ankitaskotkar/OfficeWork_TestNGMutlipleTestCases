package suite1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void newTest1() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/V4/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	    driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();	
  }
}
