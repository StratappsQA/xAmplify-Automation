package com.xamplify.automation;

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

public class PartnerManageSurveyCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");
	final Logger logger = LogManager.getLogger(PartnerManageSurveyCampaign.class);

	@Test

	public void manage_redsurveycamp() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 50); // Wait till the element is not visible
		WebElement s_element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("re_Surveycampaignhover"))));// Hover the
																											// Campaign
																											// module
		s_element.click();
		logger.info("Hover the campaign module");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("click_resurvey_manage_camp"))).click();// Click on Manage
																									// campaigns
		Thread.sleep(5000);
		logger.info("Click on Manage campaign");
		driver.findElement(By.xpath(properties.getProperty("resurvey_click_survey_tab"))).click(); // Click on SurveyTab
		Thread.sleep(5000);
		logger.info("Click on the Survey tab");
		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click(); // Click on Gear icon
		Thread.sleep(3000);
		logger.info("click on Edit");
		driver.findElement(By.xpath(properties.getProperty("click_rs_edit"))).click(); // Click on Edit
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_edit_update"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_close"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click();
		Thread.sleep(3000);
		logger.info("click on Preview");
		driver.findElement(By.xpath(properties.getProperty("click_rs_preview"))).click(); // Click on Preview
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_cross"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_dropdownarrow"))).click();
		Thread.sleep(3000);
		logger.info("click on Archieve");
		driver.findElement(By.xpath(properties.getProperty("click_rs_archieve"))).click(); // Click on Archieve under
																							// gear icon
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_archievedcampaigns"))).click(); // Click on
																										// archieved
																										// campaign
																										// button
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("drdwn_archd_camp"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_rs_unarchieve"))).click(); // Click on Unarchieved
																								// under Archieved
																								// campaigns
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_active_campaigns"))).click(); // Click on Active
																								// Campaigns
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("re_survey_tab"))).click(); // Survey tab
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_drpdown_to_delete"))).click(); // delete
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("click_re_survey_camp_Delete"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_yes_del"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("re_survey_tab"))).click();
		Thread.sleep(5000);
		logger.info("click on Analytics icon under manage Campaigns");
		driver.findElement(By.xpath(properties.getProperty("click_re_Survey_Analytics"))).click(); // Click on Analytics
		Thread.sleep(3000);

		logger.info("Click on the Recepients");

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementsByClassName('fa fa-user')");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_recepients_click"))).click(); // click on
																										// Recepients
																										// tile
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_recepients_search_box"))) // search
				.sendKeys("automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_recepients_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click(); // export
																												// to
																												// excel
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_recepients_cross_click"))).click();
		Thread.sleep(3000);

		logger.info("click on the Total EMail sent");
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_email_sent"))).click(); // Total email
																										// sent
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_email_search_box")))
				.sendKeys("automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_emailsent_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_total_emailsent_cross_click"))).click();
		Thread.sleep(3000);

		logger.info("click on the Deliverability");
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_deliverability"))).click(); // Deliverability
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_delivered_email_search_box")))
				.sendKeys("automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_delivered_email_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_surveycamp_delivered_cross_click"))).click();
		Thread.sleep(3000);

		logger.info("Click on the Open_rate");

		WebElement openrat = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_openrate"))); // openrate
		if (openrat.isEnabled()) {
			openrat.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_emails_opened_by_recepients_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_emails_opened_by_recepients_search")))
					.click();
			Thread.sleep(3000);

			WebDriverWait wait_time_drdn = new WebDriverWait(driver, 50);
			WebElement w_time = wait_time_drdn.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("re_surveycamp_time_dropdown")))); // selectdropdown
			Thread.sleep(2000);

			Select w_t1 = new Select(w_time);
			w_t1.selectByValue("1: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("2: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("3: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("4: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("5: Object");
			Thread.sleep(2000);
			w_t1.selectByValue("6: Object");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_op_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_openrate_cross_click"))).click();
			Thread.sleep(3000);
		} else {
			System.out.println("openrate count is zero");
		}

		logger.info("Click on Active Recepients");

		WebElement activerec = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_active_recepients"))); // Active
																														// Recipients
		if (activerec.isEnabled()) {

			activerec.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_emails_opened_by_recepients_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_emails_opened_by_recepients_search")))
					.click();
			Thread.sleep(3000);

			WebDriverWait wait_time_drdn_2 = new WebDriverWait(driver, 50);
			WebElement w_time2 = wait_time_drdn_2.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("re_surveycamp_time_dropdown")))); // select
																													// timedropdown
			Thread.sleep(2000);

			Select w_t2 = new Select(w_time2);
			w_t2.selectByValue("1: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("2: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("3: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("4: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("5: Object");
			Thread.sleep(2000);
			w_t2.selectByValue("6: Object");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_active_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_active_cross_click"))).click();
			Thread.sleep(3000);

		} else {
			System.out.println("activerecepients count is zero");
		}

		logger.info("Click on the Clicked URL tile");

		WebElement clickedurl = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_clicked_URL"))); // Clicked
																													// URL
		if (clickedurl.isEnabled()) {

			clickedurl.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_recepients_clicked_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_recepients_clicked_search"))).click();
			Thread.sleep(3000);

			WebDriverWait wait_time_drdn_3 = new WebDriverWait(driver, 50);
			WebElement w_time3 = wait_time_drdn_3.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("re_surveycamp_time_dropdown1")))); // select
																													// time
																													// dropdown
			Thread.sleep(2000);

			Select w_t3 = new Select(w_time3);
			w_t3.selectByValue("1: Object");
			Thread.sleep(2000);
			w_t3.selectByValue("2: Object");
			Thread.sleep(2000);
			w_t3.selectByValue("3: Object");
			Thread.sleep(2000);
			w_t3.selectByValue("4: Object");
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_url_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_url_cross_click"))).click();
			Thread.sleep(3000);
		}

		else {

			System.out.println("Clicked URL count is zero");
		}

		logger.info("Click on Hard bounce");

		WebElement hardbounce = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_click_Hardbounce"))); // HArdbounce
		if (hardbounce.isEnabled()) {
			hardbounce.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_hardbounce_close")));
			Thread.sleep(3000);
		}

		else {
			System.out.println("Hard bounce value is Zero");
		}

		logger.info("Click on soft bounce");

		WebElement softbounce = driver.findElement(By.xpath(properties.getProperty("re_surveycamp_click_softbounce"))); // Soft
																														// bounce
		if (softbounce.isEnabled()) {
			softbounce.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_softbounce_close")));
			Thread.sleep(3000);
		}

		else {
			System.out.println("soft bounce value is Zero");
		}

		logger.info("Click on unsubscribe");

		WebElement unsubscribe = driver
				.findElement(By.xpath(properties.getProperty("re_surveycamp_click_unsubscribe"))); // Unsubscribe
		if (unsubscribe.isEnabled()) {
			unsubscribe.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_surveycamp_unsubscribe_close")));
			Thread.sleep(3000);
		}

		else {
			System.out.println("unsubscribe value is Zero");
		}

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		WebDriverWait wait_eml_sortby = new WebDriverWait(driver, 50);
		WebElement eml_sort = wait_eml_sortby.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath(properties.getProperty("re_surveycamp_total_email_camp_sort_by")))); // select total email
																								// opned_dropdown
		Thread.sleep(2000);

		Select eml_sort1 = new Select(eml_sort);

		eml_sort1.selectByValue("1: Object");
		Thread.sleep(2000);
		eml_sort1.selectByValue("2: Object");
		Thread.sleep(2000);
		eml_sort1.selectByValue("3: Object");
		Thread.sleep(2000);
		eml_sort1.selectByValue("4: Object");
		Thread.sleep(2000);

		WebElement s_analytics_search = driver
				.findElement(By.xpath(properties.getProperty("re_survey_analytics_search"))); // Search
		s_analytics_search.sendKeys("mounika");
		s_analytics_search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		s_analytics_search.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("re_survey_analytics_cross"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("re_survey_export_excel"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("re_survey_click_export_Excel"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_on_email_details"))).click();
		Thread.sleep(5000);

		logger.info("Click on Register lead button");
		driver.findElement(By.xpath(properties.getProperty("click_on_register_lead_button"))).click(); // Click on
																										// Register lead
																										// button
		Thread.sleep(5000);

		logger.info("Click on Select pipeline Dropdown");
		WebDriverWait wait_pipeline_dropdwn = new WebDriverWait(driver, 50);
		WebElement sel_pipeline = wait_pipeline_dropdwn.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("click_pipeline_dropdown")))); // Select
																											// pipeline
																											// stage
																											// dropdown

		Select pipeline = new Select(sel_pipeline);

		pipeline.selectByVisibleText("Converted");
		Thread.sleep(2000);

