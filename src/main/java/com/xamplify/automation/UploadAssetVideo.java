package com.xamplify.automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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

public class UploadAssetVideo extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("src/main/resources/AssetLibrary.properties");
	final Logger logger = LogManager.getLogger(UploadAssetVideo.class);




	//In this class file we have all types of asset video files 
	//uploading MP4 file 
	@Test (priority=25,enabled=true)
	public void uploadMP4() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		
		Robot robot = new Robot();	// use robot class to upload file -- create object	
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		robot.setAutoDelay(3000);  // is equal to thread.sleep		 
		//store the path of the file to be uploaded using stringselection class object
		StringSelection filepath = new StringSelection("D:\\GitHub\\xAmplify-Automation\\MP4_file.mp4");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("mp4 video file uploaded using robot class");
		Thread.sleep(5000);	
		
	//	Runtime.getRuntime().exec("D:\\Selenium\\asset_MP4.exe"); //uploading mp4 file using auto it
		
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);		
		StringSelection filepath1 = new StringSelection("D:\\GitHub\\xAmplify-Automation\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();  //click on save changes
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	
			
	//	Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //upload thumbnail
		
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
		logger.info("clicked on submit button after filling all mandaoty fields");

		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("Success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Uploaded Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Asset file(mp4)uploaded successfully");      
		}
		else
		{
			logger.info("Asset file(mp4) is not uploaded");
		}
		Thread.sleep(3000);                        
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon 	
		logger.info("Refresh icon has been clicked");
	}




	//uploading AVI file 
	@Test (priority=26,enabled=true)
	public void uploadaAVI() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
	
		Robot robot = new Robot();	// use robot class to upload file -- create object	
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		robot.setAutoDelay(3000);  // is equal to thread.sleep		 
		//store the path of the file to be uploaded using stringselection class object
		StringSelection filepath = new StringSelection("D:\\GitHub\\xAmplify-Automation\\AVI_file.avi");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("avi video file uploaded using robot class");
		Thread.sleep(5000);	
			
	//	Runtime.getRuntime().exec("D:\\Selenium\\asset_AVI.exe"); //uploading avi file
		
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); //click on thumbnail icon
		Thread.sleep(5000);		
		StringSelection filepath1 = new StringSelection("D:\\GitHub\\xAmplify-Automation\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();  //click on save changes
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");
				
		//Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //uploading thumbnail
		
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
		
		logger.info("clicked on submit button after filling all mandaoty fields");

		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("Success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Uploaded Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Asset file(avi)uploaded successfully");      
		}
		else
		{
			logger.info("Asset file(avi) is not uploaded");
		}
		Thread.sleep(3000);                        
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon 	
		logger.info("Refresh icon has been clicked");
	}

	//upload MOV file	
	@Test (priority=27,enabled=true)
	public void uploadMOV() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
	
		Robot robot = new Robot();	// use robot class to upload file -- create object	
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		robot.setAutoDelay(3000);  // is equal to thread.sleep		 
		//store the path of the file to be uploaded using stringselection class object
		StringSelection filepath = new StringSelection("D:\\GitHub\\xAmplify-Automation\\MOV_file.mov");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("mov video file uploaded using robot class");
		Thread.sleep(5000);	
				
		//Runtime.getRuntime().exec("D:\\Selenium\\asset_MOV.exe"); //uploading mov file
	
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); //click on thumbnail icon
		Thread.sleep(5000);		
		StringSelection filepath1 = new StringSelection("D:\\GitHub\\xAmplify-Automation\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();  //click on save changes
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");
			
		//Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //uploading thumbnail
		
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
		Thread.sleep(12000);
		logger.info("clicked on submit button after filling all mandaoty fields");

		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("Success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Uploaded Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Asset file(mov)uploaded successfully");      
		}
		else
		{
			logger.info("Asset file(mov) is not uploaded");
		}
		Thread.sleep(3000);                        
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon 	
		logger.info("Refresh icon has been clicked");
	}			

	//upload MKV file 
	@Test (priority=28,enabled=true)
	public void uploadMKV() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		
		Robot robot = new Robot();	// use robot class to upload file -- create object	
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		robot.setAutoDelay(3000);  // is equal to thread.sleep		 
		//store the path of the file to be uploaded using stringselection class object
		StringSelection filepath = new StringSelection("D:\\GitHub\\xAmplify-Automation\\MKV_file.mkv");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("mkv video file uploaded using robot class");
		Thread.sleep(5000);
								
		//Runtime.getRuntime().exec("D:\\Selenium\\asset_MKV.exe"); //uploading mkv file
				
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); //click on thumbnail icon
		Thread.sleep(5000);		
		StringSelection filepath1 = new StringSelection("D:\\GitHub\\xAmplify-Automation\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();  //click on save changes
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");
						
		//Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //uploading thumbnail
		
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
		logger.info("clicked on submit button after filling all mandaoty fields");

		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("Success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Uploaded Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Asset file(mkv)uploaded successfully");      
		}
		else
		{
			logger.info("Asset file(mkv) is not uploaded");
		}
		Thread.sleep(3000);                        
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon 	
		logger.info("Refresh icon has been clicked");
		
	}			
}
