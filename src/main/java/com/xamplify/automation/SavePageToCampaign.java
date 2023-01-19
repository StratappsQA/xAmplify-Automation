package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SavePageToCampaign extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("src/main/resources/Campaign.properties");// properties file

final Logger logger = LogManager.getLogger(SavePageToCampaign.class);
	
@Test (priority=167,enabled=true)
	public void page_to_campsave() throws InterruptedException, SQLException {
		Thread.sleep(4000);

		PageToCampaign ps2 = new PageToCampaign();
		ps2.page_to_campaign();
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("page_To_save"))).click();// click on save
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("page_To_saved"))).click(); // click on save last button
		Thread.sleep(6000);
		String p_to_campsave = driver.findElement(By.xpath(properties.getProperty("page_To_response_msg"))).getText(); // response
																											// message

		String expectedtitle = "Campaign saved successfully";

		if (expectedtitle.equals(p_to_campsave)) {
			System.out.println(" Page To Campaign saved successfully");
		} else {
			System.out.println(" Page Campaign failed");
		}
		
		Thread.sleep(10000);
logger.info("Page To Campaign Saved Successfully");
}
}

