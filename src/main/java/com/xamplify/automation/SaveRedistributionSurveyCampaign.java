package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SaveRedistributionSurveyCampaign extends ExtentReportsClass{
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("src/main/resources/RedistributionCampaign.properties");
	final Logger logger = LogManager.getLogger(SaveRedistributionSurveyCampaign.class);

	@Test (priority = 250, enabled = true)

	public void re_surveysave() throws InterruptedException, SQLException {
		Thread.sleep(3000);
		RedistributeSurveyCampaign rs1 = new RedistributeSurveyCampaign();
		rs1.redistribute_scampaign(); //Method Calling
		Thread.sleep(3000);

		logger.info("Click On Save");
		driver.findElement(By.xpath(properties.getProperty("click_on_save_re_survey"))).click(); //Save
		Thread.sleep(3000);
		
		logger.info("Click On SendTestMail");
		driver.findElement(By.xpath(properties.getProperty("click_sendtestmail_re_survey"))).click(); //Send test mail
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("sendtest_emailid"))).sendKeys("chmounika@stratapps.com"); //search
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("sendtest_emailid_submit"))).click(); //Submit
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("sendtest_emailid_ok"))).click();
		Thread.sleep(3000);
		logger.info("Click on Save for Redistribution survey campaign");
		driver.findElement(By.xpath(properties.getProperty("rs_save_click"))).click();
		Thread.sleep(3000);

		String rs_save = driver.findElement(By.xpath(properties.getProperty("rs_response_msg"))).getText(); // response
		// message
		logger.info("Survey Redistribution Campaign Saved Successfully");
		String Result = "Campaign saved successfully";

		if (Result.equals(rs_save)) {
			// Thread.sleep(2000);
			System.out.println("Survey Campaign Saved Successfully");
		} else {
			Thread.sleep(2000);

			System.out.println("Survey Campaign Saved failed");
		}

	}
}