//		pipeline.selectByVisibleText("Opened");
//		Thread.sleep(2000);
//		pipeline.selectByVisibleText("Contacted");
//		Thread.sleep(2000);

		logger.info("click on Firstname");
		WebElement lead_firstname = driver.findElement(By.xpath(properties.getProperty("re_survey_leadfirstname"))); // First
																														// name

		if (lead_firstname.isDisplayed()) {

			System.out.println("There is a firstname");
		}

		else {
			// lead_firstname.clear();
			Thread.sleep(2000);
			lead_firstname.sendKeys(properties.getProperty("leadfirstname"));
			Thread.sleep(2000);
		}

		logger.info("click on Lastname");

		WebElement lead_lastname = driver.findElement(By.xpath(properties.getProperty("re_survey_leadlastname"))); // Lastname

		if (lead_lastname.isDisplayed()) {
			System.out.println("There is a Lastname");

		} else {

//		lead_lastname.clear();
			Thread.sleep(2000);
			lead_lastname.sendKeys(properties.getProperty("leadlastname"));
			Thread.sleep(2000);
		}
		logger.info("click on Address");
		WebElement address = driver.findElement(By.xpath(properties.getProperty("click_on_address"))); // Address
		address.clear();
		Thread.sleep(2000);
		address.sendKeys("Lead_Address");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath(properties.getProperty("click_on_city"))); // city
		city.clear();
		Thread.sleep(2000);
		city.sendKeys("Hyderabad");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.xpath(properties.getProperty("click_on_state"))); // State
		state.clear();
		Thread.sleep(2000);
		state.sendKeys("Telangana");
		Thread.sleep(2000);
		WebElement postalcode = driver.findElement(By.xpath(properties.getProperty("click_on_postalcode"))); // postalcode
		postalcode.clear();
		Thread.sleep(2000);
		postalcode.sendKeys("500050");
		WebElement phone = driver.findElement(By.xpath(properties.getProperty("click_on_phonenum"))); // Phone number
		phone.clear();
		Thread.sleep(2000);
		phone.sendKeys("9959710197");
		Thread.sleep(2000);

		WebDriverWait wait_country_dropdwn = new WebDriverWait(driver, 50);
		WebElement country = wait_country_dropdwn.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("click_country_dropdown")))); // Select
																											// country
																											// dropdown
		Select county_Lead = new Select(country);

		county_Lead.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_submit_lead"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_lead_Close_button"))).click();
		Thread.sleep(3000);

		logger.info("Click on Leads");

		WebElement leads = driver.findElement(By.xpath(properties.getProperty("click_leads"))); // click on Leads Tile

		if (leads.isEnabled()) {
			leads.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("lead_search_click"))).sendKeys("auto_lead");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("lead_search_icon_click"))).click();
			// Search icon click
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("lead_clear"))).click();
			Thread.sleep(3000);

			logger.info("click on Register Deal button");
			driver.findElement(By.xpath(properties.getProperty("click_on_register_deal_button"))).click();
			Thread.sleep(3000);

			WebDriverWait wait_dealpipeline_dropdwn = new WebDriverWait(driver, 50);
			WebElement sel_deal_pipeline = wait_dealpipeline_dropdwn.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("click_pipeline_dropdown")))); // Select
																												// pipeline
																												// Stage
																												// dropdown

			sel_deal_pipeline.sendKeys("Open");

			Actions keyDown = new Actions(driver);
			keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("click_on_deal_title")))
					.sendKeys("Automation_deal" + "_" + System.currentTimeMillis()); // Click on deal_title
			Thread.sleep(3000);

			WebDriverWait wait_dealtypedropdown = new WebDriverWait(driver, 50);
			WebElement w_dealdropdown = wait_dealtypedropdown.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("click_deal_type_dropdown")))); // Select
																												// deal
																												// type
																												// dropdown
			Thread.sleep(2000);

			w_dealdropdown.sendKeys("Upgrade");

			Actions keyDown2 = new Actions(driver);
			keyDown2.sendKeys(Keys.chord(Keys.DOWN)).perform();

			Thread.sleep(2000);
			driver.findElement(By.xpath(properties.getProperty("click_deal_amount"))).sendKeys("1000"); // Click on
																										// dealamount
			Thread.sleep(8000);
			driver.findElement(By.xpath(properties.getProperty("click_estimate_date"))).click();
			Thread.sleep(7000);
			driver.findElement(By.xpath(properties.getProperty("select_estimate_date1"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("click_on_save_deal"))).click();// Deal Registered.
			Thread.sleep(5000);

			logger.info("Click on Filter");
			driver.findElement(By.xpath(properties.getProperty("click_filter"))).click(); // Click on filter
			Thread.sleep(3000);

//			driver.findElement(By.xpath(properties.getProperty("select_from_date"))).click(); // Select From date
//			Thread.sleep(9000);
//
//			driver.findElement(By.xpath(properties.getProperty("re_camp_select_from_date_leadfilter"))).click(); // Select From date
//			Thread.sleep(7000);
//			driver.findElement(By.xpath(properties.getProperty("select_to_date"))).click(); // Select To date
//			Thread.sleep(3000);
//
//			driver.findElement(By.xpath(properties.getProperty("re_camp_select_to_date_leadfilter"))).click(); // Select To date
//			Thread.sleep(3000);

			WebDriverWait wait_statusdropdown = new WebDriverWait(driver, 50);
			WebElement w_statusdropdown = wait_statusdropdown.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(properties.getProperty("status_select_dropdown")))); // Select
																												// Status
																												// Dropdown
			Thread.sleep(2000);

			Select status_dropdown1 = new Select(w_statusdropdown);
			status_dropdown1.selectByValue("Opened");
			Thread.sleep(2000);

			status_dropdown1.selectByValue("Closed - Lost");
			Thread.sleep(2000);

			status_dropdown1.selectByValue("Converted");
			Thread.sleep(2000);

			status_dropdown1.selectByValue("Contacted");
			Thread.sleep(2000);

			logger.info("click on Filter button");
			driver.findElement(By.xpath(properties.getProperty("click_filter_button"))).click(); // Click on Filter
																									// button
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("apply_filter_cross"))).click();
			Thread.sleep(3000);
			logger.info("click on Download icon");
			driver.findElement(By.xpath(properties.getProperty("click_download"))).click(); // Download Icon
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("leads_close"))).click();
			Thread.sleep(3000);
		}

		else {
			System.out.println("leads count is Zero");
		}

		logger.info("Click on Deals");

		WebElement re_camp_deals = driver.findElement(By.xpath(properties.getProperty("re_survey_camp_click_deals")));

		if (re_camp_deals.isEnabled()) {
			Thread.sleep(3000);
			re_camp_deals.click(); // Click on Deal Tile
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_survey_camp_deal_search_click"))) // deal search
					.sendKeys("auto_deal");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_survey_camp_deal_search_icon_click"))).click();
			// Search icon click
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("re_survey_camp_deals_clear_search"))).click();
			Thread.sleep(3000);

			logger.info("Click on Deal Preview");
			WebElement deal_preview = driver.findElement(By.xpath(properties.getProperty("re_survey_deal_preview"))); // preview
																														// deal
			deal_preview.click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("re_survey_deal_preview_close"))).click();
			Thread.sleep(3000);
			logger.info("click on Deal edit");
			driver.findElement(By.xpath(properties.getProperty("re_survey_deal_click_edit"))).click(); // Edit Deal
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("re_survey_update_deal"))).click(); // Update Deal
			Thread.sleep(3000);

			logger.info("Click on filter");
			driver.findElement(By.xpath(properties.getProperty("re_survey_click_deal_filter"))).click(); // Click on
																											// filter
			Thread.sleep(3000);

