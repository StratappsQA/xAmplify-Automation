package com.xamplify.automation;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.Test;

public class Templates extends ExtentReportsClass{

	private static final TimeUnit Seconds = null;
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile
			.readPropertyFile("src/main/resources/Templates.properties");
	final Logger logger = LogManager.getLogger(Templates.class);

	@Test(priority = 44, enabled = true)
	public void design() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designtemplates"))).click();

	}

	@Test(priority = 45, enabled = true)
	public void design1() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("emailfilter"))).click();

		driver.findElement(By.xpath(properties.getProperty("designeamil_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designeamil_search_sendkeys"))).sendKeys("Basic");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designeamil_search_enter"))).click();
		Thread.sleep(5000);

		WebElement ele = driver.findElement(By.xpath(properties.getProperty("designeamil_hover")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("designeamil_hover_click"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designeamil_save"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designeamil_name_click"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designeamil_name_send")))
				.sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designeamil_save1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("emailtemplate_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("emailtemplate_sendkeys"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("emailtemplate_sendkeys_click"))).sendKeys("harish");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("emailtemplate_actions"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("emailtemplate_delete"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("emailtemplate_delete_yes"))).click();
	}

	@Test(priority = 46, enabled = true)
	public void video() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("designup"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designtemplate"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_video"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_video_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_video_send"))).sendKeys("simple");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_video_click"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("design_video_hover")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("design_video_create"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_video_save"))).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_video_name_click"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_video_name_send")))
				.sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_video_save1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_video_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_video_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_video_send"))).sendKeys("harish");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("video_template_actions"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("video_template_delete"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("video_template_delete_yes"))).click();
	}

	@Test(priority = 47, enabled = true)
	public void emailcobranding() throws InterruptedException {
		Thread.sleep(15000);

		driver.findElement(By.xpath(properties.getProperty("designup"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designtemplate"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding_input"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding_input"))).sendKeys("NewsLetter2");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding_searchclick"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("Email_cobranding_hover")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding_create"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding_save"))).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding_name"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding_name")))
				.sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Email_cobranding_save1"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_emailcobranding_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_emailcobranding_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_emailcobranding_send"))).sendKeys("harish");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_emailcobranding_inputclick"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_emailcobranding_delete"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_emailcobranding_deleteyes"))).click();

	}

	@Test(priority = 48, enabled = true)
	public void videocobranding() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designtemplate"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_videoco_cobranding_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_videoco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_videoco_search"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_videoco_search_click"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("design_videoco_hover")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("design_videoco_create"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_videoco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_videoco_name"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_videoco_name")))
				.sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_videoco_save1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_videoco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_videoco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_videoco_search"))).sendKeys("harish");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_videoco_click"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_videoco_actions"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_videoco_deleteyes"))).click();

	}

	@Test(priority = 49, enabled = true)
	public void event() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designtemplate"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_event_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_event_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_event_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_event_search_click"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("design_event_hover")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("design_event_create"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_event_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_event_name"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_event_name_send")))
				.sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_event_save1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_event_input"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_event_send"))).sendKeys("harish");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_event_click"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_event_action"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_event_delete"))).click();

	}

	@Test(priority = 50, enabled = true)
	public void eveco() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("designtemplate"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_eventco_tab"))).click();

		driver.findElement(By.xpath(properties.getProperty("design_eventco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_eventco_search"))).sendKeys("eve");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_eventco_search_click"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("design_eventco_hover")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("design_eventco_create"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("design_eventco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_namein"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_namein")))
				.sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_save"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_search_send"))).sendKeys("harish");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_search_click"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_actions"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_deleteyes"))).click();

	}

	@Test(priority = 51, enabled = true)
	public void managetemplates() throws InterruptedException {

		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_templates"))).click();
	}

	@Test(priority = 52, enabled = true)
	public void managetemplates_Email() throws InterruptedException {
		Thread.sleep(10000);
		managetemplates();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_search"))).sendKeys("Basic");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_close1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_action2"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_update"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_action3"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managetemplates_close3"))).click();
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.xpath(properties.getProperty("managetemplates_select"))));
		dropdown.selectByVisibleText("Name (A-Z)");

	}

	@Test(priority = 53, enabled = true)
	public void managetemplates_video() throws InterruptedException {
		Thread.sleep(10000);
		managetemplates();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_search"))).sendKeys("video1");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_close1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_update"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_video_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_preview"))).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideo_templates_preview_close"))).click();

	}

	@Test(priority = 54, enabled = true)
	public void Email_cobranding() throws InterruptedException {

		Thread.sleep(10000);
		managetemplates();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_search"))).sendKeys("email");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_close1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_update"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_emailcobranding_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageemailco_template_preview_close"))).click();
	}

	@Test(priority = 55, enabled = true)
	public void Video_Cobranding() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_templates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_search"))).sendKeys("vid");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_close1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_update"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_videoco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("managevideoco_template_preview_close"))).click();
	}

	@Test(priority = 56, enabled = true)
	public void Event() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_templates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_close1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_update"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_event_tab"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("manageevent_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageevent_close"))).click();
	}

	@Test(priority = 57, enabled = true)
	public void Event_cobranding() throws InterruptedException {

		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_templates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_search"))).sendKeys("eventco");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_close1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_update"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_eventco_tab"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("manageeventco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manageeventco_preview_close"))).click();
	}

	@Test(priority = 58, enabled = true)
	public void gridview_email() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailtab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailsearch"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailsearch"))).sendKeys("Email");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailsearch_click"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailbar")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailspam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailspam_close"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailpreview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailpreview_close"))).click();

		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailedit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailsave"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailupdate"))).click();

	}

	@Test(priority = 59, enabled = true)
	public void gridview_video() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videotab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videosearch"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videosearch"))).sendKeys("video1");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videosearch_click"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videobar")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoaction1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoclose1"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videopreview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videopreview_close"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoedit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videosave"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoupdate"))).click();

	}

	@Test(priority = 60, enabled = true)
	public void gridview_Email_cobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_tab"))).click();

		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_bar")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_actions1"))).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_close1"))).click();
		Thread.sleep(8000);
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_preview_close"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_preview_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_emailco_update"))).click();

	}

	@Test(priority = 61, enabled = true)
	public void gridview_video_cobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_tab"))).click();

		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_bar")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_close1"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_preview_close"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_edit"))).click();

		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_videoco_update"))).click();

	}

	@Test(priority = 62, enabled = true)
	public void gridview_Event() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventtab"))).click();

		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_event_bar")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_event_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_event_close1"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_event_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_event_preview_close"))).click();
		Thread.sleep(5000);

		action.moveToElement(ele).perform();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_event_edit"))).click();

		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_event_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_event_update"))).click();

	}

	@Test(priority = 63, enabled = true)
	public void gridview_Event_Cobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_tab"))).click();

		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_bar")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_actions1"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_close1"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_preview_close"))).click();
		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid_eventco_update"))).click();

	}

	@Test(priority = 64, enabled = true)
	public void folder_gridview() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("folder_grid_preview")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_preview_click"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_emailtab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_emailsearch"))).click();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_emailsearch"))).sendKeys("Basic");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_emailsearch"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_close1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_email_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_email_preview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_email_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_email_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_email_update"))).click();
		Thread.sleep(15000);


	}

	@Test(priority = 65, enabled = true)
	public void folder_gridview_video() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videotab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videosearch"))).click();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videosearch"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videosearch"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoaction1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoclose1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videopreview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videopreview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videopreview_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videopreview_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_video_update"))).click();
		Thread.sleep(5000);

	}

	@Test(priority = 66, enabled = true)
	public void folder_gridview_EmailCobranding() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_search"))).click();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_search"))).sendKeys("email");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_close1"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_preview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_emailco_update"))).click();
		Thread.sleep(10000);

	}

	@Test(priority = 67, enabled = true)
	public void folder_gridview_VideoCobranding() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_search"))).click();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_search"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_close1"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_preview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_videoco_update"))).click();
		Thread.sleep(10000);

	}

	@Test(priority = 68, enabled = true)
	public void folder_gridview_Event() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_search"))).click();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_close1"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_preview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_event_update"))).click();
		Thread.sleep(10000);

	}

	@Test(priority = 69, enabled = true)
	public void folder_gridview_EventCobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_search"))).click();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_close1"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_preview_close"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_list_eventco_update"))).click();

		Thread.sleep(10000);

	}

	@Test(priority = 70, enabled = true)
	public void folder_gridview_grid_Email() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid"))).click();
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("folder_grid_preview")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_preview_click"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailtab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_search"))).sendKeys("email");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_close1"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_edit"))).click();

		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_email_update"))).click();

	}

	@Test(priority = 71, enabled = true)
	public void folder_gridview_grid_video() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video"))).click();
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_search"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_close1"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_edit"))).click();

		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_video_update"))).click();

	}

	@Test(priority = 72, enabled = true)
	public void folder_gridview_grid_EmailCobranding() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_tab"))).click();
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_search"))).sendKeys("email");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_spam_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_edit"))).click();

		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_emailco_update"))).click();

	}

	@Test(priority = 73, enabled = true)
	public void folder_gridview_grid_VideoCobranding() throws InterruptedException {
		Thread.sleep(15000);

		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_tab"))).click();
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_search"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_close1"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_edit"))).click();

		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_videoco_update"))).click();

	}

	@Test(priority = 74, enabled = true)
	public void folder_gridview_grid_Event() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_event_update"))).click();

	}

	@Test(priority = 75, enabled = true)
	public void folder_gridview_grid_EventCobranding() throws InterruptedException {
		Thread.sleep(10000);

		driver.findElement(By.xpath(properties.getProperty("mangetemplates_grid"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid_grid_eventco_update"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grid"))).click();
	}

	@Test(priority = 76, enabled = true)
	public void folder_gridview_list_Email() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailtab"))).click();
		Select dropdown = new Select(driver.findElement(By.xpath(properties.getProperty("folder_listview_select"))));
		dropdown.selectByVisibleText("Name (Z-A)");
		//

		driver.findElement(By.xpath(properties.getProperty("folder_listview_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_search"))).sendKeys("Basic");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_email_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_email_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_email_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_email_preview_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_email_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_email_save"))).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_email_update"))).click();
		Thread.sleep(10000);

	}

	@Test(priority = 77, enabled = true)
	public void folder_gridview_list_Video() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_tab"))).click();
		Thread.sleep(5000);
		//
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_search"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_spam_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_preview_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_video_update"))).click();
		Thread.sleep(5000);

	}

	@Test(priority = 78, enabled = true)
	public void folder_gridview_list_EmailCobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_search"))).sendKeys("email");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_spam_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_preview_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_save"))).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_emailco_update"))).click();
		Thread.sleep(5000);

	}

	@Test(priority = 79, enabled = true)
	public void folder_gridview_list_VideoCobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_search"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_spam_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_preview_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_save"))).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_videoco_update"))).click();
		Thread.sleep(5000);

	}

	@Test(priority = 80, enabled = true)
	public void folder_gridview_list_Event() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);

		////
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_spam_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_preview_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_save"))).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_event_update"))).click();
		Thread.sleep(10000);

	}

	@Test(priority = 81, enabled = true)
	public void folder_gridview_list_EventCobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		//

		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_spam_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_preview_close"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_edit"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_save"))).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_listview_eventco_update"))).click();
		Thread.sleep(5000);
	}

	@Test(priority = 82, enabled = true)
	public void folder_gridview_list_grid_Email() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailtab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_search"))).sendKeys("email");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_spam_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_email_update"))).click();
	}

	@Test(priority = 83, enabled = true)
	public void folder_gridview_list_grid_Video() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_search"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_spam_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_video_update"))).click();

	}

	@Test(priority = 84, enabled = true)
	public void folder_gridview_list_grid_EmailCobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_search"))).sendKeys("email");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_search")))
				.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_spam_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_emailco_update"))).click();

	}

	@Test(priority = 85, enabled = true)
	public void folder_gridview_list_grid_videoCobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview"))).click();
		Thread.sleep(5000);
		//
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_search"))).sendKeys("video");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_search")))
				.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_spam_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_videoco_update"))).click();

	}

	@Test(priority = 86, enabled = true)
	public void folder_gridview_list_grid_Event() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview"))).click();
		Thread.sleep(5000);
		//
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_search"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_search"))).sendKeys("event");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_spam_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_event_update"))).click();

	}

	@Test(priority = 87, enabled = true)
	public void folder_gridview_list_grid_EventCobranding() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("design1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mangetemplates"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folderlist"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("expand"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview"))).click();
		Thread.sleep(5000);
		//
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_tab"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_search"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_search"))).sendKeys("event");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_search")))
				.sendKeys(Keys.ENTER);
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_hover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_spam"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_spam_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_preview_close"))).click();
		Thread.sleep(5000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_edit"))).click();
		Thread.sleep(50000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_save"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_list_gridview_eventco_update"))).click();
	}

}

