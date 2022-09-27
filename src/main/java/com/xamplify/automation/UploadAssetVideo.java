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
	final Logger logger = LogManager.getLogger(UploadAssetFile.class);
	
	@Test
	 public void uploadassetvideo() throws InterruptedException, IOException {	
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Upload"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click();
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\VideoFile.exe");
			logger.info("asset file uploaded");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
			logger.info("thumbnail uploaded");
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("Name_text2"));
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
			driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
			Thread.sleep(5000);
			logger.info("Asset uploaded succesfully");
			Thread.sleep(10000);

			WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
			String actualresult = success.getText();
			String expectedresult = "Uploaded Successfully";
			Thread.sleep(10000);

			Assert.assertEquals(actualresult, expectedresult);
			logger.info("Assertion for uploadsucess message");
			Thread.sleep(10000);
			driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
			
			
			//Manage asset - video (MP4) file
			//search asset
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys(properties.getProperty("Name_text2"));
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click();
			
			//click on create compaign
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("createcompaign_click"))).click();	
			Thread.sleep(3000);
	        // need to ask compaign should be created or not 
			
  

			
			
			
			
			
			
			
			
			
			
			
			
			

}
}
