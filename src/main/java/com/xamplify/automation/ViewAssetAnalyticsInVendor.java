package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ViewAssetAnalyticsInVendor {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(ViewAssetAnalyticsInVendor.class);

	
	//view detailed anaytics of png asset in vendor account after partner viewed and downloaded the asset in partner account
	@Test (priority = 0, enabled=false)
	public void viewanalyticsvendorpng() throws InterruptedException, IOException {	
		
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	//click on managemyasset
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("partnerasset"); //search with partnerasset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon"))).click(); //click on analytics icon agaisnt to asset
		Thread.sleep(3000);	
		logger.info("analytics icon has been clicked against to asset");
		driver.findElement(By.xpath(properties.getProperty("viewanalytics_partner"))).click(); // click analytics of partner
		Thread.sleep(3000);
		logger.info("analytics icon has been clicked against to partner");

		driver.findElement(By.xpath(properties.getProperty("partner_only_view"))).click(); //click on view button in analytics
		Thread.sleep(5000);	
		logger.info("displayed only viewed assets");	
		driver.findElement(By.xpath(properties.getProperty("partner_only_download"))).click(); //click on download button in analytics
		Thread.sleep(5000);	
		logger.info("displayed only downloaded assets");
		driver.findElement(By.xpath(properties.getProperty("searchloc"))).sendKeys("India"); //search with India
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
		Thread.sleep(5000);
		logger.info("searched with India");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in detailed anayltics page
		Thread.sleep(5000);
		logger.info("cross icon has been clicked");
		logger.info("detailed anaytics of asset are viewed in vendor account after partner viewed&downloaded the asset");
		driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in parnter info page
			
	}
	
	
	//view detailed anaytics of pdf asset in vendor account after partner viewed and downloaded the asset in partner account
		@Test (priority = 1)
		public void viewanalyticsvendorpdf() throws InterruptedException, IOException {		
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("ManageMyAssets"))).click();	//click on managemyasset
			Thread.sleep(5000);		
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("pdf"); //search with pdf
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("viewanalytics_icon"))).click(); //click on analytics icon agaisnt to asset
			Thread.sleep(3000);	
			logger.info("analytics icon has been clicked against to pdf asset");
			driver.findElement(By.xpath(properties.getProperty("viewanalytics_partner"))).click(); // click analytics of partner
			Thread.sleep(3000);
			logger.info("analytics icon has been clicked against to partner");
			driver.findElement(By.xpath(properties.getProperty("partner_only_view"))).click(); //click on view button in analytics
			Thread.sleep(5000);	
			logger.info("displayed only viewed pdf assets");	
			driver.findElement(By.xpath(properties.getProperty("partner_only_download"))).click(); //click on download button in analytics
			Thread.sleep(5000);	
			logger.info("displayed only downloaded pdf assets");
			driver.findElement(By.xpath(properties.getProperty("searchloc"))).sendKeys("India"); //search with India
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			Thread.sleep(5000);
			logger.info("searched with India");
			driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in detailed anayltics page
			Thread.sleep(5000);
			logger.info("cross icon has been clicked");
			logger.info("detailed anaytics of pdf asset are viewed in vendor account after partner viewed&downloaded the pdf asset");
			driver.findElement(By.xpath(properties.getProperty("crossicon_click"))).click(); //click on cross icon in parnter info page
				
		}
}
