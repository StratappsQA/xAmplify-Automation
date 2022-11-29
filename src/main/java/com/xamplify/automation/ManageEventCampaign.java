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

public class ManageEventCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\ManageEventCampaign.properties");
	final Logger logger = LogManager.getLogger(ManageEventCampaign.class);

	@Test(priority = 1, enabled = false)
	

	public void manage_event_copy() throws InterruptedException, SQLException {

	
		Thread.sleep(8000);
		  
		  driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click();
		  // click on the gear icon
		  
		  Thread.sleep(6000);
		  
		  driver.findElement(By.xpath(properties.getProperty("meve_copycampaign"))).
		  click(); // click on the copy campaign // icon
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("meve_copy_saveas"))).
		  click(); // click on the save the // copycampaign
		  
		  Thread.sleep(8000); 
		  logger.info("Copied Event campaign successfully");
		  
		  Thread.sleep(6000);

		  
		  driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click();
		  // click on the gear icon
		  
		  Thread.sleep(6000);
		  
		  
		  
		  driver.findElement(By.xpath(properties.getProperty("meve_editicon"))).click(); // click on the edit icon
			Thread.sleep(4000);
		  
		  driver.findElement(By.xpath("//h5[contains(text(),'Launch')]")).click();
		  Thread.sleep(4000);
		  
			driver.findElement(By.xpath(properties.getProperty("eve_now"))).click(); // click NOW
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("eve_launch"))).click(); // click LAUNCH

			Thread.sleep(4000);
		  
		  
		  
		  }
		 
	
	
	@Test(priority = 2, enabled = false)
	
	public void manage_event_editdelete() throws InterruptedException, SQLException {

		Thread.sleep(13000);
		driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();// click on the eventtab
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(9000);

		driver.findElement(By.xpath(properties.getProperty("meve_editicon"))).click(); // click on the edit icon
		Thread.sleep(3000);

		WebElement meve_drop = driver.findElement(By.xpath(properties.getProperty("meve_edit_selectfolder"))); // click
																												// on
																												// the
																												// folder
		meve_drop.click();
		driver.findElement(By.xpath(properties.getProperty("meve_edit_selectedfolder"))).click(); // selected the folder
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_updatefolder"))).click(); // click on the update
		Thread.sleep(3000);
		logger.info("Folder updated successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_close"))).click(); // close the window
		Thread.sleep(5000);

		
		
		
	}
	
	

	@Test(priority = 3, enabled = false)
