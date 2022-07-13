package com.xamplify.automation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

public class SurveyCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");
	
final Logger logger = LogManager.getLogger(SurveyCampaign.class);
	
@Test

public void scampaign() throws InterruptedException, SQLException {
	
	WebDriverWait wait = new WebDriverWait(driver, 50);

	// Wait till the element is not visible

	WebElement scamp = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("campaignhover"))));
	scamp.click(); // hover on campaign
	
	Actions camp_action = new Actions(driver);
	camp_action.moveToElement(scamp).perform();
	Thread.sleep(5000);
	WebElement create_campele = driver.findElement(By.xpath(properties.getProperty("survey_createcampaign"))); //click on create campaign
	camp_action.moveToElement(create_campele);
	camp_action.click();
	camp_action.perform();
	
	Thread.sleep(5000);
	
	WebDriverWait waitc = new WebDriverWait(driver, 40);
	
	WebElement openscamp = waitc.until(
			ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("survey_opencampaign")))); //select survey campaign
	openscamp.click();
logger.info("Opened the Survey Campaign");
	List<String> campaignNames = new ArrayList<String>();
	String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
			properties.getProperty("user.name"));
	ResultSet resultSet = DatabaseConnection.getResultSet(query);
	while (resultSet.next()) {
		campaignNames.add(resultSet.getString("campaign_name").toLowerCase());			//query,if campaign name already exists checking 
	}
	String campaignNameFromProp = properties.getProperty("swrite_campaigname").toLowerCase();
	
	driver.findElement(By.id(properties.getProperty("scampaignName")))
	.sendKeys(properties.getProperty("swrite_campaigname"));
	Thread.sleep(5000);

	if (campaignNames.indexOf(campaignNameFromProp) > -1) {
	driver.findElement(By.id(properties.getProperty("scampaignName"))).clear();
	driver.findElement(By.id(properties.getProperty("scampaignName")))
			.sendKeys(properties.getProperty("swrite_campaigname") + "_" + System.currentTimeMillis());
	}
logger.info("Select Through campaign");	
	driver.findElement(By.xpath(properties.getProperty("s_through"))).click();
	Thread.sleep(2000);
logger.info("send the data into Subject filed");
	driver.findElement(By.xpath(properties.getProperty("s_subject"))).sendKeys("subject for survey");
	Thread.sleep(2000);
logger.info("send the data into pre-header filed");	
	driver.findElement(By.xpath(properties.getProperty("s_pre-header"))).sendKeys("pre-Header for Survey");	
	Thread.sleep(2000);
logger.info("Select ON");
	driver.findElement(By.xpath(properties.getProperty("s_noty_email_opened"))).click();
	Thread.sleep(2000);
logger.info("Select ON");
	driver.findElement(By.xpath(properties.getProperty("s_noty_link_opened"))).click();
	Thread.sleep(2000);
logger.info("Click on Next button");
	driver.findElement(By.xpath(properties.getProperty("s_next"))).click();
	Thread.sleep(4000);
	logger.info("Goto Partner section");	
	driver.findElement(By.xpath(properties.getProperty("p_gototop"))).click();
 	
 	
 	WebDriverWait wait_dropdown = new WebDriverWait(driver, 50);
	WebElement w_dropdown = wait_dropdown
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("s_select_dropdown"))));  //select dropdown
	Thread.sleep(2000);
	
 	Select pdropdown = new Select(w_dropdown); 
 	pdropdown.selectByVisibleText("Count(DESC)");  //select count desc
 	
 	Thread.sleep(4000);



logger.info("give the invalid text");
	driver.findElement(By.xpath(properties.getProperty("s_search_data"))).sendKeys("mnmnmnmnmn");
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("s_search_click"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("s_cross_click"))).click();
	Thread.sleep(3000);
logger.info("Search for active Master partner list");

	driver.findElement(By.xpath(properties.getProperty("s_search_Valid_data"))).sendKeys("Active Master Partner list");
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("s_searchButton_click"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("s_select_partnerlist"))).click();
	Thread.sleep(3000);
logger.info("click on preview ");
	driver.findElement(By.xpath(properties.getProperty("s_preview_partner_list"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("s_close_preview_partner_list"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("s_next1"))).click();
	Thread.sleep(3000);
	
	
	
}
	
}

