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

public class ManageTracks {


	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(ManageTracks.class);

	
	//clicking on preview&dit and performing actions 
	@Test (priority=0)
	public void preview_edit_track() throws InterruptedException, IOException {	
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on manage tracks
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VenTrack"); //search with track
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("preview&edit_click"))).click(); //click on preview&edit
		Thread.sleep(5000);
		//updating title
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).clear(); //clear the text in title field
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).
		sendKeys(properties.getProperty("track_name_edit") + "_" + System.currentTimeMillis()); //enter track tile
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button
		logger.info("track title is updated");	
		Thread.sleep(5000);
		//updating description
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).sendKeys("Desc_Edit"); //updating description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
		Thread.sleep(5000);
		logger.info("track description updated");	
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("search_txt"))).click(); //search with mp4 in search box
		driver.findElement(By.xpath(properties.getProperty("search_txt"))).sendKeys("mp4"); //search with mp4 in search box
		driver.findElement(By.xpath(properties.getProperty("Search_click"))).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("second_asset_selection"))).click(); //selecting second asset
		Thread.sleep(5000);
		logger.info("second asset selected");   
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button  
		logger.info("second asset updated");
		Thread.sleep(5000);	 
		driver.findElement(By.xpath(properties.getProperty("update_button_asset"))).click(); //click on update button
		logger.info("track updated");
		//assertion for success message
		Thread.sleep(5000); 
		WebElement published = driver.findElement(By.xpath(properties.getProperty("afterpublish_success")));	
		String actualresult2 = published.getText();
		String expectedresult2 = "Track updated successfully";				
		Assert.assertEquals(actualresult2, expectedresult2);
		logger.info("Assertion for updated track succesfull");	
		Thread.sleep(5000);	
	}
	
	//clicking on view against to track 
	@Test (priority=1)
	public void view_track() throws InterruptedException, IOException {	
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on add tracks
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VenTrack"); //search with track
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("view_click"))).click(); //click on view icon
		Thread.sleep(5000);
		
		//add track to playbook
		driver.findElement(By.xpath(properties.getProperty("add_to_playbooks"))).click(); //click on add to playbooks button
		Thread.sleep(5000);	
		logger.info("track added to playbooks succesfully");			
		WebElement success = driver.findElement(By.xpath(properties.getProperty("playbook_success_grid")));	
		String actualresult = success.getText();
		String expectedresult = "Saved to play books successfully.";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for add to playbook ");
		
		//asset view
		driver.findElement(By.xpath(properties.getProperty("asset_viewicon_click"))).click(); //click on view icon of asset
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("asset_view_button"))).click(); //click on view icon of asset
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("asset_crossicon"))).click(); //click on view button of asset
		Thread.sleep(5000);
		logger.info("asset viewed succesfully");			
		
		//download asset
		driver.findElement(By.xpath(properties.getProperty("asset_download_button"))).click(); //click on download button of asset
		Thread.sleep(5000);
		logger.info("asset downloaded succesfully");	
		
					
	}
	
	//clicking on analytics
	@Test (priority=2)
	public void analytics_track() throws InterruptedException, IOException {	
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on add tracks
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VenTrack"); //search with track
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("analytics_icon"))).click(); //click on analytics icon
		Thread.sleep(5000);
		logger.info("analytics page viewed successfully");															
	}


	//unpublishing published track 
		@Test (priority=3)
		public void unpublish_track() throws InterruptedException, IOException {	
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on add tracks
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VenTrack"); //search with track
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("unpublish_click"))).click(); //click on unpublish icon
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("yes_popup"))).click(); //click on yes in popup
			Thread.sleep(5000);
			logger.info("track unpublished succesfully");			
		}


		
				
				
				//clicking on delete 
				@Test (priority=4)
				public void delete_track() throws InterruptedException, IOException {	
					Thread.sleep(3000);
					driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on add tracks
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VenTrack"); //search with track
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("delete_icon"))).click(); //click on view icon
					Thread.sleep(5000);
					driver.findElement(By.xpath(properties.getProperty("yes_delete_notification"))).click(); //click on view icon
					logger.info("track deleted successfully");
					Thread.sleep(5000);
					WebElement success = driver.findElement(By.xpath(properties.getProperty("track_delete_grid")));	
					String actualresult = success.getText();
					String expectedresult = "Track Deleted Successfully";
					Assert.assertEquals(actualresult, expectedresult);
					logger.info("Assertion succesfull for delete track");
					
				}												
}

