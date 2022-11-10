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

public class ManageSurveyToCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\ManageCampaigns.properties");
	final Logger logger = LogManager.getLogger(SurveyCampaign.class);

	@Test

	public void manage_surveyTocampaign() throws InterruptedException, SQLException {

		WebDriverWait wait = new WebDriverWait(driver, 80); // Wait till the element is not visible

		WebElement mscamp = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("campaignhover"))));
		mscamp.click(); // hover on campaign

		Actions mcamp_action = new Actions(driver);
		mcamp_action.moveToElement(mscamp).perform();
		Thread.sleep(5000);
		WebElement manage_campele = driver.findElement(By.xpath(properties.getProperty("managecampaigns"))); // click on
																												// manage
																												// campaign
		mcamp_action.moveToElement(manage_campele);
		mcamp_action.click();
		mcamp_action.perform();

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); // Click on Survey Tab
		Thread.sleep(5000);
		logger.info("Clicked on the Survey tab");

		driver.findElement(By.xpath(properties.getProperty("tocamp_gearicon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Click_edit"))).click();
		Thread.sleep(3000);
		WebDriverWait folder_dropdown = new WebDriverWait(driver, 50);
		WebElement f_dropdown = folder_dropdown.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("s_select_folder_dropdown")))); // select
																											// folder
																											// dropdown
		Thread.sleep(2000);

		Select fdropdown = new Select(f_dropdown);
		fdropdown.selectByValue("1106");
		// select by value

		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("update_button"))).click();// click on update
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("click_close"))).click();
		// click on close button
		Thread.sleep(4000);

		logger.info("click on Gear icon");
		driver.findElement(By.xpath(properties.getProperty("tocamp_gearicon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_copy_campaign"))).click(); // Copy campaign
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_save_changes"))).click();// click on Save Changes.

		Thread.sleep(4000);
		logger.info("campaign copied successfully");

		driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); // Click on Survey Tab
		Thread.sleep(5000);

		logger.info("click on Gear icon");
		driver.findElement(By.xpath(properties.getProperty("tocamp_gearicon1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_Preview"))).click(); // Preview
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("click_close_preview"))).click();
		Thread.sleep(5000);

		logger.info("click on Gear icon");
		driver.findElement(By.xpath(properties.getProperty("tocamp_gearicon1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_archieve_camp"))).click(); // Archieve
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_archieved_campaigns"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("t_gearicon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_unarchieve_camp"))).click(); // Unarchieve
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_active_campaigns"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); // Click on Survey Tab
		Thread.sleep(5000);

		logger.info("Click on Campaign based reports");
		driver.findElement(By.xpath(properties.getProperty("To_Campaign_based_reports"))).click(); // Campaign based
																									// reports
		Thread.sleep(5000);
		logger.info("Click on recepients tile");
		driver.findElement(By.xpath(properties.getProperty("Survey_To_recepients"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_search_box"))).sendKeys("mounika");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_recepients_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_icon_click")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_total_recepients_cross_click")))
				.click();
		Thread.sleep(3000);

		logger.info("Click on Total Email sent tile");
		driver.findElement(By.xpath(properties.getProperty("Survey_Total_Email_Sent"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_search_box"))).sendKeys("mounika");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_recepients_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_icon_click")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath(properties.getProperty("survey_to_camp_analytics_Survey_Total_Email_Sent_cross_click")))
				.click();
		Thread.sleep(3000);

		logger.info("Click on Deliverability Tile");
		driver.findElement(By.xpath(properties.getProperty("Survey_deliverabity"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_search_box"))).sendKeys("mounika");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_recepients_search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_icon_click")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_Survey_deliverabity_cross_click")))
				.click();
		Thread.sleep(3000);

		logger.info("Click on Active Recepients");

		WebElement survey_to_activerec = driver
				.findElement(By.xpath(properties.getProperty("survey_to_active_recepients")));
		Thread.sleep(3000);
		if (survey_to_activerec.isEnabled()) {

			survey_to_activerec.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_emails_opened_by_recepients_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_emails_opened_by_recepients_search")))
					.click();
			Thread.sleep(3000);

			WebDriverWait wait_time_dropdown1 = new WebDriverWait(driver, 50);
			WebElement wait_time1 = wait_time_dropdown1.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("time_dropdown")))); // select
																														// time
																														// dropdown

			Thread.sleep(2000);

			Select w_t2 = new Select(wait_time1);
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

			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_icon_click")))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_active_recepients_export_excel_click")))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath(properties.getProperty("survey_to_camp_analytics_Survey_active_recp_cross_click")))
					.click();
			Thread.sleep(3000);

		} else {
			System.out.println("activerecepients count is zero");
		}

		logger.info("Click on openrate");

		WebElement survey_to_openrate = driver
				.findElement(By.xpath(properties.getProperty("click_survey_to_camp_openrate")));
		if (survey_to_openrate.isEnabled()) {

			survey_to_openrate.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_emails_opened_by_recepients_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_emails_opened_by_recepients_search")))
					.click();
			Thread.sleep(3000);

			WebDriverWait wait_time_dropdown2 = new WebDriverWait(driver, 50);
			WebElement wait_time2 = wait_time_dropdown2.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("time_dropdown")))); // select
																														// time
																														// dropdown

			Thread.sleep(2000);

			Select w_t2 = new Select(wait_time2);
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

			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_icon_click")))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_openrate_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_openrate_cross_click")))
					.click();
			Thread.sleep(3000);

		} else {
			System.out.println("activerecepients count is zero");
		}

		logger.info("Click on the Clicked URL tile");

		WebElement clickedurl = driver.findElement(By.xpath(properties.getProperty("survey_to_clicked_URL")));
		if (clickedurl.isEnabled()) {

			clickedurl.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Torecepients_clicked_search_box")))
					.sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Torecepients_clicked_search"))).click();
			Thread.sleep(3000);

			WebDriverWait wait_time_drdn_3 = new WebDriverWait(driver, 50);
			WebElement w_time3 = wait_time_drdn_3.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("time_dropdown1")))); // select
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

			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_icon_click")))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_clicked_URL_export_excel_click")))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_clicked_URL_cross_click")))
					.click();
			Thread.sleep(3000);
		}

		else {

			System.out.println("Clicked URL count is zero");
		}

		logger.info("Click on ClickThrough rate Tile");

		WebElement clickthroughrate = driver.findElement(By.xpath(properties.getProperty("click_clickthroughrate")));
		Thread.sleep(3000);
		if (clickthroughrate.isEnabled()) {
			clickthroughrate.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Torecepients_clicked_search_box")))
					.sendKeys("Automate");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("Torecepients_clicked_search"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_analytics_export_excel_icon_click")))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("survey_to_camp_clickthrough_rate_export_excel_click")))
					.click();
			Thread.sleep(3000);
			driver.findElement(
					By.xpath(properties.getProperty("survey_to_camp_analytics_clickthrough_rate_cross_click"))).click();
			Thread.sleep(3000);
		}

		else {

			System.out.println("clickedthroughrate is disabled");
		}

		logger.info("click on Hardbounce");

		WebElement survey_to_Hardbounce = driver
				.findElement(By.xpath(properties.getProperty("click_survey_to_Hardbounce")));
		Thread.sleep(3000);

		if (survey_to_Hardbounce.isEnabled()) {

			survey_to_Hardbounce.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("suvey_to_Hardbounce_close"))).click();
			Thread.sleep(3000);
		}

		else {
			System.out.println("Hardbounce count is Zero");
		}

		logger.info("click on softbounce");

		WebElement survey_to_softbounce = driver
				.findElement(By.xpath(properties.getProperty("click_survey_to_softbounce")));
		Thread.sleep(3000);

		if (survey_to_softbounce.isEnabled()) {
			survey_to_softbounce.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("suvey_to_softbounce_close"))).click();
			Thread.sleep(3000);
		}

		else {

			System.out.println("Softbounce count is Zero");

		}

		logger.info("click on Unsubscribe");

		WebElement unsubscribe = driver.findElement(By.xpath(properties.getProperty("click_survey_to_unsubscribe")));
		Thread.sleep(3000);

		if (unsubscribe.isEnabled()) {
			unsubscribe.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("suvey_to_unsubscribe_close"))).click();
			Thread.sleep(3000);
		}

		else {

			System.out.println("unsubscribe count is Zero");

		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		WebDriverWait wait_survey_eml_sortby = new WebDriverWait(driver, 50);
		WebElement survey_eml_sort = wait_survey_eml_sortby.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("total_email_camp_sort_by")))); // select
																											// totla
																											// email
																											// opned_dropdown
		Thread.sleep(2000);

		Select survey_eml_sort1 = new Select(survey_eml_sort);

		survey_eml_sort1.selectByValue("1: Object");
		Thread.sleep(2000);
		survey_eml_sort1.selectByValue("2: Object");
		Thread.sleep(2000);
		survey_eml_sort1.selectByValue("3: Object");
		Thread.sleep(2000);
		survey_eml_sort1.selectByValue("4: Object");
		Thread.sleep(2000);

		WebElement survey_to_analytics_search = driver
				.findElement(By.xpath(properties.getProperty("survey_to_analytics_search")));
		survey_to_analytics_search.sendKeys("mounika");
		survey_to_analytics_search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		survey_to_analytics_search.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_analytics_cross"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("survey_to_export_excel"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("survey_to_click_export_Excel"))).click();
		Thread.sleep(3000);

		Actions a1 = new Actions(driver);
		a1.sendKeys(Keys.PAGE_UP).build().perform();

		Thread.sleep(2000);

		WebElement preview_email_info = driver
				.findElement(By.xpath(properties.getProperty("click_preview_on_email_info")));
		Thread.sleep(3000);
		preview_email_info.click();
		Thread.sleep(5000);

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("click_preview_on_email_info_close"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_lists_details"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_lists_details_close"))).click();
		Thread.sleep(3000);

		WebElement ManageCampaign = driver
				.findElement(By.xpath(properties.getProperty("click_survey_to_manage_campaigns")));
		Thread.sleep(2000);
		ManageCampaign.click();
		
		Thread.sleep(6000);

		logger.info("Manage Survey To campaign Analytics Completed");
	}

}
