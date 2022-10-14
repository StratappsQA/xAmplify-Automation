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

public class AddTracks {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(AddTracks.class);
	
	
	@Test 
    public void addingtrack() throws InterruptedException, IOException {	
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("Add_tracks"))).click(); //click on add tracks
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).sendKeys(properties.getProperty("track_name") + "_" + System.currentTimeMillis());
	Thread.sleep(5000);

	driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click"))).click(); //click on folder dropdown
	Thread.sleep(5000);

	driver.findElement(By.xpath(properties.getProperty("folder_selection"))).click(); //select folder
	Thread.sleep(5000);

	//image is not uploading -- need to check
//	driver.findElement(By.xpath(properties.getProperty("camera_icon"))).click(); //click on camera icon
//	Thread.sleep(8000);
//	
//	driver.findElement(By.xpath(properties.getProperty("select_image_button"))).click(); //click on select image icon
//	Thread.sleep(5000);
//
//	Runtime.getRuntime().exec("D:\\Selenium\\track_featured_image.exe"); //upload featured image
//	Thread.sleep(5000);
//
//	driver.findElement(By.xpath(properties.getProperty("save_changes"))).click(); //click on savechanges after selecting featured image
//	Thread.sleep(5000);

	driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button
	logger.info("track details provided"); //details provided
	Thread.sleep(10000);

	driver.switchTo().frame(0);
	Thread.sleep(5000);

	driver.findElement(By.xpath(properties.getProperty("Description_field"))).click();  
	Thread.sleep(5000);

	driver.findElement(By.xpath(properties.getProperty("Description_field"))).sendKeys("Track_Description"); //enter description
	Thread.sleep(5000);
	//need to add for media and form selection
	driver.switchTo().defaultContent();

	driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
	Thread.sleep(5000);
	logger.info("description entered");
	//Thread.sleep(10000);
	//mp4 selection is not working
	//driver.findElement(By.xpath(properties.getProperty("txt"))).sendKeys("mp4"); //search with mp4 in search box
	//driver.findElement(By.xpath(properties.getProperty("Search_click"))).click();	
	//Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("asset_selection"))).click();	//select first asset
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button  
	logger.info("mp4 first asset selected");
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("Search_publish"))).sendKeys("automatedPartner"); //select automatedPartner in search field
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("click_searchicon"))).click();		
		Thread.sleep(5000);		
	driver.findElement(By.xpath(properties.getProperty("arrow_click_track"))).click(); //select arrow of partner company
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("partner_select_track"))).click(); //select partner
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("save&publish_button"))).click(); //click on save&publish button
	Thread.sleep(5000);
	logger.info("track published to partner succesfully");	
	//assertion for success message
	WebElement published = driver.findElement(By.xpath(properties.getProperty("afterpublish_success")));	
	String actualresult2 = published.getText();
	String expectedresult2 = "Track created successfully";				
	Assert.assertEquals(actualresult2, expectedresult2);
	logger.info("Assertion for published succesfull");	
	Thread.sleep(5000);	
	}	
}

