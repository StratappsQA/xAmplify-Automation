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

public class ManagePlaybooks {

	//This class need to run in vendor account
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(ManagePlaybooks.class);


	//clicking on preview&edit and performing actions 
	@Test (priority=0)
	public void preview_edit_playbook() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("manage_playbooks"))).click(); //click on manage playbooks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorPlaybook"); //search with VendorPlaybook
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("preview&edit_click_pb"))).click(); //click on preview&edit
		Thread.sleep(6000);
		//updating title
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).clear(); //clear the text in title field
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).
		sendKeys(properties.getProperty("pb_name_edit") + "_" + System.currentTimeMillis()); //enter track tile
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button
		logger.info("vendorplaybook title is updated");	
		Thread.sleep(6000);
		//updating description
		driver.switchTo().frame(0);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).sendKeys("playbookDesc_Edit"); //updating description
		Thread.sleep(6000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
		Thread.sleep(6000);
		logger.info("vendorplaybook description is updated");	
		//		Thread.sleep(10000);
		//		driver.findElement(By.xpath(properties.getProperty("search_txt_pb"))).click(); //search with mp4 in search box
		//		driver.findElement(By.xpath(properties.getProperty("search_txt_pb"))).sendKeys("mp4"); //search with mp4 in search box
		//		driver.findElement(By.xpath(properties.getProperty("Search_click"))).click();	
		//		Thread.sleep(6000);
		//		driver.findElement(By.xpath(properties.getProperty("second_asset_selection_pb"))).click(); //selecting second mp4 asset
		//		Thread.sleep(6000);
		//		logger.info("second mp4 asset selected");   
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button  
		Thread.sleep(6000);
		//		logger.info("second mp4 asset updated");
		driver.findElement(By.xpath(properties.getProperty("update_button_asset"))).click(); //click on update button
		logger.info("playbook has been updated with title&description");
		//assertion for success message
		Thread.sleep(6000); 
		WebElement published = driver.findElement(By.xpath(properties.getProperty("afterpublish_success")));	
		String actualresult2 = published.getText();
		String expectedresult2 = "Play Book updated successfully";				
		Assert.assertEquals(actualresult2, expectedresult2);
		logger.info("Assertion for updated playbook succesfull");	
		Thread.sleep(6000);	
		logger.info("vendor-manage playbook-preview&edit is completed");	

	}




	//clicking on view of vendorplaybook
	@Test (priority=1)
	public void view_playbook() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("manage_playbooks"))).click(); //click on manage playbooks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorPlaybook"); //search with vendorplaybook
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("view_click_pb"))).click(); //click on view icon
		Thread.sleep(6000);	
		//asset view
		driver.findElement(By.xpath(properties.getProperty("asset_viewicon_click_pb"))).click(); //click on view icon of asset
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("asset_view_button_pb"))).click(); //click on view icon of asset
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("asset_crossicon_pb"))).click(); //click on view button of asset
		Thread.sleep(6000);
		logger.info("asset viewed succesfully");				
		//download asset
		driver.findElement(By.xpath(properties.getProperty("asset_download_button_pb"))).click(); //click on download button of asset
		Thread.sleep(6000);
		logger.info("asset downloaded succesfully");	
		logger.info("vendor-manage playbook-view is completed");
	}



	//clicking on analytics of vendorplaybook
	@Test (priority=2)
	public void analytics_playbook() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("manage_playbooks"))).click(); //click on manage playbooks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorPlaybook"); //search with vendorplaybook
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("analytics_icon_pb"))).click(); //click on analytics icon
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("analytics_crossicon"))).click(); //click on cross icon in analytics page
		Thread.sleep(6000);
		logger.info("analytics page is just viewed - but partner not viewed the asset");	
		logger.info("vendor-manage playbook-analytics is completed");
	}


	//unpublishing the published vendorplaybook 
	@Test (priority=3)
	public void unpublish_playbook() throws InterruptedException, IOException {	
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("manage_playbooks"))).click(); //click on manage playbooks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorPlaybook"); //search with vendorplaybook
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("unpublish_click_pb"))).click(); //click on unpublish icon
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("yes_popup"))).click(); //click on yes in popup
		Thread.sleep(7000);
		logger.info("vendorplaybook unpublished successfully");	
		logger.info("vendor-manage playbook-unpublish is completed");

	}

	//deleting the vendorplaybook
	@Test (priority=4)
	public void delete_vendorplaybook() throws InterruptedException, IOException {	
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("manage_playbooks"))).click(); //click on manage playbooks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("VendorPlaybook"); //search with vendorplaybook
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("delete_icon_pb"))).click(); //click on delete icon
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("yes_delete_notification"))).click(); //click on yes in popup
		logger.info("vendorplaybook is deleted successfully");
		Thread.sleep(6000);		
		//assertion for delete 
		WebElement success = driver.findElement(By.xpath(properties.getProperty("pb_delete_grid")));	
		String actualresult = success.getText();
		String expectedresult = "Play Book Deleted Successfully";
		Assert.assertEquals(actualresult, expectedresult);
		logger.info("Assertion succesfull for delete vendorplaybook");
		logger.info("vendor-manage playbook-delete is completed");

	}		


	//to view analytics in vendor account after playbook has been viewed and downloaded in partner account
	@Test (priority=5)
	public void analytics_playbook_vendor() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("manage_playbooks"))).click(); //click on add tracks
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("PartnerPlaybook"); //search with VendorPlaybook
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("analytics_icon_pb"))).click(); //click on analytics icon
		Thread.sleep(6000);
		logger.info("redirected to partner view analytics page in vendor account");
		driver.findElement(By.xpath(properties.getProperty("partner_analytics_icon"))).click(); //click on analytics icon agaisnt to partner
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("partner_analytics_icon"))).click(); //click on analytics icon 
		Thread.sleep(6000);
		logger.info("deatiled analytics page is opened and viewed the analytics in vendor account");
		driver.findElement(By.xpath(properties.getProperty("cross_icon_analytics"))).click(); //click on cross icon detailed analytics view
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon_partnerview"))).click(); //click on cross icon in partner view
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("cross_icon_partnerview"))).click(); //click on cross icon in partner view
		Thread.sleep(6000);
		logger.info("clicked on cross icons in all pages and page is redirected to all playbooks");
		logger.info("vendor-manage playbook-partner analytics view in vendor is completed");
	}



}
