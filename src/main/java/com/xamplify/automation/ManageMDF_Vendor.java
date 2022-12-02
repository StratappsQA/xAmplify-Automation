package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ManageMDF_Vendor {
	
	
	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\MDF-xAmplify\\src\\main\\resources\\MDF.properties");

final Logger logger = LogManager.getLogger(ManageMDF_Vendor.class);
	@Test (priority=1,enabled=true)
	public void Add_MDF_Amount() throws InterruptedException
	{
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDF"))).click(); //click on manage mdf details 
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF"))).sendKeys("automatedpartner"); //search with automated partner
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("edit_icon_MDF"))).click(); //click on edit icon against to automatedpartner to add mdf amount
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("enteramount_MDF"))).sendKeys("100"); //enter 100 in enter amount field
		Thread.sleep(7000);	
		driver.findElement(By.xpath(properties.getProperty("description_MDF"))).sendKeys("Adding mdf funds"); //enter description
		Thread.sleep(7000);
		logger.info("Amount and description provided in the text fields");
		driver.findElement(By.xpath(properties.getProperty("updatebutton_MDF"))).click(); //click on update button
		Thread.sleep(5000);
		logger.info("update button has been clicked");
		driver.findElement(By.xpath(properties.getProperty("okbutton_popup_MDF"))).click(); //click on OK on success popup
		Thread.sleep(5000);
		logger.info("OK button has been clicked on success pop up and funds added successfully");

		//click on view history icon and view the history
		driver.findElement(By.xpath(properties.getProperty("historyicon_MDF"))).click(); //click on view history icon
		Thread.sleep(5000);
		//scroll down till webpage end
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
        //scroll up till top
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		logger.info("Scrolled up in the web page");
		Thread.sleep(7000);
        driver.findElement(By.xpath(properties.getProperty("crossicon_MDF"))).click(); //click on cross icon in view history page
		Thread.sleep(5000);
		logger.info("cross icon has been clicked in view history page");	
		
	}
	





}
