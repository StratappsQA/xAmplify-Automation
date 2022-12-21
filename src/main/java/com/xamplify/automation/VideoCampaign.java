package com.xamplify.automation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VideoCampaign extends ExtentReportsClass{
	
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");
final Logger logger = LogManager.getLogger(VideoCampaign.class);
	
	@Test(priority = 8, enabled = true)

	public void vdecampaign() throws InterruptedException, SQLException {
	
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
		WebElement create_campele = driver.findElement(By.xpath(properties.getProperty("vcreatecampaign"))); // click on
																												// create
logger.info("Click on create Campaign");																										// campaign
		
		camp_action.moveToElement(create_campele);
		camp_action.click();
		camp_action.perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("openvideocampaign"))).click();// open campagin
		Thread.sleep(3000);

		//from here duplicate
		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
				properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("campaign_name").toLowerCase());
		}
		String campaignNameFromProp = properties.getProperty("vwrite_campaign").toLowerCase();

		driver.findElement(By.id(properties.getProperty("vcampaignName")))
				.sendKeys(properties.getProperty("vwrite_campaign"));
		Thread.sleep(5000);
		if (campaignNames.indexOf(campaignNameFromProp) > -1) {
			driver.findElement(By.id(properties.getProperty("vcampaignName"))).clear();
		} // added

		WebElement vcampaignName = driver.findElement(By.id(properties.getProperty("vcampaignName")));
		vcampaignName.sendKeys(properties.getProperty("vwrite_campaign") + "_" + System.currentTimeMillis());
		System.out.println(vcampaignName.getAttribute("value"));

		Thread.sleep(2000);
		
		//String getcampaignname = vcampaignName.getAttribute("value");


		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("vcampaign_through"))).click();// through toggle on
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("vsubjectline"))).sendKeys("subjectLine***");// enter data
																										// for subject
																										// line

		Thread.sleep(2000);

		driver.findElement(By.name(properties.getProperty("vpreheader"))).sendKeys("preHeader***");// enter data for pre
																									// header
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("vnotifyme_email"))).click();// notify email opened
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("vnotifyme_link"))).click();// notify link opened
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("vnotifyme_video"))).click();// notify video is played
		Thread.sleep(2000);
		

		WebDriverWait waitv2 = new WebDriverWait(driver, 30);// Wait till the element is not visible

		WebElement wvnext1 = waitv2.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("vcampaign_next_button1"))));
		wvnext1.click();
logger.info("Given the data in Campaign details page");
		

		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("goto_top"))).click();// go to top arrow
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(properties.getProperty("v_search_video"))).sendKeys("po3412CHANDRAYAAN2TEASE");// enter
																													// data
																													// in
																													// the
																													// search
																													// bar
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("v_search_video_click"))).click();// after data entered click

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("v_search_video_click_clear"))).click();// clear the data

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("v_search_video_click_clear_search"))).click();// clear the
																											// searched
																											// data

		Thread.sleep(3000);

		WebElement vdropdown = driver.findElement(By.xpath(properties.getProperty("video_category")));// select category
		Thread.sleep(3000);

		Select vd = new Select(vdropdown);
		Thread.sleep(3000);
		vd.selectByValue("1");

		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("select_video1"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("video_next2"))).click();// click next
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("goto_top"))).click();// go to top arrow
		Thread.sleep(5000);
logger.info("Selected the Video");		
		
		

		driver.findElement(By.xpath(properties.getProperty("search_select_partnerlist"))).sendKeys("Master");// send
																												// data
																												// to
																												// search
																												// bar

		WebDriverWait wait_vdropdown = new WebDriverWait(driver, 50);
		WebElement w_vdropdown = wait_vdropdown.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("v_select_dropdown"))));
		Thread.sleep(2000);

		Select dropdown = new Select(w_vdropdown);
		dropdown.selectByVisibleText("Count(DESC)");

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("search_select_partnerlist_click"))).click();// click on
																										// search after
																										// data entered
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("select_partner_preview"))).click();// click on preview
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("close_partner_preview"))).click();// close partner preview
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("select_partnerlist"))).click();// select partner list
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("select_next3"))).click();// click next
		Thread.sleep(5000);
logger.info("Selected the Partnerlist");
		

		WebElement v7 = driver.findElement(By.xpath(properties.getProperty("search_template")));
		v7.sendKeys("cobranding");// send data through search bar in template

		v7.sendKeys(Keys.ENTER);

		WebDriverWait waitv71 = new WebDriverWait(driver, 50);
		WebElement v71 = waitv71.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("search_template_click"))));// click on
																										// search after
																										// data entered
		v71.click();
		Thread.sleep(3000);

		WebDriverWait waitv_sel_temp = new WebDriverWait(driver, 60);
		WebElement v_temp_select = waitv_sel_temp.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("select_template")))); // select
																														// template
		v_temp_select.click();
		Thread.sleep(4000);

		WebDriverWait waitv11 = new WebDriverWait(driver, 50);
		WebElement v11 = waitv11.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("email_template_preview")))); // select
																											// template
		v11.click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("email_template_preview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_template_next"))).click();
		Thread.sleep(5000);
logger.info("Selected the Template");		
	}

}