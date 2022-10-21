package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Partner_ManageVideoCampaign {
	
	
	WebDriver driver=Instance.getInstance();
	
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\Workspace2\\xAmplify-Automation\\src\\main\\resources\\Partner_ManageCampaigns.properties");
	final Logger logger = LogManager.getLogger(Partner_ManageVideoCampaign.class);

	@Test

	public void partner_manage_vdecampaign() throws InterruptedException, SQLException {

	
		
		
		WebDriverWait p_mvc_wait = new WebDriverWait(driver, 50); // Wait till the element is not visible
		
		
		WebElement mvcamp = p_mvc_wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("partneracc_campaignhover"))));
		mvcamp.click(); // hover on campaign

		Actions p_mvcamp_action = new Actions(driver);
		p_mvcamp_action.moveToElement(mvcamp).perform();
		Thread.sleep(5000);
		WebElement manage_pvcampele = driver.findElement(By.xpath(properties.getProperty("partneracc_manage_campaign"))); // click on
		Thread.sleep(5000);																							// manage
																												// campaign
		p_mvcamp_action.moveToElement(manage_pvcampele);
		p_mvcamp_action.click();
		p_mvcamp_action.perform();

		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("partneracc_manage_video_tab"))).click();
		Thread.sleep(4000);
		
		
	}
}