//			driver.findElement(By.xpath(properties.getProperty("select_from_date_deal"))).click(); // Select From date
//			Thread.sleep(5000);

//				driver.findElement(By.xpath(properties.getProperty("choose_from_date1"))).click();
//				Thread.sleep(5000);

//				driver.findElement(By.xpath(properties.getProperty("select_to_date_deal"))).click(); // Select To date
//				Thread.sleep(7000);
//				
//				driver.findElement(By.xpath(properties.getProperty("choose_to_date1"))).click(); // Select To date
//				Thread.sleep(3000);

			WebDriverWait wait_dealstatusdropdown = new WebDriverWait(driver, 50);
			WebElement w_dstatusdropdown = wait_dealstatusdropdown.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(properties.getProperty("re_survey_camp_status_select_dropdown2")))); // Select Deal Status
																									// dropdown
			Thread.sleep(2000);

			Select status_dropdown2 = new Select(w_dstatusdropdown);
			status_dropdown2.selectByValue("Opened");
			Thread.sleep(2000);
			status_dropdown2.selectByValue("Approved");
			Thread.sleep(2000);
			status_dropdown2.selectByValue("Rejected");
			Thread.sleep(2000);
			status_dropdown2.selectByValue("Hold");
			Thread.sleep(2000);

			logger.info("Click on Deal filter");
			driver.findElement(By.xpath(properties.getProperty("re_survey_click_filter_button"))).click(); // Click on
																											// Deal
																											// filter
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("re_survey_apply_filter_cross"))).click();
			Thread.sleep(3000);
			logger.info("Click on Deal downlaod");
			driver.findElement(By.xpath(properties.getProperty("re_survey_click_download_deal"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("re_survey_deals_close"))).click();
			Thread.sleep(3000);
		}

		else {
			System.out.println("deals count is Zero");
		}

		logger.info("Click on Navigation Breadcrumb");

		driver.findElement(By.xpath(properties.getProperty("click_navigation_breadcrumb"))).click(); // Click on MAnage
																										// Campaign
																										// navigation
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("re_survey_tab"))).click(); // Survey tab
		Thread.sleep(5000);

		logger.info("Click on Grid View");
		driver.findElement(By.xpath(properties.getProperty("click_grid_view"))).click(); //
		Thread.sleep(3000);

		logger.info("Click on Folder Grid View");
		driver.findElement(By.xpath(properties.getProperty("click_folder_grid_view"))).click();
		Thread.sleep(3000);

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
		// sort by dropdown
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
																										// list view
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();// click on search icon
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("cross_button"))).click();
		Thread.sleep(4000);

		logger.info("Click on Listview");
		driver.findElement(By.xpath(properties.getProperty("list_view"))).click(); // Click on List View
		Thread.sleep(5000);

		logger.info("Manage Redistributed Survey Campaign Successfully Completed");

		Thread.sleep(9000);
	}

}
