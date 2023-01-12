package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManageTracks extends ExtentReportsClass {


	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(ManageTracks.class);



	//grid and list view , folder view 
	@Test (priority=304,enabled=true)
	public void gridlistview_track() throws InterruptedException
	{
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on manage tracks
		Thread.sleep(7000);	
		logger.info("manage tracks has been clicked");
		//clicking on grid view
		WebElement gridview_tc = driver.findElement(By.xpath(properties.getProperty("gridclick_tc")));
		if(gridview_tc.isEnabled())
		{
			gridview_tc.click();
			Thread.sleep(6000);		
		}
		else
		{
			System.out.println("grid view icon is disabled");
		}
		logger.info("assets viewed in grid view");

		//clickng on folder grid view
		WebElement foldergridview_tc = driver.findElement(By.xpath(properties.getProperty("foldergridclick_tc")));
		if(foldergridview_tc.isEnabled())
		{
			foldergridview_tc.click();
			Thread.sleep(6000);
			WebElement ele = driver.findElement(By.xpath("//div[@id='category-icon-div']"));
			Actions action = new Actions(driver);
			action.moveToElement(ele).perform();
			Thread.sleep(6000);
			driver.findElement(By.xpath(properties.getProperty("gridview_items_tc"))).click(); //to view all items in folder gird view
			Thread.sleep(6000);
			driver.findElement(By.xpath(properties.getProperty("go_back_tc"))).click(); //click on go back
			Thread.sleep(6000);
			logger.info("all items viewed under folder grid view");
		}
		else
		{
			System.out.println(" folder grid view icon is disabled");
		}
		logger.info("assets viewed in foldergrid view");


		//clickng on folder list view
		WebElement folderlistview_tc = driver.findElement(By.xpath(properties.getProperty("folderlistclick_tc")));
		if(folderlistview_tc.isEnabled())
		{
			folderlistview_tc.click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(properties.getProperty("listview_items_tc"))).click(); //to view all items in folder list view
			Thread.sleep(6000);
			logger.info("all items viewed under folder list view");			
		}	
		else
		{
			System.out.println(" folder list view icon is disabled");
		}
		logger.info("assets viewed in folderlist view");



		//clickng on list view
		WebElement listview = driver.findElement(By.xpath(properties.getProperty("listclick_tc")));
		if(listview.isEnabled())
		{
			listview.click();
		}
		else
		{
			System.out.println("list view icon is disabled");
		}
		logger.info("assets viewed in list view");
		logger.info("vendor-manage track-clicked on folder&list,grid icons");
	}
	
	//clicking on preview&edit against to vendortrack
	@Test (priority=305,enabled=true) 
	public void preview_edit_track() throws InterruptedException, IOException {	
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on manage tracks
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorTrack"); //search with vendortrack
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("preview&edit_click"))).click(); //click on preview&edit
		Thread.sleep(6000);
		//updating title
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).clear(); //clear the text in title field
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).
		sendKeys(properties.getProperty("track_name_edit") + "_" + System.currentTimeMillis()); //enter track tile
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button
		logger.info("track title is updated");	
		Thread.sleep(7000);
		//updating description
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).sendKeys("Desc_Edit"); //updating description
		Thread.sleep(7000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
		Thread.sleep(7000);
		logger.info("track description updated");	
		Thread.sleep(6000);
		//		driver.findElement(By.xpath(properties.getProperty("search_txt"))).click(); //search with mp4 in search box
		//		driver.findElement(By.xpath(properties.getProperty("search_txt"))).sendKeys("mp4"); //search with mp4 in search box
		//		driver.findElement(By.xpath(properties.getProperty("Search_click"))).click();	
		//		Thread.sleep(6000);
		//		driver.findElement(By.xpath(properties.getProperty("second_asset_selection"))).click(); //selecting second asset
		//		Thread.sleep(6000);
		//		logger.info("second asset selected");   
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button  
		//		logger.info("second asset updated");
		Thread.sleep(3000);	 
		driver.findElement(By.xpath(properties.getProperty("update_button_asset"))).click(); //click on update button
		Thread.sleep(3000);	
		logger.info("clicked on update button");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("afterpublish_success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Track updated successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("track updated successfully with title&description");      
		}
		else
		{
			logger.info("Error while updating track");
		}
		
		Thread.sleep(3000);
		logger.info("vendor-manage track-preview&edit successful");
	}


	//clicking on view against to vendortrack 
	@Test (priority=306,enabled=true)
	public void view_track() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on manage tracks
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorTrack"); //search with vendortrack
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("view_click"))).click(); //click on view icon
		Thread.sleep(7000);

		//add track to playbook
		driver.findElement(By.xpath(properties.getProperty("add_to_playbooks"))).click(); //click on add to playbooks button
		Thread.sleep(7000);	
		logger.info("track added to playbooks successfully");			
		WebElement success = driver.findElement(By.xpath(properties.getProperty("playbook_success_grid")));	
		String actualresult = success.getText();
		String expectedresult = "Saved to play books successfully.";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion successfull for add to playbook ");

		//asset view
		driver.findElement(By.xpath(properties.getProperty("asset_viewicon_click"))).click(); //click on view icon of asset
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("asset_view_button"))).click(); //click on view icon of asset
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("asset_crossicon"))).click(); //click on view button of asset
		Thread.sleep(7000);
		logger.info("asset viewed successfully");			

		//download asset
		driver.findElement(By.xpath(properties.getProperty("asset_download_button"))).click(); //click on download button of asset
		Thread.sleep(6000);
		logger.info("asset downloaded successfully");	
		logger.info("vendor-manage track-view successful");


	}

	//clicking on analytics of vendortrack
	@Test (priority=307,enabled=true)
	public void analytics_track() throws InterruptedException, IOException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on manage tracks
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorTrack"); //search with track
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("analytics_icon"))).click(); //click on analytics icon
		Thread.sleep(6000);
		logger.info("analytics page viewed successfully - but partner not viewed the track");	
		logger.info("vendor-manage track-view analytics successful");

	}




	//unpublishing the published vendortrack 
	@Test (priority=308,enabled=true)
	public void unpublish_track() throws InterruptedException, IOException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on manage tracks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorTrack"); //search with track
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("unpublish_click"))).click(); //click on unpublish icon
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("yes_popup"))).click(); //click on yes in popup
		Thread.sleep(6000);
		logger.info("vendortrack unpublished succesfully");	
		logger.info("vendor-manage track-unpublish successful");
	}




	//clicking on delete 
	@Test (priority=309,enabled=true)
	public void delete_track() throws InterruptedException, IOException {	
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on manage tracks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorTrack"); //search with track
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("delete_icon"))).click(); //click on view icon
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("yes_delete_notification"))).click(); //click on view icon
		Thread.sleep(3000);
		logger.info("clicked on delete icon");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("track_delete_grid"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Details Updated Successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("Track Deleted Successfully");      
		}
		else
		{
			logger.info("Error while deleting track");
		}
		
		Thread.sleep(3000);
		logger.info("vendor-manage track-delete successful");


	}	

	//to view analytics in vendor account after track is been viewed and downloaded in partner account
	@Test (priority=310,enabled=true)
	public void analytics_track_vendor() throws InterruptedException, IOException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("manage_tracks"))).click(); //click on manage tracks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("PartnerTrack"); //search with track
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("analytics_icon"))).click(); //click on analytics icon
		Thread.sleep(6000);
		logger.info("redirected to partner view analytics page ");
		driver.findElement(By.xpath(properties.getProperty("partner_analytics_icon"))).click(); //click on analytics icon agaisnt to partner
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("partner_analytics_icon"))).click(); //click on analytics icon 
		Thread.sleep(6000);
		logger.info("deatiled analytics page is opened");
		driver.findElement(By.xpath(properties.getProperty("cross_icon_analytics"))).click(); //click on cross icon detailed analytics view
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon_partnerview"))).click(); //click on cross icon in partner view
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon_partnerview"))).click(); //click on cross icon in partner view
		Thread.sleep(6000);
		logger.info("clicked on cross icon and page is redirected to all tracks");
		logger.info("vendor-manage track-partner analytics view in vendor is completed");		

	}
}

