package com.xamplify.automation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

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

public class shareleads {

	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Shareleads.properties");
	final Logger logger = LogManager.getLogger(shareleads.class);

	@Test(priority = 1, enabled = false)
	public void hoveron_shareleads() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("hovershareleads")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// mouse hover action on the element
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("add_shareleads"))).click();
	}

	@Test(priority = 2, enabled = false)
	public void shareleads_oneatatime() throws InterruptedException {
		Thread.sleep(2000);
		logger.debug("Starting creating partner using One at a time");

		driver.findElement(By.xpath(properties.getProperty("sharelistname"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("sharelistname")))
				.sendKeys("AutoSlist" + System.currentTimeMillis());
		logger.info("starts onboarding share leads");    //enter list name
		driver.findElement(By.xpath(properties.getProperty("sh_oneattime"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("sh_emailid"))).click();
		driver.findElement(By.xpath(properties.getProperty("sh_emailid")))
				.sendKeys("Gayatri_automated" + System.currentTimeMillis() + "@getnada.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("sh_firstname"))).sendKeys("Gayatri");
		driver.findElement(By.cssSelector(properties.getProperty("sh_lastname"))).sendKeys("autoshare");
		driver.findElement(By.cssSelector(properties.getProperty("sh_company"))).sendKeys("automatecompany");

		driver.findElement(By.xpath(properties.getProperty("sh_legalbasis"))).click();

		WebElement shlegal = driver.findElement(By.xpath(properties.getProperty("sh_legalbasis")));
		shlegal.sendKeys("Legitimate interest - existing customer");// enter data for legal basis field
		shlegal.sendKeys(Keys.ENTER);// click enter in the keyboard
		shlegal.sendKeys("Legitimate interest - prospect/lead");// enter data for legal basis field
		shlegal.sendKeys(Keys.ENTER);// click enter in the keyboard

		driver.findElement(By.cssSelector(properties.getProperty("sh_jobtitle"))).sendKeys("jobtitle");
		driver.findElement(By.cssSelector(properties.getProperty("sh_Address"))).sendKeys("Address");
		driver.findElement(By.cssSelector(properties.getProperty("sh_state"))).sendKeys("state");

		driver.findElement(By.xpath(properties.getProperty("sh_mobileno"))).sendKeys("9876543210");
		driver.findElement(By.xpath(properties.getProperty("sh_country"))).click();
		driver.findElement(By.xpath(properties.getProperty("sh_country"))).sendKeys("india");

		driver.findElement(By.xpath(properties.getProperty("sh_country"))).sendKeys(Keys.ENTER);

		driver.findElement(By.xpath(properties.getProperty("sh_city"))).sendKeys("Hyderabad");

		driver.findElement(By.cssSelector(properties.getProperty("sh_zipcode"))).sendKeys("567890");

		driver.findElement(By.xpath(properties.getProperty("sh_add"))).click();  //click on the add button
		driver.findElement(By.xpath(properties.getProperty("sh_save"))).click(); //click on the save button

		driver.findElement(By.xpath(properties.getProperty("sh_accept"))).click(); //click on the accept button

		Thread.sleep(1000);

	}

	@Test(priority = 3, enabled = false)
	public void Shareleads_Copy_list_from_clipboard_tab() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(2000);

		hoveron_shareleads();
		Thread.sleep(2000);
		logger.debug("Starting creating partner using copy from clipboard - tab separated");

		driver.findElement(By.xpath(properties.getProperty("sh_copyclipboard_tab"))).click();// click copy from
																								// clipboard
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("sharelistname"))).click();
		driver.findElement(By.xpath(properties.getProperty("sharelistname")))
				.sendKeys("Auto_tab_Slist" + System.currentTimeMillis()); //enter list name
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("sh_tab_legalbasis"))).click();

		driver.findElement(By.xpath(properties.getProperty("sh_tab_legalbasis")))
				.sendKeys("Legitimate interest - prospect/lead");  //enter legal basis 

		driver.findElement(By.xpath(properties.getProperty("sh_tab_legalbasis"))).sendKeys(Keys.ENTER); //enter from keyboard

		Select delimiter1 = new Select(driver.findElement(By.xpath(properties.getProperty("sh_dropdown"))));
		delimiter1.selectByValue("TabSeperated");  //select tab separated in the drop down
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("sh_tab_textarea"))).click();  //click on the textarea
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript(
				"document.getElementById('copyFromclipTextArea').value='gayatri	A	Stratapps	QAAutomationEngineer	';");
		Thread.sleep(5000);
		driver.findElement(By.id("copyFromclipTextArea"))
				.sendKeys(System.currentTimeMillis() + "gayatri@stratapps.com	");
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("sh_verify"))).click();  //click on the verify button
		driver.findElement(By.xpath(properties.getProperty("sh_save"))).click();  //click on the save button
		driver.findElement(By.xpath(properties.getProperty("sh_tab_accept"))).click(); //click on the accept button
		Thread.sleep(2000);
	}

	@Test(priority = 4, enabled = false)
	public void shareleads_Copy_list_from_clipboard_comma() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(1000);

		logger.debug("Starting creating partner using copy from clipboard - comma separated");
		hoveron_shareleads();
		driver.findElement(By.xpath(properties.getProperty("sharelistname"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("sharelistname")))
				.sendKeys("Autocoma" + System.currentTimeMillis());  //enter list name

		driver.findElement(By.xpath(properties.getProperty("sh_copyclipboard_comma"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("sh_comma_legalbasis"))).click();

		driver.findElement(By.xpath(properties.getProperty("sh_comma_legalbasis")))
				.sendKeys("Legitimate interest - existing customer"); //enter legal basis 

		driver.findElement(By.xpath(properties.getProperty("sh_comma_legalbasis"))).sendKeys(Keys.ENTER);

		Select delimiter2 = new Select(driver.findElement(By.xpath(properties.getProperty("sh_dropdown"))));
		delimiter2.selectByValue("CommaSeperated");  //select value form the drop down
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("sh_comma_textarea"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("sh_comma_textarea")))
				.sendKeys(("Gayatri,A,Stratapps,QAAutomationEngineer,"));  // enter the data in text area
		driver.findElement(By.xpath(properties.getProperty("sh_comma_textarea")))
				.sendKeys(("Gayatri") + "_" + System.currentTimeMillis());
		driver.findElement(By.xpath(properties.getProperty("sh_comma_textarea"))).sendKeys("@getnada.com");

		driver.findElement(By.xpath(properties.getProperty("sh_verify"))).click(); //click on the verify button
		driver.findElement(By.xpath(properties.getProperty("sh_save"))).click();  //click on the save button
		driver.findElement(By.xpath(properties.getProperty("sh_comma_accept"))).click(); //click on the accept button
       Thread.sleep(2000);
	}
	
	
	@SuppressWarnings("deprecation")
	@Test(priority = 5, enabled = false)
	public void shareleads_uploadcsv() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(1000);

		logger.debug("Starting creating partner using upload a csv");
		hoveron_shareleads();
	
		driver.findElement(By.id("uploadCSV")).click();   //click on the upload csv
		Thread.sleep(5000);
	
	
	Runtime.getRuntime().exec("D:\\git\\xAmplify-Automation\\Uploadshareleads.exe");  //by using auto it create and execute, copy the path here
		
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(properties.getProperty("sh_csv_legalbasis"))).click();//click on the legal basis

	driver.findElement(By.xpath(properties.getProperty("sh_csv_legalbasis")))
			.sendKeys("Legitimate interest - existing customer"); //enter legal basis 

	driver.findElement(By.xpath(properties.getProperty("sh_csv_legalbasis"))).sendKeys(Keys.ENTER); //click on the enter

	driver.findElement(By.xpath(properties.getProperty("sh_csvlist"))).clear();
	
	driver.findElement(By.xpath(properties.getProperty("sh_csvlist"))).sendKeys("Autoupload" + System.currentTimeMillis());  //enter list name
	
	
	driver.findElement(By.xpath(properties.getProperty("sh_csv_save"))).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath(properties.getProperty("sh_csv_verify"))).click();
	Thread.sleep(2000);
	
	}
	
	

	@Test(priority = 6, enabled = true)
	public void manage_shareleads() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath(properties.getProperty("hovershareleads")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// mouse hover action on the element
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("manage_shareleads"))).click();
	}
		
		
		
		@Test(priority=7,enabled=true)
		public void manage_shareleads_sortby() throws InterruptedException {
		
		
			WebDriverWait sh_sortby = new WebDriverWait(driver, 60);
			WebElement msh_sort = sh_sortby.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(properties.getProperty("manage_sh_sortby")))); // select dropdown
			
			Select msh_sort1 = new Select(msh_sort);

			msh_sort1.selectByVisibleText("List name (A-Z)");
			logger.debug("Sorted List name a-z");
			
			Thread.sleep(5000);
			
			msh_sort1.selectByVisibleText("List name (Z-A)");
			logger.debug("Sorted List name Z-A");
			Thread.sleep(5000);
			
			msh_sort1.selectByVisibleText("List name (A-Z)");
			logger.debug("Sorted List name a-z");
			Thread.sleep(5000);
		
			
			msh_sort1.selectByVisibleText("Creation date (ASC)");
			logger.debug("sorted Creation date (ASC)");
			Thread.sleep(5000);

			msh_sort1.selectByVisibleText("Creation date (DESC)");
			logger.debug("sorted Creation date (DESC)");
			
			
			
			
			driver.findElement(By.xpath(properties.getProperty("manage_sh_publishicon"))).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("manage_sh_publish_selectcom"))).click();
			Thread.sleep(2000);

			
			driver.findElement(By.xpath(properties.getProperty("manage_sh_publish_selectall"))).click();

			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("manage_sh_publish_submit"))).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(properties.getProperty("manage_sh_publish_submit_close"))).click();

			Thread.sleep(5000);

			
			driver.findElement(By.xpath(properties.getProperty("manage_sh_gridview"))).click();

			Thread.sleep(5000);
			
			msh_sort1.selectByVisibleText("Assigned date (ASC)");
			logger.debug("sorted Assigned date (ASC)");
			Thread.sleep(5000);
			msh_sort1.selectByVisibleText("Assigned date (DESC)");
			logger.debug("sorted Assigned date (DESC)");
			Thread.sleep(3000);
	
		WebElement sh_search=driver.findElement(By.xpath(properties.getProperty("manage_sh_grid_search")));
			sh_search.sendKeys("List");
			sh_search.sendKeys(Keys.ENTER);
			Thread.sleep(3000);

			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(properties.getProperty("manage_sh_gridview_preview"))));
			element.click();
			
			
			
			driver.findElement(By.xpath(properties.getProperty("manage_sh_gridview_preview_cls"))).click();
			driver.findElement(By.xpath(properties.getProperty("manage_sh_grid_search_expand"))).click();
			
			
		
			
		/*
		 * Select delimiter2 = new Select(driver.findElement( By.xpath(
		 * "//*[@id='manageContacts']/div/div/div/div/div/div/div/div[3]/div[2]/div/div/div[1]/select"
		 * ))); delimiter2.selectByIndex(2); // textbox2.sendKeys(Keys.ENTER);
		 * Thread.sleep(2000); WebElement search =
		 * driver.findElement(By.xpath("//input[@placeholder='Search for a list']"));
		 * search.click(); search.sendKeys("harish"); search.sendKeys(Keys.ENTER);
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='manageContacts']/div/div/div/div/div/div/div/div[3]/div[2]/div/div/div[2]/div/button[1]"
		 * )) .click(); Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[3]/i")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//*[@id='campaignName']")).clear();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//*[@id='campaignName']")).sendKeys("harishlead"
		 * + System.currentTimeMillis()); Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click
		 * (); Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[4]/i")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[1]/i")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='parnter-companies']/tbody/tr[2]/td[1]/div/a/i")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='admin-and-team-members-3056']/thead/tr/th[1]/input")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='partnerCompaniesPopup']/div/div/div[3]/button[2]")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='partnerCompaniesPopup']/div/div/div[3]/button")).click();
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[4]/i")).click();
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//button[@class='swal2-confirm styled']")).click
		 * ();
		 */
	}

	@Test(priority = 10, enabled = false)
	public void tiles() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manageContacts']/div/div/div/div/div/div/div/div[2]/div[1]/button/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manageContacts']/div/div/div/div/div/div/div/div[2]/div[2]/button/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//*[@id='manageContacts']/div/div/div/div/div/div/div/div[2]/div[3]/button/span/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@id='delete_button'])[2]")).click();
	}

}
