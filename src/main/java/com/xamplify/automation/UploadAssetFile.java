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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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


	//uploading png file asset 
	@Test (priority = 0,enabled=true)
	public void uploadasset_png() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\PNG_file.png");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("png file uploaded using robot class");
		Thread.sleep(5000);

		//		Runtime.getRuntime().exec("D:\\Selenium\\asset_png.exe");  // upload png file using autoit

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); //click on thumbnail icon
		Thread.sleep(5000);		
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
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

		//		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //upload thumbnail image using autoit

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("png_name")+ "_" + System.currentTimeMillis());
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
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description"); //enter description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Submit"))).click(); //click on submit 
		Thread.sleep(5000);
		logger.info("clicked on submit button after filling all mandaoty fields");

		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("Success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Uploaded Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Asset file(png)uploaded successfully");      
		}
		else
		{
			logger.info("Asset file(png) is not uploaded");
		}
		Thread.sleep(3000);                        
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon file has been saved		
		logger.info("Refresh icon has been clicked");
	}


	//uploading mp3 file
	@Test (priority = 1,enabled=true)
	public void uploadasset_mp3() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\mp3_file.mp3");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("mp3 file uploaded using robot class");
		Thread.sleep(5000);	

		//Runtime.getRuntime().exec("D:\\Selenium\\asset_mp3.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);							
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	

		//Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mp3_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(5000);
		logger.info("Asset mp3 uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of uploading mp3 file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}


	//uploading ppt file
	@Test (priority = 2,enabled=true)
	public void uploadasset_ppt() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\PPT_file.ppt");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("ppt file uploaded using robot class");
		Thread.sleep(5000);		

		//		Runtime.getRuntime().exec("D:\\Selenium\\asset_ppt.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");

		//		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("ppt_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(5000);
		logger.info("Asset ppt uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of uploading ppt file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}


	//uploading doc file (word file)
	@Test (priority = 3,enabled=true)
	public void uploadasset_doc() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\word_file.doc");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("doc file uploaded using robot class");
		Thread.sleep(5000);	

		//		Runtime.getRuntime().exec("D:\\Selenium\\asset_doc.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	

		//	Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("doc_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(5000);
		logger.info("Asset doc uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of uploading doc file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}


	//uploading xls file
	@Test (priority = 4,enabled=true)
	public void uploadasset_xls() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\XLS_file.xls");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("xls file uploaded using robot class");
		Thread.sleep(5000);		

		//	Runtime.getRuntime().exec("D:\\Selenium\\asset_xls.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");

		//	Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("xls_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(5000);
		logger.info("Asset xls uploaded succesfully");	
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of uploading xls file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}




	//uploading gif file
	@Test (priority = 5,enabled=true)
	public void uploadasset_gif() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\gif_file.gif");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("gif file uploaded using robot class");
		Thread.sleep(5000);		

		//	Runtime.getRuntime().exec("D:\\Selenium\\asset_gif.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	

		//	Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("gif_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(5000);
		logger.info("Asset gif uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of uploading gif file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}

	//uploading jpg file
	@Test (priority = 6,enabled=true)
	public void uploadasset_jpg() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("jpg file uploaded using robot class");
		Thread.sleep(5000);

		//	Runtime.getRuntime().exec("D:\\Selenium\\asset_jpg.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	

		//	Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("jpg_name")+ "_" + System.currentTimeMillis());
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
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description"); //enter description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
		Thread.sleep(5000);
		logger.info("Asset jpg uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of uploading jpg file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}

	//uploading zip file
	@Test (priority = 7,enabled=true)
	public void uploadasset_zip() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\ZIP_file.zip");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("zip file uploaded using robot class");
		Thread.sleep(5000);	

		//	Runtime.getRuntime().exec("D:\\Selenium\\asset_zip.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	

		//Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("zip_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(5000);
		logger.info("Asset zip uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of uploading zip file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}

	//uploading html file
	@Test (priority = 8,enabled=true)
	public void uploadasset_html() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\HTML_file.html");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("html file uploaded using robot class");
		Thread.sleep(5000);	

		//	Runtime.getRuntime().exec("D:\\Selenium\\asset_html.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();//upload thumbnail
		Thread.sleep(5000);		
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	

		//	Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");//upload thumbnail

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("html_name")+ "_" + System.currentTimeMillis());
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
		logger.info("Assertion for uploadsucess message of uploading html file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}


	//uploading svg file
	@Test (priority = 9,enabled=true)
	public void uploadasset_svg() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\svg_file.svg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("svg file uploaded using robot class");
		Thread.sleep(5000);	

		//	Runtime.getRuntime().exec("D:\\Selenium\\asset_svg.exe");

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click();
		Thread.sleep(5000);
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	

		//	Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe");

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("svg_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(5000);
		logger.info("Asset svg uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion for uploadsucess message of uploading svg file");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
		logger.info("Refresh icon has been clicked");
	}


	//uploading asset (png)to view&downlod in partner account 
	@Test (priority = 10,enabled=true)
	public void assetpng_partner() throws InterruptedException, IOException, AWTException {	
		Thread.sleep(6000);
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
		StringSelection filepath = new StringSelection("D:\\Selenium\\files\\PNG_file.png");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		logger.info("png file uploaded using robot class to view & download in partner account");
		Thread.sleep(5000);		

		//	Runtime.getRuntime().exec("D:\\Selenium\\asset_png.exe");  // upload png file 

		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); //click on thumbnail icon
		Thread.sleep(5000);
		StringSelection filepath1 = new StringSelection("D:\\Selenium\\files\\jpg_file.jpg");  //create a stringselection object
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath1, null); // here path is avaliable in clipboard 		
		robot.keyPress(KeyEvent.VK_CONTROL);// press ctrl
		robot.keyPress(KeyEvent.VK_V);		// press V			
		robot.keyRelease(KeyEvent.VK_V);	//release V	
		robot.keyRelease(KeyEvent.VK_CONTROL);//relase ctrl				
		robot.keyPress(KeyEvent.VK_ENTER);//press enter				
		robot.keyRelease(KeyEvent.VK_ENTER); // release enter				
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();
		Thread.sleep(5000);
		logger.info("thumbnail uploaded using robot class");	

		//	Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //upload thumbnail image

		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("assetname")+ "_" + System.currentTimeMillis());
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
		driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description"); //enter description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("Submit"))).click(); //click on submit 
		Thread.sleep(5000);
		logger.info("Asset png uploaded succesfully-partner");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for success message of uploading png file ");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon file has been saved		
		//search with the created partnerasset and publish to partner
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar"))).sendKeys("partnerasset");
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("Searchclick"))).click(); 
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("publish_click"))).click(); //click on publish link
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchbar_publish"))).sendKeys("automatedPartner");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Searchclick_publish"))).click();		
		Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("arrow_click"))).click(); //select arrow of partner company
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_select"))).click(); //select partner
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("submit_button"))).click();
		Thread.sleep(5000);
		logger.info("Assetfile-png published succesfully to view in partner account");
		//Assertion 1st way for published asset
		Thread.sleep(5000);
		WebElement published = driver.findElement(By.xpath(properties.getProperty("published_page")));	
		String actualresult2 = published.getText();
		String expectedresult2 = "Published Successfully";				
		Assert.assertEquals(actualresult2, expectedresult2);
		logger.info("Assertion for published succesfull");	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon_publish"))).click();
		logger.info("cross icon clicked");		
	}	


	//uploading asset through webcam 
	@Test (priority = 11,enabled=true)
	public void assetthroughwebcam() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("webcam_icon"))).click(); // click on webcam icon
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("description_webcam"))).sendKeys("uploading webcam recorded video"); // entering message in the description field
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("camera_icon_click_webcam"))).click(); // click on camera icon to record
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("recordbutton_click"))).click(); // click on record icon -- start recording
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("recordbutton_click"))).click(); // click on record icon- to stop the recording
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("uploadbutton_webcam"))).click(); // click on upload button
		Thread.sleep(5000);
		logger.info("video has been recorded and uploaded");
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("recordedvideo_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(7000);
		logger.info("video uploaded through webcam succesfully as a video asset");

	}

	//uploading asset through box account
	@Test (priority = 12,enabled=true)
	public void assetthroughbox() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath(properties.getProperty("boxicon_click"))).click(); // click on upload
		Thread.sleep(5000);
		for (String windowHandle : driver.getWindowHandles()) {
			if(!parentWindow.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				driver.findElement(By.xpath(properties.getProperty("box_email"))).sendKeys(properties.getProperty("box_email_id")); // entering email id
				Thread.sleep(5000);
				logger.info("email id has been entered");
				driver.findElement(By.xpath(properties.getProperty("box_next_button"))).click(); //click on next button
				Thread.sleep(5000);
				driver.findElement(By.xpath(properties.getProperty("box_password"))).sendKeys(properties.getProperty("box_password_id")); //entering password
				Thread.sleep(5000);
				logger.info("password has been entered");
				driver.findElement(By.xpath(properties.getProperty("box_login_button"))).click(); //click on login button
				Thread.sleep(5000);
				logger.info("login button has been clicked");
				driver.findElement(By.xpath(properties.getProperty("box_select_document"))).click(); //select document from box account
				Thread.sleep(5000);
				logger.info("document has been selected");
				driver.findElement(By.xpath(properties.getProperty("box_uploadbutton"))).click(); //click on upload after selecting document
				Thread.sleep(5000);
				logger.info("document has been uploaded");	
				driver.switchTo().window(parentWindow);
				driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("box_document_name")+ "_" + System.currentTimeMillis());  //enter name of the asset
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
				driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description"); //enter asset description
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath(properties.getProperty("Submit"))).click(); //click on submit
				Thread.sleep(5000);
				logger.info("asset(google document-gdoc) has been uploaded from box account");
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("Refresh"))).click();
				logger.info("Refresh icon has been clicked");


			}

		} 

	}
}








