package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadAssetVideo {
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(UploadAssetVideo.class);
	
	
			//uploading MP4 file -- succussful
			@Test (priority=1)
	        public void uploadMP4() throws InterruptedException, IOException {	
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\asset_MP4.exe");
			logger.info("asset mp4 file uploaded");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
			logger.info("thumbnail uploaded");
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mp4_name"));
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
			driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
			Thread.sleep(15000);
			logger.info("Asset mp4 uploaded succesfully");
			driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();			
			Thread.sleep(5000);
			
			WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
			String actualresult = success.getText();
			String expectedresult = "Uploaded Successfully";
			Assert.assertEquals(actualresult, expectedresult);
			logger.info("Assertion succesfull for success message ");
	}
	
			
			
			
			//uploading AVI file -- succesfull
			@Test (priority=2)
			public void uploadaAVI() throws InterruptedException, IOException {	
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		    Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\asset_AVI.exe");
			logger.info("asset file uploaded");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
			logger.info("thumbnail uploaded");
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("avi_name"));
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
			logger.info("Assertion for uploadsucess message");
			driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
	}
	
		//upload MOV file	-- successful
	@Test (priority=3)
	 public void uploadMOV() throws InterruptedException, IOException {	
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
	Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\asset_MOV.exe");
			logger.info("asset file uploaded");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
			logger.info("thumbnail uploaded");
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mov_name"));
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
			logger.info("Assertion succesfull for uploadsucess message");
			driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
	}			
		
	//upload MKV file -- successfull
	@Test (priority=4)
	 public void uploadMKV() throws InterruptedException, IOException {	
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\asset_MKV.exe");
			logger.info("asset file uploaded");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
			logger.info("thumbnail uploaded");
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click(); //click on save changes
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mkv_name"));
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
			logger.info("Assertion for uploadsucess message");
			Thread.sleep(10000);
			driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
	}			
}
