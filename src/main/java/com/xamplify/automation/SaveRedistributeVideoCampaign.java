package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SaveRedistributeVideoCampaign extends ExtentReportsClass {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");// properties
																											// file
	final Logger logger = LogManager.getLogger(RedistributeVideoCampaign.class);

	@Test
	public void savevideo_Redistributecampaign() throws InterruptedException {

		Thread.sleep(7000);
		RedistributeVideoCampaign save_rvsc = new RedistributeVideoCampaign();
		save_rvsc.hoverRedistributecampaigns();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Redis_vde_sendtestmail"))).click();// click on sendtestmail
																								// button
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Redis_vde_sendinputfield")))
				.sendKeys("agayatri@stratapps.com"); // send the data
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("Redis_vde_sendinput_submit"))).click(); // click on the
																									// submit
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Redis_vde_submit_ok"))).click(); // click on Ok button

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Redis_vde_saved"))).click(); // click on save last button
		Thread.sleep(6000);
		String redis_vde_save = driver.findElement(By.xpath(properties.getProperty("Redis_video_save_response_msg")))
				.getText(); // response
		// message

		String expectedtitle = "Campaign saved successfully";

		if (expectedtitle.equals(redis_vde_save)) {
			System.out.println("Redistribution Video Campaign saved successfully");
		} else {
			System.out.println("Redistribution Video Campaign failed");
		}

		logger.info(" Redistribution Video Campaign saved successfully");

	}
}