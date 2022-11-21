package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadAssetVideo {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(UploadAssetVideo.class);




	//uploading MP4 file - video asset
	@Test (priority=0)
	public void uploadMP4() throws InterruptedException, IOException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\asset_MP4.exe"); //uploading mp4 file
		logger.info("asset mp4 file uploaded");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		logger.info("thumbnail uploaded");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //upload thumbnail
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click(); //click on save chnages button
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mp4_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_plusicon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_text_click"))).click();
		//	driver.findElement(By.xpath(properties.getProperty("tag_text_click"))).sendKeys(properties.getProperty("tag_name"));
		WebElement enter=driver.findElement(By.xpath(properties.getProperty("tag_text_click")));
		enter.sendKeys(properties.getProperty("tag_name")+ "_" + System.currentTimeMillis());
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(properties.getProperty("tag_savebutton"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_select"))).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description"); //enter description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Submit"))).click(); //click on submit
		Thread.sleep(15000);
		logger.info("Asset mp4 uploaded succesfully");
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();	//click on refresh icon		
		Thread.sleep(5000);

		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for success message of mp4 file ");
	}




	//uploading AVI file 
	@Test (priority=1)
	public void uploadaAVI() throws InterruptedException, IOException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\asset_AVI.exe"); //uploading avi file
		logger.info("asset file uploaded");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		logger.info("thumbnail uploaded");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //uploading thumbnail
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("avi_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_plusicon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_text_click"))).click();
		WebElement enter=driver.findElement(By.xpath(properties.getProperty("tag_text_click")));
		enter.sendKeys(properties.getProperty("tag_name")+ "_" + System.currentTimeMillis());
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(properties.getProperty("tag_savebutton"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_select"))).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
		Thread.sleep(10000);
		logger.info("Asset AVI uploaded succesfully");
		Thread.sleep(10000);
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of avi file");
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon
	}

	//upload MOV file	
	@Test (priority=2)
	public void uploadMOV() throws InterruptedException, IOException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\asset_MOV.exe"); //uploading mov file
		logger.info("asset file uploaded");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); 
		logger.info("thumbnail uploaded");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //uploading thumbnail
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mov_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_plusicon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_text_click"))).click();
		WebElement enter=driver.findElement(By.xpath(properties.getProperty("tag_text_click")));
		enter.sendKeys(properties.getProperty("tag_name")+ "_" + System.currentTimeMillis());
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(properties.getProperty("tag_savebutton"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_select"))).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
		Thread.sleep(10000);
		logger.info("Asset MOV uploaded succesfully");
		Thread.sleep(10000);

		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";

		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for uploadsucess message of mov file");
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon
	}			

	//upload MKV file -
	@Test (priority=3)
	public void uploadMKV() throws InterruptedException, IOException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\asset_MKV.exe"); //uploading mkv file
		logger.info("asset file uploaded");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		logger.info("thumbnail uploaded");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //uploading thumbnail
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click(); //click on save changes
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mkv_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_plusicon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_text_click"))).click();
		WebElement enter=driver.findElement(By.xpath(properties.getProperty("tag_text_click")));
		enter.sendKeys(properties.getProperty("tag_name")+ "_" + System.currentTimeMillis());
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(properties.getProperty("tag_savebutton"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_select"))).click();
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
		Thread.sleep(10000);
		logger.info("Asset MKV uploaded succesfully");
		Thread.sleep(10000);
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Thread.sleep(10000);
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of mkv file");
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon
	}			
}
