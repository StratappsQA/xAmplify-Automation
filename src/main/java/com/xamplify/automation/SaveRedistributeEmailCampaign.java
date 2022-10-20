package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SaveRedistributeEmailCampaign {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\Workspace2\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");// properties
																											// file
	final Logger logger = LogManager.getLogger(RedistributeVideoCampaign.class);

	@Test
	public void saveemail_Redistributecampaign() throws InterruptedException {

		Thread.sleep(7000);
		RedistributeEmailCampaign save_resc = new RedistributeEmailCampaign();
		save_resc.hoverRedistributecampaigns_email();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Redis_email_sendtestmail"))).click();// click on sendtestmail
																								// button
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Redis_email_sendinputfield")))
				.sendKeys("agayatri@stratapps.com"); // send the data
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("Redis_email_sendinput_submit"))).click(); // click on the
																									// submit
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Redis_email_submit_ok"))).click(); // click on Ok button

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Redis_email_saved"))).click(); // click on save last button
		Thread.sleep(6000);
		String redis_email_save = driver.findElement(By.xpath(properties.getProperty("Redis_email_save_response_msg")))
				.getText(); // response
		// message

		String expectedtitle = "Campaign saved successfully";

		if (expectedtitle.equals(redis_email_save)) {
			System.out.println("Redistribution email Campaign saved successfully");
		} else {
			System.out.println("Redistribution email Campaign failed");
		}

		logger.info(" Redistribution email Campaign saved successfully");

}
}