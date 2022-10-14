package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ManageTracks {
	
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(ManageTracks.class);
	
	
	@Test 
    public void managetracks() throws InterruptedException, IOException {	
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on add tracks
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("Track"); //search with track
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon
	
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("preview&edit_click"))).click(); 
	driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).sendKeys(properties.getProperty("track_name_edit") + "_" + System.currentTimeMillis());
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button


	
	}

}

