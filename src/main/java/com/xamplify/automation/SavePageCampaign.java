package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SavePageCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");// properties file

final Logger logger = LogManager.getLogger(SavePageCampaign.class);
	@Test
	public void page_save() throws InterruptedException, SQLException {
		Thread.sleep(4000);

		PageCampaign ps1 = new PageCampaign();
		ps1.pcampaign();
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("p_save"))).click();// click on save
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("p_saved"))).click(); // click on save last button
		Thread.sleep(6000);
		String p_save = driver.findElement(By.xpath(properties.getProperty("p_response_msg"))).getText(); // response
																											// message

		String expectedtitle = "Campaign saved successfully";

		if (expectedtitle.equals(p_save)) {
			System.out.println(" Page Campaign saved successfully");
		} else {
			System.out.println(" Page Campaign failed");
		}
		
		Thread.sleep(10000);
logger.info("Page Campaign Launched Successfully");
	}
}