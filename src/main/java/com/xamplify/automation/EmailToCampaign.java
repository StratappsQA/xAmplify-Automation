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
import org.testng.annotations.Test;

public class EmailToCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(EmailToCampaign.class);

	@Test
	public void email_to_campaign() throws InterruptedException, SQLException {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement campele = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("email_to_campaignhover"))));
		campele.click(); // hover on campaign

		Actions camp_action = new Actions(driver);
		camp_action.moveToElement(campele).perform();
		Thread.sleep(5000);
		WebElement create_e_tocampele = driver.findElement(By.xpath(properties.getProperty("email_to_createcampaign"))); // click
																														// on
																														// create
																														// campaign
		camp_action.moveToElement(create_e_tocampele);
		camp_action.click();
		camp_action.perform();
		Thread.sleep(5000);
		WebDriverWait waitc = new WebDriverWait(driver, 40);
		WebElement opncamp = waitc.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("email_to_openecampaign")))); // select
																											// email
																											// campaign
		opncamp.click();

		logger.info("Choose the Email campaign");

		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
				properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("campaign_name").toLowerCase()); // query,if campaign name already
																					// exists checking
		}
		String campaignNameFromProp = properties.getProperty("email_to_write_campaign").toLowerCase();

		driver.findElement(By.id(properties.getProperty("email_to_campaignName")))
				.sendKeys(properties.getProperty("email_to_write_campaign"));
		Thread.sleep(5000);
		if (campaignNames.indexOf(campaignNameFromProp) > -1) {
			driver.findElement(By.id(properties.getProperty("email_to_campaignName"))).clear();
			driver.findElement(By.id(properties.getProperty("email_to_campaignName")))
					.sendKeys(properties.getProperty("email_to_write_campaign") + "_" + System.currentTimeMillis());
		}
		WebElement e_tocampaignName = driver.findElement(By.id(properties.getProperty("email_to_campaignName")));
		String getcampaignname = e_tocampaignName.getAttribute("value");
		driver.findElement(By.xpath(properties.getProperty("email_to_subjectline"))).sendKeys("subjectLine***");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("email_to_preheader"))).sendKeys("preHeader**"); // preheader

		WebDriverWait waite1 = new WebDriverWait(driver, 50);
		WebElement we1 = waite1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("email_to_notify")))); // notify
																														// me
																														// email
																														// is
																														// opened

		we1.click();
		driver.findElement(By.xpath(properties.getProperty("email_to_notify1"))).click();

		WebDriverWait waite2 = new WebDriverWait(driver, 50);
		WebElement we2 = waite2.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("email_to_next1")))); // next
																													// page
		we2.click();
		logger.info("Given all the data in the Campaign details page");

		driver.findElement(By.xpath(properties.getProperty("email_to_goto_top"))).click();// go to top arrow
		Thread.sleep(5000);

		WebDriverWait wait_edropdown = new WebDriverWait(driver, 50);
		WebElement w_edropdown = wait_edropdown.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("email_to_select_dropdown"))));
		Thread.sleep(2000);

		Select dropdown = new Select(w_edropdown);
		dropdown.selectByVisibleText("Count(DESC)");

		WebDriverWait waite3 = new WebDriverWait(driver, 50);
		WebElement we3 = waite3.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("esearch_select_partnerlist_click"))));
		we3.sendKeys("Master");
//Search for partner list
		we3.sendKeys(Keys.ENTER); // Click on search

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_partnerlist_preview"))).click(); // preview of
																										// selected
																										// partner list
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_close_partnerpreview"))).click(); // close the
																										// selected
																										// partner
																										// preview list
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_select_partnerlist"))).click(); // select the
																										// partner list
		Thread.sleep(5000);

		logger.info("Selected the Partner list");
		

		driver.findElement(By.xpath(properties.getProperty("email_to_next2"))).click();							//next page
		//Thread.sleep(5000);

		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollTo(0,document.body.scrollHeight)");						//to scroll down the page

		WebDriverWait waite4 = new WebDriverWait(driver, 50);
		WebElement we4 = waite4
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("email_to_goto_top2"))));		//go to top navigation
		we4.click();

		

	WebElement template_search=	driver.findElement(By.xpath(properties.getProperty("email_to_search_template")));//search for template
	template_search.sendKeys("email");	
	template_search.sendKeys(Keys.ENTER);                       //for clicking on the search
		
		
		WebDriverWait waite5 = new WebDriverWait(driver, 50);
		WebElement we5 = waite5
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("email_to_search_template_select"))));			//select  template
		we5.click();	
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("email_to_template_preview"))).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("email_to_template_preview_close"))).click();
		Thread.sleep(5000);
		
logger.info("Selected the Email Template");
		driver.findElement(By.xpath(properties.getProperty("email_to_next3"))).click();							//next page
		Thread.sleep(5000);
		
	}
}
