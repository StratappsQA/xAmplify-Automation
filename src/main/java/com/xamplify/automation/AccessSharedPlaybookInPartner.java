package com.xamplify.automation;

import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//This class need to run in parnter account
public class AccessSharedPlaybookInPartner {


	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\TrackBuilder.properties");
	final Logger logger = LogManager.getLogger(AccessSharedPlaybookInPartner.class);


	//view and download playbook in partner account
	@Test (priority = 219, enabled =true)
	public void view_playbook_partner() throws InterruptedException, IOException {	
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("Content_leftmenu1"))).click(); //click on left side content menu in partner account
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("access_sharedplaybook"))).click(); //click on access shared playbook
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("search_track"))).sendKeys("PartnerPlaybook"); //search with PartnerPlaybook
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_searchh"))).click(); //click on search icon	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("view_click_pb"))).click(); //click on view icon against to playbook
		Thread.sleep(5000);
		logger.info("view icon has been clicked agaisnt to partner playbook");	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("asset_viewicon_click_pb"))).click(); //click on view icon of asset
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("asset_view_button_pb"))).click(); //click on view button of asset
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("asset_crossicon_pb"))).click(); //click on cross icon of asset
		Thread.sleep(5000);
		logger.info("asset viewed succesfully in partner account");	
		//click on download
		driver.findElement(By.xpath(properties.getProperty("asset_download_button_pb"))).click(); //click on download button of asset
		Thread.sleep(5000);
		logger.info("asset downloaded succesfully in partner account");	
		logger.info("playbook has been viewed and downloaded in partner account");




	}

}
