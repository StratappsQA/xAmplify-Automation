package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//This class need to run in partner account
public class AccessSharedTrackInPartner {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(AccessSharedTrackInPartner.class);


	//view and download track in partner account
	@Test (enabled=true)
	public void view_track_partner() throws InterruptedException, IOException {	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu in partner account
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("access_sharedtrack"))).click(); //click on access shared tracks
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("partnertrack"); //search with partnertrack
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("view_click"))).click(); //click on view icon against to track
		Thread.sleep(5000);
		logger.info("view icon has been clicked agaisnt to partner track");			
		driver.findElement(By.xpath(properties.getProperty("asset_viewicon_click"))).click(); //click on view icon of track
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("asset_view_button"))).click(); //click on view icon of asset
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("asset_crossicon"))).click(); //click on view button of asset
		Thread.sleep(5000);
		logger.info("asset viewed successfully");	
		driver.findElement(By.xpath(properties.getProperty("form_view_icon"))).click(); //click on view icon of form
		Thread.sleep(5000);
		logger.info("quiz-form viewed successfully");

		//submitting form by providing mandatory data in the quiz form
		driver.findElement(By.xpath(properties.getProperty("quizform_email"))).sendKeys(properties.getProperty("quizform_email_id")); // entering email id
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("quizform_biganimal"))).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("quizform_largestcity"))).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("quizform_valves"))).click(); 
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath(properties.getProperty("quizform_submitbutton"))).click(); 
		Thread.sleep(5000);
		//driver.findElement(By.xpath(properties.getProperty("form_cross_icon"))).click(); //click on cross icon after form viewed
		//Thread.sleep(5000);
		logger.info("quiz-form submitted successfully");
		driver.findElement(By.xpath(properties.getProperty("asset_viewicon_click"))).click(); //click on view icon of track
		Thread.sleep(5000);
		//click on download
		driver.findElement(By.xpath(properties.getProperty("asset_download_button"))).click(); //click on download button of track
		Thread.sleep(5000);
		logger.info("asset downloaded succesfully");	
		logger.info("partner-track has been viewed and downloaded in partner account");

	}

}
