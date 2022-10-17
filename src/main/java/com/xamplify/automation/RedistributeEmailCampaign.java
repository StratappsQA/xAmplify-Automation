package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RedistributeEmailCampaign {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\Workspace2\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");// properties
																											// file
	final Logger logger = LogManager.getLogger(RedistributeEmailCampaign.class);

	@Test
	public void hoverRedistributecampaigns_email() throws InterruptedException {
		Thread.sleep(6000);

		WebElement ele = driver.findElement(By.linkText("Campaign"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_ehover"))).click(); // hover on
																										// campaign
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_emailtab"))).click(); // click on email
																										// tab
		Thread.sleep(4000);
		logger.info("Email tab clicked successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_eredis_edownload"))).click(); // click on download
																								// icon
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partner_eredis_edwnld_html"))).click();
		Thread.sleep(4000);
		logger.info("Html downloaded successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_eredis_edownload"))).click(); // click on download
																								// icon
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partner_eredis_edwnld_pdf"))).click();
		Thread.sleep(4000);
		logger.info("Pdf downloaded successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_eredis_eviewdwnld_history"))).click(); // click on
																											// viewdownloadhistory
																											// icon
		Thread.sleep(4000);
		logger.info("DownloadHistory seen successfully");
		driver.findElement(By.xpath(properties.getProperty("partner_eredis_eviewdwnld_history_close"))).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_ecamp_preview"))).click(); // click
																											// preview
																											// icon

		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_ecamp_preview_close"))).click();// closing
																												// the
		logger.info("Previewed campaign successfully");
		// preview
		
		
		
		
		
		

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_ecamp_redistributeicon"))).click(); // click
																													// Redistribute
																													// icon
		Thread.sleep(5000);

		driver.findElement(By.id("campaignName")).sendKeys("" + "_" + System.currentTimeMillis());
		Thread.sleep(4000);

		

		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_selectcontact_click"))).click(); // click
																													// select
																													// button

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_selectcontactlist"))).click();// select
																												// the
																												// contacts

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_selectcontactlist_preview"))).click(); // click
																														// preview
																														// of
																														// the
																														// contacts
																														// icon

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("partner_eredistribute_selectcontactlist_preview_close")))
				.click();

		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
}
