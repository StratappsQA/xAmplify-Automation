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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManageVideoCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\ManageCampaigns.properties");
	final Logger logger = LogManager.getLogger(SurveyCampaign.class);

	@Test

	public void manage_scampaign() throws InterruptedException, SQLException {

		WebDriverWait wait = new WebDriverWait(driver, 50); // Wait till the element is not visible

		WebElement mvcamp = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("campaignhover"))));
		mvcamp.click(); // hover on campaign

		Actions mcamp_action = new Actions(driver);
		mcamp_action.moveToElement(mvcamp).perform();
		Thread.sleep(5000);
		WebElement manage_campele = driver.findElement(By.xpath(properties.getProperty("managecampaigns"))); // click on
																												// manage
																												// campaign
		mcamp_action.moveToElement(manage_campele);
		mcamp_action.click();
		mcamp_action.perform();

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("video_tab"))).click(); // Click on Video Tab
		Thread.sleep(5000);
		logger.info("Clicked on the Video tab");
		
		driver.findElement(By.xpath(properties.getProperty("video_gear_icon"))).click(); //click on Gear icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("video_edit"))).click(); //click on edit 
		Thread.sleep(3000);
		logger.info("Click on the Edit Icon");
		WebDriverWait folder_dropdown = new WebDriverWait(driver, 50);
		WebElement f_dropdown = folder_dropdown.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("v_select_folder_dropdown")))); // select
																											// folder
																											// dropdown
		Thread.sleep(2000);

		Select fdropdown = new Select(f_dropdown);
		fdropdown.selectByValue("1106"); // select by value

		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("update_button"))).click();// click on update
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("click_close"))).click();// click on close button
		Thread.sleep(4000);
		logger.info("click on Gear icon");
		driver.findElement(By.xpath(properties.getProperty("gear_icon"))).click(); // Click on gear icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copy_campaign"))).click();// Click on Copy Campaign
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("click_save_changes"))).click();// click on Save Changes.
		Thread.sleep(5000);
		logger.info("campaign copied successfully");

		
}
}
