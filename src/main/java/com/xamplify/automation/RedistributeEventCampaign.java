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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RedistributeEventCampaign extends ExtentReportsClass {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"src/main/resources/RedistributionCampaign.properties");// properties
																											// file
	final Logger logger = LogManager.getLogger(RedistributeEventCampaign.class);

	@Test(priority = 252, enabled = true)
	public void hoverRedistributecampaigns_event() throws InterruptedException {
		Thread.sleep(7000);

		WebElement eve_ele = driver.findElement(By.linkText("Campaign"));
		Actions act = new Actions(driver);
		act.moveToElement(eve_ele).perform();
		driver.findElement(By.xpath(properties.getProperty("partner_eve_redistribute_evehover"))).click(); // hover on
																											// //
																											// campaign
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("partner_eve_redistribute_eventtab"))).click(); // click on
																											// // event
																											// // tab
		Thread.sleep(38000);
		logger.info("Event tab clicked successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_redistribute_eve_camp_preview"))).click(); // click
																												// on //
																												// preview
		Thread.sleep(6000);

		logger.info("Event tab preview clicked successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_redistribute_eve_camp_preview_close"))).click(); // click
																														// on

		logger.info("Event tab preview closed successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_eve_redis_eve_download"))).click(); // click on //
																										// download //
																										// icon

		logger.info("Event download clicked successfully");

		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("partner_eve_redis_eve_dwnld_html"))).click(); // click on //
																											// download
																											// html
		// icon logger.info("Event download html clicked successfully");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("partner_eve_redis_viewdwnld_history"))).click(); // click on
																												// history

		Thread.sleep(4000);
		logger.info("Event view download history clicked successfully");
		driver.findElement(By.xpath(properties.getProperty("partner_eve_redis_viewdwnld_history_close"))).click(); // click
																													// on
																													// history

		Thread.sleep(4000);

		driver.get("https://xamplify.co/home/campaigns/manage");

		Thread.sleep(7000);

		logger.info("Redirected to ManageCampaign successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_eve_redistribute_eventtab"))).click(); // click on
																											// // event
																											// // tab
		Thread.sleep(38000);
		logger.info("Event tab clicked successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_manage_eve_gearicon"))).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_edit"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on the edit icon successfully");
		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_edit_folder"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on the edit folder successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_edit_updatefolder"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_edit_update"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on the update button successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_edit_update_close"))).click();
		Thread.sleep(9000);

	}

	@Test(priority = 253, enabled = true)
	public void pac_manage_sendpreviewemail() throws InterruptedException, SQLException {

		driver.findElement(By.xpath(properties.getProperty("partner_manage_eve_gearicon"))).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_sendpreviewemail"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on the send preview email option successfully");

		WebElement sndata = driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_senddata")));
		sndata.sendKeys("agayatri@stratapps.com"); // send data
		sndata.sendKeys(Keys.ENTER);

		Thread.sleep(7000);

		Actions pa = new Actions(driver);
		pa.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_sendbutton"))).click(); // click on the
																										// send button
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_closebutton"))).click();
		Thread.sleep(9000);

		logger.info("Clicked on the close option successfully");
	}

	@Test(priority = 254, enabled = true)
	public void pac_manage_Inivitemore() throws InterruptedException, SQLException {

		driver.findElement(By.xpath(properties.getProperty("partner_manage_eve_gearicon"))).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invitemore"))).click();
		Thread.sleep(4000);

		logger.info("Clicked on the InviteMore option successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invite_1stpage"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invite_1stpage_send"))).click();
		Thread.sleep(4000);

		logger.info("Clicked on send button for the Invite more contacts  successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invite_close"))).click();
		Thread.sleep(4000);

		logger.info("Clicked on close button successfully");

		Thread.sleep(7000);

	}

	@Test(priority = 255, enabled = true)
	public void pac_manage_preview_analytics() throws InterruptedException, SQLException {

		driver.get("https://xamplify.co/home/campaigns/manage");

		Thread.sleep(7000);

		logger.info("Redirected to ManageCampaign successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_eve_redistribute_eventtab"))).click(); // click on
																											// // event
																											// // tab
		Thread.sleep(38000);
		logger.info("Event tab clicked successfully");

		driver.findElement(By.xpath(properties.getProperty("partner_manage_eve_gearicon"))).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_preview"))).click();

		logger.info("Clicked on preview successfully");
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_preview_analytics"))).click();

		logger.info("Clicked on analytics icon successfully");

		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_preview_emlinfo"))).click();

		logger.info("Clicked on emailinfo  successfully");
		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_preview_emlinfo_cls"))).click();

		logger.info("emailinfo closed successfully");

		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_preview_listinfo"))).click();

		logger.info("Clicked on listinfo  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_preview_listinfo_cls"))).click();

		logger.info("listinfo closed successfully");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites"))).click();

		logger.info("Clicked on invites  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_opened"))).click();

		logger.info("Clicked on invites opened  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned"))).click();

		logger.info("Clicked on who havent opened tab  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned_remainder")))
				.click();

		logger.info("Clicked on remainder icon  successfully");

		Thread.sleep(6000);

		driver.findElement(
				By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned_remainder_subject")))
				.sendKeys("subject");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned_remainder_msg")))
				.sendKeys("Please open the email[Remainder]");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned_remainder_send")))
				.click();

		logger.info("Clicked on Send Remainderbutton  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_Notyet"))).click();
		Thread.sleep(5000);

		WebElement evesearch = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_Notyet_search")));
		evesearch.sendKeys("gayatri");
		evesearch.sendKeys(Keys.ENTER);

		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_Notyet_export"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_Notyet_excel"))).click();
		Thread.sleep(5000);

		logger.info("Export to excel done successfully");

		Thread.sleep(5000);

		WebElement invite_yes = driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_yes")));

		if (invite_yes.isEnabled()) {

			logger.info("Yes tile clicked Successfully");

			Thread.sleep(4000);

		}

		else {
			logger.info("Unable to click Yes tile  due to count is '0' ");

		}
		Thread.sleep(5000);

		WebElement invite_leads = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_leads")));

		if (invite_leads.isEnabled()) {

			logger.info("Leads tile clicked Successfully");

			Thread.sleep(4000);

		}

		else {
			logger.info("Unable to click leads tile  due to count is '0' ");

		}
		Thread.sleep(5000);

		WebElement invite_total = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_total")));

