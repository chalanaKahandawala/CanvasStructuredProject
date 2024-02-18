package CanvasProject.Test;

import org.openqa.selenium.WebDriver;
import CanvasProject.Framework.Base;
import CanvasProject.Framework.TestDataLoader;
import CanvasProject.PageObjects.LoginPage;
import CanvasProject.PageObjects.PortfoliosPage;

//import org.testng.Assert;
//import org.testng.annotations.Test;

public class AddModulesComputerAndMouse {
	
	public static void main(String[] args) throws Exception {
		
		//Launch Xyicon page 
		Base base = new Base(); 
		WebDriver driver = base.navigateToTheUrl(TestDataLoader.getData("url"));

		//Verify whether the correct page loaded
		//Asser.isTrue(driver.getTitle().equals("Xyicon"),"Login page loaded successfully", args);
		  
		//Login 
		LoginPage.driver = driver;
		LoginPage loginPage = new LoginPage(driver); 
		driver =  loginPage.login(driver);
	  
	  //Select portfolio 
	  PortfoliosPage portfolioPage = new PortfoliosPage(driver);
	  portfolioPage.selectPortfolio("Ross Holdings");
	  
	  //Select hamberger button
	  portfolioPage.clickHamberger();
	  
	  //Select Spaces from left nav lst
	  portfolioPage.clicFromNavList("Spaces");
	  
	  
//	  Assert.isTrue(false, null, args);
	 
		
		
	}

}
