package com.xamplify.automation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VideoCampaign {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");
	final Logger logger = LogManager.getLogger(VideoCampaign.class);

	@Test(priority = 8, enabled = true)

	public void vdecampaign() throws InterruptedException, SQLException {

		WebDriverWait waitv = new WebDriverWait(driver, 50);

		// Wait till the element is not visible
		WebElement campele = waitv.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("campaign_hover_v"))));// hover on Campaigns
		campele.click();

		Actions camp_action = new Actions(driver);
		camp_action.moveToElement(campele).perform();
		Thread.sleep(5000);
		WebElement create_campele = driver.findElement(By.xpath(properties.getProperty("vcreatecampaign"))); // click on
																												// create
		logger.info("Click on create Campaign"); // campaign

		camp_action.moveToElement(create_campele);
		camp_action.click();
		camp_action.perform();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("openvideocampaign"))).click();// open campagin
		Thread.sleep(3000);

		List<String> campaignNames = new ArrayList<String>();
		String query = properties.getProperty("query.getCampaignNamesByOrganizationId").replaceAll(":emailId",
				properties.getProperty("user.name"));
		ResultSet resultSet = DatabaseConnection.getResultSet(query);
		while (resultSet.next()) {
			campaignNames.add(resultSet.getString("campaign_name").toLowerCase());
		}
		String campaignNameFromProp = properties.getProperty("ewrite_campaign").toLowerCase();

		driver.findElement(By.id(properties.getProperty("vcampaignName")))
				.sendKeys(properties.getProperty("vwrite_campaign"));
		Thread.sleep(5000);
		if (campaignNames.indexOf(campaignNameFromProp) > -1) {
			driver.findElement(By.id(properties.getProperty("vcampaignName"))).clear();
		} // added

		WebElement vcampaignName = driver.findElement(By.id(properties.getProperty("vcampaignName")));
		vcampaignName.sendKeys(properties.getProperty("vwrite_campaign") + "_" + System.currentTimeMillis());
		System.out.println(vcampaignName.getAttribute("value"));

		Thread.sleep(2000);

		// String getcampaignname = vcampaignName.getAttribute("value");

		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("vcampaign_through"))).click();// through toggle on
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("vsubjectline"))).sendKeys("subjectLine***");// enter data
																										// for subject
																										// line

		Thread.sleep(2000);

		driver.findElement(By.name(properties.getProperty("vpreheader"))).sendKeys("preHeader***");// enter data for pre
																									// header
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("vnotifyme_email"))).click();// notify email opened
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("vnotifyme_link"))).click();// notify link opened
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("vnotifyme_video"))).click();// notify video is played
		Thread.sleep(2000);

		
		WebElement vdropdown_sort = driver.findElement(By.xpath(properties.getProperty("v_dropdown_sort")));// select sort
		Thread.sleep(3000);
		Select vds = new Select(vdropdown_sort);
		vds.selectByValue("3: Object");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("v_search_video"))).sendKeys("Nature_video1234");// enter the data in Search bar																									
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("v_search_video_click"))).click();// after data entered click
		Thread.sleep(3000);

		WebElement vdropdown = driver.findElement(By.xpath(properties.getProperty("video_category")));// select category
		Thread.sleep(3000);

		Select vd = new Select(vdropdown);
		Thread.sleep(3000);
		vd.selectByValue("108");

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("select_video1"))).click();
		Thread.sleep(2000);
