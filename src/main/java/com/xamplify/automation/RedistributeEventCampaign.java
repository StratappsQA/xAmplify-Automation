package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RedistributeEventCampaign extends ExtentReport {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\Workspace2\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");// properties
																											// file
	final Logger logger = LogManager.getLogger(RedistributeEventCampaign.class);

	@Test
	public void hoverRedistributecampaigns_event() throws InterruptedException {
		Thread.sleep(7000);

		/*
		 * WebElement eve_ele = driver.findElement(By.linkText("Campaign")); Actions act
		 * = new Actions(driver); act.moveToElement(eve_ele).perform();
		 * driver.findElement(By.xpath(properties.getProperty(
		 * "partner_eve_redistribute_evehover"))).click(); // hover on // campaign
		 * Thread.sleep(6000);
		 * 
		 * driver.findElement(By.xpath(properties.getProperty(
		 * "partner_eve_redistribute_eventtab"))).click(); // click on // event // tab
		 * Thread.sleep(38000); logger.info("Event tab clicked successfully");
		 * 
		 * 
		 * driver.findElement(By.xpath(properties.getProperty(
		 * "partner_redistribute_eve_camp_preview"))).click(); // click on // preview
		 * Thread.sleep(6000);
		 * 
		 * logger.info("Event tab preview clicked successfully");
		 * 
		 * driver.findElement(By.xpath(properties.getProperty(
		 * "partner_redistribute_eve_camp_preview_close"))).click(); // click on
		 * 
		 * 
		 * 
		 * 
		 * 
		 * logger.info("Event tab preview closed successfully");
		 * 
		 * 
		 * driver.findElement(By.xpath(properties.getProperty(
		 * "partner_eve_redis_eve_download"))).click(); // click on // download // icon
		 * 
		 * logger.info("Event download clicked successfully");
		 * 
		 * Thread.sleep(4000); driver.findElement(By.xpath(properties.getProperty(
		 * "partner_eve_redis_eve_dwnld_html"))).click(); // click on // download html
		 * // icon logger.info("Event download html clicked successfully");
		 * Thread.sleep(4000); driver.findElement(By.xpath(properties.getProperty(
		 * "partner_eve_redis_viewdwnld_history"))).click(); // click on history
		 * 
		 * Thread.sleep(4000);
		 * logger.info("Event view download history clicked successfully");
		 * driver.findElement(By.xpath(properties.getProperty(
		 * "partner_eve_redis_viewdwnld_history_close"))).click(); // click on history
		 * 
		 * 
		 * Thread.sleep(4000);
		 */
		
		
		
		
		
		
		
		
		
driver.get("https://xamplify.co/home/campaigns/manage");

Thread.sleep(7000);

logger.info("Redirected to ManageCampaign successfully");







driver.findElement(By.xpath(properties.getProperty(
		  "partner_eve_redistribute_eventtab"))).click(); // click on // event // tab
		  Thread.sleep(38000); logger.info("Event tab clicked successfully");












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



/*
 * driver.findElement(By.xpath(properties.getProperty(
 * "partner_manage_eve_gearicon"))).click();
 * 
 * Thread.sleep(4000);
 * 
 * 
 * 
 * 
 * 
 * driver.findElement(By.xpath(properties.getProperty(
 * "partneracc_m_eve_sendpreviewemail"))).click(); Thread.sleep(4000);
 * logger.info("Clicked on the send preview email option successfully");
 * 
 * 
 * 
 * 
 * WebElement sndata=driver.findElement(By.xpath(properties.getProperty(
 * "partneracc_m_eve_senddata"))); sndata.sendKeys("agayatri@stratapps.com");
 * sndata.sendKeys(Keys.ENTER);
 * 
 * Thread.sleep(7000);
 * 
 * Actions pa = new Actions(driver);
 * pa.sendKeys(Keys.PAGE_DOWN).build().perform(); // scroll down the page
 * 
 * Thread.sleep(4000);
 * 
 * 
 * 
 * driver.findElement(By.xpath(properties.getProperty(
 * "partneracc_m_eve_sendbutton"))).click(); Thread.sleep(4000);
 * 
 * driver.findElement(By.xpath(properties.getProperty(
 * "partneracc_m_eve_closebutton"))).click(); Thread.sleep(9000);
 * 
 * logger.info("Clicked on the close option successfully");
 * 
 * 
 * driver.findElement(By.xpath(properties.getProperty(
 * "partner_manage_eve_gearicon"))).click();
 * 
 * Thread.sleep(4000);
 * 
 * 
 * driver.findElement(By.xpath(properties.getProperty(
 * "partneracc_m_eve_invitemore"))).click(); Thread.sleep(4000);
 * 
 * logger.info("Clicked on the InviteMore option successfully");
 * 
 * driver.findElement(By.xpath(properties.getProperty(
 * "partneracc_m_eve_invite_1stpage"))).click(); Thread.sleep(4000);
 * 
 * 
 * 
 * driver.findElement(By.xpath(properties.getProperty(
 * "partneracc_m_eve_invite_1stpage_send"))).click(); Thread.sleep(4000);
 * 
 * logger.
 * info("Clicked on send button for the Invite more contacts  successfully");
 * 
 * driver.findElement(By.xpath(properties.getProperty(
 * "partneracc_m_eve_invite_close"))).click(); Thread.sleep(4000);
 */

logger.info("Clicked on close button successfully");

Thread.sleep(7000);

driver.findElement(By.xpath(properties.getProperty("partner_manage_eve_gearicon"))).click();

Thread.sleep(4000);


driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_preview"))).click();

logger.info("Clicked on preview successfully");
Thread.sleep(4000);
Thread.sleep(7000);

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




driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned"))).click();

logger.info("Clicked on who havent opened tab  successfully");

Thread.sleep(5000);

driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned_remainder"))).click();

logger.info("Clicked on remainder icon  successfully");



Thread.sleep(6000);

driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned_remainder_subject"))).sendKeys("subject");


Thread.sleep(5000);

driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned_remainder_msg"))).sendKeys("Please open the email[Reamidner]");
Thread.sleep(5000);


driver.findElement(By.xpath(properties.getProperty("partneracc_m_eve_invites_whohaventopned_remainder_send"))).click();

logger.info("Clicked on Send Remainderbutton  successfully");

























	}
}
