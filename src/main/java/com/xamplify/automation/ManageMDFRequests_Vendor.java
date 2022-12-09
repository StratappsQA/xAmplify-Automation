package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ManageMDFRequests_Vendor {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\MDF-xAmplify\\src\\main\\resources\\MDF.properties");

	final Logger logger = LogManager.getLogger(ManageMDFRequests_Vendor.class);

	@Test (priority=1,enabled=true)
	public void mdf_request_vendor() throws InterruptedException
	{
		//click on ( + ) icon - view details
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("MDF_leftmenu"))).click(); //click on MDF left menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Manage_MDFRequest_Vendor"))).click(); //click on manage mdf requests in vendor account 
		Thread.sleep(6000);

		String actualresult_tm1=driver.findElement(By.xpath(properties.getProperty("title_grid"))).getText();
		System.out.println("Request title is"+ actualresult_tm1);
		driver.findElement(By.xpath(properties.getProperty("Search_field_MDF"))).sendKeys(actualresult_tm1); //search with request title
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_icon_MDF"))).click(); //click on search icon
		Thread.sleep(3000);
		System.out.println("searched with request title in vendor account");

		//click on (+) icon - and view details
		driver.findElement(By.xpath(properties.getProperty("view_more_columns"))).click(); //click on view more columns icon ('+' icon against to request)
		Thread.sleep(5000);
		//scroll down till webpage end
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
		logger.info("request details displayed when clicks on + icon - vendor");
		driver.findElement(By.xpath(properties.getProperty("hide_more_columns"))).click(); //click on hide icon ('-' icon against to request)
		Thread.sleep(4000);
		logger.info("request details minimized when clicks on - icon - vendor");

		//click on change request - 
		driver.findElement(By.xpath(properties.getProperty("change_request_mdf"))).click(); //click on change requets icon 
		Thread.sleep(3000);
		//scroll down till webpage end
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js5.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(7000);
		logger.info("Scrolled down till end");
		//scroll up till top
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		logger.info("Scrolled up in the web page");
		Thread.sleep(7000);		
		driver.findElement(By.xpath(properties.getProperty("action_button_mdf"))).click(); //click on action button 
		Thread.sleep(3000);	
		driver.findElement(By.xpath(properties.getProperty("changemdf_request"))).click(); //click on change mdf request option
		Thread.sleep(3000);
		logger.info("selected 'Change MDF Request Status & Assignment' option");


	}


}
