package suite2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test(invocationCount=2)
  public void newTest2() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\akotkar\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/V4/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr3492444");							
	    driver.findElement(By.name("password")).sendKeys("amUpen2u");							
	    driver.findElement(By.name("btnLogin")).click();	
  }
}
