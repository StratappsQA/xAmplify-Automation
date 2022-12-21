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

	public class ManagePageCampaign {
		WebDriver driver = Instance.getInstance();
		Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\ManageCampaigns.properties");
		final Logger logger = LogManager.getLogger(ManagePageCampaign.class);

		
		@Test(priority = 410, enabled = true)
		public void sortby_previewdelete() throws InterruptedException {
			Thread.sleep(5000);

			WebDriverWait wait = new WebDriverWait(driver, 90);// Wait till the element is not visible

			WebElement mpcam = wait
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("page_hover"))));
			mpcam.click(); // hover on campaign
			Actions mpcamp_action = new Actions(driver);
			mpcamp_action.moveToElement(mpcam).perform();
			Thread.sleep(5000);

			WebElement managepage_cam = driver.findElement(By.xpath(properties.getProperty("page_manage_hover")));

			// create
			// campaign
			mpcamp_action.moveToElement(managepage_cam);
			mpcamp_action.click();
			mpcamp_action.perform();
			Thread.sleep(5000);

			logger.info("Click on Page Tab");
			driver.findElement(By.xpath(properties.getProperty("page_tab"))).click();// pagetab
			Thread.sleep(3000);

			logger.info("Click on Settings icon");
			driver.findElement(By.xpath(properties.getProperty("page_camp_gearicon1"))).click(); //gear icon

			Thread.sleep(3000);

			logger.info("Click on Preview & delete");
			driver.findElement(By.xpath(properties.getProperty("page_preivewdelete_partner"))).click(); // click on preview & delete

			Thread.sleep(3000);
			JavascriptExecutor js_down = (JavascriptExecutor) driver;
			js_down.executeScript("window.scrollTo(0,100)");
			Thread.sleep(5000);

			new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown"))))
					.selectByVisibleText("Email ID(A-Z)");// sort email id A to Z

			Thread.sleep(3000);
			new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown"))))
					.selectByVisibleText("Email ID(Z-A)");// sort email id Z to A
			Thread.sleep(3000);

			new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown"))))
					.selectByVisibleText("First Name(ASC)");// sort First name ascending
			Thread.sleep(3000);

			new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown"))))
					.selectByVisibleText("First Name(DESC)");// sort First name descending
			Thread.sleep(3000);

			new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown"))))
					.selectByVisibleText("Last Name(ASC)");// sort Last name ascending
			Thread.sleep(3000);

			new Select(driver.findElement(By.xpath(properties.getProperty("page_previewdelete_select_dropdown"))))
					.selectByVisibleText("Last Name(DESC)");// sort Last name descending
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("page_previewdelete_search"))).click();// search
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("page_previewdelete_search"))).sendKeys("Automate");// data
																													// sent
																													// in
																													// search
																													// bar
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("page_previewdelete_search"))).sendKeys(Keys.ENTER);// click
																													// enter
			Thread.sleep(3000);

			String s = driver.findElement(By.xpath(properties.getProperty("page_aftersearch_getext"))).getText();// get the
																													// text
			//System.out.println(s);

			String Excepted = "No Data Found.";

			if (s.equals(Excepted)) {
				Thread.sleep(3000);
				System.out.println("unable to delete the partner because already it is deleted/not there in the list");
				driver.findElement(By.xpath(properties.getProperty("page_clck_managecampaigns"))).click();// click on manage
																											// campaigns

			}

			else {

				driver.findElement(By.xpath(properties.getProperty("page_previewdeletepartner_delete"))).click();// click
																													// for
																													// delete
				Thread.sleep(3000);
				driver.findElement(By.xpath(properties.getProperty("page_previewdeletepartner_yesdelete"))).click();// click
																													// for
																													// yes
																													// delete
				Thread.sleep(3000);
				System.out.println("Deleted Partner successfully from the campaign");

				driver.findElement(By.xpath(properties.getProperty("page_clck_managecampaigns"))).click();// click on manage
																											// campaigns
				Thread.sleep(3000);
			}

		}

		// @Test(priority = 411, enabled = true)
		@Test(dependsOnMethods = { "sortby_previewdelete" })
		public void search_Copy_Edit_Preview_Delete() throws InterruptedException {

			Thread.sleep(5000);

			logger.info("Click on Page Tab");

			WebDriverWait waittab = new WebDriverWait(driver, 50);
			WebElement camptab = waittab
					.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("page_tab")))); //page tab
			camptab.click();
			Thread.sleep(4000);

			driver.findElement(By.xpath(properties.getProperty("page_search"))).click();// search
			Thread.sleep(5000);

			WebElement pagetext = driver.findElement(By.xpath(properties.getProperty("page_search"))); 
			pagetext.sendKeys("pcampaign");// send data
			Thread.sleep(3000);

			pagetext.sendKeys(Keys.ENTER);
			Thread.sleep(3000);

			
			driver.findElement(By.xpath(properties.getProperty("page_camp_gearicon1"))).click();// gear icon
			Thread.sleep(3000);
			logger.info("Click on Copy");
			driver.findElement(By.linkText("Copy Campaign")).click();// copy campaign
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("page_cpy_save"))).click();// save
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("page_gearicon"))).click();// gear icon
			Thread.sleep(3000);
			logger.info("Click on Edit");
			driver.findElement(By.linkText("Edit")).click();// edit
			Thread.sleep(3000);
			logger.info("Click on Manage Campaigns");
			driver.findElement(By.xpath(properties.getProperty("page_click_ManageCampaigns"))).click();// click on manage
																										// campaigns
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("page_click_ManageCampaigns_no"))).click();// click on no
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("page_gearicon"))).click();// gear icon//
			Thread.sleep(3000);
			logger.info("Click on Preview");
			driver.findElement(By.linkText("Preview Campaign")).click();// preview
			Thread.sleep(5000);
			driver.findElement(By.xpath(properties.getProperty("page_preview1"))).click();// click inside preview
			Thread.sleep(6000);
			driver.findElement(By.xpath(properties.getProperty("close_page_preview1"))).click();// close preview
			Thread.sleep(3000);
			driver.findElement(By.xpath(properties.getProperty("close_preview_campagin"))).click();// close other preview
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("page_gearicon"))).click();// gear icon
			Thread.sleep(3000);

			logger.info("Click on Delete Campaign");
			driver.findElement(By.linkText("Delete")).click();// delete
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("page_yes_delete"))).click();// yes delete
			Thread.sleep(3000);
			String mpdelete = driver.findElement(By.id("responseMessage")).getText();
			Thread.sleep(3000);
			System.out.println(mpdelete);

		}

		// @Test(priority = 413, enabled = true)
		@Test(dependsOnMethods = { "search_Copy_Edit_Preview_Delete" })
		public void grid_Analytics() throws InterruptedException {

			WebDriverWait waitgrid = new WebDriverWait(driver, 50);
			WebElement campgrid = waitgrid.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("page_gridview"))));
			campgrid.click();
			logger.info("Clicked on Grid View");

			WebElement pagetext = driver.findElement(By.xpath(properties.getProperty("page_search")));
			pagetext.sendKeys("pcampaign");// send data
			Thread.sleep(3000);

			pagetext.sendKeys(Keys.ENTER);
			Thread.sleep(7000);

			WebElement we1 = driver.findElement(By.xpath(properties.getProperty("page_hover_cmpgnbasedreports")));// hover
																													// on
																													// campaign
																													// based
																													// reports

			Actions mpaction_hover = new Actions(driver);

			mpaction_hover.moveToElement(we1).perform();
			Thread.sleep(4000);

			logger.info("Click on Campaign based reports");
			driver.findElement(By.xpath(properties.getProperty("page_hover_cmpgnbasedreports_click"))).click();// click on
																												// campaign
																												// based
																												// reports

			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("page_info_preview"))).click();// page info
			Thread.sleep(6000);

			driver.findElement(By.xpath(properties.getProperty("page_info_preview_close"))).click();// page info close
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("page_partnerlist_click"))).click();// partner list info
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("page_partnerlist_close"))).click();// partner list info
																									// close
			Thread.sleep(3000);
			logger.info("Click on Recipients tile");

			driver.findElement(By.xpath(properties.getProperty("page_recipients"))).click();// click for recipients
			Thread.sleep(3000);

			WebElement p_recipients_search = driver.findElement(By.xpath(properties.getProperty("page_recipients_search")));
			p_recipients_search.sendKeys("Mounika");// send data into search bar
			Thread.sleep(2000);
			p_recipients_search.sendKeys(Keys.ENTER); // entered in search bar
			Thread.sleep(5000);
			// p_recipients_search.sendKeys(Keys.CLEAR);
			p_recipients_search.clear();

			Thread.sleep(5000);

			driver.findElement(By.xpath(properties.getProperty("page_recipients_gearicon"))).click();// click on gear icon
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("page_recipients_exportoexcel"))).click();// click on export
																											// to excel
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("page_recipients_close"))).click();// close the recipients
			Thread.sleep(5000);

			WebElement p_analytics_search = driver.findElement(By.xpath(properties.getProperty("page_inside_search")));// send
																														// data
																														// to
																														// search
			p_analytics_search.sendKeys("gayatri");
			p_analytics_search.sendKeys(Keys.ENTER);
			Thread.sleep(3000);

			p_analytics_search.clear();
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("page_clck_managecampaigns"))).click();// click on manage
																										// campaigns
			Thread.sleep(8000);
			
			logger.info("Manage Page Campaigns Completed");

		}

	
	
}
