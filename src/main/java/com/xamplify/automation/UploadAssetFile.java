package com.xamplify.automation;

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
	@Test (priority = 0)
	public void uploadasset_png() throws InterruptedException, IOException {	
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\asset_png.exe");  // upload png file 
		logger.info("asset png uploaded");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); //click on thumbnail icon
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //upload thumbnail image
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();  //click on save changes
		Thread.sleep(5000);
		logger.info("thumbnail uploaded");
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("png_name")+ "_" + System.currentTimeMillis());
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
		Thread.sleep(5000);
		logger.info("Asset png uploaded succesfully");
		WebElement success = driver.findElement(By.xpath(properties.getProperty("Success")));	
		String actualresult = success.getText();
		String expectedresult = "Uploaded Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for success message of uploading png file ");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Refresh"))).click(); //click on refresh icon file has been saved
	}


	//uploading mp3 file
	@Test (priority = 1,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("mp3_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}


	//uploading ppt file
	@Test (priority = 2,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("ppt_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}


	//uploading doc file
	@Test (priority = 3,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("doc_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}


	//uploading xls file
	@Test (priority = 4,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("xls_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}




	//uploading gif file
	@Test (priority = 5,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("gif_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}

	//uploading jpg file
	@Test (priority = 6,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("jpg_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}

	//uploading zip file
	@Test (priority = 7,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("zip_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}

	//uploading html file
	@Test (priority = 8,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("html_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}


	//uploading svg file
	@Test (priority = 9,enabled=false)
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
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("svg_name")+ "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click1"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection1"))).click(); //select folder
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
	}
	
	
	//uploading asset to view&downlod in partner account 
	@Test (priority = 1)
	public void assetpng() throws InterruptedException, IOException {	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Upload"))).click(); // click on upload
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("BrowseButton"))).click(); //click on Browse
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\asset_png.exe");  // upload png file 
		logger.info("asset png uploaded");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Thumbnail"))).click(); //click on thumbnail icon
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\Selenium\\Thumbnail.exe"); //upload thumbnail image
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Savechanges"))).click();  //click on save changes
		Thread.sleep(5000);
		logger.info("thumbnail uploaded");
		driver.findElement(By.xpath(properties.getProperty("Name"))).sendKeys(properties.getProperty("assetname")+ "_" + System.currentTimeMillis());
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
		@Test (priority = 11,enabled=false)
		public void assetthroughwebcam() throws InterruptedException, IOException {	
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("DesignUpload"))).click(); //click on design/upload
			Thread.sleep(3000);
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
			driver.findElement(By.xpath(properties.getProperty("tag_select"))).click();
			Thread.sleep(5000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).click();
			driver.findElement(By.xpath(properties.getProperty("Descriptionclick"))).sendKeys("Asset_Description");
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath(properties.getProperty("Submit"))).click();
			Thread.sleep(5000);
			logger.info("video uploaded through webcam succesfully as a video asset");
			
		}
	
}