//System.out.println(invite_total.isEnabled());

		if (invite_total.isEnabled()) {

			logger.info("Total tile clicked Successfully");

			Thread.sleep(4000);

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_total_download"))).click();
			Thread.sleep(5000);

			logger.info("Download icon successfully in Total tile");

			WebElement eve_tot_search = driver
					.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_total_search")));
			eve_tot_search.sendKeys("gayatri");
			eve_tot_search.sendKeys(Keys.ENTER);

			Thread.sleep(7000);

			driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_total_cls"))).click();
			Thread.sleep(5000);

		}

		else {
			logger.info("Unable to click Total tile due to count is '0' ");

		}
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_total_cls"))).click();
		Thread.sleep(5000);

		WebElement eve_analytics = driver
				.findElement(By.xpath(properties.getProperty("partneracc_m_eve_Campaignanalytics")));
		eve_analytics.sendKeys("gayatri");
		eve_analytics.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_Campaignanalytics_gearicon"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_Campaignanalytics_gearicon_excel")))
				.click();
		Thread.sleep(5000);

		logger.info("Download excel successfully in Campaign Analytics section");

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_emailid_click"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_emailid_registerlead"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_firstname"))).sendKeys(" " + " FName"); // first
																														// name
		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_lastname"))).sendKeys(" " + " LName"); // last
																														// name
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_companyname"))).sendKeys(" " + " cname"); // company
																															// name
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_phoneno"))).sendKeys(" " + " 912345678"); // phone
																															// number
		Thread.sleep(5000);

		Select drpstage = new Select(
				driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_selectstage")))); // select stage
		drpstage.selectByValue("4551");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_address"))).sendKeys(" " + " Address"); // address
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_city"))).sendKeys(" " + " city"); // city
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_state"))).sendKeys(" " + " state"); // state
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_postalcode"))).sendKeys(" " + " 534342"); // zipcode
		Thread.sleep(1000);

		Select eve_drpCountry = new Select(
				driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_selectcountry")))); // country
		eve_drpCountry.selectByValue("India");

		driver.findElement(By.xpath(properties.getProperty("mevec_registerlead_submit"))).click(); // submit

		logger.info("Event Lead submitted Successfully");

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mevec_opportunities"))).click(); // hover to opportunities
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mevec_oppo_manageleads"))).click(); // redirect to manage
																								// leads
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mevec_oppo_manageleads_registerdealclick"))).click(); // Register
																													// Deal
																													// button
																													// click
		Thread.sleep(4000);

		logger.info("Register deal button clicked Successfully");

		WebElement eve_selectstage = driver
				.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_selectstage"))); // select stage
		eve_selectstage.sendKeys("Opened");
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

		Thread.sleep(3000);
		logger.info("Selected stage in dropdown Successfully");

		driver.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_title"))).sendKeys("Title"); // title
																													// field

		Thread.sleep(3000);
		WebElement eve_selectstage2 = driver
				.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_selectdeal"))); // select stage
		eve_selectstage2.sendKeys("Select Dealtype");
		Actions keyDown2 = new Actions(driver);
		keyDown2.sendKeys(Keys.chord(Keys.DOWN)).perform();

		logger.info("Selected Dealtype in dropdown Successfully");

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_amount"))).sendKeys("2345"); // amount
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_calendar"))).click(); // select
																											// calendar

		Thread.sleep(7000);

		WebElement reve_calendar = driver
				.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_selectdate")));

		if (reve_calendar.isDisplayed()) {

			reve_calendar.click(); // select current date

			Thread.sleep(4000);
			logger.info("Selected Date in Calendar Successfully");

			driver.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_addcomments"))).click(); // add
																													// comments
																													// button
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_commenttitle")))
					.sendKeys("commtitle"); // comment title
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_rdeal_comment"))).sendKeys("comment"); // comment
																															// text
																															// area

			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("mevec_oppo_mleads_register_deal"))).click(); // click
																												// for
																												// register
																												// deal
																												// button
			Thread.sleep(5000);
			String s = driver.findElement(By.xpath(properties.getProperty("mevec_registerdeal_msg"))).getText();
			System.out.println(s);

		} else {
			logger.info(
					"Unable to Select Date in Calendar for Email Deal Registration[Failed to register deal for Email]");

		}

	}

}