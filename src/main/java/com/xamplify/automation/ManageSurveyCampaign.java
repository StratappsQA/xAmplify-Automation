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
	Thread.sleep(3000);
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

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("gear_icon_t"))).click(); //Click on gear icon
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("update_end_date"))).click(); //click on update end date
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("campaign_end_date"))).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath(properties.getProperty("select_date"))).click();
	//Thread.sleep(3000);
//	List<WebElement> dates= driver.findElements(By.className("flatpickr-day"));
//	//select common attribute // list and iterate
//	int count=driver.findElements(By.className("flatpickr-day selected")).size();
//	for(int i=0; i<count; i++)
//	{
//		String text=driver.findElements(By.className("flatpickr-day selected")).get(i).getText();
//		if(text.equalsIgnoreCase("4"))
//		{
//		driver.findElements(By.className("flatpickr-day selected")).get(i).click();
//		break;
//		}
//	}
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
	
	
//		String s = driver.findElement(By.xpath(properties.getProperty("survey_aftersearch_getext"))).getText();// get the text
//	System.out.println(s);
//	
//	String Excepted = "No Data Found.";
//	
//	if (s.equals(Excepted)) {
//	Thread.sleep(3000);
//	System.out.println("unable to delete the partner because already it is deleted/not there in the list");
//	driver.findElement(By.xpath(properties.getProperty("managecampaigns"))).click();// click on manage campaigns
//	
//	}
//	
//	else {
//	
//		driver.findElement(By.xpath(properties.getProperty("s_previewdelete_delete"))).click(); // click on Delete
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(properties.getProperty("s_yes_delete"))).click(); // Click on Yes_delete
//		Thread.sleep(3000);
//	
//	System.out.println("Deleted Partner successfully from the campaign");
//	}

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
	
	driver.findElement(By.xpath(properties.getProperty("list_view"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(properties.getProperty("analytics_icon_click"))).click();
	Thread.sleep(3000);
	
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
	
	driver.findElement(By.xpath(properties.getProperty("email_open_history_by_template"))).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(properties.getProperty("mc_click"))).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(properties.getProperty("show_download_history"))).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(properties.getProperty("mc1_click"))).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(properties.getProperty("no_red_camp"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(properties.getProperty("mc1_click"))).click();
	Thread.sleep(3000);
	
	
}
 

}
