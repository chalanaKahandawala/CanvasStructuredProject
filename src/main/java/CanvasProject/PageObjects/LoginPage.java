package CanvasProject.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CanvasProject.Framework.Elements;
import CanvasProject.Framework.TestDataLoader;

public class LoginPage {
	  
	
	  public static WebDriver driver; 
	  public LoginPage(WebDriver driver) { 
		  LoginPage.driver = driver; 
		  }
	  Elements element = new Elements(LoginPage.driver); 
	  protected String idUsername = "userName"; 
	  protected String idPassword = "pwInput";
	  protected String nameLogin = "submitButton"; 
	  protected String userName = TestDataLoader.getUsername(); 
	  protected String password = TestDataLoader.getPassword();
	  
      WebDriverWait wait = new WebDriverWait(LoginPage.driver, Duration.ofSeconds(20));
	  //Capture elements into web elements 
	  protected WebElement inUsername = element.getElementById(idUsername); 
	  protected WebElement inPassword = element.getElementById(idPassword); 
	  protected WebElement btnLogin = element.getElementByName(nameLogin);
	 	
	  //Login to the system 
	  public WebDriver login(WebDriver driver) throws Exception{
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(idUsername)));
		  inUsername.clear();
		  inUsername.sendKeys(userName); 
		  inPassword.clear();
		  inPassword.sendKeys(password);
		  btnLogin.click(); 
		  PortfoliosPage.driver = driver;
		  Thread.sleep(30);
		  return driver; 
	  }
	 

}
