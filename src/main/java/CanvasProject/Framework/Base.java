package CanvasProject.Framework;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * @author ChalanaK
 * @Date: 13Feb2024
 * @Objective: Base class of the framework.
 * *Initializes the webdriver
 * *Handle basic webdriver features
 */
public class Base {
	
	  private WebDriver driver;
	  
	  //Initialize webdriver. 
	  public WebDriver navigateToTheUrl(String url) throws InterruptedException { 
	  System.setProperty("webdriver.chrome.driver","E:/GitHub/CanvasStructuredProject/config/chromedriver/chromedriver.exe"); 
	  WebDriver driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.get(url); 
	  Thread.sleep(30);
	  return driver;
	  
	  }
	  
	  //Close webdriver. 
	  public void closeWebDriver() { 
		  if (driver != null) {
			  driver.quit(); 
			  } 
		  }
	 
}
	