logger.info("Selected the Video");

		WebElement v7 = driver.findElement(By.xpath(properties.getProperty("search_template")));
		v7.sendKeys("cobranding");// send data through search bar in template
		v7.sendKeys(Keys.ENTER);

		WebDriverWait waitv71 = new WebDriverWait(driver, 50);
		WebElement v71 = waitv71.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("search_template_click"))));// click on search after data entered																							
		v71.click();

		WebDriverWait waitv10 = new WebDriverWait(driver, 60);
		WebElement v10 = waitv10.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("select_template")))); // select
																														// template
		v10.click();

		driver.findElement(By.xpath(properties.getProperty("vclick_sendtext_email"))).click();
		Thread.sleep(5000);

		WebElement stext_email = driver.findElement(By.xpath(properties.getProperty("vsendtext_email")));// search email
																											// fileds
		stext_email.sendKeys("chmounika@stratapps.com");
		stext_email.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement stext_email_subject = driver
				.findElement(By.xpath(properties.getProperty("vsendtext_email_subject")));// subject fileds
		stext_email_subject.sendKeys("Please check the Template");
		stext_email_subject.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement stext_email_button1 = driver.findElement(By.xpath(properties.getProperty("v_sendemail_button")));// send
																													// email
																													// button
		stext_email_button1.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("vemailsent_popup"))).click();
		Thread.sleep(5000);

		WebDriverWait waitv11 = new WebDriverWait(driver, 50);
		WebElement v11 = waitv11.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("email_template_preview")))); // select
																											// template
		v11.click();
		Thread.sleep(2000);

		String originalWindow = driver.getWindowHandle();// store the current window handle
		waitv.until(ExpectedConditions.numberOfWindowsToBe(2)); // wait for new tab to open
		Thread.sleep(5000);

		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles()); // get all windows handle

		driver.switchTo().window(tabs.get(1)); // switch to the new tab

		Thread.sleep(3000);

		/*
		 * WebElement companylogoNewTab =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.
		 * getProperty("")))); companylogoNewTab.click(); //perform actions in new tab
		 */
		driver.close(); // switch back to original tab and close the new tab

		driver.switchTo().window(tabs.get(0));
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("email_template_next"))).click();
		Thread.sleep(5000);
		logger.info("Selected the Template");

		WebDriverWait wait_vdropdown = new WebDriverWait(driver, 50);
		WebElement w_vdropdown = wait_vdropdown.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("v_select_dropdown"))));

		Select dropdown = new Select(w_vdropdown);
		dropdown.selectByVisibleText("Count(DESC)");

		Thread.sleep(4000);

		WebDriverWait waitv12 = new WebDriverWait(driver, 50);
		WebElement v12 = waitv12.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("search_select_partnerlist"))));
		v12.sendKeys("Active Master Partner List");// Search for partner list
		v12.sendKeys(Keys.ENTER); // Click on search
		Thread.sleep(5000);

		  
		driver.findElement(By.xpath(properties.getProperty("search_select_partnerlist_click"))).click(); //Select the searched data
		  

		driver.findElement(By.xpath(properties.getProperty("select_partner_preview"))).click();// click on preview
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("close_partner_preview"))).click();// close partner preview
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("select_partnerlist"))).click();// select partner list
		Thread.sleep(4000);

		logger.info("Selected the Partnerlist");
		
	}

}



/*
 * driver.findElement(By.xpath(properties.getProperty("vpushleads2marketo"))).
 * click();//push to marketo toggle on Thread.sleep(5000);
 * driver.findElement(By.xpath(properties.getProperty("marketovideo"))).click();
 * //select marketo check box
 * driver.findElement(By.xpath(properties.getProperty("hubspotvideo"))).click();
 * //select hub spot check box Thread.sleep(3000);
 */

/*
 * WebDriverWait waitv2 = new WebDriverWait(driver, 30);// Wait till the element
 * is not visible
 * 
 * WebElement wvnext1 = waitv2.until(ExpectedConditions
 * .visibilityOfElementLocated(By.xpath(properties.getProperty(
 * "vcampaign_next_button1")))); wvnext1.click();
 * logger.info("Given the data in Campaign details page");
 */
/*
 * for (int i = 0; i <= 8; i++) {
 * driver.findElement(By.xpath(properties.getProperty("v_pagenation_nxt"))).
 * click();
 * 
 * Thread.sleep(5000); }
 */

/*
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
 * Thread.sleep(5000);
 * 
 * WebElement eg1 =
 * driver.findElement(By.xpath(properties.getProperty("vpagintionlist")));
 * List<WebElement> links1 = eg1.findElements(By.tagName("li")); for (int j = 1;
 * j <= links1.size()-5; j++) { System.out.println(j);
 * System.out.println(links1.size());
 * System.out.println(links1.get(j).getText());
 * 
 * 
 * WebElement
 * c2=driver.findElement(By.xpath(properties.getProperty("v_pagenation_nxt")));
 * Thread.sleep(10000); c2.click(); Thread.sleep(9000); System.out.println(j
 * +"clicked");
 * 
 * 
 * }
 * 
 */

/*
 * Thread.sleep(7000);
 * 
 * driver.findElement(By.xpath(properties.getProperty("goto_top"))).click();//
 * go to top arrow Thread.sleep(5000);
 */
/*
 * � � � � �* JavascriptExecutor js = (JavascriptExecutor) driver; � � � � �*
 * js.executeScript("window.scrollTo(document.body.scrollHeight,600)"); � � � �
 * �* Thread.sleep(7000);
 * 
 * 
 * 
 * /* JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollTo(document.body.scrollHeight,500)");
 * Thread.sleep(3000);
 * 
 * 
 * 
 */
/*
 * driver.findElement(By.xpath(properties.getProperty("clck_tmplt2"))).click();
 * Thread.sleep(7000);
 * driver.findElement(By.xpath(properties.getProperty("clck_tmplt3"))).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath(properties.getProperty("clck_tmplt4"))).click();
 * Thread.sleep(5000);
 */
