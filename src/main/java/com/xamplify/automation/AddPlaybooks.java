package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddPlaybooks extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(AddPlaybooks.class);


	//playbook creation to edit and delete in vendor account
	@Test (priority=32,enabled=true)
	public void add_playbook_vendor() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Add_playbooks"))).click(); //click on add playbooks
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).sendKeys(properties.getProperty("playbook_name") + "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection"))).click(); //select folder
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("camera_icon_playbook"))).click(); //click on camera icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("select_image"))).sendKeys("D:\\GitHub\\xAmplify-Automation\\jpg_file.jpg"); //click on select image icon and uploa dimage
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("save_changes"))).click(); //click on savechanges after selecting featured image
		Thread.sleep(5000);
		logger.info("featured image is uploaded by using sendkeys");
		driver.findElement(By.xpath(properties.getProperty("tag_plusicon_tp"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_text_click_tp"))).click();
		WebElement enter=driver.findElement(By.xpath(properties.getProperty("tag_text_click_tp")));
		enter.sendKeys(properties.getProperty("tag_name_tp")+ "_" + System.currentTimeMillis());
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(properties.getProperty("tag_savebutton_tp"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_select_tp"))).click();
		Thread.sleep(5000);
		logger.info("tag is selected");
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button
		logger.info("playbook details are provided"); //playbook details provided
		Thread.sleep(60000);

		//selecting first asset
		driver.findElement(By.xpath(properties.getProperty("add_media_playbook"))).click(); //click on add media
		Thread.sleep(5000);
		WebElement firstasset = driver.findElement(By.xpath(properties.getProperty("firstasset_click_pb")));
		if(firstasset.isDisplayed()) {
			driver.findElement(By.xpath(properties.getProperty("firstasset_click_pb"))).click(); //selecting first asset
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("display_text"))).sendKeys("Asset");
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("confirm_button"))).click();
			logger.info("first asset is selected");  	 
		}else {
			driver.findElement(By.xpath(properties.getProperty("close_popup_media"))).click();
			logger.info("no asset selected");
		}

		Thread.sleep(5000);

		//selecting first form
		driver.findElement(By.xpath(properties.getProperty("add_forms_playbook"))).click(); //click on add forms
		Thread.sleep(5000);
		WebElement firstform = driver.findElement(By.xpath(properties.getProperty("firstform_click_pb")));
		if(firstform.isDisplayed()) {
			driver.findElement(By.xpath(properties.getProperty("firstform_click_pb"))).click(); //selecting first form
			logger.info("form is selected");
		}else {
			driver.findElement(By.xpath(properties.getProperty("close_popup_form"))).click();
			logger.info("no form selected");

		}

		Thread.sleep(5000);
		driver.switchTo().frame(0);
		//Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).click();  
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).sendKeys("Playbook_Description"); //enter description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
		Thread.sleep(5000);
		logger.info("playbook description is entered");

		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("search_txt_pb"))).click(); //search with mp4 in search box
		driver.findElement(By.xpath(properties.getProperty("search_txt_pb"))).sendKeys("mp4"); //search with mp4 in search box
		driver.findElement(By.xpath(properties.getProperty("Search_click"))).click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("first_asset_selection_pb"))).click();	//select first asset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button  
		logger.info("mp4 first asset is selected");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("Search_publish_pb"))).sendKeys("automatedPartner"); //select automatedPartner in search field
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_publish_pb"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//driver.findElement(By.xpath(properties.getProperty("click_searchicon"))).click();		
		//Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("arrow_click_pb"))).click(); //select arrow of partner company
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_select_pb"))).click(); //select partner
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("save&publish_button"))).click(); //click on save&publish button
		Thread.sleep(5000);
		logger.info("clicked on save&publish button");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("afterpublish_success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Play Book created successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("playbook published to partner successfully-partner track");      
		}
		else
		{
			logger.info("Error while publishing the playbook to partner");
		}
		Thread.sleep(3000); 		
		logger.info("playbook has been created to view and delete in vendor account");
	}	




	//playbook to view and download in partner account
	@Test (priority=33,enabled=true)
	public void add_playbook_partner() throws InterruptedException, IOException {	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Add_playbooks"))).click(); //click on add playbooks
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Title_textfield"))).sendKeys(properties.getProperty("playbook_name_par") + "_" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_dropdown_click"))).click(); //click on folder dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_selection"))).click(); //select folder
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("camera_icon_playbook"))).click(); //click on camera icon
		Thread.sleep(5000);	
		driver.findElement(By.xpath(properties.getProperty("select_image"))).sendKeys("D:\\GitHub\\xAmplify-Automation\\jpg_file.jpg"); //click on select image icon and uploa dimage
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("save_changes"))).click(); //click on savechanges after selecting featured image
		Thread.sleep(5000);
		logger.info("image is uploaded using sendkeys- partner playbook");
		driver.findElement(By.xpath(properties.getProperty("tag_plusicon_tp"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_text_click_tp"))).click();
		//	driver.findElement(By.xpath(properties.getProperty("tag_text_click_pb"))).sendKeys(properties.getProperty("tag_name_pb"));
		WebElement enter=driver.findElement(By.xpath(properties.getProperty("tag_text_click_tp")));
		enter.sendKeys(properties.getProperty("tag_name_tp")+ "_" + System.currentTimeMillis());
		enter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(properties.getProperty("tag_savebutton_tp"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("tag_select_tp"))).click();
		Thread.sleep(5000);
		logger.info("tag is selected- partner playbook");
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button
		logger.info("playbook details are provided- partner playbook"); //details provided
		Thread.sleep(60000);



		//selecting first asset
		driver.findElement(By.xpath(properties.getProperty("add_media_playbook"))).click();//click on add media
		Thread.sleep(5000);


		WebElement firstasset = driver.findElement(By.xpath(properties.getProperty("firstasset_click_pb")));
		if(firstasset.isDisplayed()) {
			driver.findElement(By.xpath(properties.getProperty("firstasset_click_pb"))).click(); //select first asset
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("display_text"))).sendKeys("Asset");
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("confirm_button"))).click();
			logger.info("asset is selected- partner playbook");  	 
		}else {
			driver.findElement(By.xpath(properties.getProperty("close_popup_media"))).click();
			logger.info("no asset selected");
		}

		Thread.sleep(5000);

		//selecting first form
		driver.findElement(By.xpath(properties.getProperty("add_forms_playbook"))).click(); //click on add forms
		Thread.sleep(5000);

		WebElement firstform = driver.findElement(By.xpath(properties.getProperty("firstform_click_pb")));

		if(firstform.isDisplayed()) {
			driver.findElement(By.xpath(properties.getProperty("firstform_click_pb"))).click(); //select first form
			logger.info("form is selected- partner playbook");
		}else {
			driver.findElement(By.xpath(properties.getProperty("close_popup_form"))).click();
			logger.info("no form selected");

		}

		Thread.sleep(5000);
		driver.switchTo().frame(0);
		//Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).click();  
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Description_field"))).sendKeys("Playbook_Description"); //enter description
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click();
		Thread.sleep(5000);
		logger.info("playbook description is entered- partner playbook");

		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("search_txt_pb"))).click(); //search with mp4 in search box
		driver.findElement(By.xpath(properties.getProperty("search_txt_pb"))).sendKeys("mp4"); //search with mp4 in search box
		driver.findElement(By.xpath(properties.getProperty("Search_click"))).click();	
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("first_asset_selection_pb"))).click();	//select first asset
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("next_button"))).click(); //click on next button  
		logger.info("mp4 first asset is selected- partner playbook");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Search_publish_pb"))).sendKeys("automatedPartner"); //select automatedPartner in search field
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Search_publish_pb"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//driver.findElement(By.xpath(properties.getProperty("click_searchicon"))).click();		
		//Thread.sleep(5000);		
		driver.findElement(By.xpath(properties.getProperty("arrow_click_pb"))).click(); //select arrow of partner company
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_select_pb"))).click(); //select partner
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("save&publish_button"))).click(); //click on save&publish button
		Thread.sleep(5000);
		logger.info("clicked on save&publish button");	
		
		String actualresult_asset=driver.findElement(By.xpath(properties.getProperty("afterpublish_success"))).getText();
		Thread.sleep(3000);
		String expectedresult_asset = "Play Book created successfully";                                
		if(expectedresult_asset.equals(actualresult_asset))
		{
			logger.info("playbook published to partner successfully-partner track");      
		}
		else
		{
			logger.info("Error while publishing the playbook to partner");
		}
		Thread.sleep(3000); 		
		logger.info("playbook has been created to view and download in partner account");
	}	




}
