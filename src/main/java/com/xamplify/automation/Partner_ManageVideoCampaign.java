package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Partner_ManageVideoCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\Workspace2\\xAmplify-Automation\\src\\main\\resources\\Partner_ManageCampaigns.properties");
	final Logger logger = LogManager.getLogger(Partner_ManageVideoCampaign.class);

	@Test(priority = 1, enabled = true)

	public void partneracc_manage_vdecampaign_draft_delete() throws InterruptedException, SQLException {

		WebDriverWait p_mvc_wait = new WebDriverWait(driver, 50); // Wait till the element is not visible

		WebElement mvcamp = p_mvc_wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("partneracc_campaignhover"))));
		mvcamp.click(); // hover on campaign

		Actions p_mvcamp_action = new Actions(driver);
		p_mvcamp_action.moveToElement(mvcamp).perform();
		Thread.sleep(5000);
		WebElement manage_pvcampele = driver
				.findElement(By.xpath(properties.getProperty("partneracc_manage_campaign"))); // click on manage
																								// campaign
		Thread.sleep(5000);
		p_mvcamp_action.moveToElement(manage_pvcampele);
		p_mvcamp_action.click();
		p_mvcamp_action.perform();

		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("partneracc_manage_video_tab"))).click(); // click on video
																										// tab
		Thread.sleep(4000);
		logger.info("Video tab clicked successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_manage_video_gearicon"))).click(); // click on
																											// gear icon
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_manage_video_preview"))).click(); // click on the
																											// preview
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_preview_delete"))).click(); // click on
																											// the
																											// delete
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_preview_delete_yes"))).click(); // click
																												// on
																												// the
																												// yes
																												// delete
		Thread.sleep(4000);
		logger.info("Draft campagin deleted successfully from preview option");

	}

	@Test(priority = 2, enabled = true)

	public void partneracc_manage_vdecampaign_edit_updatefolder() throws InterruptedException, SQLException {

		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("partneracc_manage_video_gearicon"))).click(); // click on
																											// gear icon
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_edit"))).click(); // click on edit icon
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_edit_folder"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_edit_updatefolder"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_edit_update"))).click(); // click on the
																										// update

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_edit_update_close"))).click(); // click
																												// on
																												// the
																												// close
																												// button

		Thread.sleep(4000);

	}

	@Test(priority = 3, enabled=true)

	public void partneracc_manage_vdecampaign_analytics() throws InterruptedException, SQLException {

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon"))).click(); // click on
																											// analytics
																											// icon

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_vdeinfo"))).click(); // click
																													// on
																													// video
																													// info
		Thread.sleep(4000);
		logger.info("Video Info Clicked Successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_vdeinfo_cls"))).click();
		logger.info("Video Info popup closed Successfully");
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Emailinfo"))).click(); // click on email info
		logger.info("Email Info Clicked  Successfully");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Emailinfo_cls"))).click();
		logger.info("Email Info popup closed Successfully");
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_listinfo"))).click(); // click on list info
		logger.info("List Info Clicked  Successfully");
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Listinfo_cls"))).click();
		logger.info("List Info popup closed Successfully");

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_RecipientsClick"))) // click on recipients tile
				.click();
		logger.info("Recipient tile clicked Successfully");
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Recipients_search"))) //click for the search
				.sendKeys("gayatri");
		Thread.sleep(4000);

		WebElement rec_search = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Recipients_search")));  ////click on the enter
		rec_search.sendKeys(Keys.ENTER);
		logger.info("In Recipient tile data searched Successfully");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Recipients_search_exporticon"))) //click on the export to excel
				.click();
		Thread.sleep(4000);
		logger.info("In Recipient tile Export to excel Clicked Successfully");
		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Recipients_search_excel"))) //clicked on the export to excel
				.click();
		Thread.sleep(4000);
		logger.info("In Recipient tile Excel data downloaded Successfully");
		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Recipients_cls"))).click(); //click on the close
		Thread.sleep(4000);
		logger.info(" Recipient tile popup closed Successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_TotalEmailsSentClick")))
				.click();
		logger.info("TotalEmailsSent tile clicked Successfully");
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_TotalEmailsSent_search"))) //click on the search
				.sendKeys("gayatri");
		Thread.sleep(4000);

		WebElement TotalEmailsSent_search = driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_TotalEmailsSent_search")));
		TotalEmailsSent_search.sendKeys(Keys.ENTER);
		logger.info("In TotalEmailsSent tile data searched Successfully");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_TotalEmailsSent_search_exporticon")))//click on the export to excel
				.click();
		Thread.sleep(4000);
		logger.info("In TotalEmailsSent tile Export to excel Clicked Successfully");
		driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_TotalEmailsSent_search_excel"))) //clicked on the export to excel
				.click();
		Thread.sleep(4000);
		logger.info("In TotalEmailsSent tile Excel data downloaded Successfully");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_TotalEmailsSent_cls"))) //click on the close
				.click();
		Thread.sleep(4000);
		logger.info(" TotalEmailsSent tile popup closed Successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_DeliverabilityClick")))
				.click();
		logger.info("Recipient tile  clicked Successfully");
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deliverability_search")))//click on the search
				.sendKeys("gayatri");
		Thread.sleep(4000);

		WebElement Deliverability_search = driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deliverability_search")));
		Deliverability_search.sendKeys(Keys.ENTER);
		logger.info("In Deliverability tile data searched Successfully");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deliverability_search_exporticon"))).click(); //click on the export to excel
		Thread.sleep(4000);
		logger.info("In Deliverability tile Export to excel Clicked Successfully");
		driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deliverability_search_excel")))//clicked on the export to excel
				.click();
		Thread.sleep(4000);
		logger.info("In Deliverability tile Excel data downloaded Successfully");
		driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deliverability_cls"))) //click on the close
				.click();
		Thread.sleep(4000);
		logger.info(" Deliverability tile popup closed Successfully");

		WebElement ActiveRecipients = driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ActiveRecipientsClick")));
		if (ActiveRecipients.isEnabled()) {
			ActiveRecipients.click();

			logger.info("ActiveRecipients tile clicked Successfully");
			Thread.sleep(4000);

			WebElement ActiveRecipientsdrpdwn = driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_OpenRate_dropdown")));  //click on the sortby dropdown
			logger.info("In OpenRate tile dropdown clicked Successfully");
			Select ar_drpdwn = new Select(ActiveRecipientsdrpdwn);
			ar_drpdwn.selectByValue("1: Object");

			Thread.sleep(4000);
			ar_drpdwn.selectByValue("2: Object");

			Thread.sleep(4000);
			ar_drpdwn.selectByValue("3: Object");
			Thread.sleep(4000);
			ar_drpdwn.selectByValue("4: Object");
			Thread.sleep(4000);

			logger.info("In ActiveRecipients tile dropdown functionality done Successfully");

			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ActiveRecipients_search"))) //click on the search
					.sendKeys("gayatri");
			Thread.sleep(4000);

			WebElement ActiveRecipients_search = driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ActiveRecipients_search")));
			ActiveRecipients_search.sendKeys(Keys.ENTER);
			logger.info("In ActiveRecipients tile data searched Successfully");
			Thread.sleep(4000);
			driver.findElement(By.xpath(
					properties.getProperty("partneracc_m_video_analyticsicon_ActiveRecipients_search_exporticon")))//click on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In ActiveRecipients tile Export to excel Clicked Successfully");
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ActiveRecipients_search_excel"))) //clicked on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In ActiveRecipients tile Excel data downloaded Successfully");
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ActiveRecipients_cls"))).click(); //click on the close
			Thread.sleep(4000);
			logger.info(" ActiveRecipients tile popup closed Successfully");

		} else {
			logger.info(" ActiveRecipients tile count is zero so unable to Click");
		}
		Thread.sleep(3000);

		WebElement ClickedURL = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ClickedURLClick")));
		if (ClickedURL.isEnabled()) {
			ClickedURL.click();

			logger.info("ClickedURL tile clicked Successfully");

			Thread.sleep(4000);

			WebElement ClickedURLdrpdwn = driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ClickedURL_dropdown")));  //click on the sortby dropdown
			logger.info("In ClickedURL tile dropdown clicked Successfully");
			Select ar_drpdwn = new Select(ClickedURLdrpdwn);
			ar_drpdwn.selectByValue("1: Object");

			Thread.sleep(4000);
			ar_drpdwn.selectByValue("2: Object");

			Thread.sleep(4000);
			ar_drpdwn.selectByValue("3: Object");
			Thread.sleep(4000);
			ar_drpdwn.selectByValue("4: Object");
			Thread.sleep(4000);

			logger.info("In ClickedURL tile dropdown functionality done Successfully");

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ClickedURL_search")))
					.sendKeys("gayatri");
			Thread.sleep(4000);

			WebElement ClickedURL_search = driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ClickedURL_search")));
			ClickedURL_search.sendKeys(Keys.ENTER);
			logger.info("In ClickedURL tile data searched Successfully");
			Thread.sleep(4000);
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ClickedURL_search_exporticon"))) //click on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In ClickedURL tile Export to excel Clicked Successfully");
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ClickedURL_search_excel"))) //clicked on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In ClickedURL tile Excel data downloaded Successfully");
			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ClickedURL_cls"))) //click on the close
					.click();
			Thread.sleep(4000);
			logger.info(" ClickedURL tile popup closed Successfully");

		} else {
			logger.info(" ClickedURL tile count is zero so unable to Click");
		}

		Thread.sleep(3000);
		WebElement Clickthoughrate = driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ClickthroughrateClick")));
		if (Clickthoughrate.isEnabled()) {
			Clickthoughrate.click();

			logger.info("Clickthroughrate tile clicked Successfully");

			Thread.sleep(4000);

			WebElement Clickthroughratedrpdwn = driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Clickthroughrate_dropdown"))); //click on the sortby dropdown
			logger.info("In Clickthroughrate tile dropdown clicked Successfully");
			Select ar_drpdwn = new Select(Clickthroughratedrpdwn);
			ar_drpdwn.selectByValue("1: Object");

			Thread.sleep(4000);
			ar_drpdwn.selectByValue("2: Object");

			Thread.sleep(4000);
			ar_drpdwn.selectByValue("3: Object");
			Thread.sleep(4000);
			ar_drpdwn.selectByValue("4: Object");
			Thread.sleep(4000);

			logger.info("In Clickthroughrate tile dropdown functionality done Successfully");

			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Clickthroughrate_search")))//click on the search
					.sendKeys("gayatri");
			Thread.sleep(4000);

			WebElement Clickthroughrate_search = driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Clickthroughrate_search")));
			Clickthroughrate_search.sendKeys(Keys.ENTER);
			logger.info("In Clickthroughrate tile data searched Successfully");
			Thread.sleep(4000);
			driver.findElement(By.xpath(
					properties.getProperty("partneracc_m_video_analyticsicon_Clickthroughrate_search_exporticon"))) //click on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In Clickthroughrate tile Export to excel Clicked Successfully");
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Clickthroughrate_search_excel")))//clicked on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In Clickthroughrate tile Excel data downloaded Successfully");
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Clickthroughrate_cls"))).click(); //click on the close
			Thread.sleep(4000);
			logger.info(" Clickthroughrate tile popup closed Successfully");

		} else {
			logger.info(" Clickthoughrate tile count is zero so unable to Click");
		}
		Thread.sleep(3000);

		WebElement Views = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_ViewsClick")));
		if (Views.isEnabled()) {
			Views.click();

			logger.info("Views tile clicked Successfully");

			Thread.sleep(4000);

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Views_search")))//click on the search
					.sendKeys("gayatri");
			Thread.sleep(4000);

			WebElement Views_search = driver
					.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Views_search")));
			Views_search.sendKeys(Keys.ENTER);
			logger.info("In Views tile data searched Successfully");
			Thread.sleep(4000);
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Views_search_exporticon"))) //click on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In Views tile Export to excel Clicked Successfully");
			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Views_search_excel"))) //clicked on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In Views tile Excel data downloaded Successfully");
			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Views_cls"))).click();//click on the close
			Thread.sleep(4000);
			logger.info(" Views tile popup closed Successfully");

		} else {
			logger.info(" Views tile count is zero so unable to Click");
		}
		Thread.sleep(3000);

		WebElement Hardbounce = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_HardbounceClick")));
		if (Hardbounce.isEnabled()) {
			Hardbounce.click();

			logger.info("Hardbounce tile clicked Successfully");

			Thread.sleep(4000);

		} else {
			logger.info(" Hardbounce tile count is zero so unable to Click");
		}
		Thread.sleep(3000);

		WebElement Softbounce = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_SoftbounceClick")));
		if (Softbounce.isEnabled()) {
			Softbounce.click();

			logger.info("Softbounce tile clicked Successfully");

			Thread.sleep(4000);

		} else {
			logger.info(" Softbounce tile count is zero so unable to Click");
		}
		Thread.sleep(3000);

		WebElement Unsubscribe = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_UnsubscribeClick")));
		if (Unsubscribe.isEnabled()) {
			Unsubscribe.click();

			logger.info("Unsubscribe tile clicked Successfully");

			Thread.sleep(4000);

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Unsubscribe_search")))  //click on the search
					.sendKeys("gayatri");
			Thread.sleep(4000);

			WebElement Unsubscribe_search = driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Unsubscribe_search")));
			Unsubscribe_search.sendKeys(Keys.ENTER);
			logger.info("In Unsubscribe tile data searched Successfully");
			Thread.sleep(4000);
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Unsubscribe_search_exporticon")))  //click on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In Unsubscribe tile Export to excel Clicked Successfully");
			driver.findElement(
					By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Unsubscribe_search_excel")))  //clicked on the export to excel
					.click();
			Thread.sleep(4000);
			logger.info("In Unsubscribe tile Excel data downloaded Successfully");
			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Unsubscribe_cls")))//click on the close
					.click();
			Thread.sleep(4000);
			logger.info(" Unsubscribe tile popup closed Successfully");

		} else {
			logger.info(" Unsubscribe tile count is zero so unable to Click");
		}
		Thread.sleep(3000);

		WebElement Leads = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_LeadsClick")));
		if (Leads.isEnabled()) {
			Leads.click();

			logger.info("Leads tile clicked Successfully");

			Thread.sleep(4000);

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Leads_dwnload"))) //click on the download icon
					.click();
			Thread.sleep(4000);

			logger.info("In Leads tile  download icon clicked Successfully");

			WebElement leadsearch = driver
					.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Leads_search")));  //click on the search
			leadsearch.sendKeys("gayatri");
			Thread.sleep(4000);
			leadsearch.sendKeys(Keys.ENTER);
			logger.info("In Leads tile data searched Successfully");

			Thread.sleep(7000);

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Leads_search_clr")))//click on the x for the search
					.click();

			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Leads_close")))//click on the close
					.click();
			Thread.sleep(4000);

		} else {
			logger.info(" Leads tile count is zero so unable to Click");
		}
		Thread.sleep(3000);

		WebElement Deals = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_DealsClick")));
		if (Deals.isEnabled()) {
			Deals.click();

			logger.info("Deals tile clicked Successfully");

			Thread.sleep(4000);

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deals_dwnload"))) //click on the download icon
					.click();
			Thread.sleep(4000);

			logger.info("In Deals tile  download icon clicked Successfully");
			Thread.sleep(3000);

			WebElement Dealsearch = driver
					.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deals_search")));  //click on the search
			Dealsearch.sendKeys("gayatri");
			Thread.sleep(4000);
			Dealsearch.sendKeys(Keys.ENTER);
			logger.info("In Deals tile data searched Successfully");

			Thread.sleep(7000);

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deals_search_clr"))) //click on the x for the search
					.click();

			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("partneracc_m_video_analyticsicon_Deals_close")))//click on the close
					.click();
			Thread.sleep(4000);

		} else {
			logger.info(" Deals tile count is zero so unable to Click");
		}
		Thread.sleep(3000);

		WebElement sortby_drpdwn = driver.findElement(
				By.xpath(properties.getProperty("partneracc_mvideo_analyticsicon_tot_view_for_campaign_sortdrpdwn"))); //click on the sortby dropdown

		Select dropdwn = new Select(sortby_drpdwn);

		dropdwn.selectByValue("1: Object");
		Thread.sleep(4000);

		dropdwn.selectByValue("2: Object");
		Thread.sleep(4000);

		dropdwn.selectByValue("3: Object");
		Thread.sleep(4000);

		dropdwn.selectByValue("4: Object");

		Thread.sleep(4000);

		dropdwn.selectByValue("5: Object");

		Thread.sleep(4000);
		dropdwn.selectByValue("6: Object");

		Thread.sleep(4000);

		logger.info(" Sortby done successfully");
		Thread.sleep(3000);

		WebElement vanalytics_search = driver.findElement(
				By.xpath(properties.getProperty("partneracc_mvideo_analyticsicon_tot_view_for_campaign_search")));  //click on the search
		vanalytics_search.sendKeys("gayatri");
		vanalytics_search.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

		driver.findElement(
				By.xpath(properties.getProperty("partneracc_mvideo_analyticsicon_tot_view_for_campaign_export"))) //click on the export to excel
				.click();

		Thread.sleep(4000);

		driver.findElement(
				By.xpath(properties.getProperty("partneracc_mvideo_analyticsicon_tot_view_for_campaign_export_click"))) //clicked on the export to excel
				.click();

		logger.info(" Export to excel done successfully in 'total views for this campaign' section ");

	}

}
