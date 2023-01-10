package com.xamplify.automation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class shareleads {

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\shareleads.properties");
	final Logger logger = LogManager.getLogger(shareleads.class);

	@Test(priority = 34, enabled = true)
	public void movingtoshareleads() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("hover_shareleads")));//1

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("click_shareleads")))//2
				.click();
	}

	@Test(priority = 35, enabled = true)
	public void addoneatatime() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("click_in_listname"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("click_in_listname1"))).sendKeys("harish" + System.currentTimeMillis()); 
		driver.findElement(By.xpath(properties.getProperty("click_on_one_at_a_time"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("enter_email"))).click();
		driver.findElement(By.xpath(properties.getProperty("enter_email_sendkeys_one_at_a_time")))
				.sendKeys("m.harish" + System.currentTimeMillis() + "@getnada.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("enter_firstname_one_at_time"))).sendKeys("harry");
		driver.findElement(By.cssSelector(properties.getProperty("enter_last_name_one_at_time"))).sendKeys("potter");
		driver.findElement(By.cssSelector(properties.getProperty("one_at_a_time_company"))).sendKeys("company");
		
		driver.findElement(By.cssSelector(properties.getProperty("one_at_a_time_jobtitle"))).sendKeys("jobtitle");
		driver.findElement(By.cssSelector(properties.getProperty("one_at_a_time_address"))).sendKeys("Address");
		driver.findElement(By.cssSelector(properties.getProperty("one_at_a_time_state"))).sendKeys("state");

		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_mobile_number"))).sendKeys("9876543210");
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_country"))).click();
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_ind")))
				.sendKeys("india");
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_country_enter")))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_Hyderabad"))).sendKeys("Hyderabad");
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_Legalbasis"))).click();
																							
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_Legalbasis_send")))
				.sendKeys("Legitimate interest - prospect/lead");

		WebElement textbox = driver.findElement(By.xpath(properties.getProperty("one_at_a_time_Legalbasis_enter")));
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(properties.getProperty("one_at_a_time_zip"))).sendKeys("567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_zip_enter"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_samp"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("one_at_a_time_last_button"))).click();
	}

	@Test(priority = 36, enabled = true)
	public void addoneatatime1() throws InterruptedException {
		Thread.sleep(6000);
		movingtoshareleads();
	}

	@Test(priority = 37, enabled = true)
	public void Copy_list_from_clipboard() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_click"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_listname"))).click();
		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_sendkeys")))
				.sendKeys("harishleadlist" + System.currentTimeMillis());
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_click"))).click();  
		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_legalbasis")))
				.sendKeys("Legitimate interest - prospect/lead");//5 
		WebElement textbox1 = driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_textbox"))); 
		textbox1.sendKeys(Keys.ENTER);

		Select delimiter1 = new Select(driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_tab")))); 
		delimiter1.selectByValue("TabSeperated");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_js"))).click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript(
				"document.getElementById('copyFromclipTextArea').value='hari	M	Stratapps	QAAutomationEngineer	';");
		Thread.sleep(5000);
		driver.findElement(By.id(properties.getProperty("copy_from_clipboard_contact_send")))
				.sendKeys(System.currentTimeMillis() + "harish@stratapps.com	");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_button1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_button2"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("copy_from_clipboard_contact_last_button"))).click();

	}

	@Test(priority = 38, enabled = true)
	public void addcsv() throws InterruptedException, IOException {
		Thread.sleep(5000);
		movingtoshareleads();
		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("csv_contact_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("csv_send"))).sendKeys("Harish" + System.currentTimeMillis());
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("csv_input"))).sendKeys("D:\\Selenium\\files\\shareleads.csv");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("csv_input_send_input"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("csv_input_send"))).sendKeys("Not applicable");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("csv_sendkeys"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("csv_click_save"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("csv_click_accept"))).click();

	}

	@Test(priority = 39, enabled = true)
	public void addoneatatime2() throws InterruptedException {
		movingtoshareleads();
	}

	@Test(priority = 40, enabled = true)
	public void Copy_list_from_clipboard_commaseperated() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(4000);

		

		driver.findElement(By.xpath(properties.getProperty("commaseperated_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("commaseperated_sendkeys"))).sendKeys("harish" + System.currentTimeMillis());

		driver.findElement(By.xpath(properties.getProperty("commaseperated_clickintext"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("commaseperated_input"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("commaseperated_legalbasis")))
				.sendKeys("Legitimate interest - prospect/lead");// enter data for legal basis
		WebElement textbox1 = driver.findElement(By.xpath(properties.getProperty("commaseperated_texbox")));
		textbox1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		Select delimiter2 = new Select(driver.findElement(By.xpath(properties.getProperty(
				"commaseperated_delimiter"))));
		delimiter2.selectByValue("CommaSeperated");

		driver.findElement(By.xpath(properties.getProperty("commaseperated_send_data")))
				.sendKeys(("harish,M,Stratapps,QAAutomationEngineer,"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("commaseperated_mailid")))
				.sendKeys(("harish") + "_" + System.currentTimeMillis());
		
		driver.findElement(By.xpath(properties.getProperty("commaseperated_mail"))).sendKeys(("@getnada.com"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("commaseperated_verify"))).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("commaseperated_submit"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("commaseperated_accept"))).click();

	}

	@Test(priority = 41, enabled = true)
	public void manage_shareleads() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver
				.findElement(By.xpath(properties.getProperty("manageshareleads_hover")));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath(properties.getProperty("manageshareleads_click"))).click();
	}

	@Test(priority = 42, enabled =true)
	public void manage_shareleads_op() throws InterruptedException {
		Thread.sleep(3000);
		WebElement textbox2 = driver.findElement(
				By.xpath(properties.getProperty("manageshareleads_manage")));
		textbox2.sendKeys(Keys.ENTER);

		Select delimiter2 = new Select(driver.findElement(
				By.xpath(properties.getProperty("manageshareleads_sort"))));
		delimiter2.selectByIndex(2);
		// textbox2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath(properties.getProperty("manageshareleads_search")));
		search.click();
		search.sendKeys("harish");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty(
				"manageshareleads_button1")))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_button1_click"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_clear"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_send"))).sendKeys("harishlead" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_click1"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_click2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_click3"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_click4"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_input_click"))).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_input_click1"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_input_click2"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_input_click3"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("manageshareleads_input_click_click4"))).click();
	}

	@Test(priority = 43, enabled = true)
	public void tiles() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("tiles_click1")))
				.click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("tiles_click2")))
				.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath(properties.getProperty("tiles_manage"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("tiles_dropdown"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("tiles_delete"))).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath(properties.getProperty("tiles_last"))).click();

	}

}