//	@Test(dependsOnMethods = { "manage_event_editdelete" })
	public void manage_eve_sndpreview_previewdelete() throws InterruptedException, SQLException {

		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_sendpreviewemail"))).click(); // click on the
																								// sendpreview mail
																								// option

		Thread.sleep(3000);

		WebElement snddata = driver.findElement(By.xpath(properties.getProperty("meve_senddata"))); // click on the
																									// emailid field
		snddata.sendKeys("agayatri@stratapps.com");
		snddata.sendKeys(Keys.ENTER);

		Thread.sleep(4000);

		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page

		driver.findElement(By.xpath(properties.getProperty("meve_sendbutton"))).click(); // click on the send button

		Thread.sleep(3000);

		logger.info("Event Preview email sent successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_closebutton"))).click(); // click on the close button
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_gear_icon"))).click(); // click on the gear icon

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_preview&delete"))).click(); // click on the
																								// preview&delete icon

		Thread.sleep(3000);

		WebElement we = driver.findElement(By.xpath(properties.getProperty("meve_preview&delete_sortby"))); // click for
																											// sortby
		we.click();
		Thread.sleep(3000);

		Select sort = new Select(we);
		Thread.sleep(3000);

		sort.selectByVisibleText("Email ID(A-Z)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Email ID(Z-A)");

		Thread.sleep(3000);
		sort.selectByVisibleText("First Name(ASC)");

		Thread.sleep(3000);
		sort.selectByVisibleText("First Name(DESC)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Last Name(ASC)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Last Name(DESC)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Company Name (A-Z)");

		Thread.sleep(3000);
		sort.selectByVisibleText("Company Name (Z-A)");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_preview&delete_del"))).click(); // delete icon for one
																									// of the partner

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("meve_preview&del_yesdel"))).click(); // click for the yes
																									// delete button

		Thread.sleep(3000);

		logger.info("Deleted one of the partner in the  Preview&Delete option successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_navigate_mcam"))).click(); // navigate to manage
																							// campaign

		logger.info("Navigate to Manage Campaigns successfully");

		Thread.sleep(6000);
	}

	@Test(priority = 4, enabled = false)
	
	public void manage_eve_grid_cancel() throws InterruptedException, SQLException {

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("meve_gridview"))).click(); // click on the grid view
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();// click on the eventtab
		Thread.sleep(5000);

		WebElement wp = driver.findElement(By.xpath(properties.getProperty("meve_hover_previewicon"))); // hover to
		// previewevent
		// icon

		Actions action = new Actions(driver);
		action.moveToElement(wp).perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("meve_hover_previewicon"))).click(); // click on the preview
																								// option
		Thread.sleep(5000);

		logger.info("Clicked preview icon in grid view successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_preview_closeicon"))).click(); // click on the close
																								// icon

		Thread.sleep(3000);

		WebElement wue = driver.findElement(By.xpath(properties.getProperty("meve_hover_updateevent_icon"))); // hover
																												// to
		// update event
		// icon

		Actions action_wue = new Actions(driver);
		action_wue.moveToElement(wue).perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("meve_hover_updateevent_icon"))).click(); // click on the
																										// update event
																										// option
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_message"))).sendKeys("update for the message field");
		Thread.sleep(3000);
		logger.info("Added Message successfully by clicking on the update event icon");

		driver.findElement(By.xpath(properties.getProperty("meve_update_button"))).click(); // click on the update
																							// button
		

		Thread.sleep(55000);
		logger.info("Event has been updated successfully");
		driver.navigate().to("https://xamplify.co/home/campaigns/manage");
		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("meve_gridview"))).click(); // click on the grid view
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();// click on the eventtab
		Thread.sleep(7000);

		WebElement w = driver.findElement(By.xpath(properties.getProperty("meve_hover_canceleventicon"))); // hover to
																											// cancelevent
																											// icon

		Actions action21 = new Actions(driver);
		action21.moveToElement(w).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("meve_hover_canceleventicon"))).click();
		Thread.sleep(5000);

		logger.info("Clicked Cancel event icon in grid view successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_cancel_emailsubject")))
				.sendKeys("event cancelled subject"); // enter the data for the subject field
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_cancel_message")))
				.sendKeys("event cancelled due to some reasons");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("meve_cancel_event"))).click(); // click on the cancel event
																							// button
		Thread.sleep(63000);
		logger.info("Event has been cancelled successfully");

	}

	@Test(priority = 5, enabled = false)
	// @Test(dependsOnMethods = { "manage_eve_grid_cancel" })
	public void manage_eve_archieve() throws InterruptedException, SQLException {

		Thread.sleep(7000);
		driver.navigate().to("https://xamplify.co/home/campaigns/manage");
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("meve_gridview"))).click(); // click on the grid view
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();// click on the eventtab
		Thread.sleep(8000);
		
		
		WebElement w2 = driver.findElement(By.xpath(properties.getProperty("meve_hover_archieve_icon"))); // hover to
																											// cancelevent
																											// icon

		Actions action2 = new Actions(driver);
		action2.moveToElement(w2).perform();
		Thread.sleep(9000);
		driver.findElement(By.xpath(properties.getProperty("meve_hover_archieve_icon"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_archievecampaigns_button"))).click(); // clcik on the
																										// archieve
																										// button
		Thread.sleep(6000);
		logger.info("archived campaigns button clicked successfully");

		driver.findElement(By.xpath(properties.getProperty("meve_gridview"))).click(); // click on the grid view

		logger.info("clicked on the grid view");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();// click on the eventtab
		Thread.sleep(11000);
		
		
		WebElement w3 = driver.findElement(By.xpath(properties.getProperty("meve_hover_grid_delete_active"))); // hover
																												// to
																												// icon

		Actions action3 = new Actions(driver);
		action3.moveToElement(w3).perform();
		Thread.sleep(9000);

		driver.findElement(By.xpath(properties.getProperty("meve_hover_grid_delete_active"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("meve_hover_grid_delete_yes"))).click();

		Thread.sleep(7000);
		logger.info("Deleted archived campaign ");
		driver.findElement(By.xpath(properties.getProperty("meve_hover_grid_activecam_button"))).click();

		Thread.sleep(7000);
		logger.info("Back to active campaigns page ");
		
	}
	
	
		
		
		
		
		
		
		
	@Test(priority = 6, enabled = true)
	public void manage_eve_analyticsreports() throws InterruptedException, SQLException {

		
	{
		
		
		
		driver.navigate().to("https://xamplify.co/home/campaigns/manage");
		Thread.sleep(6000);
		
		
		
		
		
		
		
		
		System.out.println("aa");
		
		
		
		driver.findElement(By.xpath(properties.getProperty("meve_cbreports"))).click();

		Thread.sleep(7000);
		

		
		
		driver.findElement(By.xpath(properties.getProperty("m_eve_preview_emlinfo"))).click();

		logger.info("Clicked on emailinfo  successfully");
		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_preview_emlinfo_cls"))).click();

		logger.info("emailinfo closed successfully");

		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_preview_listinfo"))).click();

		logger.info("Clicked on listinfo  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_preview_listinfo_cls"))).click();

		logger.info("listinfo closed successfully");

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites"))).click();

		logger.info("Clicked on invites  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_opened"))).click();

		logger.info("Clicked on invites opened  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_whohaventopned"))).click();

		logger.info("Clicked on who havent opened tab  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_whohaventopned_remainder")))
				.click();

		logger.info("Clicked on remainder icon  successfully");

		Thread.sleep(6000);

		driver.findElement(
				By.xpath(properties.getProperty("m_eve_invites_whohaventopned_remainder_subject")))
				.sendKeys("subject");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_whohaventopned_remainder_msg")))
				.sendKeys("Please open the email[Remainder from vendor]");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_whohaventopned_remainder_send")))
				.click();

		logger.info("Clicked on Send Remainderbutton  successfully");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_Notyet"))).click();
		Thread.sleep(5000);

		WebElement evesearch = driver
				.findElement(By.xpath(properties.getProperty("m_eve_invites_Notyet_search")));
		evesearch.sendKeys("gayatri");
		evesearch.sendKeys(Keys.ENTER);

		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_Notyet_export"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_Notyet_excel"))).click();
		Thread.sleep(5000);

		logger.info("Export to excel done successfully");

		Thread.sleep(5000);

		WebElement invite_yes = driver.findElement(By.xpath(properties.getProperty("m_eve_invites_yes")));

		if (invite_yes.isEnabled()) {

			logger.info("Yes tile clicked Successfully");

			Thread.sleep(4000);

		}

		else {
			logger.info("Unable to click Yes tile  due to count is '0' ");

		}
		Thread.sleep(5000);

		WebElement invite_leads = driver
				.findElement(By.xpath(properties.getProperty("m_eve_invites_leads")));

		if (invite_leads.isEnabled()) {

			logger.info("Leads tile clicked Successfully");

			Thread.sleep(4000);

		}

		else {
			logger.info("Unable to click leads tile  due to count is '0' ");

		}
		Thread.sleep(5000);

		WebElement invite_total = driver
				.findElement(By.xpath(properties.getProperty("m_eve_invites_total")));

//System.out.println(invite_total.isEnabled());

		if (invite_total.isEnabled()) {

			logger.info("Total tile clicked Successfully");

			Thread.sleep(4000);

			driver.findElement(By.xpath(properties.getProperty("m_eve_invites_total_download"))).click();
			Thread.sleep(5000);

			logger.info("Download icon successfully in Total tile");

			WebElement eve_tot_search = driver
					.findElement(By.xpath(properties.getProperty("m_eve_invites_total_search")));
			eve_tot_search.sendKeys("gayatri");
			eve_tot_search.sendKeys(Keys.ENTER);

			Thread.sleep(7000);

			driver.findElement(By.xpath(properties.getProperty("m_eve_invites_total_cls"))).click();
			Thread.sleep(5000);

		}

		else {
			logger.info("Unable to click Total tile due to count is '0' ");

		}
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("m_eve_invites_total_cls"))).click();
		Thread.sleep(5000);

		
		
		
	}
		
		
	
		
	}
}
