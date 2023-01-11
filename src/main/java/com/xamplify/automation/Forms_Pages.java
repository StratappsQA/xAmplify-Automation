package com.xamplify.automation;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Forms_Pages {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Forms_Pages.properties");
	final Logger logger = LogManager.getLogger(Forms_Pages.class);

	@Test(priority = 88, enabled = true)
	public void design_general() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design_click")))//
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_general_form"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_general_li"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_general_input"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_input_send"))).sendKeys("yoga");

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_input_click"))).click();

		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("design_general_create")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_create_click")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_general_formname"))).clear();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_formname_send")))
				.sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_formname_full"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_formname_button"))).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design_general_formname_gen"))).click();

		Thread.sleep(2000);
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath(properties.getProperty("design_general_formname_index"))));
		se.selectByIndex(4);

		driver.findElement(By.xpath(properties.getProperty("design_general_formname_enter_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_formname_enter_click1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_formname_enter_click2"))).sendKeys("harish");

		driver.findElement(By.xpath(properties.getProperty("design_general_formname_entered_keys")))
				.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("design_general_form_delete"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_general_form_delete_yes"))).click();

		Thread.sleep(2000);

	}

	@Test(priority = 89, enabled = true)
	public void design_quiz() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_form"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_li"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_search_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_sendkeys"))).sendKeys("Default");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_sendkeys_enter"))).click();

		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("design_quiz_ele")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_create"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_form_name"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_form_email")))
				.sendKeys("harish" + System.currentTimeMillis());// 10 design_quiz_form_email
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_email_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_button1"))).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_li1"))).click();
		Thread.sleep(2000);
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath(properties.getProperty("designquiz_select"))));

		se.selectByIndex(4);

		driver.findElement(By.xpath(properties.getProperty("designquiz_input_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designquiz_input_click1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designquiz_input_sendkeys"))).sendKeys("harish");

		driver.findElement(By.xpath(properties.getProperty("design_quiz_enter"))).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_delete"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_quiz_delete_yes"))).click();

		Thread.sleep(2000);
	}

	@Test(priority = 90, enabled = true)
	public void design_survey() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_form"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_li"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_search_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_sendkeys"))).sendKeys("follow");

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_sendkeys_enter"))).click();

		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("design_survey_ele")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_create"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_form_name"))).clear();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_form_email")))
				.sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_email_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_button1"))).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_li1"))).click();
		Thread.sleep(2000);
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.xpath(properties.getProperty("designsurvey_select"))));
		se.selectByIndex(4);// 14 designsurvey_select

		driver.findElement(By.xpath(properties.getProperty("designsurvey_input_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designsurvey_input_click1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designsurvey_input_sendkeys"))).sendKeys("harish");

		driver.findElement(By.xpath(properties.getProperty("design_survey_enter"))).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_delete"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_survey_delete_yes"))).click();

		Thread.sleep(2000);

	}

	@Test(priority = 91, enabled = true)
	public void design_Manage_Forms_List() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_li"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_input"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_send"))).sendKeys("Regular");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_clickon"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_action"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_button1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_click1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_click2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_click3"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_click4"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_button2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_click5"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_click6"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_input1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_input1_clear")))

				.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_input1_sendkeys")))

				.sendKeys("#001");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(properties.getProperty("manage_forms_list_input_edit")));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_input1_label")))

				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_update_button"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_forms_list_update_yes"))).click();

	}

	@Test(priority = 92, enabled = true)
	public void design_Manage_Forms_List_quiz() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_click")))

				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_create")))

				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_sendkeys"))).sendKeys("quiz");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_sendkeysenter")))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_listclick1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_button1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_listclick2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_button2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_listclick3"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_click4"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_button3"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_button4"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_click5"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_inputclick")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_inputclear")))

				.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_input_colour")))

				.sendKeys("#001");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_js")));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_label")))

				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_savebutton"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_quiz_savebutton_yes"))).click();

	}

	@Test(priority = 93, enabled = true)
	public void design_Manage_Forms_List_survey() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_click"))).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_create"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_sendkeys"))).sendKeys("survey");

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_sendkeysenter")))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_listclick1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_button1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_listclick2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_button2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_listclick3"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_click4"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_button3"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_button4"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_click5"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_inputclick")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_inputclear")))

				.clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_input_colour")))

				.sendKeys("#001");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_js")));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_label")))

				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_savebutton"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_List_survey_savebutton_yes"))).click();

	}

	@Test(priority = 94, enabled = true)
	public void design_Manage_Forms_Grid_Regular() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_li"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_input"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_input_sendkeys")))
				.sendKeys("regular");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_input_sendkeysenter")))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele1 = driver
				.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_hover")));

		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_hover_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_hover_button"))).click();

		Thread.sleep(2000);
		action1.moveToElement(ele1).perform();
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_button2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_button2click"))).click();

		Thread.sleep(2000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_button3click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_Regular_button4click"))).click();

	}

	@Test(priority = 95, enabled = true)
	public void design_Manage_Forms_Grid_quiz() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_ui"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_click1")))

				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_input")))

				.sendKeys("quiz");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_input_enter")))

				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_hover")));

		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_click2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_button1"))).click();

		Thread.sleep(2000);
		action1.moveToElement(ele1).perform();
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_button2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_button3"))).click();

		Thread.sleep(2000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_button4"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_quiz_button5"))).click();

	}

	@Test(priority = 96, enabled = true)
	public void design_Manage_Forms_Grid_survey() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_ui"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_click1")))

				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_input")))

				.sendKeys("survey");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_input_enter")))

				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_hover")));

		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_click2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_button1"))).click();

		Thread.sleep(2000);
		action1.moveToElement(ele1).perform();
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_button2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_button3"))).click();

		Thread.sleep(2000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_button4"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("design_Manage_Forms_Grid_survey_button5"))).click();

	}

	@Test(priority = 97, enabled = true)
	public void design_Manage_Forms_Folder_Gridview_Regular() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click")))

				.click();
		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty(

				"Folder_Gridview_Regular_click1")));
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click3"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click4"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click5"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click6"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click7"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click8"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_Regular_click9"))).click();

	}

	@Test(priority = 98, enabled = true)
	public void design_Manage_Forms_Folder_Gridview_quiz() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_quiz_click")))

				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_quiz_click1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_quiz_button1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_quiz_click2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_quiz_button2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_quiz_click3"))).click();

		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_quiz_button3"))).click();

	}

	@Test(priority = 99, enabled = true)
	public void design_Manage_Forms_Folder_Gridview_survey() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_survey_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_survey_click1"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_survey_button1"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_survey_click2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_survey_button2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_survey_click3"))).click();
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_survey_button3")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Folder_Gridview_survey_button3"))).click();

	}

	@Test(priority = 100, enabled = true)
	public void design_Manage_Forms_Folder_Gridview_Gridview_Regular() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular_click")))

				.click();
		Thread.sleep(2000);

		WebElement ele1 = driver
				.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular_hover")));

		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular_click1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular_button1"))).click();

		Thread.sleep(3000);

		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular_click2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular_button2"))).click();

		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular_click3"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_Regular_button3"))).click();

	}

	@Test(priority = 101, enabled = true)
	public void design_Manage_Forms_Folder_Gridview_Gridview_quiz() throws InterruptedException {
		Thread.sleep(15000);

		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz_click")))

				.click();
		Thread.sleep(3000);

		WebElement ele1 = driver
				.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz_hover")));

		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz_click1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz_button1"))).click();

		Thread.sleep(3000);

		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz_click2"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz_button2"))).click();

		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz_click3"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_quiz_button3"))).click();

	}

	@Test(priority = 102, enabled = true)
	public void design_Manage_Forms_Folder_Gridview_Gridview_survey() throws InterruptedException {
		Thread.sleep(15000);

		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_click1")))

				.click();
		Thread.sleep(3000);

		WebElement ele1 = driver
				.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_click2")));

		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_click3"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_button1"))).click();

		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_click4"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_button2"))).click();

		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_click5"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_button3"))).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_click6")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_button4"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_Gridview_Gridview_survey_button5"))).click();

	}

	@Test(priority = 103, enabled = true)
	public void design_Manage_Forms_Folder_list_view_list_view_regular() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_Folder_list_view_list_view_regular_click")))

				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_Folder_list_view_list_view_regular_click1")))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_Folder_list_view_list_view_regular_button1")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_Folder_list_view_list_view_regular_click2")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_Folder_list_view_list_view_regular_button2")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_Folder_list_view_list_view_regular_click3")))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Manage_Forms_Folder_list_view_list_view_regular_button3")))
				.click();

	}

	@Test(priority = 104, enabled = true)
	public void design_Manage_Forms_Folder_list_view_list_view_quiz() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_click")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_click1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_click2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_click3")))

				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_actionsclick")))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_button1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_actionsclick1")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_button2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_actionsclick2")))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_quiz_button3"))).click();

	}

	@Test(priority = 105, enabled = true)
	public void design_Manage_Forms_Folder_list_view_list_view_Survey() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_click"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_click1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_click2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_click3"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_actions_click1")))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_actions_button1")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_actions_click2")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_actions_button2")))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_actions_click3")))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_list_view_survey_actions_button3")))
				.click();
	}

	@Test(priority = 106, enabled = true)
	public void design_Manage_Forms_Folder_list_view_Grid_view_regular() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_click")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_click1")))

				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_click2"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_click3")))

				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_clickli")))

				.click();
		Thread.sleep(2000);

		WebElement ele1 = driver
				.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_hover")));

		Actions action1 = new Actions(driver);

		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_click4"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_button1")))
				.click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_click5"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_button2")))
				.click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_click6"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_regular_button3")))
				.click();

	}

	@Test(priority = 107, enabled = true)
	public void design_Manage_Forms_Folder_list_view_Grid_view_quiz() throws InterruptedException {
		Thread.sleep(25000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_click1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_click2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_click3"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_clickli"))).click();
		Thread.sleep(3000);

		WebElement ele1 = driver
				.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_hover")));
		Actions action1 = new Actions(driver);

		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_click4"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_button1"))).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_click5"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_button2"))).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_click6"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_quiz_button3"))).click();

	}

	@Test(priority = 108, enabled = true)
	public void design_Manage_Forms_Folder_list_view_Grid_view_survey() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_click1"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_click2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_click3"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_clickli"))).click();
		Thread.sleep(3000);

		WebElement ele1 = driver
				.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_hover")));
		Actions action1 = new Actions(driver);

		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_click4"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_button1"))).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_click5"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_button2"))).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_click6"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("Forms_Folder_list_view_Grid_view_survey_button3"))).click();

	}

	@Test(priority = 109, enabled = true)
	public void design_reg_public() throws InterruptedException {
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("designPages_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_click"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("regular_tab_click"))).click();
		Thread.sleep(3000);
		//

		driver.findElement(By.xpath(properties.getProperty("regular_tab_click"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("create_regpage_enter"))).sendKeys("demo");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("create_regpage_enterclick"))).click();
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath(properties.getProperty("create_repage_hover")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("create_repage_hoverclick"))).click();

		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("create_regpage_createclick"))).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("create_regpage_switch"))).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("create_regpage_nameclick"))).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath(properties.getProperty("create_regpage_nameclickenter")))
				.sendKeys("harishreg" + System.currentTimeMillis());
		Thread.sleep(3000);
		Select se = new Select(driver.findElement(By.xpath("//div/select[@id='pageType']")));
        Thread.sleep(2000);
		// Select the option by index
		se.selectByVisibleText("PUBLIC");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("create_regpage_savebutton"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("create_regpage_liclick"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("create_sort_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("create_sort_enter"))).sendKeys("harish");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("create_sort_enterclick"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("create_sort_actions"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("create_reg_delete"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("create_reg_delete_yes"))).click();
		Thread.sleep(3000);

	}

	@Test(priority = 110, enabled = true)
	public void design_reg_private() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("designPages_private_click"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_private_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_private_input_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_private_input_enter"))).sendKeys("audy");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_private_input_click2"))).click();
		Thread.sleep(3000);
		//
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("designPages1_private_hover")));
		Thread.sleep(2000);

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("designPages1_private_create_click"))).click();

		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_private_save_click"))).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("designPages1_private_saveyes_click"))).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_enter")))
				.sendKeys("harishreg" + System.currentTimeMillis());
		Thread.sleep(2000);
		Select se = new Select(driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_select"))));

		// Select the option by index
		se.selectByVisibleText("PRIVATE");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_save"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_savebuttonyes"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_sort_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_sort_send"))).sendKeys("harish");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_sort_sendenter")))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_sort_sendclick"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_sort_sendbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designPages1_tempname_sort_sendbuttonyes"))).click();
		Thread.sleep(3000);

	}

	@Test(priority = 111, enabled = true)
	public void design_cobranded_private() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("designcoPages_private_click"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_private_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_private_input_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_private_input_enter")))
				.sendKeys("test saving");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_private_input_click2"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("designcopage_private_hover")));
		Thread.sleep(2000);

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("designcopage_private_create_click"))).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_private_save_click"))).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_private_saveyes_click"))).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_enter")))
				.sendKeys("harishreg" + System.currentTimeMillis());
		Thread.sleep(2000);
		Select se = new Select(driver.findElement(By.xpath(properties.getProperty("designcopage_copage_select"))));

		// Select the option by index
		se.selectByVisibleText("PRIVATE");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_save"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_savebuttonyes"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_sort_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_sort_send"))).sendKeys("harish");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_sort_sendenter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_sort_sendclick"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_sort_sendbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("designcopage_copage_sort_sendbuttonyes"))).click();
		Thread.sleep(3000);

	}

	@Test(priority = 112, enabled = true)
	public void design_cobranded_public() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_click"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_publicpage_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_input_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_input_enter"))).sendKeys("test saving");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_input_click2"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("cobranded_public_hover")));
		Thread.sleep(2000);

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_create_click"))).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_save_click"))).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_saveyes_click"))).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("cobranded_public_copage_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_copage_enter")))
				.sendKeys("harishreg" + System.currentTimeMillis());
		Thread.sleep(2000);
		Select se = new Select(driver.findElement(By.xpath(properties.getProperty("cobranded_public_copage_select"))));

		// Select the option by index
		se.selectByVisibleText("PUBLIC");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_save"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_savebuttonyes"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_sort_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_sort_send"))).sendKeys("harish");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_sort_sendenter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_sort_sendclick"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_sort_sendbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("cobranded_public_sort_sendbuttonyes"))).click();

	}

	@Test(priority = 113, enabled = true)
	public void Manage_Regular_public() throws InterruptedException {
		Thread.sleep(20000);

		driver.findElement(By.xpath(properties.getProperty("manage_regpub_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_sortclick"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_sortsend"))).sendKeys("regular");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_sortenter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_actionsbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_actions2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_actionsclose"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_actions3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_actionssave"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpub_actionssaveyes"))).click();

	}

	@Test(priority = 114, enabled = true)
	public void Manage_Regular_private() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_sortclick"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_sortsend"))).sendKeys("regularprivate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_sortenter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_actionsbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_actions2"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_actionsclose"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_actions3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_actionssave"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_regpri_actionssaveyes"))).click();
	}

	@Test(priority = 115, enabled = true)
	public void Manage_Regular_Cobranded_private() throws InterruptedException {
		Thread.sleep(20000);

		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_sortclick"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_sortsend")))
				.sendKeys("Cobranded private");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_sortenter"))).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_actionsbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_actions2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_actionsclose"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_actions3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_actionssave"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpri_actionssaveyes"))).click();
	}

	@Test(priority = 116, enabled = true)
	public void Manage_Regular_Cobranded_public() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_sortclick"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_sortsend"))).sendKeys("cobranded public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_sortenter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_actionsbutton"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_actions2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_actionsclose"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_actions3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_actionssave"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manage_cobrandpub_actionssaveyes"))).click();

	}

	@Test(priority = 117, enabled = true)
	public void Gridview_Manage_regular_public() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_clear"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_send"))).sendKeys("regular public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("gridreg_pub_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_action1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_button1"))).click();
		Thread.sleep(4000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_action2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_button2"))).click();

		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_button3"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pub_update"))).click();

	}

	@Test(priority = 118, enabled = true)
	public void Gridview_Manage_regular_private() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_clear"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_send"))).sendKeys("regularprivate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("gridreg_pri_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_action1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_button1"))).click();
		Thread.sleep(2000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_action2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_button2"))).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_button3"))).click();
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_pri_update"))).click();

	}

	@Test(priority = 119, enabled = true)
	public void Gridview_Manage_Cobranded_public() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_clear"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_send"))).sendKeys("cobranded public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_button1"))).click();
		Thread.sleep(4000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_action2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_button2"))).click();

		Thread.sleep(4000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_button3"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copublic_update"))).click();

	}

	@Test(priority = 120, enabled = true)
	public void Gridview_Manage_Cobranded_private() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_clear"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_send"))).sendKeys("cobranded private");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_button1"))).click();
		Thread.sleep(3000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_action2"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_button2"))).click();

		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_button3"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridreg_copriv_update"))).click();
	}

	@Test(priority = 121, enabled = true)
	public void Folder_Gridview_Manage_regular_public() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_click"))).click();
		Thread.sleep(5000);

		WebElement ele = driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_hover_click"))).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_sort_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_sort_send")))
				.sendKeys("regular public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_sort_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_button1"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_action2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_close"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_action3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_savebutton"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_public_savebutton_yes"))).click();

	}

	@Test(priority = 122, enabled = true)
	public void Folder_Gridview_Manage_regular_private() throws InterruptedException {
		Thread.sleep(20000);

		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_click"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_send"))).sendKeys("regularprivate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_button1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_actions2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_button2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_actions3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_savebutton"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grireg_pri_savebutton_yes"))).click();

	}

	@Test(priority = 123, enabled = true)
	public void Folder_Gridview_Manage_cobranded_public() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_click"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_send"))).sendKeys("cobranded public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_button1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_actions2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_button2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_actions3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_savebutton"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pub_savebutton_yes"))).click();

	}

	@Test(priority = 124, enabled = true)
	public void Folder_Gridview_Manage_cobranded_private() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_click"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_send"))).sendKeys("Cobranded private");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_actions1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_button1"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_actions2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_button2"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_actions3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_savebutton"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("folder_grico_pri_savebutton_yes"))).click();

	}

	@Test(priority = 125, enabled = true)
	public void Folder_Gridview_grid_Manage_regular_public() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_clear"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_send"))).sendKeys("regular public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_button1"))).click();
		Thread.sleep(4000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_action2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_button2"))).click();

		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_save"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pub_saveyes"))).click();

	}

	@Test(priority = 126, enabled = true)
	public void Folder_Gridview_grid_Manage_regular_private() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_clear"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_send"))).sendKeys("regularprivate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_button1"))).click();
		Thread.sleep(4000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_action2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_button2"))).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_save"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_reg_pri_saveyes"))).click();
	}

	@Test(priority = 127, enabled = true)
	public void Folder_Gridview_grid_Manage_regular_cobrandedpublic() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_clear"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_send"))).sendKeys("cobranded public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_button1"))).click();
		Thread.sleep(4000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_action2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_button2"))).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_save"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pub_saveyes"))).click();

	}

	@Test(priority = 128, enabled = true)
	public void Folder_Gridview_grid_Manage_regular_cobrandedprivate() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_clear"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_send"))).sendKeys("cobranded private");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_action1"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_button1"))).click();
		Thread.sleep(4000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_action2"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_button2"))).click();

		Thread.sleep(4000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_save"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("gri_gri_co_pri_saveyes"))).click();

	}

	@Test(priority = 129, enabled = true)
	public void Folder_listview_grid_Manage_regular_regularpublic() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_click1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_expand"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_search"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_search_send"))).sendKeys("regular public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_search_send"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_button1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_action2"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_button2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_action3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_button3"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pub_update"))).click();

	}

	@Test(priority = 130, enabled = true)
	public void Folder_listview_grid_Manage_regular_regularprivate() throws InterruptedException {
		Thread.sleep(20000);

		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_click1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_expand"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_search"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_search_send"))).sendKeys("regularprivate");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_search_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_button1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_action2"))).click();//
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_button2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_action3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_button3"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_reg_pri_update"))).click();

	}

	@Test(priority = 131, enabled = true)
	public void Folder_listview_grid_Manage_regular_cobrandedpublic() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub"))).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_click1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_expand"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_search"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_search_send")))
				.sendKeys("cobranded public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_search_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_button1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_action2"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_button2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_action3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_button3"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pub_update"))).click();

	}

	@Test(priority = 132, enabled = true)
	public void Folder_listview_grid_Manage_regular_cobrandedprivate() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_click1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_expand"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_search"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_search_send")))
				.sendKeys("cobranded private");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_search_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_action1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_button1"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_action2"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_button2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_action3"))).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_button3"))).click();
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("list_gri_co_pri_update"))).click();

	}

	@Test(priority = 133, enabled = true)
	public void Folder_gridview_grid_Manage_regular_public() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_click1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_clickongrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_clickingrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_search"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_search_send")))
				.sendKeys("regular public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_search_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_action1"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_button1"))).click();
		Thread.sleep(4000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_action2"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_button2"))).click();

		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_save"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pub_update"))).click();

	}

	@Test(priority = 134, enabled = true)
	public void Folder_gridview_grid_Manage_regular_private() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_click1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_clickongrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_clickingrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_search"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_search_send")))
				.sendKeys("regularprivate");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_search_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_action1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_button1"))).click();
		Thread.sleep(2000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_action2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_button2"))).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_save"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_reg_pri_update"))).click();

	}

	@Test(priority = 135, enabled = true)
	public void Folder_gridview_grid_Manage_cobranded_public() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_click1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_clickongrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_clickingrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_search"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_search_send")))
				.sendKeys("cobranded public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_search_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_action1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_button1"))).click();
		Thread.sleep(2000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_action2"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_button2"))).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_save"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pub_update"))).click();

	}

	@Test(priority = 136, enabled = true)
	public void Folder_gridview_grid_Manage_cobranded_private() throws InterruptedException {
		Thread.sleep(20000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_click1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_clickongrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_tab"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_clickingrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_search"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_search_send")))
				.sendKeys("cobranded private");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_search_enter"))).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_hover")));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_action1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_button1"))).click();
		Thread.sleep(2000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_action2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_button2"))).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_action3"))).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_save"))).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("grid_grid_co_pri_update"))).click();

	}

}
