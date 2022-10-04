package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ManageEventCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\ManageEventCampaign.properties");
	final Logger logger = LogManager.getLogger(ManageEventCampaign.class);

	@Test(priority = 1, enabled = true)
	public void manage_event_editdelete() throws InterruptedException, SQLException {

		WebDriverWait wait = new WebDriverWait(driver, 50);// Wait till the element is not visible

		WebElement mevecam = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("manage_eve_campaignhover"))));
		mevecam.click(); // hover on campaign
		Actions mevecamp_action = new Actions(driver);
		mevecamp_action.moveToElement(mevecam).perform();
		Thread.sleep(5000);

		WebElement manage_eve_cam = driver.findElement(By.xpath(properties.getProperty("manage_eventcampaign"))); // manage
																													// campaign
		mevecamp_action.moveToElement(manage_eve_cam);
		mevecamp_action.click();
		mevecamp_action.perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();// click on the eventtab
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_editicon"))).click(); // click on the edit icon
		Thread.sleep(3000);

		WebElement meve_drop = driver.findElement(By.xpath(properties.getProperty("meve_edit_selectfolder"))); // click
																												// on
																												// the
																												// folder
		meve_drop.click();
		driver.findElement(By.xpath(properties.getProperty("meve_edit_selectedfolder"))).click(); // selected the folder
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_updatefolder"))).click(); // click on the update
		Thread.sleep(3000);
		logger.info("Folder updated successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_close"))).click(); // close the window
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_copycampaign"))).click(); // click on the copy campaign
																							// icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_copy_saveas"))).click(); // click on the save the
																							// copycampaign

		Thread.sleep(7000);
		logger.info("Copied Event campaign successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon2"))).click(); // click on the gear icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_delete"))).click(); // click on the delete icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_delete_yes"))).click(); // click on yes delete icon

		Thread.sleep(5000);
		logger.info("Copied Event Campaign Deleted Successfully");

	}

	@Test(priority = 2, enabled = true)
	public void manage_eve_sndpreview_update() throws InterruptedException, SQLException {

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_sendpreviewemail"))).click(); // click on the
																								// sendpreview mail
																								// option

		Thread.sleep(3000);

		WebElement snddata = driver.findElement(By.xpath(properties.getProperty("meve_senddata"))); // click on the
																									// emailid field
		snddata.sendKeys("agayatri@stratapps.com");
		snddata.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page

		driver.findElement(By.xpath(properties.getProperty("meve_sendbutton"))).click(); // click on the send button

		Thread.sleep(3000);

		logger.info("Event Preview email sent successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_closebutton"))).click(); // click on the close button
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_preview&delete"))).click();

		Thread.sleep(3000);

		WebElement we = driver.findElement(By.xpath("//div[@class='portlet-title']//select[1]"));
		we.click();
		Thread.sleep(3000);

		Select sort = new Select(we);
		Thread.sleep(3000);

		sort.selectByVisibleText("Email ID(A-Z)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Email ID(Z-A)");

		Thread.sleep(3000);
		sort.selectByVisibleText("First Name(ASC)");

		Thread.sleep(3000);
		sort.selectByVisibleText("First Name(DESC)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Last Name(ASC)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Last Name(DESC)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Company Name (A-Z)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Company Name (Z-A)");

		Thread.sleep(5000);

		driver.findElement(
				By.xpath("//div[@class='portlet-title']//input[@class='form-control ng-pristine ng-valid ng-touched']"))
				.sendKeys("gmail");

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_preview&delete_del"))).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_preview&del_yesdel"))).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_navigate_mcam"))).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_previewicon"))).click(); // click on the preview option

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("meve_preview_closeicon"))).click(); // click on the close
																								// icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_updateevent_option"))).click(); // click on the update
																									// event option
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_message"))).sendKeys("update for the message field");
		Thread.sleep(3000);
		logger.info("Added Message successfully by clicking on the update event icon");

		Actions at2 = new Actions(driver);
		at2.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_update_button"))).click(); // click on the update
																							// button
		Thread.sleep(58000);
		logger.info("Updated event successfully");

	}

	@Test(priority = 3, enabled = true)
	public void manage_eve_grid_cancel() throws InterruptedException, SQLException {

		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 50);// Wait till the element
		 * is not visible
		 * 
		 * WebElement mevecam = wait
		 * .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.
		 * getProperty("manage_eve_campaignhover")))); mevecam.click(); // hover on
		 * campaign Actions mevecamp_action = new Actions(driver);
		 * mevecamp_action.moveToElement(mevecam).perform(); Thread.sleep(5000);
		 * 
		 * WebElement manage_eve_cam =
		 * driver.findElement(By.xpath(properties.getProperty("manage_eventcampaign")));
		 * // manage campaign mevecamp_action.moveToElement(manage_eve_cam);
		 * mevecamp_action.click(); mevecamp_action.perform(); Thread.sleep(5000);
		 */

		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("meve_gridview"))).click(); // click on the grid view
		Thread.sleep(3000);

		WebElement w = driver.findElement(By.xpath(properties.getProperty("meve_hover_canceleventicon"))); // hover to
																											// cancelevent
																											// icon

		Actions action = new Actions(driver);
		action.moveToElement(w).perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("meve_hover_canceleventicon"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("meve_cancel_emailsubject")))
				.sendKeys("event cancelled subject"); // click on the Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_cancel_message")))
				.sendKeys("event cancelled due to some reasons"); // click on the
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_cancel_event"))).click(); // click on the cancel event
																							// button
																							// Thread.sleep(58000);
		logger.info("Event has been cancelled successfully");

		Thread.sleep(5000);

		WebElement w2 = driver.findElement(By.xpath(properties.getProperty("meve_hover_archieve_icon"))); // hover to
																											// cancelevent
																											// icon

		Actions action2 = new Actions(driver);
		action2.moveToElement(w2).perform();
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("meve_hover_archieve_icon"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_archievecampaigns_button"))).click();
		Thread.sleep(6000);
		logger.info("archieved button clicked successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_gridview"))).click(); // click on the grid view
		Thread.sleep(6000);

		logger.info("grid view");

		WebElement w3 = driver.findElement(By.xpath(properties.getProperty("meve_hover_grid_delete_active"))); // hover
																												// to
																												// icon

		Actions action3 = new Actions(driver);
		action3.moveToElement(w3).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("meve_hover_grid_delete_active"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_hover_grid_delete_yes"))).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("meve_hover_grid_activecam_button"))).click();

		Thread.sleep(7000);

	}
}
