package CanvasProject.PageObjects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CanvasProject.Framework.Elements;

public class PortfoliosPage {
	static WebDriver driver;
	Elements element = new Elements(driver);
	protected String xpathRoseHoldings = "//div[@data-key='7e9857a3-060f-4097-9aec-8e2e623305aa']";
	  
	
	public PortfoliosPage(WebDriver driver) {
		this.driver = driver;
	}
	protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	protected String header ="//h3[text()='Portfolios']";
	protected String xpathNavSpaces = "//li[@class='SideBarNavItem navItem'][2]";
	
	
	
	
	//checking whether the page header is present
	public boolean isHeaderPresent() {
		//Page header element
		WebElement pageHeader = driver.findElement(By.xpath(header));
		return pageHeader.isDisplayed();
	}
	
	//Click select portfolio 
	public void selectPortfolio(String portfolioName){
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(header)));
		WebElement chkbxRoseHoldings = driver.findElement(By.xpath(xpathRoseHoldings));	
		if (!chkbxRoseHoldings.isSelected()) {
			chkbxRoseHoldings.click();
		}
		switch (portfolioName) {
		case "Ross Holdings":
			driver.findElement(By.id("c6b2f67f-3ba0-47d1-bf2f-c8e541955f71")).click();
			break;

		default:
			break;
		}
	}
	
	public void clickHamberger() {
		 WebElement btnHamberger = driver.findElement(By.xpath("//span[@class='navButton button']"));
		btnHamberger.click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathNavSpaces)));
	}
	
	public void clicFromNavList(String listItem) {
		switch (listItem) {
		case "Spaces":
			WebElement navSpaces= driver.findElement(By.xpath(xpathNavSpaces));
			wait.until(ExpectedConditions.elementToBeClickable(navSpaces));
			navSpaces.click();
			break;

		default:
			break;
		}
	}

}
