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

public class SurveyCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

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
		WebElement create_campele = driver.findElement(By.xpath(properties.getProperty("survey_createcampaign"))); // click
																													// on
																													// create
																													// campaign
		camp_action.moveToElement(create_campele);
		camp_action.click();
		camp_action.perform();

		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,300)");
		Thread.sleep(5000);

		WebDriverWait waitc = new WebDriverWait(driver, 50);

		WebElement openscamp = waitc.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("survey_opencampaign")))); // select
																															// survey
																															// campaign
		openscamp.click();
		logger.info("Opened the Survey Campaign");
		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
				properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("campaign_name").toLowerCase()); // query,if campaign name already
																					// exists checking
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
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(document.body.scrollHeight,300)");
		Thread.sleep(5000);
		logger.info("Select Through campaign");
		driver.findElement(By.xpath(properties.getProperty("s_through"))).click(); // Slect Toggle Through
		Thread.sleep(2000);
		logger.info("send the data into Subject filed");
		driver.findElement(By.xpath(properties.getProperty("s_subject"))).sendKeys("subject for survey - "); // Campaign
		Thread.sleep(2000);
		logger.info("send the data into pre-header filed");
		driver.findElement(By.xpath(properties.getProperty("s_pre-header"))).sendKeys("pre-Header for Survey"); // Preheader
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("s_noty_workflows"))).click(); //Notify Workflows
		logger.info("Select ON");
		driver.findElement(By.xpath(properties.getProperty("s_noty_email_opened"))).click(); // Notify email
		Thread.sleep(2000);
		logger.info("Select ON");
		driver.findElement(By.xpath(properties.getProperty("s_noty_link_opened"))).click(); // Notify Link
		Thread.sleep(2000);
		
		/*
		 * JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 * js2.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		 * Thread.sleep(5000);
		 */
		
		logger.info("Goto Email_Template_Section");
		WebElement s_search = driver.findElement(By.xpath(properties.getProperty("s_search_template")));// search bar
		s_search.sendKeys("Survey");
		s_search.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("s_select_temp"))).click(); // Select template
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_template_preview"))).click(); // click on Preview icon
		Thread.sleep(3000);
		
		String originalWindow = driver.getWindowHandle();//store the current window handle
		wait.until(ExpectedConditions.numberOfWindowsToBe(2)); // wait for new tab to open
		Thread.sleep(5000);
			
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles()); //get all windows handle
			
		driver.switchTo().window(tabs.get(1)); //switch to the new tab
			
		Thread.sleep(3000);
			
			/*
			 * WebElement companylogoNewTab =
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.
			 * getProperty("")))); companylogoNewTab.click(); //perform actions in new tab
			 */			
		driver.close(); // switch back to original tab and close the new tab
			
		driver.switchTo().window(tabs.get(0));
			
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(properties.getProperty("click_survey_sendtext_email"))).click();
		Thread.sleep(5000);
		
		WebElement stext_email=	driver.findElement(By.xpath(properties.getProperty("survey_sendtext_email")));//search email fileds
		stext_email.sendKeys("chmounika@stratapps.com");	
		stext_email.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement stext_email_subject=	driver.findElement(By.xpath(properties.getProperty("survey_sendtext_email_subject")));//subject fileds
		stext_email_subject.sendKeys("Please check the Template");	
		stext_email_subject.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement stext_email_button=	driver.findElement(By.xpath(properties.getProperty("s_sendemail_button")));//send email button
		stext_email_button.click();	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("s_emailsent_popup"))).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(properties.getProperty("s_hover_on_template"))).click();
		Thread.sleep(2000);
		WebDriverWait edit = new WebDriverWait(driver, 20);
		WebElement edit1 = edit.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("s_template_edit"))));
		edit1.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("s_show_survey_button"))).click();
		
		WebElement form_Serach = driver.findElement(By.xpath(properties.getProperty("s_survey_form_search")));
		form_Serach.sendKeys("Survey");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_survey_form_search_icon"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_survey_form_preview"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_survey_form_preview_close"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_survey_forms_popup_close"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_template_edit_close"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_next"))).click(); // click on Next
		Thread.sleep(3000);

		logger.info("Goto Launch_Section");

		WebDriverWait wait_dropdown = new WebDriverWait(driver, 50);
		WebElement w_dropdown = wait_dropdown.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("s_select_dropdown")))); // select
																														// dropdown
		Thread.sleep(2000);

		Select sdropdown = new Select(w_dropdown);
		sdropdown.selectByVisibleText("Count(ASC)"); // select count Asc

		Thread.sleep(4000);

		logger.info("give the invalid text");
		driver.findElement(By.xpath(properties.getProperty("s_search_data"))).sendKeys("mnmnmnmnmn"); // give invalid
																										// text
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_search_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_cross_click"))).click();
		Thread.sleep(3000);
		logger.info("Search for active Master partner list");

		driver.findElement(By.xpath(properties.getProperty("s_search_Valid_data"))).sendKeys("active master"); // give
																													// Valid
																													// text
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_searchButton_click"))).click(); // click on Search button
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_select_partnerlist"))).click(); // Slect the Partner list
		Thread.sleep(3000);
		logger.info("click on preview_Partner_list ");
		driver.findElement(By.xpath(properties.getProperty("s_preview_partner_list"))).click(); // click on Preview Icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_close_preview_partner_list"))).click();
		Thread.sleep(3000);
		

	}

}
