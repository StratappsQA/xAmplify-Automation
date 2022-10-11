package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadAssetFile {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(UploadAssetFile.class);
	

	    @Test (priority = 0)
	    public void uploadasset_png() throws InterruptedException, IOException {	
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\asset_png.exe");  // upload file 
		logger.info("asset png uploaded");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); //click on thumbnail icon
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //upload thumbnail image
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click(); 
		Thread.sleep(5000);
		logger.info("thumbnail uploaded");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("png_name"));
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
		Thread.sleep(5000);
		logger.info("Asset png uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for success message ");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
	    }
		
		
		
		 @Test (priority = 1)
		    public void uploadasset_mp3() throws InterruptedException, IOException {	
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\asset_mp3.exe");
			logger.info("asset mp3 file uploaded");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
			logger.info("thumbnail uploaded");
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mp3_name"));
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
			driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
			Thread.sleep(5000);
			logger.info("Asset mp3 uploaded succesfully");
			WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
			String actualresult = success.getText();
			String expectedresult = "Uploaded Successfully";
			Assert.assertEquals(actualresult, expectedresult);
			logger.info("Assertion for uploadsucess message");
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		 }
		
		
			 @Test (priority = 2)
			    public void uploadasset_ppt() throws InterruptedException, IOException {	
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
				Thread.sleep(5000);
				Runtime.getRuntime().exec("D:\\Selenium\\asset_ppt.exe");
				logger.info("asset ppt file uploaded");
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
				logger.info("thumbnail uploaded");
				Thread.sleep(5000);
				Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("ppt_name"));
				Thread.sleep(5000);
				driver.switchTo().frame(0);
				driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
				driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
				Thread.sleep(5000);
				logger.info("Asset ppt uploaded succesfully");
				WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
				String actualresult = success.getText();
				String expectedresult = "Uploaded Successfully";
				Assert.assertEquals(actualresult, expectedresult);
				logger.info("Assertion for uploadsucess message");
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
			 }
		
		
				 @Test (priority = 3)
				    public void uploadasset_doc() throws InterruptedException, IOException {	
					Thread.sleep(3000);
					driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
					Thread.sleep(3000);
					driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
					Thread.sleep(5000);
					Runtime.getRuntime().exec("D:\\Selenium\\asset_doc.exe");
					logger.info("asset doc file uploaded");
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
					logger.info("thumbnail uploaded");
					Thread.sleep(5000);
					Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("doc_name"));
					Thread.sleep(5000);
					driver.switchTo().frame(0);
					driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
					driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
					Thread.sleep(5000);
					driver.switchTo().defaultContent();
					driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
					Thread.sleep(5000);
					logger.info("Asset doc uploaded succesfully");
					WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
					String actualresult = success.getText();
					String expectedresult = "Uploaded Successfully";
					Assert.assertEquals(actualresult, expectedresult);
					logger.info("Assertion for uploadsucess message");
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
				 }
		
		
					 @Test (priority = 4)
					    public void uploadasset_xls() throws InterruptedException, IOException {	
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\asset_xls.exe");
						logger.info("asset xls file uploaded");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
						logger.info("thumbnail uploaded");
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("xls_name"));
						Thread.sleep(5000);
						driver.switchTo().frame(0);
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
						Thread.sleep(5000);
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
						Thread.sleep(5000);
						logger.info("Asset xls uploaded succesfully");
						WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
						String actualresult = success.getText();
						String expectedresult = "Uploaded Successfully";
						Assert.assertEquals(actualresult, expectedresult);
						logger.info("Assertion for uploadsucess message");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
					 }
		
		
		
					 @Test (priority = 5)
					    public void uploadasset_gif() throws InterruptedException, IOException {	
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\asset_gif.exe");
						logger.info("asset gif file uploaded");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
						logger.info("thumbnail uploaded");
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("gif_name"));
						Thread.sleep(5000);
						driver.switchTo().frame(0);
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
						Thread.sleep(5000);
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
						Thread.sleep(5000);
						logger.info("Asset gif uploaded succesfully");
						WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
						String actualresult = success.getText();
						String expectedresult = "Uploaded Successfully";
						Assert.assertEquals(actualresult, expectedresult);
						logger.info("Assertion for uploadsucess message");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
					 }
		
		
					 @Test (priority = 6)
					    public void uploadasset_jpg() throws InterruptedException, IOException {	
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
						
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\asset_jpg.exe");
						logger.info("asset jpg file uploaded");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
						logger.info("thumbnail uploaded");
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("jpg_name"));
						Thread.sleep(5000);
						driver.switchTo().frame(0);
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
						Thread.sleep(5000);
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
						Thread.sleep(5000);
						logger.info("Asset jpg uploaded succesfully");
						WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
						String actualresult = success.getText();
						String expectedresult = "Uploaded Successfully";
						Assert.assertEquals(actualresult, expectedresult);
						logger.info("Assertion for uploadsucess message");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
					 }
		
		
					 @Test (priority = 7)
					    public void uploadasset_zip() throws InterruptedException, IOException {	
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\asset_zip.exe");
						logger.info("asset zip file uploaded");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
						logger.info("thumbnail uploaded");
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("zip_name"));
						Thread.sleep(5000);
						driver.switchTo().frame(0);
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
						Thread.sleep(5000);
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
						Thread.sleep(5000);
						logger.info("Asset zip uploaded succesfully");
						WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
						String actualresult = success.getText();
						String expectedresult = "Uploaded Successfully";
						Assert.assertEquals(actualresult, expectedresult);
						logger.info("Assertion for uploadsucess message");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
					 }
		
					 @Test (priority = 8)
					    public void uploadasset_html() throws InterruptedException, IOException {	
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\asset_html.exe");
						logger.info("asset html file uploaded");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();//upload thumbnail
						logger.info("thumbnail uploaded");
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");//upload thumbnail
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click(); //click on save change button
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("html_name"));
						Thread.sleep(5000);
						driver.switchTo().frame(0);
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
						Thread.sleep(5000);
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath(properties.getProperty("Submit"))).click();//click ob submit button
						Thread.sleep(5000);
						logger.info("Asset html uploaded succesfully");
						WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
						String actualresult = success.getText();
						String expectedresult = "Uploaded Successfully";
						Assert.assertEquals(actualresult, expectedresult);
						logger.info("Assertion for uploadsucess message");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
					 }
		
		
					 @Test (priority = 9)
					    public void uploadasset_svg() throws InterruptedException, IOException {	
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
						Thread.sleep(3000);
						driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\asset_svg.exe");
						logger.info("asset svg file uploaded");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
						logger.info("thumbnail uploaded");
						Thread.sleep(5000);
						Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("svg_name"));
						Thread.sleep(5000);
						driver.switchTo().frame(0);
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
						driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
						Thread.sleep(5000);
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
						Thread.sleep(5000);
						logger.info("Asset svg uploaded succesfully");
						WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
						String actualresult = success.getText();
						String expectedresult = "Uploaded Successfully";
						Assert.assertEquals(actualresult, expectedresult);
					logger.info("Assertion for uploadsucess message");
						Thread.sleep(5000);
						driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
				
					 }
}



