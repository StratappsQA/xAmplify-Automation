package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//this class need to run in vendor
public class ViewTrackAnalyticsInVendor extends ExtentReportsClass {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(ViewTrackAnalyticsInVendor.class);
	
	@Test (priority = 311, enabled = true)
	public void analytics_track_vendor() throws InterruptedException, IOException {	
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on add tracks
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("partnertrack"); //search with track
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("analytics_icon"))).click(); //click on analytics icon
		Thread.sleep(5000);
		logger.info("redirected to partner view analytics page ");
		driver.findElement(By.xpath(properties.getProperty("analytics_icon_"))).click(); //click on analytics icon
		Thread.sleep(5000);
		
		
		
		

	}
	
}
