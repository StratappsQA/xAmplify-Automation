package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AccessSharedAsset extends ExtentReportsClass {
	
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("src/main/resources/AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(AccessSharedAsset.class);

	
	@Test (priority = 215,enabled = true)
	public void sharedasset() throws InterruptedException, IOException {	
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("access_sharedasset"))).click(); //click on access shared asset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("partnerasset"); //search with partnerasset 
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); //click on search icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_asset_view"))).click();  //click on view icon of shared asset
		logger.info("Assetfile has been viewed in partner account successfully");
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_asset_download"))).click();  //click on download button of shared asset
		logger.info("Assetfile has been downloaded in partner account successfully");
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_cross_icon"))).click(); //click on cross icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("partnerasset"); //search with partnerasset 
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); //click on search icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("partner_view_analytics"))).click(); //click on analytics icon
		Thread.sleep(10000);	
		logger.info("Analytics have been viewed succesfully in partner account for the assetfile");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_view"))).click(); //click on view button in analytics
		Thread.sleep(5000);	
		logger.info("displayed only viewed assets");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_download"))).click(); //click on download button in analytics
		Thread.sleep(5000);	
		logger.info("displayed only downloaded assets");
		
		
		
	}
}

