package CanvasProject.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * @author ChalanaK
 * @Date: 13Feb2024
 * @Objective: Elements class of the framework.
 * *Capture Elements in different ways.
 */
public class Elements {
	
	  private static WebDriver driver;
	  
	  public Elements(WebDriver driver) { 
		  Elements.driver = driver; 
		  }
	  
	  //Capture elements by ID 
	  public WebElement getElementById(String elementId) {
	  return driver.findElement(By.id(elementId)); 
	  }
	  
	  //Capture elements by Name 
	  public WebElement getElementByName(String elementName) { 
		  return driver.findElement(By.name(elementName)); 
	  }
	 

}
