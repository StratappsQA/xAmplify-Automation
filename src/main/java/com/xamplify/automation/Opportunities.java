package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Opportunities extends ExtentReportsClass {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\git\\xAmplifyproject\\xAmplify-Automation\\src\\main\\resources\\Opportunities.properties");
	final Logger logger = LogManager.getLogger(Opportunities.class);

	@Test(priority = 1, enabled = true)

	public void partner_opportunities() throws InterruptedException {

		WebDriverWait opportunities_wait = new WebDriverWait(driver, 50);
		WebElement Opportunities_module = opportunities_wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("hover_opportunities"))));
		Opportunities_module.click();

		logger.info("Hovered on Opportunities module");
		Thread.sleep(3000);

		Actions opp_action = new Actions(driver);
		opp_action.moveToElement(Opportunities_module).perform();
		Thread.sleep(5000);

		logger.info("Click on Manage Leads");
		WebElement manage_leads = driver.findElement(By.xpath(properties.getProperty("click_manage_leads")));
		manage_leads.click();

		Thread.sleep(6000);
	}

	@Test(priority = 2, enabled = true)

	public void addlead_form() throws InterruptedException {

		Thread.sleep(3000);
		logger.info(("Click on Add lead button"));
		WebElement add_lead_click = driver.findElement(By.xpath(properties.getProperty("click_add_lead")));
		add_lead_click.click();
		Thread.sleep(5000);

		Select companydrpdown = new Select(driver.findElement(By.xpath(properties.getProperty("select_company"))));
		companydrpdown.selectByValue("810");
		Thread.sleep(4000);

		Select lead_pipeline_drpdown = new Select(
				driver.findElement(By.xpath(properties.getProperty("select_lead_pipeline"))));
		lead_pipeline_drpdown.selectByValue("1128");
		Thread.sleep(4000);

		Select lead_pipelinestage_drpdown = new Select(
				driver.findElement(By.xpath(properties.getProperty("select_lead_pipeline_stage"))));
		lead_pipelinestage_drpdown.selectByValue("4551");
		Thread.sleep(2000);

		lead_pipelinestage_drpdown.selectByValue("4552");
		Thread.sleep(2000);

		lead_pipelinestage_drpdown.selectByValue("4553");
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("lead_Fname_click"))).sendKeys("" + "fname"); // firstname
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_Lname_click"))).sendKeys("" + "lname"); // Lastname
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_companyname_click"))).sendKeys("" + "cname"); // Company
																												// name
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_email_click"))).sendKeys("chmounika@stratapps.com"); // email
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_address_click"))).sendKeys("PJR_Enclave"); // address
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_city_click"))).sendKeys("city"); // city
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_state_click"))).sendKeys("Telangana"); // telangana
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_phonenum_click"))).sendKeys("9090909090"); // phone
																											// number
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_postalcode_click"))).sendKeys("500050"); // postal code
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("lead_website_click"))).sendKeys("www.me.com"); // website
		Thread.sleep(3000);

		WebElement country_drp_down = driver.findElement(By.xpath(properties.getProperty("coutry_drpdown_click")));
		Select countrydrpdwn = new Select(country_drp_down);
		countrydrpdwn.selectByVisibleText("India");
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("click_submit_button_lead"))).click();
		Thread.sleep(7000);

		String lead_result = driver.findElement(By.xpath(properties.getProperty("registerlead_msg"))).getText();

		String expected_leadresult = "Lead Submitted Successfully";
		if (lead_result.equals(expected_leadresult)) {

			System.out.println("Lead Submitted Successfully");

		} else {

			System.out.println("Lead Submission failed");
		}

		logger.info("Lead added Successfully");

	}

	@Test(priority = 3, enabled = true)

	public void registered_deal_form() throws InterruptedException {

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_registerdeal_button"))).click();
		Thread.sleep(3000);

		logger.info("Register deal button clicked Successfully");

		WebElement deal_pipeline_drpdown =
				driver.findElement(By.xpath(properties.getProperty("select_deal_pipeline_click"))); // select stage
		deal_pipeline_drpdown.sendKeys("Default Deal Pipeline");
	    Actions keyDown = new Actions(driver);
	    keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN)).perform();

		Thread.sleep(3000);
		logger.info("Selected pipeline in dropdown Successfully");

		WebElement deal_pipeline_stage_drpdown = 
				driver.findElement(By.xpath(properties.getProperty("select_deal_pipelinestage_click"))); // select
																											// stage
		deal_pipeline_stage_drpdown.sendKeys("Approved");
	    Actions keyDown2 = new Actions(driver);
	    keyDown2.sendKeys(Keys.chord(Keys.DOWN)).perform();
		logger.info("Selected pipeline in dropdown Successfully");

		driver.findElement(By.xpath(properties.getProperty("opp_deal_title_click"))).sendKeys("Deal_Title"); // title
																												// field

		Thread.sleep(3000);
		WebElement dealtypedrpdown =
				driver.findElement(By.xpath(properties.getProperty("opp_selectdealtype_click"))); // select dealtype
		dealtypedrpdown.sendKeys("New Product");
	    Actions keyDown3 = new Actions(driver);
	    keyDown3.sendKeys(Keys.chord(Keys.DOWN)).perform();

		logger.info("Selected Dealtype in dropdown Successfully");

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("opp_deal_amount_click"))).sendKeys("9999"); // amount
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("opp_estimate_deal_calendar"))).click(); // select calendar

		Thread.sleep(7000);

		WebElement estimate_date_calendar = driver
				.findElement(By.xpath(properties.getProperty("opp_estimateddeal_selectdate")));

		

			estimate_date_calendar.click(); // select date

			Thread.sleep(8000);
			logger.info("Selected Date in Calendar Successfully");

			driver.findElement(By.xpath(properties.getProperty("opp_deal_addcomments_click"))).click(); // add comments
																										// button
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("opp_deal_commenttitle_click")))
					.sendKeys("Deal_comment"); // comment title
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("opp_deal_comment_click"))).sendKeys("comment here"); // comment
																														// text
																														// area

			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("opp_save_register_deal"))).click(); // save
			Thread.sleep(7000);
			
			
			String result = driver.findElement(By.xpath(properties.getProperty("registerdeal_msg"))).getText();

			String expectedresult = "Deal Submitted Successfully";
			if (result.equals(expectedresult)) {

				System.out.println("Deal Submitted Successfully");

			} else {

				System.out.println("Deal Submission failed");
			}
			
			logger.info("Deal submitted Successfully");

		}
	
	@Test(priority = 4, enabled =true)
	
	public void lead_Actions() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_view_lead_icon"))).click(); //view lead icon
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("close_viewlead_click"))).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(properties.getProperty("click_edit_lead_icon"))).click(); //edit lead icon
		Thread.sleep(5000);
		
		Select lead_pipelinestage_drpdown1 = new Select(
				driver.findElement(By.xpath(properties.getProperty("select_lead_pipeline_stage"))));
		lead_pipelinestage_drpdown1.selectByValue("4554");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(properties.getProperty("click_update_lead"))).click(); //lead update
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("click_delete_lead"))).click(); //delete icon
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_yes_delete"))).click(); // yed delete
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("click_comments_icon"))).click(); //comments icon
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_comment_text"))).sendKeys("Hello Vendor");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(properties.getProperty("comment_submit"))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("comments_close"))).click();
		Thread.sleep(5000);
		
		logger.info("click on search lead");
		
		driver.findElement(By.xpath(properties.getProperty("click_lead_search"))).sendKeys("mounika");
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_lead_search_icon"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("clear_search_data"))).click();
		Thread.sleep(3000);
		
	}
	
	
		@Test(priority = 5, enabled = true)
		
		public void campaignview_filter_download_functionalities() throws InterruptedException {
		
		WebElement campaign_view_icon = driver.findElement(By.xpath(properties.getProperty("click_campaign_view_icon"))); //campaign view
		campaign_view_icon.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_viewleads_for_this_campaign"))).click(); //viewleads for this campaign
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_campview_search"))).sendKeys("mounika"); //search data
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_campview_searchicon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("clear_campview_search"))).click();
		Thread.sleep(3000);
		
		logger.info("Click on filter icon under campaign view ");

		WebElement campview_filter_icon = driver.findElement(By.xpath(properties.getProperty("click_campview_filter"))); //filter icon
		campview_filter_icon.click();
		Thread.sleep(4000);
		
		Select staus_drpdown_campview_filter = new Select(driver.findElement(By.xpath(properties.getProperty("click_staus_drpdown_campview_filter"))));
		staus_drpdown_campview_filter.selectByValue("Closed - Lost");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_campview_filter_button"))).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("close_apply_filters_campview"))).click();
		Thread.sleep(4000);
		
		logger.info("Click on download icon under campaign view ");

		driver.findElement(By.xpath(properties.getProperty("click_campview_leads_downloadicon"))).click(); //download
		Thread.sleep(4000);
		
		
		logger.info("Click on view lead icon under campaign view ");
		driver.findElement(By.xpath(properties.getProperty("click_campview_viewlead_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_campview_viewlead_icon_close"))).click();
		Thread.sleep(3000);
		
		logger.info("Click on edit icon under campaign view ");
		driver.findElement(By.xpath(properties.getProperty("click_campview_edit_icon"))).click();
		Thread.sleep(3000);
		Select campview_edit_stagedrpdown = new Select(driver.findElement(By.xpath(properties.getProperty("click_campview_edit_stagedrpdown"))));
		campview_edit_stagedrpdown.selectByValue("4552");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath(properties.getProperty("click_campview_lead_update"))).click();
		Thread.sleep(3000);
		logger.info("Lead updated Successfully in CAMPAIGN VIEW");
		
		logger.info("Click on list view");
		driver.findElement(By.xpath(properties.getProperty("click_leads_listview"))).click();
		Thread.sleep(3000);
		
		logger.info("Click on filter icon ");
		WebElement lead_filter_func = driver.findElement(By.xpath(properties.getProperty("click_lead_filtericon")));
		lead_filter_func.click();
		Thread.sleep(4000);
		
		Select statusdrpdown_filter_func = new Select(driver.findElement(By.xpath(properties.getProperty("click_statusdrpdown_filter_func"))));
		statusdrpdown_filter_func.selectByValue("Closed - Lost");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(properties.getProperty("click_lead_filter_button"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_leads_apply_filter_close"))).click();
		Thread.sleep(3000);
		
	
		driver.findElement(By.xpath(properties.getProperty("click_download_total_leads"))).click();
		Thread.sleep(4000);
		logger.info("Total leads downloaded Successfully");
		
		
		}
		
		@Test(priority = 6, enabled = true)
		public void lead_categories() throws InterruptedException 
		
		{
			Thread.sleep(3000);
			logger.info("click on won leads");
			WebElement won_leads = driver.findElement(By.xpath(properties.getProperty("click_won_leads")));
			won_leads.click();
			Thread.sleep(5000);
			
			logger.info("click on lost leads");
			WebElement lost_leads = driver.findElement(By.xpath(properties.getProperty("click_lost_leads")));
			lost_leads.click();
			Thread.sleep(5000);
			
			logger.info("click on converted leads");
			WebElement converted_leads = driver.findElement(By.xpath(properties.getProperty("click_converted_leads")));
			converted_leads.click();
			Thread.sleep(5000);
			
			logger.info("click on total leads");
			WebElement total_leads = driver.findElement(By.xpath(properties.getProperty("click_total_leads")));
			total_leads.click();
			Thread.sleep(5000);
			
			Actions a1 = new Actions(driver); // scroll down a page
			  a1.sendKeys(Keys.PAGE_DOWN).build().perform(); 
			Thread.sleep(5000);
			
			Select pagination_drpdown = new Select( driver.findElement(By.xpath(properties.getProperty("click_on_pagination"))));
			pagination_drpdown.selectByValue("2: Object");
			Thread.sleep(6000);
			
			Actions a2 = new Actions(driver); // scroll down a page
			  a2.sendKeys(Keys.PAGE_UP).build().perform(); 
			Thread.sleep(5000);
			
			driver.findElement(By.xpath(properties.getProperty("goto_home"))).click();
			Thread.sleep(3000);
			
			logger.info("Manage leads completed");
			
			
		}
		
	

	}


