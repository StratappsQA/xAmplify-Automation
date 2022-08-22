package com.xamplify.automation;
			
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
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
			
public class ManageSurveyCampaign {
		
			WebDriver driver = Instance.getInstance();
			Properties properties = PropertiesFile.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\ManageCampaigns.properties");
			final Logger logger = LogManager.getLogger(SurveyCampaign.class);
			
		@Test
		
			public void manage_scampaign() throws InterruptedException, SQLException {
				
			WebDriverWait wait = new WebDriverWait(driver, 50);  // Wait till the element is not visible
		
			WebElement mscamp = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("campaignhover"))));
			mscamp.click(); // hover on campaign
			
			Actions mcamp_action = new Actions(driver);
			mcamp_action.moveToElement(mscamp).perform();
			Thread.sleep(5000);
			WebElement manage_campele = driver.findElement(By.xpath(properties.getProperty("managecampaigns"))); //click on manage campaign
			mcamp_action.moveToElement(manage_campele);
			mcamp_action.click();
			mcamp_action.perform();
		
			Thread.sleep(4000);
		
			
			driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); //Click on Survey Tab
			Thread.sleep(5000);
		logger.info("Clicked on the Survey tab");
			driver.findElement(By.xpath(properties.getProperty("gear_icon"))).click(); //Click on gear icon
			Thread.sleep(3000);
		logger.info("Click on the Gear icon");
			driver.findElement(By.xpath(properties.getProperty("edit"))).click();
			Thread.sleep(3000);
		logger.info("Click on the Edit Icon");
		 	WebDriverWait folder_dropdown = new WebDriverWait(driver, 50);
			WebElement f_dropdown = folder_dropdown
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("s_select_folder_dropdown"))));  //select folder dropdown
			Thread.sleep(2000);
			
		 	Select fdropdown = new Select(f_dropdown); 
		 	fdropdown.selectByValue("1106");  //select by value
		 	
		 	Thread.sleep(4000);
		 	driver.findElement(By.xpath(properties.getProperty("update_button"))).click();//click on update
		 	Thread.sleep(2000);
		 	driver.findElement(By.xpath(properties.getProperty("click_close"))).click();//click on close button
		 	Thread.sleep(4000);
		 logger.info("click on Gear icon");
		 	driver.findElement(By.xpath(properties.getProperty("gear_icon"))).click(); //Click on gear icon
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("copy_campaign"))).click();//Click on Copy Campaign
			Thread.sleep(2000);
			driver.findElement(By.xpath(properties.getProperty("click_save_changes"))).click();//click on Save Changes.
			Thread.sleep(2000);
		logger.info("campaign copied successfully");
		
			Actions a = new Actions(driver); // scroll down a page
			a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		//	JavascriptExecutor js = (JavascriptExecutor) driver;
		//	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//	Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("gear_icon_t"))).click(); //Click on gear icon
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("update_end_date"))).click(); //click on update end date
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("campaign_end_date"))).click();
			Thread.sleep(3000);
			//driver.findElement(By.xpath(properties.getProperty("select_date"))).click();
			//Thread.sleep(3000);
		
			driver.findElement(By.xpath(properties.getProperty("save_changes"))).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath(properties.getProperty("gear_icon_t"))).click(); //Click on gear icon
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("preview&delete_partner"))).click(); //Click on Preview and delete
			Thread.sleep(3000);
			JavascriptExecutor js_down = (JavascriptExecutor) driver;
			js_down.executeScript("window.scrollTo(0,100)");
			Thread.sleep(5000);
			
			WebDriverWait wait_sortby = new WebDriverWait(driver, 50);
			WebElement w_sort = wait_sortby
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("ms_sortby"))));  //select dropdown
			Thread.sleep(2000);
			
			Select sort1 = new Select(w_sort);
			
			sort1.selectByVisibleText("Email ID(A-Z)");
			Thread.sleep(3000);
			
			sort1.selectByVisibleText("Email ID(Z-A)");
			Thread.sleep(3000);
			
			sort1.selectByVisibleText("First Name(ASC)");
			Thread.sleep(3000);
			
			sort1.selectByVisibleText("First Name(DESC)");
			Thread.sleep(3000);
			
			sort1.selectByVisibleText("Last Name(ASC)");
			Thread.sleep(3000);
			
			sort1.selectByVisibleText("Last Name(DESC)");
			Thread.sleep(3000);
			
			sort1.selectByVisibleText("Company Name (Z-A)");
			Thread.sleep(3000);
			
			sort1.selectByVisibleText("Company Name (A-Z)");
			Thread.sleep(3000);
			
			WebDriverWait search1 = new WebDriverWait(driver, 50); 
			WebElement sr1 = search1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("survey_previewdelete_search"))));
			sr1.sendKeys("Automate");// data sent in search bar
			Thread.sleep(3000);
			
			driver.findElement(By.xpath(properties.getProperty("survey_previewdelete_search"))).sendKeys(Keys.ENTER);// click enter
			Thread.sleep(3000);
			
		
			driver.findElement(By.xpath(properties.getProperty("ManageCamp_breadcrump"))).click();// click on manage campaigns
			Thread.sleep(3000);
				
			driver.findElement(By.xpath(properties.getProperty("gear_icon_t"))).click(); //Click on gear icon
			Thread.sleep(3000);
		
			driver.findElement(By.xpath(properties.getProperty("preview"))).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(properties.getProperty("preview_close"))).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("gear_icon_t"))).click(); //Click on gear icon
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(properties.getProperty("archieve_campaign"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("archieved_campaign_button"))).click();//click on archieved campaigns button
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("archieved_gear_icon"))).click();
			Thread.sleep(3000);
			driver.findElement(By.cssSelector(properties.getProperty("unarchieved_option"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("active_campaigns_botton"))).click();//click on active campaigns button
			Thread.sleep(4000);
			
			
			driver.findElement(By.xpath(properties.getProperty("grid_view"))).click();// click on grid view
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("folder_grid_view"))).click(); //click on folder grid view
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("fgv_search"))).sendKeys("automatedvendor"); // click on search bar under folder grid view
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("search_click"))).click();// click on search icon
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("cross_button"))).click();
			Thread.sleep(4000);
			
			WebDriverWait wait_f_sortby = new WebDriverWait(driver, 50);
			WebElement w_f_sort = wait_f_sortby
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("ms_f_sortby"))));  //select dropdown
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
			
			
			driver.findElement(By.xpath(properties.getProperty("folder_list_view"))).click(); // Click on folder list view
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("flv_search"))).sendKeys("automatedvendor"); // click on search bar under folder grid view
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("search_click"))).click();// click on search icon
			Thread.sleep(4000);
			driver.findElement(By.xpath(properties.getProperty("cross_button"))).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath(properties.getProperty("list_view"))).click(); //Click on List View
			Thread.sleep(5000);
			
		logger.info("Click on the campaign based reports");
			driver.findElement(By.xpath(properties.getProperty("analytics_icon_click"))).click(); // Click on Campaign based Reports
			Thread.sleep(3000);
		logger.info("Click on the Recepients");
			
		
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("document.getElementsByClassName('fa fa-user')");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath(properties.getProperty("recepients_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("total_recepients_search_box"))).sendKeys("mounika");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("total_recepients_search"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("total_recepients_cross_click"))).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath(properties.getProperty("total_email_sent"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("total_email_search_box"))).sendKeys("mounika");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("total_emailsent_search"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("total_emailsent_cross_click"))).click();
			Thread.sleep(3000);
			
			driver.findElement(By.xpath(properties.getProperty("deliverability"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("delivered_email_search_box"))).sendKeys("mounika");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("delivered_email_search"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("delivered_cross_click"))).click();
			Thread.sleep(3000);
		
			
		logger.info("Click on the Open_rate");	
			
			WebElement openrat = driver.findElement(By.xpath(properties.getProperty("openrate")));
			if(openrat.isEnabled())
			{
			openrat.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("emails_opened_by_recepients_search_box"))).sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("emails_opened_by_recepients_search"))).click();
			Thread.sleep(3000);
			
			WebDriverWait wait_time_drdn = new WebDriverWait(driver, 50);
			WebElement w_time = wait_time_drdn
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("time_dropdown"))));  //select dropdown
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
			
			driver.findElement(By.xpath(properties.getProperty("export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("op_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("openrate_cross_click"))).click();
			Thread.sleep(3000);
			}
			else
			{
				System.out.println("openrate count is zero");
			}
			
		logger.info("Click on Active Recepients");
		
			WebElement activerec = driver.findElement(By.xpath(properties.getProperty("active_recepients")));
			if(activerec.isEnabled())
			{
			
			activerec.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("emails_opened_by_recepients_search_box"))).sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("emails_opened_by_recepients_search"))).click();
			Thread.sleep(3000);
			
			WebDriverWait wait_time_drdn_2 = new WebDriverWait(driver, 50);
			WebElement w_time2 = wait_time_drdn_2
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("time_dropdown"))));  //select time dropdown
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
			
			driver.findElement(By.xpath(properties.getProperty("export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("active_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("active_cross_click"))).click();
			Thread.sleep(3000);
		
			}
			else
			{
				System.out.println("activerecepients count is zero");
			}
		logger.info("Click on the Clicked URL tile");
		
			WebElement clickedurl = driver.findElement(By.xpath(properties.getProperty("clicked_URL")));
			if(clickedurl.isEnabled())
			{
		
			clickedurl.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("recepients_clicked_search_box"))).sendKeys("automated");
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("recepients_clicked_search"))).click();
			Thread.sleep(3000);
			
			WebDriverWait wait_time_drdn_3 = new WebDriverWait(driver, 50);
			WebElement w_time3 = wait_time_drdn_3
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("time_dropdown1"))));  //select time dropdown
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
			
			driver.findElement(By.xpath(properties.getProperty("export_excel_icon_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("url_export_excel_click"))).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("url_cross_click"))).click();
			Thread.sleep(3000);
			}
			
			else {
				
				System.out.println("Clicked URL count is zero");
			}
		
			
		logger.info("Click on Hard bounce");
		
			WebElement hardbounce = driver.findElement(By.xpath(properties.getProperty("click_Hardbounce")));
			if(hardbounce.isEnabled())
			{
				hardbounce.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("hardbounce_close")));
				Thread.sleep(3000);
			}
			
			else
			{
				System.out.println("Hard bounce value is Zero");
			}
			
			
			
		logger.info("Click on soft bounce");
		
			WebElement softbounce = driver.findElement(By.xpath(properties.getProperty("click_softbounce")));
			if(softbounce.isEnabled())
			{
				softbounce.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("softbounce_close")));
				Thread.sleep(3000);
			}
			
			else
			{
				System.out.println("soft bounce value is Zero");
			}
			
			
		logger.info("Click on unsubscribe");
		
			WebElement unsubscribe = driver.findElement(By.xpath(properties.getProperty("click_unsubscribe")));
			if(unsubscribe.isEnabled())
			{
				unsubscribe.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("unsubscribe_close")));
				Thread.sleep(3000);
			}
			
			else
			{
				System.out.println("unsubscribe value is Zero");
			}
		
			
			
		logger.info("Click on Leads");	
			
			WebElement leads = driver.findElement(By.xpath(properties.getProperty("click_leads")));
			
			
			if(leads.isEnabled())
			{
				leads.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("lead_search_click"))).sendKeys("auto_lead");
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("lead_search_icon_click"))).click();
				// Search icon click
				Thread.sleep(3000);
				
				driver.findElement(By.xpath(properties.getProperty("lead_clear"))).click();
				Thread.sleep(3000);
				
				logger.info("Click on filter");
				driver.findElement(By.xpath(properties.getProperty("click_filter"))).click(); //Click on filter
				Thread.sleep(3000);
				
		//		driver.findElement(By.xpath(properties.getProperty("select_from_date"))).click(); // Select From date
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath(properties.getProperty("choose_from_date"))).click(); // Select From date
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath(properties.getProperty("select_to_date"))).click(); // Select To date
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath(properties.getProperty("choose_to_date"))).click(); // Select To date
		//		Thread.sleep(3000);
				
				WebDriverWait wait_statusdropdown = new WebDriverWait(driver, 50);
				WebElement w_statusdropdown = wait_statusdropdown
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("status_select_dropdown"))));
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
			 	
				driver.findElement(By.xpath(properties.getProperty("click_filter_button"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("apply_filter_cross"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("click_download"))).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath(properties.getProperty("leads_close"))).click();
				Thread.sleep(3000);
			}
		
			else
			{
				System.out.println("leads count is Zero");
			}
		
		logger.info("Click on Deals");	
			
			WebElement deals = driver.findElement(By.xpath(properties.getProperty("click_deals")));
			
			
			if(deals.isEnabled())
			{
				deals.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("deal_search_click"))).sendKeys("auto_deal");
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("deal_search_icon_click"))).click();
				// Search icon click
				Thread.sleep(3000);
				
				driver.findElement(By.xpath(properties.getProperty("deals_clear_search"))).click();
				Thread.sleep(3000);
				logger.info("Click on filter");
				driver.findElement(By.xpath(properties.getProperty("check_d_filter"))).click(); //Click on filter
				Thread.sleep(3000);
				
		//		driver.findElement(By.xpath(properties.getProperty("select_from_date"))).click(); // Select From date
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath(properties.getProperty("choose_from_date"))).click(); // Select From date
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath(properties.getProperty("select_to_date"))).click(); // Select To date
		//		Thread.sleep(3000);
		//		
		//		driver.findElement(By.xpath(properties.getProperty("choose_to_date"))).click(); // Select To date
		//		Thread.sleep(3000);
				
				WebDriverWait wait_dealstatusdropdown = new WebDriverWait(driver, 50);
				WebElement w_dstatusdropdown = wait_dealstatusdropdown
						.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("status_select_dropdown2"))));
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
				
				driver.findElement(By.xpath(properties.getProperty("click_filter_button"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("apply_filter_cross"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("click_download_deal"))).click();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath(properties.getProperty("deals_close"))).click();
				Thread.sleep(3000);
			}
		
			else
			{
				System.out.println("deals count is Zero");
			}
				
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
				Thread.sleep(5000);
			
				WebDriverWait wait_eml_sortby = new WebDriverWait(driver, 50);
				WebElement eml_sort = wait_eml_sortby
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("total_email_camp_sort_by"))));  //select totla email opned_dropdown
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
				
				WebElement s_analytics_search = driver.findElement(By.xpath(properties.getProperty("analytics_search")));
				s_analytics_search.sendKeys("mounika");
				s_analytics_search.sendKeys(Keys.ENTER);
				Thread.sleep(3000);
			
				s_analytics_search.clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath(properties.getProperty("analytics_cross"))).click();
				Thread.sleep(3000);
				
				driver.findElement(By.xpath(properties.getProperty("s_export_excel"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("s_click_export_Excel"))).click();
				Thread.sleep(3000);
				
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollTo(document.body.scrollHeight,0)");
				Thread.sleep(5000);
			
				
				driver.findElement(By.xpath(properties.getProperty("ManageCamp_click"))).click();// click on manage campaigns
				Thread.sleep(3000);
				
			
				
				driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); //Click on Survey Tab
				Thread.sleep(5000);
			logger.info("Clicked on the Survey tab");
			
			
				driver.findElement(By.xpath(properties.getProperty("email_open_history_by_template"))).click(); // click on email_open_history_by_template
				Thread.sleep(3000);
			logger.info("Clicked on email_open_history_by_template icon");	
				driver.findElement(By.xpath(properties.getProperty("mcamp_click"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); //Click on Survey Tab
				Thread.sleep(5000);
			logger.info("Clicked on the Survey tab");
				driver.findElement(By.xpath(properties.getProperty("show_download_history"))).click(); //click on Show download history icon
				Thread.sleep(3000);
			logger.info("Clicked on the Show download history icon");	
				driver.findElement(By.xpath(properties.getProperty("mcamp1_click"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("survey_tab"))).click(); //Click on Survey Tab
				Thread.sleep(5000);
			logger.info("Clicked on the Survey tab");
				driver.findElement(By.xpath(properties.getProperty("no_red_camp"))).click();// Clicked on Number of redistributed campaign icon
				Thread.sleep(3000);
			logger.info("Clicked on Number of redistributed campaign icon");
				driver.findElement(By.xpath(properties.getProperty("red_camp_analytics"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("mcamp2_click"))).click();
				Thread.sleep(3000);
			logger.info("Manage Survey Campaign completed");
				
			}
			 
			
			
			}
			
