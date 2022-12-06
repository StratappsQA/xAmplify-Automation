package com.xamplify.automation;

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
import org.apache.logging.log4j.Logger;

public class ManageContacts {

	
	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile(
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
			
			driver.findElement(By.xpath(properties.getProperty("mcon_ALL"))).click(); // click on the edit icon
			Thread.sleep(3000);
	
			

			logger.info("ALL Contacts button clicked successfully[Manage Contacts]");
			
			
			driver.findElement(By.xpath(properties.getProperty("mcon_grid"))).click(); // click on the edit icon
			Thread.sleep(3000);
	
			
			logger.info("Grid View icon clicked successfully[Manage Contacts]");
			
			
			
			WebElement mcon_sort=driver.findElement(By.xpath(properties.getProperty("mcon_grid_sortby"))); // click on the edit icon
			Thread.sleep(3000);
	
			Select mconsort=new Select(mcon_sort);
			
			mconsort.selectByValue("1: Object");
			Thread.sleep(2000);
			mconsort.selectByValue("2: Object");
			Thread.sleep(2000);
			mconsort.selectByValue("3: Object");
			Thread.sleep(2000);
			mconsort.selectByValue("4: Object");
			Thread.sleep(4000);
			WebElement mcon_search=driver.findElement(By.xpath(properties.getProperty("mcon_grid_search")));
			mcon_search.sendKeys("Automate"); 
			mcon_search.sendKeys(Keys.ENTER);
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("mcon_grid_search_insidelist"))).click(); // click on the edit icon
			Thread.sleep(3000);
			logger.info("Searched successfully[Manage Contacts]");
			driver.findElement(By.xpath(properties.getProperty("mcon_grid_search_close"))).click(); // click on the edit icon
			Thread.sleep(3000);

			driver.findElement(By.xpath(properties.getProperty("mcon_MyContacts"))).click(); // click on the edit icon
			Thread.sleep(3000);

			
		}	
			
	

	@Test(priority = 2, enabled = true)
	public void managecontacts_alltiles() throws InterruptedException, SQLException {

	
		
		
		
		
		WebDriverWait wait_atile = new WebDriverWait(driver, 60);

		// Wait till the element is not visible
		WebElement wait_atile1 = wait_atile.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("mc_alltile"))));
		wait_atile1.click();
		
		
		Thread.sleep(6000);

		
		
		
		
		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter"))).click(); // click on t
		Thread.sleep(3000);

		
		

	WebElement condrop=	driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_selectfield")));
		 // click on t
		Thread.sleep(3000);

		
		
		
		Select field=new Select(condrop);
		field.selectByVisibleText("Company");
		Thread.sleep(3000);
		
		
		
		
		WebElement condrop2=driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_selectcondition")));
		
		Thread.sleep(3000);

		
		
		
		Select field2=new Select(condrop2);
		field2.selectByVisibleText("=");
		Thread.sleep(3000);
		
		  
		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_sendvalue"))).sendKeys("automate_company"); // click on the edit icon
		Thread.sleep(3000);

		
		
		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_submit"))).click(); // click on saveas button
		Thread.sleep(5000);

		
		logger.info("Data Filtered successfully within the ALL Tile[Manage Contacts]");

		
		
		
		
		driver.findElement(By.id("checkAllExistingContacts")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_gearicon"))).click(); // click on saveas button
		Thread.sleep(5000);

		
		driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_saveas"))).click(); // click on saveas button
		Thread.sleep(5000);
		
				
		
		driver.findElement(By.xpath(properties.getProperty("list_allvalidation"))).sendKeys("filterchck");


DatabaseQueries mcon_all_data= new DatabaseQueries();
	String mcon_all_data_query = properties.getProperty("query.getcontactlistnames");
	List<String> contactNames = mcon_all_data.listNames(mcon_all_data_query, "user_list_name");
	String contactNameFromProp = properties.getProperty("list_allvalidation").toLowerCase();

	
	
	if (contactNames.indexOf(contactNameFromProp) > -1) {
		driver.findElement(By.xpath(properties.getProperty("list_allvalidation"))).clear();
		
	}
		
		driver.findElement(By.xpath(properties.getProperty("list_allvalidation")))
				.sendKeys(properties.getProperty("list_allvalidation_text")+"_"+System.currentTimeMillis());
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

				







driver.findElement(By.xpath(properties.getProperty("mc_alltile_filter_savechanges"))).click(); // click on saveas button
Thread.sleep(5000);




logger.info("List Saved successfully for filter option within the ALL Tile[Manage Contacts]");

























		

driver.findElement(By.xpath(properties.getProperty("mc_validtile"))).click(); // 
Thread.sleep(8000);


		
driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter"))).click(); // 
Thread.sleep(3000);




WebElement condrop_2=	driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_selectfield")));
 // click on 
Thread.sleep(3000);




Select field_2=new Select(condrop_2);
field_2.selectByVisibleText("Mobile Number");
Thread.sleep(3000);




WebElement con_drop2=driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_selectcondition")));

Thread.sleep(3000);




Select con_field_2=new Select(con_drop2);
con_field_2.selectByVisibleText("=");
Thread.sleep(3000);

  
driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_sendvalue"))).sendKeys("98941234"); // click on the edit icon
Thread.sleep(3000);



driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_submit"))).click(); // click on saveas button
Thread.sleep(5000);



driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_clear"))).click(); // click on saveas button
Thread.sleep(9000);


logger.info("Filter option filtered and cleared within the Valid Tile[Manage Contacts]");






driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_gearicon"))).click(); // 
Thread.sleep(5000);



driver.findElement(By.xpath(properties.getProperty("mc_validtile_filter_export"))).click(); // 
Thread.sleep(5000);


logger.info("Export to Excel done successfully within the Valid Tile[Manage Contacts]");


WebElement valid_sorty=driver.findElement(By.xpath(properties.getProperty("mc_validtile_sortby")));

Thread.sleep(5000);

Select validsort=new Select(valid_sorty);

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
Thread.sleep(2000);


	
	}
	
	
	
	
	
	
	
	
	

}
