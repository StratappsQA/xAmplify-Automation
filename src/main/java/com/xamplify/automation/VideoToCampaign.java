package com.xamplify.automation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VideoToCampaign extends ExtentReportsClass{
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");
	final Logger logger = LogManager.getLogger(VideoToCampaign.class);

	@Test

	public void vde_to_campaign() throws InterruptedException, SQLException {

		WebDriverWait waitv = new WebDriverWait(driver, 80);

		// Wait till the element is not visible
		WebElement campele = waitv.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("campaign_hover_v"))));// hover
																														// on
																														// campaign
		campele.click();

		Actions camp_action = new Actions(driver);
		camp_action.moveToElement(campele).perform();
		Thread.sleep(5000);
		WebElement create_campele = driver.findElement(By.xpath(properties.getProperty("vcreateTocampaign"))); // click
																												// on
																												// create
		logger.info("Click on create Campaign"); // campaign

		camp_action.moveToElement(create_campele);
		camp_action.click();
		camp_action.perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("openvideoTocampaign"))).click();// open campaign
		Thread.sleep(3000);

		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
				properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("campaign_name").toLowerCase());
		}
		String campaignNameFromProp = properties.getProperty("ewrite_campaign").toLowerCase();

		driver.findElement(By.id(properties.getProperty("v_to_campaignName")))
				.sendKeys(properties.getProperty("v_towrite_campaign"));
		Thread.sleep(5000);
		if (campaignNames.indexOf(campaignNameFromProp) > -1) {
			driver.findElement(By.id(properties.getProperty("vcampaignName"))).clear();
		} // added

		WebElement vTocampaignName = driver.findElement(By.id(properties.getProperty("v_to_campaignName")));
		vTocampaignName.sendKeys(properties.getProperty("v_towrite_campaign") + "_" + System.currentTimeMillis());
		System.out.println(vTocampaignName.getAttribute("value"));

		Thread.sleep(2000);

		// String getcampaignname = vcampaignName.getAttribute("value");

//		Thread.sleep(1000);
//		driver.findElement(By.xpath(properties.getProperty("vcampaign_through"))).click();// through toggle on
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("vsubjectline"))).sendKeys("VideoToCampaignsubjectLine");// enter data
																										// for subject
																										// line

		Thread.sleep(2000);

		driver.findElement(By.name(properties.getProperty("vpreheader"))).sendKeys("VideoToCampaignpreheader");// enter data for pre
																									// header
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("v_to_notifyme_email"))).click();// notify email opened
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("v_to_notifyme_link"))).click();// notify link opened
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("v_to_notifyme_video"))).click();// notify video is played
		Thread.sleep(2000);

		WebDriverWait waitv2camp = new WebDriverWait(driver, 30);// Wait till the element is not visible

		WebElement wv_to_next1 = waitv2camp.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("v_to_campaign_next_button1"))));
		wv_to_next1.click();
		logger.info("Given the data in Campaign details page");

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("goto_top"))).click();// go to top arrow
		Thread.sleep(3000);

		
		driver.findElement(By.xpath(properties.getProperty("v_to_search_video"))).sendKeys("po3412CHANDRAYAAN2TEASE");// enter 																													// data
																													// in
																													// the
																													// search
																													// bar
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("v_to_search_video_click"))).click();// after data entered click

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("v_to_search_video_click_clear"))).click();// clear the data

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("v_to_search_video_click_clear_search"))).click();// clear the
																											// searched
																											// data

		Thread.sleep(3000);

		WebElement v_to_dropdown = driver.findElement(By.xpath(properties.getProperty("v_to_video_category")));// select category
		Thread.sleep(3000);

		Select vd1 = new Select(v_to_dropdown);
		Thread.sleep(3000);
		vd1.selectByValue("1");

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_select_video1"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp__next2"))).click();// click next
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("goto_top"))).click();// go to top arrow
		Thread.sleep(5000);
		logger.info("Selected the Video");

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_search_select_partnerlist"))).sendKeys("Master");// send
																												// data
																												// to
																												// search
																												// bar

		WebDriverWait wait_v_to_dropdown = new WebDriverWait(driver, 50);
		WebElement w_v_to_dropdown = wait_v_to_dropdown.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("v_to_camp_select_dropdown"))));
		Thread.sleep(2000);

		Select dropdown1 = new Select(w_v_to_dropdown);
		dropdown1.selectByVisibleText("Count(DESC)");

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_search_select_partnerlist_click"))).click();// click on
																										// search after
																										// data entered
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_select_partner_preview"))).click();// click on preview
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_close_partner_preview"))).click();// close partner preview
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_select_partnerlist"))).click();// select partner list
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_select_next3"))).click();// click next
		Thread.sleep(5000);
		logger.info("Selected the Partnerlist");
		

		WebElement v_to_1 = driver.findElement(By.xpath(properties.getProperty("v_to_camp_search_template")));
		v_to_1.sendKeys("video");// send data through search bar in template

		v_to_1.sendKeys(Keys.ENTER);
		Thread.sleep(4000);


		WebDriverWait waitv21 = new WebDriverWait(driver, 50);
		WebElement v21 = waitv21.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("v_to_camp_search_template_click"))));// click on
																										// search after
																										// data entered
		v21.click();
		Thread.sleep(4000);


		WebDriverWait waitv31 = new WebDriverWait(driver, 60);
		WebElement v31 = waitv31.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("v_to_camp_select_template")))); // select
																														// template
		v31.click();
		Thread.sleep(4000);

		WebDriverWait waitv41 = new WebDriverWait(driver, 50);
		WebElement v41 = waitv41.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("v_to_camp_email_template_preview")))); // select
																											// template
		v41.click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_email_template_preview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("v_to_camp_email_template_next"))).click();
		Thread.sleep(5000);
		logger.info("Selected the Template");
		Thread.sleep(8000);
	}

}
