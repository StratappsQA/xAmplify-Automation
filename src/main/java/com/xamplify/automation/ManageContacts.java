package com.xamplify.automation;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
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
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVWriter;

import org.apache.logging.log4j.Logger;

public class ManageContacts extends ExtentReportsClass {

	static WebDriver driver = Instance.getInstance();

	static Properties properties = PropertiesFile.readPropertyFile(
			"D:\\git\\gayatriContactswrkspace\\xAmplify-Automation\\src\\main\\resources\\ManageContacts.properties");

	final Logger logger = LogManager.getLogger(ManageContacts.class);

	@Test(priority = 1, enabled = true)
	public void managecontacts_sortby() throws InterruptedException, SQLException {

		WebDriverWait wait_mcon = new WebDriverWait(driver, 50);
		// Wait till the element is not visible
		WebElement mcon1 = wait_mcon.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("hovercontacts"))));// hover
																													// on
																													// contacts

		mcon1.click();

		Actions actions = new Actions(driver);
		WebElement contacts = driver.findElement(By.xpath(properties.getProperty("hovercontacts")));
		actions.moveToElement(contacts).build().perform();
		Thread.sleep(5000);

		WebDriverWait wait_mcon2 = new WebDriverWait(driver, 50);
		// Wait till the element is not visible
		WebElement mcon2 = wait_mcon2.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("managecontacts"))));// hover
																													// on
																													// contacts

		mcon2.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_formcon"))).click(); // click on the edit icon
		Thread.sleep(3000);

		logger.info("Form Contacts button clicked successfully[Manage Contacts]");

		
		  driver.findElement(By.xpath(properties.getProperty("mcon_ALL"))).click(); //click on the edit icon
		  Thread.sleep(3000);
		  
		  logger.info("ALL Contacts button clicked successfully[Manage Contacts]");
		  
		  driver.findElement(By.xpath(properties.getProperty("mcon_grid"))).click(); //click on the edit icon
		  Thread.sleep(3000);
		  
		  logger.info("Grid View icon clicked successfully[Manage Contacts]");
		  
		  WebElement mcon_sort =
		  driver.findElement(By.xpath(properties.getProperty("mcon_grid_sortby"))); //click on the // edit icon 
		  Thread.sleep(3000);
		  
		  Select mconsort = new Select(mcon_sort);
		  
		  mconsort.selectByValue("1: Object"); Thread.sleep(2000);
		  mconsort.selectByValue("2: Object"); Thread.sleep(2000);
		  mconsort.selectByValue("3: Object"); Thread.sleep(2000);
		  mconsort.selectByValue("4: Object"); Thread.sleep(4000); 
		  WebElement mcon_search =driver.findElement(By.xpath(properties.getProperty("mcon_grid_search")));
		  mcon_search.sendKeys("Automate");
		  mcon_search.sendKeys(Keys.ENTER);
		  Thread.sleep(3000);
		  
		  driver.findElement(By.xpath(properties.getProperty(
		  "mcon_grid_search_insidelist"))).click(); // click on the // edit icon
		  Thread.sleep(3000); 
		  logger.info("Searched successfully[Manage Contacts]");
		  driver.findElement(By.xpath(properties.getProperty("mcon_grid_search_close"))).click(); // click on the edit // icon Thread.sleep(3000);
		 

		driver.findElement(By.xpath(properties.getProperty("mcon_MyContacts"))).click(); // click on the edit icon
		Thread.sleep(3000);

	}

	@Test(priority = 2, enabled = true)
	public void managecontacts_alltiles() throws InterruptedException, SQLException {

		WebDriverWait wait_atile = new WebDriverWait(driver, 60);

		// Wait till the element is not visible
		WebElement wait_atile1 = wait_atile
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("mc_alltile"))));
		wait_atile1.click();

		Thread.sleep(6000);

		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter"))).click(); // click on t
		Thread.sleep(3000);

		WebElement condrop = driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_selectfield")));
		// click on t
		Thread.sleep(3000);

		Select field = new Select(condrop);
		field.selectByVisibleText("Company");
		Thread.sleep(3000);

		WebElement condrop2 = driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_selectcondition")));

		Thread.sleep(3000);

		Select field2 = new Select(condrop2);
		field2.selectByVisibleText("=");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_sendvalue")))
				.sendKeys("automate_company"); // click on the edit icon
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_submit"))).click(); // click on saveas
																									// button
		Thread.sleep(5000);

		logger.info("Data Filtered successfully within the ALL Tile[Manage Contacts]");

		driver.findElement(By.id("checkAllExistingContacts")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_gearicon"))).click(); // click on saveas
																									// button
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_saveas"))).click(); // click on saveas
																									// button
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("list_allvalidation"))).sendKeys("filterchck");

		DatabaseQueries mcon_all_data = new DatabaseQueries();
		String mcon_all_data_query = properties.getProperty("query.getcontactlistnames");
		List<String> contactNames = mcon_all_data.listNames(mcon_all_data_query, "user_list_name");
		String contactNameFromProp = properties.getProperty("list_allvalidation").toLowerCase();

		if (contactNames.indexOf(contactNameFromProp) > -1) {
			driver.findElement(By.xpath(properties.getProperty("list_allvalidation"))).clear();

		}

		driver.findElement(By.xpath(properties.getProperty("list_allvalidation")))
				.sendKeys(properties.getProperty("list_allvalidation_text") + "_" + System.currentTimeMillis());
		Thread.sleep(3000);

		WebElement mc_alltile_legal = driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_legal")));// click
		// legal
		// basis field
		// to get the
		// list

		Actions mc_all_actions1 = new Actions(driver);
		mc_all_actions1.moveToElement(mc_alltile_legal);
		mc_all_actions1.click();

		mc_all_actions1.sendKeys("Legitimate interest - existing customer");
		mc_all_actions1.sendKeys(Keys.ENTER);
		mc_all_actions1.build().perform();
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_savechanges"))).click(); // click on
																										// saveas button
		Thread.sleep(5000);

		logger.info("List Saved successfully for filter option within the ALL Tile[Manage Contacts]");

		driver.findElement(By.xpath(properties.getProperty("mc_validtile"))).click(); //
		Thread.sleep(9000);

		driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter"))).click(); //
		Thread.sleep(3000);

		WebElement condrop_2 = driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_selectfield")));
		// click on
		Thread.sleep(3000);

		Select field_2 = new Select(condrop_2);
		field_2.selectByVisibleText("Mobile Number");
		Thread.sleep(3000);

		WebElement con_drop2 = driver
				.findElement(By.xpath(properties.getProperty("mc_validtile_filter_selectcondition")));

		Thread.sleep(3000);

		Select con_field_2 = new Select(con_drop2);
		con_field_2.selectByVisibleText("=");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_sendvalue"))).sendKeys("98941234"); // click
																													// on
																													// the
																													// edit
																													// icon
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_submit"))).click(); // click on saveas
																									// button
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_clear"))).click(); // click on saveas
																									// button
		Thread.sleep(11000);

		logger.info("Filter option filtered and cleared within the Valid Tile[Manage Contacts]");

		driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_gearicon"))).click(); //
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_export"))).click(); //
		Thread.sleep(5000);

		logger.info("Export to Excel done successfully within the Valid Tile[Manage Contacts]");

		WebElement valid_sorty = driver.findElement(By.xpath(properties.getProperty("mc_validtile_sortby")));

		Thread.sleep(5000);

		Select validsort = new Select(valid_sorty);

		validsort.selectByValue("0: Object");
		Thread.sleep(2000);
		validsort.selectByValue("1: Object");
		Thread.sleep(2000);
		validsort.selectByValue("2: Object");
		Thread.sleep(2000);
		validsort.selectByValue("3: Object");
		Thread.sleep(2000);
		validsort.selectByValue("4: Object");
		Thread.sleep(2000);

		validsort.selectByValue("5: Object");
		Thread.sleep(2000);
		validsort.selectByValue("6: Object");

		logger.info("Sortby functionality done successfully within the Valid Tile[Manage Contacts]");

		Thread.sleep(8000);

		WebElement undeliverabletile = driver.findElement(By.xpath(properties.getProperty("mc_undeliverabletile")));
		Thread.sleep(5000);

		if (undeliverabletile.isEnabled()) {

			undeliverabletile.click();

			WebElement undeliverabletilesort = driver
					.findElement(By.xpath(properties.getProperty("mc_undeliverabletile_sortby")));
			Select undeliverable = new Select(undeliverabletilesort);
			undeliverable.selectByValue("0: Object");
			Thread.sleep(5000);
			undeliverable.selectByValue("1: Object");
			Thread.sleep(5000);
			undeliverable.selectByValue("2: Object");
			Thread.sleep(5000);
			undeliverable.selectByValue("3: Object");
			Thread.sleep(5000);
			undeliverable.selectByValue("4: Object");
			Thread.sleep(5000);
			undeliverable.selectByValue("5: Object");
			Thread.sleep(5000);
			undeliverable.selectByValue("6: Object");
			Thread.sleep(5000);

		} else {
			logger.info("Unable to click on undeliverable tile due to count '0'[Manage Contacts]");

		}

		WebElement unsubscribetile = driver.findElement(By.xpath(properties.getProperty("mc_unsubscribetile")));
		Thread.sleep(5000);

		if (unsubscribetile.isEnabled()) {

			unsubscribetile.click();

		}

		else {
			logger.info("Unable to click on unsubscribe tile due to count '0'[Manage Contacts]");

		}

		driver.get("https://xamplify.co/home/contacts/manage");

	}

	@Test(priority = 3, enabled = true)
	public void managecontacts_edit_add() throws InterruptedException {

		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon"))).click(); // click on the edit icon
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon_addcon"))).click(); // click on the one at a
																								// time
		Thread.sleep(3000);

		WebElement mcon_oat = driver.findElement(By.id("email1"));

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		mcon_oat.sendKeys("gayatri_Automate" + randomInt + "@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("firstName")).sendKeys("automate_fname");
		Thread.sleep(3000);

		driver.findElement(By.id("lastName")).sendKeys("automate_lname");
		Thread.sleep(3000);

		driver.findElement(By.id("company")).sendKeys("automate_company");
		Thread.sleep(4000);

		WebElement mc_ele_legal = driver.findElement(By.xpath(properties.getProperty("mcon_editicon_legalbasis")));// click
																													// legal
		// basis field
		// to get the
		// list

		Actions mc_actions1 = new Actions(driver);
		mc_actions1.moveToElement(mc_ele_legal);
		mc_actions1.click();

		mc_actions1.sendKeys("Legitimate interest - prospect/lead");
		mc_actions1.sendKeys(Keys.ENTER);
		mc_actions1.build().perform();
		Thread.sleep(1000);

		mc_actions1.sendKeys("Legitimate interest - existing customer");
		mc_actions1.sendKeys(Keys.ENTER);
		mc_actions1.build().perform();
		Thread.sleep(1000);
		mc_actions1.sendKeys("Legitimate interest - other");

		Thread.sleep(1000);
		driver.findElement(By.id("title")).sendKeys("automate_title");

		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon_submit"))).click(); // click on the edit icon
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon_accept"))).click(); // click on the edit icon
		Thread.sleep(3000);

		logger.info("Contact Added Successfully through 'ONE AT A TIME' within the Edit icon[Manage Contacts]");

	}

	@Test(priority = 4, enabled = true)
	public void managecontacts_edit_filter_save() throws InterruptedException, SQLException {

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon"))).click(); // click on the edit icon
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon_filter"))).click(); // click on t
		Thread.sleep(3000);

		WebElement condrop = driver.findElement(By.xpath(properties.getProperty("mcon_editicon_filter_selectfield")));
		// click on t
		Thread.sleep(3000);

		Select field = new Select(condrop);
		field.selectByVisibleText("Email Id");
		Thread.sleep(3000);

		WebElement condrop2 = driver
				.findElement(By.xpath(properties.getProperty("mcon_editicon_filter_selectcondition")));

		Thread.sleep(3000);

		Select field2 = new Select(condrop2);
		field2.selectByVisibleText("Contains");
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon_filter_sendvalue"))).sendKeys("gayatri"); // click
																													// on
																													// the
																													// edit
																													// icon
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon_filter_submit"))).click(); // click on saveas
																										// button
		Thread.sleep(5000);

		logger.info("Data Filtered successfully within the Edit icon[Manage Contacts]");

		driver.findElement(By.name("campaignContact[]")).click(); // select contact checkbox
		driver.findElement(By.xpath(properties.getProperty("mcon_edit_saveclick"))).click(); // click on saveas button
		Thread.sleep(5000);

		DatabaseQueries mcon_data = new DatabaseQueries();
		String mcon_query = properties.getProperty("query.getcontactlistnames");
		List<String> contactNames = mcon_data.listNames(mcon_query, "user_list_name");
		String contactNameFromProp = properties.getProperty("mcon_savelist_validation").toLowerCase();

		if (contactNames.indexOf(contactNameFromProp) > -1) {
			driver.findElement(By.xpath(properties.getProperty("mcon_savelist_validation"))).clear();

		}

		driver.findElement(By.xpath(properties.getProperty("mcon_savelist_validation")))
				.sendKeys(properties.getProperty("mcon_savelist_validation_text") + "_" + System.currentTimeMillis());
		Thread.sleep(3000);

		WebElement mcon_legal = driver.findElement(By.xpath(properties.getProperty("mcon_editicon_legalbasis")));// click
		// legal
		// basis field
		// to get the
		// list

		Actions actions4 = new Actions(driver);
		actions4.moveToElement(mcon_legal);
		actions4.click();

		actions4.sendKeys("Legitimate interest - existing customer");
		actions4.sendKeys(Keys.ENTER);
		actions4.build().perform();

		driver.findElement(By.xpath(properties.getProperty("mcon_edit_toggleon"))).click(); // click on the save
		// button
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_edit_savechanges"))).click(); // click on the save
																								// button
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mcon_copy&saveicon"))).click(); // click on the copy and
																							// save icon
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mcon_copysave_saveas_click"))).click(); // click on
																									// savechanges
																									// button
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_downloadicon"))).click(); // click on the download icon
		Thread.sleep(5000);

		logger.info("Downloaded successfully");

		driver.findElement(By.xpath(properties.getProperty("mcon_deleteicon"))).click(); // click on the delete icon
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_yesdeleteicon"))).click(); // click on the yes delete
																							// button
		Thread.sleep(5000);

		String del_contact = driver.findElement(By.id("responseMessage")).getText();
		// System.out.println(del_contact);

		Assert.assertEquals(del_contact, "Your contact list has been deleted successfully.");

		logger.info("Contact List Deleted successfully");

	}

	@Test(priority = 5, enabled = true)
	public void manage_Edit_commaseparated() throws InterruptedException, SQLException, IOException {

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon"))).click(); // click on the edit icon
		Thread.sleep(9000);

		driver.findElement(By.xpath(properties.getProperty("edit_copyfromclipboard_click"))).click(); // click on copy
																										// from
																										// clipboard
		Select delimiter1 = new Select(
				driver.findElement(By.xpath(properties.getProperty("edit_selectdelimeter_dropdown")))); // select
																										// delimeter
		delimiter1.selectByValue("CommaSeperated");

		WebElement textarea_comma = driver.findElement(By.xpath(properties.getProperty("edit_textarea"))); // click on
																											// text area
		textarea_comma.click();
		textarea_comma.sendKeys("gayatri,a,stratapps,Testing,");

		textarea_comma.sendKeys(System.currentTimeMillis() + "agayatri@stratapps.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("verifybutton"))).click(); // click on verify button
		Thread.sleep(3000);

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("contact_legalbasis")));// click legal
																										// basis field
																										// to get the
																										// list

		Actions actions2 = new Actions(driver);
		actions2.moveToElement(ele1);
		actions2.click();
		actions2.sendKeys("Legitimate interest - prospect/lead");
		actions2.sendKeys(Keys.ENTER);
		actions2.build().perform();
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mupload_csv_action"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mupload_csv_save"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("mupload_csv_accept"))).click();
		Thread.sleep(2000);
		logger.info("contact added in the within the contact list through copy from clipboard");

	}

	@Test(priority = 6, enabled = true)
	public void manage_Edit_uploadcsv() throws InterruptedException, SQLException, IOException {

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon"))).click(); // click on the edit icon
		Thread.sleep(9000);

		String csv = "D:\\Selenium\\files\\UPLOAD_USER_LIST.csv";
		CSVWriter writer = new CSVWriter(new FileWriter(csv));

		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		String email_csv = "gayatri_Automate" + randomInt + "@gmail.com";
		Thread.sleep(3000);

		String[] header = { "FIRSTNAME", "LASTNAME", "COMPANY", "JOBTITLE", "EMAILID", "ADDRESS", "CITY", "STATE",
				"ZIP CODE", "COUNTRY", "MOBILE NUMBER" };

		String set1[] = { "gayatri ", " ", " ", " ", email_csv, " ", " ", " ", " ", " ", " " };
		
		writer.writeNext(header);
		writer.writeNext(set1);
		
		writer.flush();
		System.out.println("Data written to csv file");

		WebElement test = driver.findElement(By.xpath(properties.getProperty("muploadcsv1")));
		test.sendKeys(csv);
		Thread.sleep(8000);

		WebElement mc_alltile_legal_csv = driver
				.findElement(By.xpath(properties.getProperty("mc_alltile_filter_legal")));// click
		// legal
		// basis field
		// to get the
		// list

		Actions mc_all_actions_legal = new Actions(driver);
		mc_all_actions_legal.moveToElement(mc_alltile_legal_csv);
		mc_all_actions_legal.click();

		mc_all_actions_legal.sendKeys("Legitimate interest - existing customer");
		mc_all_actions_legal.sendKeys(Keys.ENTER);
		mc_all_actions_legal.build().perform();
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("mupload_csv_action"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mupload_csv_save"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("mupload_csv_accept"))).click();
		Thread.sleep(2000);
		logger.info("contact added in the within the contact list through csv");

	}

	@Test(priority = 7, enabled = true)
	public void mcon_Edit_delete() throws InterruptedException, SQLException, IOException {

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_editicon"))).click(); // click on the edit icon
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_edit_del"))).click(); // click on the edit icon
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("mcon_edit_del_yes"))).click(); // click on the edit icon
		Thread.sleep(5000);
		logger.info("Deleted contact within the contact list");
		driver.get("https://xamplify.co/home/contacts/manage");

	}

}