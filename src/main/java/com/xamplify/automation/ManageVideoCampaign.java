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

		driver.findElement(By.xpath(properties.getProperty("video_gear_icon"))).click(); // click on Gear icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("video_edit"))).click(); // click on edit
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
		driver.findElement(By.xpath(properties.getProperty("video_gear_icon1"))).click(); // Click on gear icon
		Thread.sleep(3000);
		logger.info("click on copy");

		driver.findElement(By.xpath(properties.getProperty("mv_copy_campaign"))).click();// Click on Copy Campaign
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("mv_click_save_changes"))).click();// click on Save Changes.
		Thread.sleep(5000);
		logger.info("campaign copied successfully");

		Actions a = new Actions(driver); // scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("video_gear_icon2"))).click(); // Click on gear icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mv_update_end_date"))).click(); // click on update end date
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mv_campaign_end_date"))).click();
		Thread.sleep(3000);

		WebElement wd = driver.findElement(By.xpath(properties.getProperty("mv_selected_date")));

		wd.click();

		Thread.sleep(4000);

		logger.info("Selected the End date ");

		driver.findElement(By.xpath(properties.getProperty("mv_save_changes"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("video_gear_icon2"))).click(); // Click on gear icon
		Thread.sleep(3000);

		logger.info("Click on Preview & Delete");
		driver.findElement(By.xpath(properties.getProperty("mv_preview&delete_partner"))).click(); // Click on Preview
																									// and
																									// delete
		Thread.sleep(3000);
		JavascriptExecutor js_down = (JavascriptExecutor) driver;
		js_down.executeScript("window.scrollTo(0,100)");
		Thread.sleep(5000);

		WebDriverWait wait_sortby = new WebDriverWait(driver, 50);
		WebElement w_sort = wait_sortby
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("mv_sortby")))); // select
																														// dropdown
		Thread.sleep(2000);

		Select sort1 = new Select(w_sort);

		sort1.selectByVisibleText("Email ID(A-Z)");
		Thread.sleep(3000);
		WebDriverWait search1 = new WebDriverWait(driver, 50);
		WebElement sr1 = search1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("mv_previewdelete_search"))));
		sr1.sendKeys("Automate");// data sent in search bar
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mv_previewdelete_search"))).sendKeys(Keys.ENTER);// click
																												// enter
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mv_click_delete_under_preview&Delete"))).click(); // delete
																												// partner
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mv_click_on_yes_delete"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mv_ManageCamp_breadcrump"))).click();// click on manage
		// campaigns
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("video_tab"))).click(); // Click on Survey Tab
		Thread.sleep(5000);

		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		jsp.executeScript("window.scrollTo(document.body.scrollHeight,200)");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("video_gear_icon2"))).click(); // Click on gear icon
		Thread.sleep(3000);
		logger.info("Click on Preview");

		driver.findElement(By.xpath(properties.getProperty("mv_click_preview_camp"))).click();
		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("mv_preview_close"))).click();
		Thread.sleep(7000);
		
//		logger.info("click on video tab");
//
//		driver.findElement(By.xpath(properties.getProperty("video_tab"))).click(); // Click on Video Tab
//		Thread.sleep(5000);

//		Actions a1 = new Actions(driver); // scroll down a page
//		a.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(7000);
		logger.info("click on gear icon");

		driver.findElement(By.xpath(properties.getProperty("video_gear_icon2"))).click(); // Click on gear icon
		Thread.sleep(3000);
		logger.info("Click on Archieve Campaigns");
		driver.findElement(By.xpath(properties.getProperty("mv_archieve_campaign"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mv_archieved_campaign_button"))).click();// click on archieved
		// campaigns button
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("mv_archieved_gear_icon"))).click();
		Thread.sleep(3000);
		logger.info("Click on Unarchieve Campaigns");
		driver.findElement(By.xpath(properties.getProperty("mv_unarchieved_option"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mv_active_campaigns_botton"))).click();// click on active
		// campaigns button
		Thread.sleep(4000);
		logger.info("click on video tab");

		driver.findElement(By.xpath(properties.getProperty("video_tab"))).click(); // Click on Video Tab
		Thread.sleep(5000);
		logger.info("click on gear icon");


		driver.findElement(By.xpath(properties.getProperty("mv_gear_icon"))).click(); // Click on gear icon
		Thread.sleep(3000);
		
		logger.info("click on delete campaign");
		driver.findElement(By.xpath(properties.getProperty("mv_delete_campaign"))).click(); // Click on delete Campaign
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mv_click_on_yes_delete"))).click(); // deleted the Campaign
		Thread.sleep(3000);
		logger.info("Click on Grid View");
		driver.findElement(By.xpath(properties.getProperty("grid_view"))).click();// click on grid view
		Thread.sleep(4000);
		logger.info("Click on Folder Grid View");
		
		driver.findElement(By.xpath(properties.getProperty("folder_grid_view"))).click(); // click on folder grid view
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("fgv_search"))).sendKeys("automatedvendor"); // click on
																										// search bar
																										// under folder
																										// grid view
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();// click on search icon
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("cross_button"))).click();
		Thread.sleep(4000);

		WebDriverWait wait_f_sortby = new WebDriverWait(driver, 50);
		WebElement w_f_sort = wait_f_sortby
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("ms_f_sortby")))); // select
																														// dropdown
		Thread.sleep(2000);

		Select f_sort1 = new Select(w_f_sort);

		f_sort1.selectByVisibleText("Name (A-Z)");
		Thread.sleep(3000);
		f_sort1.selectByVisibleText("Name (Z-A)");
		Thread.sleep(3000);
		f_sort1.selectByVisibleText("Created On (ASC)");
		Thread.sleep(3000);
		f_sort1.selectByVisibleText("Created On (DESC)");
		Thread.sleep(3000);
		f_sort1.selectByVisibleText("Updated On (ASC)");
		Thread.sleep(3000);
		f_sort1.selectByVisibleText("Updated On (DESC)");
		Thread.sleep(3000);
		f_sort1.selectByVisibleText("Count (ASC)");
		Thread.sleep(3000);
		f_sort1.selectByVisibleText("Count (DESC)");
		Thread.sleep(3000);

		logger.info("Click on Folder List View");

		driver.findElement(By.xpath(properties.getProperty("folder_list_view"))).click(); // Click on folder list view
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("flv_search"))).sendKeys("automatedvendor"); // click on
																										// search bar
																										// under folder
																										// grid view
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();// click on search icon
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("cross_button"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("list_view"))).click(); // Click on List View
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("video_gear_icon2"))).click(); // Click on gear icon
		Thread.sleep(3000);

		logger.info("Click on the campaign based reports");
		driver.findElement(By.xpath(properties.getProperty("analytics_icon_click"))).click(); // Click on Campaign based
																								// Reports
		Thread.sleep(3000);

	}
}
