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

public class VendorOpportunities extends ExtentReportsClass {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\VendorOpportunities.properties");
	final Logger logger = LogManager.getLogger(VendorOpportunities.class);

	@Test(priority = 1, enabled = true)
	public void vendor_opportunities_manage_leads() throws InterruptedException {

		WebDriverWait vendor_opportunities_wait = new WebDriverWait(driver, 90);
		WebElement Ven_Opportunities_module = vendor_opportunities_wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("hover_opportunities_module"))));
		Ven_Opportunities_module.click();

		logger.info("Hovered on Opportunities module");
		Thread.sleep(3000);

		Actions opp_action = new Actions(driver);
		opp_action.moveToElement(Ven_Opportunities_module).perform();
		Thread.sleep(5000);

		logger.info("Click on Manage Leads");
		WebElement manage_leads = driver.findElement(By.xpath(properties.getProperty("click_vendor_manage_leads")));
		manage_leads.click();

		Thread.sleep(6000);
	}

	@Test(priority = 2, enabled = true)
	public void manage_leads() throws InterruptedException {

		Thread.sleep(6000);

		logger.info("click on search");
		WebElement manage_leads_Seach = driver
				.findElement(By.xpath(properties.getProperty("click_manage_leads_search_box")));
		manage_leads_Seach.sendKeys("mounika");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_manage_leads_search_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("clear_search_lead_data"))).click();
		Thread.sleep(3000);

		logger.info("click on View lead icon");
		driver.findElement(By.xpath(properties.getProperty("click_manage_view_lead"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("close_manage_view_lead"))).click();
		Thread.sleep(4000);

		logger.info("click on comments icon");
		driver.findElement(By.xpath(properties.getProperty("click_ml_comments_icon"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_comment_text_box"))).sendKeys("Hello Lead");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_comment_submit"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("close_ml_comment_section"))).click();
		Thread.sleep(4000);
	}

	@Test(priority = 3, enabled = true)
	public void maage_leads_campaignview() throws InterruptedException {

		Thread.sleep(3000);
		logger.info("click on Campaign_view");
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_Viewleads_for_this_campaign")))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view_search_partner")))
				.sendKeys("Automated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view_search_icon_partner"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaign_view_search_partner_data_close")))
				.click();
		Thread.sleep(6000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(document.body.scrollHeight,300)");
		Thread.sleep(5000);

		logger.info("click on Number of leads icon");
		driver.findElement(By.xpath(properties.getProperty("click_ml_number_of_leads_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_ViewLead_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_ViewLead_close"))).click();
		Thread.sleep(3000);

		logger.info("click on comments icon");
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_comments_icon"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_commentstextbox")))
				.sendKeys("Hello Lead");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_comments_submit"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_comments_close"))).click();
		Thread.sleep(3000);

		logger.info("click on filter in campaign view");

		WebElement Campaogn_view_filter = driver
				.findElement(By.xpath(properties.getProperty("click_ml_campaign_view_filter")));
		Campaogn_view_filter.click();
		Thread.sleep(3000);

		logger.info("click on status dropdown");

		Select manage_leads_campaignview_status_drpdown = new Select(
				driver.findElement(By.xpath(properties.getProperty("click_manage_leads_campaignview_status_drpdown"))));
		manage_leads_campaignview_status_drpdown.selectByValue("Converted");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_filterbutton"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("close_ml_campaignview_filter"))).click();
		Thread.sleep(5000);

		logger.info("Click on Download - Campaign view");
		driver.findElement(By.xpath(properties.getProperty("click_ml_campaignview_download_leads"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("close_ml_campaignview"))).click();
		Thread.sleep(5000);
	}

	@Test(priority = 4, enabled = true)
	public void manage_leads_filter_and_download_func() throws InterruptedException {

		Thread.sleep(3000);
		logger.info("Click on List view");
		driver.findElement(By.xpath(properties.getProperty("click_ml_listview"))).click();
		Thread.sleep(5000);

		logger.info("click on manage leads filter button");
		WebElement manage_leads_filtericon = driver
				.findElement(By.xpath(properties.getProperty("click_manageleads_filter_icon")));
		manage_leads_filtericon.click();
		Thread.sleep(4000);

		Select manageleads_status_drpdown = new Select(
				driver.findElement(By.xpath(properties.getProperty("click_manageleads_status_drpdown"))));
		manageleads_status_drpdown.selectByValue("Converted");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_manageleads_filter_button"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("close_manageleads_filter"))).click();
		Thread.sleep(3000);

		logger.info("Click on Download Icon");
		driver.findElement(By.xpath(properties.getProperty("click_manageleads_Download_icon"))).click();
		Thread.sleep(3000);

		logger.info("Leads Downloaded Successfully");

		logger.info("click on won leads");
		WebElement won_leads = driver.findElement(By.xpath(properties.getProperty("click_ml_won_leads")));
		won_leads.click();
		Thread.sleep(5000);

		logger.info("click on lost leads");
		WebElement lost_leads = driver.findElement(By.xpath(properties.getProperty("click_ml_lost_leads")));
		lost_leads.click();
		Thread.sleep(5000);

		logger.info("click on converted leads");
		WebElement converted_leads = driver.findElement(By.xpath(properties.getProperty("click_ml_converted_leads")));
		converted_leads.click();
		Thread.sleep(5000);

		logger.info("click on total leads");
		WebElement total_leads = driver.findElement(By.xpath(properties.getProperty("click_ml_total_leads")));
		total_leads.click();
		Thread.sleep(5000);

		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);

		Select pagination_drpdown = new Select(
				driver.findElement(By.xpath(properties.getProperty("click_on_pagination_manageleads"))));
		pagination_drpdown.selectByValue("1: Object");
		Thread.sleep(6000);

		logger.info("Manage leads completed");
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

	}

	@Test(priority = 5, enabled = true)
	public void vendor_opportunities_manage_deals() throws InterruptedException {

		WebDriverWait vendor_opportunities_wait = new WebDriverWait(driver, 50);
		WebElement Ven_Opportunities_module1 = vendor_opportunities_wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("hover_opportunities_module1"))));
		Ven_Opportunities_module1.click();

		logger.info("Hovered on Opportunities module");
		Thread.sleep(3000);

		Actions opp_action = new Actions(driver);
		opp_action.moveToElement(Ven_Opportunities_module1).perform();
		Thread.sleep(3000);

		logger.info("Click on Manage Deals");
		WebElement manage_leads = driver.findElement(By.xpath(properties.getProperty("click_vendor_manage_deals")));
		manage_leads.click();

		Thread.sleep(6000);
	}

	@Test(priority = 6, enabled = true)
	public void manage_deals() throws InterruptedException {
		Thread.sleep(2000);

		logger.info("Click on the View Deals");
		WebElement view_manage_deals = driver.findElement(By.xpath(properties.getProperty("click_md_viewdeals_icon")));
		view_manage_deals.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("close_md_viewdeals"))).click();
		Thread.sleep(3000);

		logger.info("click on the comments icon");
		WebElement md_comments_icon = driver
				.findElement(By.xpath(properties.getProperty("click_managedeals_comments_icon")));
		md_comments_icon.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_md_comments_textbox"))).sendKeys("Hello deal");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_md_comments_data_Submit"))).sendKeys("Hello deal");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("close_md_comments_Section"))).click();
		Thread.sleep(3000);

		logger.info("Click on search for manage deals");
		WebElement manage_Deal_Search = driver
				.findElement(By.xpath(properties.getProperty("click_manage_Deals_Search")));
		manage_Deal_Search.sendKeys("automated", Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("clear_manage_deals_search_data"))).click();
		Thread.sleep(6000);

		logger.info("update the manage deals Status dropdown");
		Select md_update_status_drpdown = new Select(
				driver.findElement(By.xpath(properties.getProperty("update_md_status_drpdown"))));
		md_update_status_drpdown.selectByValue("2: 4557");
		Thread.sleep(4000);

		logger.info("click on filter icon");
		WebElement manage_Deals_filter_icon = driver
				.findElement(By.xpath(properties.getProperty("click_manage_Deals_filter_icon")));
		manage_Deals_filter_icon.click();
		Thread.sleep(6000);
		Select filter_status_drpdown = new Select(
				driver.findElement(By.xpath(properties.getProperty("select_managedeals_status_drpdown"))));
		filter_status_drpdown.selectByValue("Approved");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("click_md_filter_button"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("close_md_filter_Section"))).click();
		Thread.sleep(3000);

		logger.info("click on download icon for manage deals");
		driver.findElement(By.xpath(properties.getProperty("click_md_download_icon"))).click();
		Thread.sleep(6000);

	}

	@Test(priority = 6, enabled = true)
	public void manage_deals_campaignview() throws InterruptedException {

		Thread.sleep(2000);
		logger.info("click on Camapignview- manage deals");
		WebElement md_campaignview = driver.findElement(By.xpath(properties.getProperty("click_md_campaignview")));
		md_campaignview.click();
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("click_md_campview_search_field"))).sendKeys("campaign",
				Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("clear_md_campview_search_field_data"))).click();
		Thread.sleep(4000);

		logger.info("click number of view deals for this camp icon");
		driver.findElement(By.xpath(properties.getProperty("click_view_deals_for_this_campaign_icon"))).click();
		Thread.sleep(4000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(document.body.scrollHeight,300)");
		Thread.sleep(5000);

		logger.info("click number of deals for this camp icon");
		driver.findElement(By.xpath(properties.getProperty("click_no_of_deals_camp_icon"))).click();
		Thread.sleep(4000);

		logger.info("click camapign view view deals icon");
		driver.findElement(By.xpath(properties.getProperty("click_md_campview_vew_deals_icon"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("close_md_campview_vew_deals_icon"))).click();
		Thread.sleep(4000);

		logger.info("click number of view deals for this camp icon");
		driver.findElement(By.xpath(properties.getProperty("click_view_deals_for_this_campaign_icon"))).click();
		Thread.sleep(4000);

		logger.info("click number of deals for this camp icon");
		driver.findElement(By.xpath(properties.getProperty("click_no_of_deals_camp_icon"))).click();
		Thread.sleep(4000);

		logger.info("click on camapign view comments icon -");
		driver.findElement(By.xpath(properties.getProperty("click_md_campview_comments_icon"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("click_md_campview_comments_textbox")))
				.sendKeys("Hello Deal");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("click_md_campview_comment_submit"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("click_md_campview_comments_section_close"))).click();
		Thread.sleep(3000);

		logger.info("click on status drpdown in campaign view");
		Select md_campview_status_dropdown = new Select(
				driver.findElement(By.xpath(properties.getProperty("update_md_campview_status_dropdown"))));
		md_campview_status_dropdown.selectByValue("2: 4557");
		logger.info("status updated successfully in campaign view");
		Thread.sleep(5000);

		logger.info("click on search within the campaignview");
		WebElement search_md_camp_view = driver
				.findElement(By.xpath(properties.getProperty("click_md_campview_within_search")));
		search_md_camp_view.sendKeys("automated", Keys.ENTER);
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("close_md_campview_within_search_data"))).click();
		Thread.sleep(3000);

		logger.info("click on campaign view filter icon");
		WebElement filter_md_camp_view = driver
				.findElement(By.xpath(properties.getProperty("click_md_campview_filter_icon")));
		filter_md_camp_view.click();
		Thread.sleep(5000);

		Select md_campview_filter_status_dropdown1 = new Select(
				driver.findElement(By.xpath(properties.getProperty("click_md_campview_filter_status_dropdown"))));
		md_campview_filter_status_dropdown1.selectByValue("Approved");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("click_md_campview_filter_button"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("close_md_campview_filter_Section"))).click();
		Thread.sleep(3000);

		logger.info("click on cammaign view download icon");
		driver.findElement(By.xpath(properties.getProperty("click_md_campview_download_"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("close_md_campview_Section"))).click();
		Thread.sleep(3000);

		logger.info("click on list view ");
		driver.findElement(By.xpath(properties.getProperty("click_md_listview"))).click();
		Thread.sleep(3000);

		Actions a1 = new Actions(driver); // scroll up a page
		a1.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(5000);

		logger.info("Click on Won Deals");
		WebElement wondeals = driver.findElement(By.xpath(properties.getProperty("click_md_wondeals")));
		wondeals.click();
		Thread.sleep(4000);

		logger.info("Click on lost Deals");
		WebElement lostdeals = driver.findElement(By.xpath(properties.getProperty("click_md_lostdeals")));
		lostdeals.click();
		Thread.sleep(4000);

		logger.info("Click on total Deals");
		WebElement totaldeals = driver.findElement(By.xpath(properties.getProperty("click_md_totaldeals")));
		totaldeals.click();
		Thread.sleep(4000);

		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		Select pagination_drpdown1 = new Select(
				driver.findElement(By.xpath(properties.getProperty("click_on_managedeals_pagination1"))));
		pagination_drpdown1.selectByValue("1: Object");
		Thread.sleep(6000);

		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("go_to_home_page"))).click();
		Thread.sleep(9000);

		logger.info("Manage deals Completed Successfully");
		logger.info("Vendor Opportunities module completed");

	}

}
