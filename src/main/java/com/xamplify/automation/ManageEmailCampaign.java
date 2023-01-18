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

public class ManageEmailCampaign extends ExtentReportsClass {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\ManageCampaigns.properties");
	final Logger logger = LogManager.getLogger(ManageEmailCampaign.class);

	@Test (priority=150,enabled=true)

	public void manage_email_camp() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement m_emailcamp = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("me_campaignhover")))); // Hover
																														// on
																														// campaigns

		Actions m_emailcamp_action = new Actions(driver);
		m_emailcamp_action.moveToElement(m_emailcamp).perform();
		Thread.sleep(5000);
		WebElement manage_emailcamp = driver.findElement(By.xpath(properties.getProperty("me_managecampaigns"))); // click
																													// on
																													// manage
																													// campaign
		m_emailcamp_action.moveToElement(manage_emailcamp);
		m_emailcamp_action.click();
		m_emailcamp_action.perform();

		Thread.sleep(6000);

		logger.info("Clicked on manage Campaigns");
		
		  driver.findElement(By.xpath(properties.getProperty("manage_email_tab"))).click(); // Click on Email tab 
		  Thread.sleep(8000);
		  logger.info("Clicked on Email tab");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_gearicon"))).click(); // Click on settings  icon.
		  Thread.sleep(3000);
		  logger.info("Click on Edit"); 
		  WebElement email_camp_edit = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_edit"))
		  ); // click // on // Edit 
		  email_camp_edit.click(); 
		  Thread.sleep(3000);
		  
		  WebDriverWait wait_e = new WebDriverWait(driver, 50); 
		  WebElement email_camp_folder_dropdown = wait.until(ExpectedConditions
		  .visibilityOfElementLocated(By.xpath(properties.getProperty("manage_email_camp_folder_dropdown")))); // Click // on // Folder // Dropdown
		  
		  Thread.sleep(3000);
		  
		  Select m_email_folder_dropdown = new Select(email_camp_folder_dropdown);
		  m_email_folder_dropdown.selectByValue("1106"); 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_update"))).click(); // click on Update 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_update_close"))).click();
		  Thread.sleep(8000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_gearicon")))
		  .click(); // Click on settings // icon. 
		  Thread.sleep(5000);
		  
		  logger.info("Click on copy campaign");
		  WebElement email_camp_copy = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_copy"))); // click // on // copy 
		  email_camp_copy.click(); 
		  Thread.sleep(3000);
		  logger.info("Click on copied successfully");
		  driver.findElement(By.xpath(properties.getProperty(
		  "manage_email_camp_copy_save"))).click(); // copied // successfully
		  Thread.sleep(3000);
		  
		  Actions a = new Actions(driver); // scroll down a page
		  a.sendKeys(Keys.PAGE_DOWN).build().perform(); 
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_gearicon1"))).click(); // Click on settings // icon. 
		  Thread.sleep(5000);
		  logger.info("Click on Update Enddate"); 
		  WebElement email_camp_update_enddate= driver .findElement(By.xpath(properties.getProperty("manage_email_camp_update_enddate"))); // click on // update_enddate
		  email_camp_update_enddate.click(); 
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_end_date"))).click(); // Click on enddate // field
		  Thread.sleep(3000);
		  
		  
			/*
			 * WebElement ed_email = driver.findElement(By.xpath(properties.getProperty(
			 * "manage_email_camp_selected_date"))); // Select // date // on // Calendar
			 * 
			 * ed_email.click();
			 * 
			 * Thread.sleep(6000);
			 * 
			 * logger.info("Selected the End date ");
			 */
		  driver.findElement(By.xpath(properties.getProperty(
		  "manage_email_camp_save_changes"))).click();
		  Thread.sleep(8000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_gearicon1"))).click(); // Click on settings // icon. 
		  Thread.sleep(4000);
		  logger.info("Click on Preview & delete "); 
		  WebElement email_camp_preview_delete = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_preview&delete"))); // click on Preview // &delete
		  email_camp_preview_delete.click(); 
		  Thread.sleep(4000); 
		  JavascriptExecutor js_down = (JavascriptExecutor) driver;
		  js_down.executeScript("window.scrollTo(0,100)"); 
		  Thread.sleep(5000);
		  
		  WebDriverWait wait_PD_sortby = new WebDriverWait(driver, 50);
		  WebElement PD_sort = wait_PD_sortby.until(ExpectedConditions.visibilityOfElementLocated(
		  By.xpath(properties.getProperty("manage_email_camp_preview&delete_sortby"))))
		  ; // select // dropdown 
		  Thread.sleep(2000);
		  
		  Select PD_sort1 = new Select(PD_sort);
		  
		  PD_sort1.selectByVisibleText("Email ID(A-Z)"); 
		  Thread.sleep(3000);
		  
		  WebDriverWait PD_search1 = new WebDriverWait(driver, 50); 
		  WebElement email_sr1 = PD_search1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("manage_email_camp_previewdelete_search"))));
		  email_sr1.sendKeys("Automate");// data sent in search bar 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_previewdelete_search"))) .sendKeys(Keys.ENTER);// click //enter 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_click_delete_under_preview&Delete"))) .click(); // delete
		  // partner 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_click_on_yes_delete"))).click(); 
		  Thread.sleep(6000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ManageCamp_breadcrump"))).click();// click // on // manage
		  // campaigns 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_tab"))).click(); // Click on Email tab 
		  Thread.sleep(8000);
		  logger.info("Clicked on Email tab");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_gearicon1"))).click(); // Click on settings // icon. 
		  Thread.sleep(3000);
		  logger.info("Click on Preview");
		  WebElement email_camp_preview = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_preview")));
		  // click on Preview 
		  email_camp_preview.click();
		  Thread.sleep(6000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_preview_close"))).click();
		  Thread.sleep(8000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_gearicon1"))).click(); // Click on settings // icon. 
		  Thread.sleep(3000);
		  logger.info("Click on Archieve CAmpaigns"); 
		  WebElement email_camp_archieve = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_archieve")));
		  // click on Archieve Camp 
		  email_camp_archieve.click(); 
		  Thread.sleep(5000);
		  logger.info("Click on archieved Campaign button");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_archievedcamp"))).click(); // Click on // Archieved // camapign button 
		  Thread.sleep(4000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_archievedcamp_settingsdropdown"))).click(); // Click // on //gearicon
		  Thread.sleep(4000); 
		  logger.info("Click on Unarchieve Campaign");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_unarchieve"))).click(); // Click on // Unarchieve //campaign 
		  Thread.sleep(4000); 
		  logger.info("Click on Active Campaigns");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_activecamp"))).click(); // Click on Active // Campaigns
		  Thread.sleep(4000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_tab"))).
		  click(); // Click on Email tab 
		  Thread.sleep(8000);
		  logger.info("Clicked on Email tab");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_gearicon")))
		  .click(); // Click on settings // icon. 
		  Thread.sleep(3000);
		  logger.info("Click on Delete Campaign");
		  WebElement email_delete_camp =driver.findElement(By.xpath(properties.getProperty("manage_email_delete_camp"))); // click // on // delete // 
email_delete_camp.click();
		  Thread.sleep(5000); 
		  driver.findElement(By.xpath(properties.getProperty(
		  "manage_email_yes_delete_camp"))).click(); // Yes delete 
		  Thread.sleep(7000);
		  
		  driver.findElement(By.xpath(properties.getProperty(
		  "manage_email_camp_analytics"))).click(); // click on // campaign //analytics 
		  Thread.sleep(5000);
		  
		  JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("document.getElementsByClassName('fa fa-user')");
		  Thread.sleep(3000);
		  
		  logger.info("Click on recipients tile");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_recepients_click"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_total_recepients_search_box"))) .sendKeys("mounika");
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_total_recepients_search"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_total_recepients_search_close"))).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_export_excel_icon_click"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_export_excel_click"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_total_recepients_cross_click"))).click();
		  Thread.sleep(3000);
		  
		  logger.info("Click on Total email sent tile");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_totalemailsent_click"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_totalemailsent_search_box"))) .sendKeys("mounika");
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_totalemailsent_search"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_totalemailsent_search_close"))).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_totalemailsent_export_excel_icon_click"))) .click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty(
		  "manage_email_camp_totalemailsent_export_excel_click"))) .click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_totalemailsent_cross_click"))).click();
		  Thread.sleep(3000);
		  
		  logger.info("Click on Deliverability tile");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Deliverability_click"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Deliverability_search_box"))) .sendKeys("mounika");
		  Thread.sleep(3000); driver.findElement(By.xpath(properties.getProperty(
		  "manage_email_camp_Deliverability_search"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Deliverability_search_close"))).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Deliverability_export_excel_icon_click"))) .click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Deliverability_export_excel_click"))) .click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Deliverability_cross_click"))).click();
		  Thread.sleep(3000);
		  
		  logger.info("Click on Active Recepients");
		  
		  WebElement mange_email_camp_activerec = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Activerecipients_click")));
		  if
		  (mange_email_camp_activerec.isEnabled()) {
		  
		  mange_email_camp_activerec.click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Activerecipients_search_box"))) .sendKeys("automated");
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Activerecipients_search"))).click(); // click // on //search 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Activerecipients_search_close"))) .click();
		  Thread.sleep(3000);
		  WebDriverWait wait_time_drdn_2 = new WebDriverWait(driver, 50);
		  WebElement w_time2 = wait_time_drdn_2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("m_email_time_dropdown")))); // select // time // dropdown
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
		  
		  driver.findElement( By.xpath(properties.getProperty("manage_email_camp_Activerecipients_export_excel_icon_click"))) .click();
		  Thread.sleep(3000); 
		  driver.findElement( By.xpath(properties.getProperty("manage_email_camp_Activerecipients_export_excel_click"))).click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Activerecipients_cross_click"))) .click();
		  Thread.sleep(3000);
		  
		  } 
		  
		  else { 
			  
			  System.out.println("activerecepients count is zero"); 
			  
		  }
		  
		  logger.info("Click on the Open_rate");
		  
		  WebElement openrat = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Openrate_click"))); 
		  
		  if (openrat.isEnabled()) {
		  openrat.click(); 
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Openrate_search_box"))) .sendKeys("automated");
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Openrate_search"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Openrate_search_close"))).click(); 
		  Thread.sleep(3000);
		  
		  WebDriverWait wait_time_drdn = new WebDriverWait(driver, 50); 
		  WebElement w_time = wait_time_drdn.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty(
		  "m_email_time_dropdown1")))); // select // dropdown 
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
		  w_t1.selectByValue("6: Object"); Thread.sleep(5000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Openrate_export_excel_icon_click"))) .click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Openrates_export_excel_click"))) .click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Openrate_cross_click"))).click(); 
		  Thread.sleep(3000); }
		  else { 
			  
			  System.out.println("openrate count is zero"); 
			  
		  }
		  
		  logger.info("Click on the Clicked URL tile");
		  
		  WebElement clickedurl = driver .findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedURL_click"))); 
		  
		  if (clickedurl.isEnabled()) {
		  
		  clickedurl.click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedURL_search_box"))) .sendKeys("automated");
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedURL_search"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty(
		  "manage_email_camp_ClickedURL_search_close"))).click(); 
		  Thread.sleep(3000);
		  
		  WebDriverWait wait_time_drdn_3 = new WebDriverWait(driver, 50);
		  WebElement w_time3 = wait_time_drdn_3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("m_email_time_dropdown2")))); // select // time // dropdown
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
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedURL_export_excel_icon_click"))) .click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedURLs_export_excel_click"))) .click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedURL_cross_click"))).click(); 
		  Thread.sleep(3000);
		  
		  }
		  
		  else {
		  
		  System.out.println("Clicked URL count is zero"); 
		  
		  Thread.sleep(3000); 
		  
		  }
		  
		  WebElement clickthroughrate = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedThroughRate_click"))); 
		  
		  if
		  (clickthroughrate.isEnabled()) {
		  
		  clickthroughrate.click(); 
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedThroughRate_search_box"))) .sendKeys("automated");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedThroughRate_search"))).click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedThroughRate_search_close"))) .click();
		  Thread.sleep(3000);
		  
		  WebDriverWait wait_time_drdn_3 = new WebDriverWait(driver, 50); 
		  WebElement w_time3 = wait_time_drdn_3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty(
		  "mv_time_dropdown3")))); // select // time // dropdown 
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
		  
		  driver.findElement( By.xpath(properties.getProperty("manage_email_camp_ClickedThroughRate_export_excel_icon_click"))) .click();
		  Thread.sleep(3000); 
		  driver.findElement( By.xpath(properties.getProperty("manage_email_camp_ClickedThroughRate_export_excel_click"))) .click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_ClickedThroughRate_cross_click"))) .click();
		  Thread.sleep(3000); 
		  
		  }
		  
		  else {
		  
		  System.out.println("Click through rate count is zero");
		  Thread.sleep(3000); 
		  
		  }
		  
		  logger.info("Click on Hard bounce");
		  
		  WebElement hardbounce = driver .findElement(By.xpath(properties.getProperty("manage_email_camp_Hardbounce_click"))); 
		  if (hardbounce.isEnabled()) {
		  hardbounce.click(); 
		  Thread.sleep(3000);
		 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Hardbounce_cross_click"))); 
		  Thread.sleep(3000); }
		  
		  else {
			  
			  System.out.println("Hard bounce value is Zero"); 
			  Thread.sleep(3000); 
			  }
		  
		  logger.info("Click on soft bounce");
		  
		  WebElement softbounce = driver .findElement(By.xpath(properties.getProperty("manage_email_camp_Softbounce_click"))); 
		  if (softbounce.isEnabled()) 
		  {
		  softbounce.click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Softbounce_cross_click")));
		  Thread.sleep(3000); }
		  
		  else { 
			  System.out.println("soft bounce value is Zero"); 
			  
		  }
		  
		  logger.info("Click on unsubscribe");
		  
		  WebElement unsubscribe = driver .findElement(By.xpath(properties.getProperty("manage_email_camp_Unsubscribe_click")));
		  if (unsubscribe.isEnabled()) {
		  unsubscribe.click(); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_Unsubscribe_cross_click"))); 
		  Thread.sleep(3000); 
		  }
		  
		  else {
			  System.out.println("unsubscribe value is Zero"); 
			  
			  Thread.sleep(3000);
			  }
		  
		  logger.info("Click on Leads");
		  
		  WebElement email_camp_leads = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_leads_click")));
		  
		  if (email_camp_leads.isEnabled()) {
			  email_camp_leads.click();
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_leads_search_box"))) .sendKeys("auto_lead");
		  Thread.sleep(6000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_leads_search"))).click(); // Search icon click
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_leads_search_close"))).click(); 
		  Thread.sleep(3000);
		  
		  logger.info("Click on filter");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_click_lead_filter"))).click(); // Click // on // filter
		  Thread.sleep(3000);
		  
		  WebDriverWait wait_statusdropdown = new WebDriverWait(driver, 50);
		  WebElement w_leadstatusdropdown = wait_statusdropdown.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("manage_email_camp_click_leadstatus_select_dropdown")))); //
		  Thread.sleep(2000);
		  
		  Select leadstatus_dropdown1 = new Select(w_leadstatusdropdown);
		  leadstatus_dropdown1.selectByValue("Opened"); 
		  Thread.sleep(2000);
		  
		  leadstatus_dropdown1.selectByValue("Closed - Lost"); 
		  
		  Thread.sleep(2000);
		  
		  leadstatus_dropdown1.selectByValue("Converted"); 
		  Thread.sleep(2000);
		  
		  leadstatus_dropdown1.selectByValue("Contacted");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_click_leadfilter_button"))).click(); // click // on // filter // button
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_click_leadfilter_cross_click"))) .click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_leads_download_click"))).click(); // Click // on // Download 
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_leads_close"))).click(); // close // leads // section
		  Thread.sleep(3000); 
		  
		  }
		  
		  else {
			  
			  System.out.println("leads count is Zero");
			  Thread.sleep(3000);
			  }
		  
		  logger.info("Click on Deals");
		  
		  WebElement deals = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_deals_click"))); // Click // on // Deals // tile
		  
		  if (deals.isEnabled()) { 
			  
			  deals.click();
			  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_deals_search_box"))) .sendKeys("auto_deal");
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_deals_search"))).click(); // Search icon click
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_deals_search_close"))).click(); 
		  Thread.sleep(3000);
		  logger.info("Click on filter");
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_click_deals_filter"))).click(); // Click // on // filter
		  Thread.sleep(3000);
		  
		  WebDriverWait wait_dealstatusdropdown = new WebDriverWait(driver, 50);
		  WebElement w_dealstatusdropdown = wait_dealstatusdropdown.until(ExpectedConditions.visibilityOfElementLocated(
		  By.xpath(properties.getProperty("manage_email_camp_click_dealstatus_select_dropdown")))); 
		  Thread.sleep(2000);
		  
		  Select dealstatus_dropdown2 = new Select(w_dealstatusdropdown);
		  dealstatus_dropdown2.selectByValue("Opened"); 
		  Thread.sleep(2000);
		  dealstatus_dropdown2.selectByValue("Approved"); 
		  Thread.sleep(2000);
		  dealstatus_dropdown2.selectByValue("Rejected"); 
		  Thread.sleep(2000);
		  dealstatus_dropdown2.selectByValue("Hold"); 
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_click_dealsfilter_button"))).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_click_dealsfilter_cross_click"))) .click();
		  Thread.sleep(3000); driver.findElement(By.xpath(properties.getProperty("manage_email_camp_deals_download_click"))).click(); 
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_deals_close"))).click(); 
		  Thread.sleep(3000); 
		  
		  }
		  
		  else { 
			  System.out.println("deals count is Zero"); 
			  Thread.sleep(3000); 
			  
		  }
		  
		  JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		  jse1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  Thread.sleep(5000);
		  
		  WebDriverWait wait_eml_camp_sortby = new WebDriverWait(driver, 50);
		  WebElement email_sort =wait_eml_camp_sortby.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("manage_email_camp_total_email_camp_sort_by")
		  ))); // select // totla // email // opned_dropdown 
		  Thread.sleep(2000);
		  
		  Select email_sort1 = new Select(email_sort);
		  
		  email_sort1.selectByValue("1: Object"); 
		  Thread.sleep(2000);
		  email_sort1.selectByValue("2: Object");
		  Thread.sleep(2000);
		  email_sort1.selectByValue("3: Object"); 
		  Thread.sleep(2000);
		  email_sort1.selectByValue("4: Object");
		  Thread.sleep(2000);
		  
		  WebElement mv_analytics_search = driver.findElement(By.xpath(properties.getProperty("manage_email_camp_analytics_search")));
		  mv_analytics_search.sendKeys("mounika");
		  mv_analytics_search.sendKeys(Keys.ENTER); 
		  Thread.sleep(3000);
		  
		  mv_analytics_search.clear(); 
		  Thread.sleep(2000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_camp_analytics_cross"))).click();
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_campanalytics_export_excel_arrow"))).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_campanalytics_click_export_Excel"))).click();
		  Thread.sleep(3000);
		  logger.info("Campaign-based reports Downloaded Successfully");
		  JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		  jse2.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		  Thread.sleep(5000);
		  
		  driver.findElement(By.xpath(properties.getProperty("e_managecamp_click"))).
		  click();// click on manage campaigns 
		  Thread.sleep(7000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_email_tab"))).
		  click(); // Click on Email Tab
		  Thread.sleep(5000);
		  logger.info("Clicked on the Video tab");
		  
		  driver.findElement(By.xpath(properties.getProperty(
		  "manage_emailcamp_openhistorybytemplate_click"))).click(); // click // on // email_open_history_by_template 
		  Thread.sleep(3000);
		  
		  WebDriverWait wait_email_open_history_sortby = new WebDriverWait(driver, 50);
		  WebElement email_open_sort =wait_email_open_history_sortby.until(ExpectedConditions.visibilityOfElementLocated( By.xpath(properties.getProperty(
		  "manage_emailcamp_openhistorybytemplate_soryby_click")))); // select // email
		  // opned_history_dropdown 
		  Thread.sleep(3000);
		  
		  Select email_open_sort1 = new Select(email_open_sort);
		  
		  email_open_sort1.selectByValue("3: Object"); 
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_emailcamp_openhistorybytemplate_searchbox_click")))
		  .sendKeys("Automated"); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_emailcamp_openhistorybytemplate_searchicon_click"))) .click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_emailcamp_openhistorybytemplate_search_close"))) .click();
		  Thread.sleep(3000);
		  
		  logger.info("Clicked on email_open_history_by_template icon");
		  driver.findElement(By.xpath(properties.getProperty("e_managecamp1_click"))).
		  click(); 
		  Thread.sleep(6000);
		  driver.findElement(By.xpath(properties.getProperty("manage_email_tab"))).
		  click(); // Click on Email Tab 
		  Thread.sleep(5000);
		  logger.info("Clicked on the Email tab");
		  driver.findElement(By.xpath(properties.getProperty(
		  "manage_emailcamp_showdownloadhistory_click"))).click(); // click // on //Show // download // history icon 
		  Thread.sleep(3000);
		  
		  WebDriverWait email_camp_show_download_history_sortby = new
		  WebDriverWait(driver, 50); WebElement email_camp_downloadhistory__sort =
		  email_camp_show_download_history_sortby
		  .until(ExpectedConditions.visibilityOfElementLocated(
		  By.xpath(properties.getProperty(
		  "manage_emailcamp_showdownloadhistory_soryby_click")))); // select // showdownload history_dropdown // 
		  Thread.sleep(2000);
		  
		  Select eml_camp_downloadhistory__sort1 = new Select(email_camp_downloadhistory__sort);
		  
		  eml_camp_downloadhistory__sort1.selectByValue("3: Object");
		  Thread.sleep(2000);
		  eml_camp_downloadhistory__sort1.selectByValue("5: Object");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath(properties.getProperty("manage_emailcamp_showdownloadhistory_searchbox_click"))).sendKeys("Automated"); 
		  Thread.sleep(3000);
		  driver.findElement(By.xpath(properties.getProperty("manage_emailcamp_showdownloadhistory_searchicon_click"))) .click();
		  Thread.sleep(3000); 
		  driver.findElement(By.xpath(properties.getProperty("manage_emailcamp_showdownloadhistory_search_close"))) .click(); // clear data 
		  Thread.sleep(5000);
		  logger.info("Clicked on the Show download history icon");
		  driver.findElement(By.xpath(properties.getProperty("e_managecamp2_click"))).
		  click(); // click on Manage Campaigns 
		  Thread.sleep(5000);
		 
		driver.findElement(By.xpath(properties.getProperty("manage_email_tab"))).click(); // Click on email Tab
		Thread.sleep(5000);
		logger.info("Clicked on the Email tab");

		logger.info("number of redistribution campaign icon");

		WebElement email_camp_redistributionicon = driver
				.findElement(By.xpath(properties.getProperty("number_of_email_Camp_redistribution_camp"))); // click no.of redistribution campaign
		email_camp_redistributionicon.click();
		Thread.sleep(5000);
		
		
		Actions a1 = new Actions(driver); // scroll Up a page
		  a1.sendKeys(Keys.PAGE_UP).build().perform(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("goto_home"))).click(); //Click Home
		Thread.sleep(7000);
		logger.info("Manage Email Campaign completed");
	}

}
