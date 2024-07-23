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

	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Shareleads.properties");
	final Logger logger = LogManager.getLogger(shareleads.class);

	@Test(priority = 1, enabled = true)
	public void hoveron_shareleads() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("hovershareleads")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// mouse hover action on the element
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("add_shareleads"))).click();
	}

	@Test(priority = 2, enabled = true)
	public void add_oneatatime() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("sharelistname"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("sharelistname")))
				.sendKeys("AutoSlist" + System.currentTimeMillis());
		logger.info("starts onboarding share leads");
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

		driver.findElement(By.xpath(properties.getProperty("sh_add"))).click();
		driver.findElement(By.xpath(properties.getProperty("sh_save"))).click();

		driver.findElement(By.xpath(properties.getProperty("sh_accept"))).click();

		Thread.sleep(1000);

	}

	@Test(priority = 3, enabled = true)
	public void Copy_list_from_clipboard() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(2000);

		hoveron_shareleads();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("sh_copyclipboard_tab"))).click();// click copy from
																								// clipboard
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("sharelistname"))).click();
		driver.findElement(By.xpath(properties.getProperty("sharelistname")))
				.sendKeys("Auto_tab_Slist" + System.currentTimeMillis());
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("sh_tab_legalbasis"))).click();

		driver.findElement(By.xpath(properties.getProperty("sh_tab_legalbasis")))
				.sendKeys("Legitimate interest - prospect/lead");

		driver.findElement(By.xpath(properties.getProperty("sh_tab_legalbasis"))).sendKeys(Keys.ENTER);

		Select delimiter1 = new Select(driver.findElement(By.xpath(properties.getProperty("sh_dropdown"))));
		delimiter1.selectByValue("TabSeperated");
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("sh_tab_textarea"))).click();
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript(
				"document.getElementById('copyFromclipTextArea').value='gayatri	A	Stratapps	QAAutomationEngineer	';");
		Thread.sleep(5000);
		driver.findElement(By.id("copyFromclipTextArea"))
				.sendKeys(System.currentTimeMillis() + "gayatri@stratapps.com	");
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("sh_verify"))).click();
		driver.findElement(By.xpath(properties.getProperty("sh_save"))).click();
		driver.findElement(By.xpath(properties.getProperty("sh_tab_accept"))).click();

	}

	@Test(priority = 4, enabled = true)
	public void Copy_list_from_clipboard_commaseperated() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(1000);

		logger.debug("Starting creating partner using copy from clipboard - comma separated");
		hoveron_shareleads();
		driver.findElement(By.xpath(properties.getProperty("sharelistname"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("sharelistname")))
				.sendKeys("Autocoma" + System.currentTimeMillis());

		driver.findElement(By.xpath(properties.getProperty("sh_copyclipboard_comma"))).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(properties.getProperty("sh_comma_legalbasis"))).click();

		driver.findElement(By.xpath(properties.getProperty("sh_comma_legalbasis")))
				.sendKeys("Legitimate interest - existing customer");

		driver.findElement(By.xpath(properties.getProperty("sh_comma_legalbasis"))).sendKeys(Keys.ENTER);

		Select delimiter2 = new Select(driver.findElement(By.xpath(properties.getProperty("sh_dropdown"))));
		delimiter2.selectByValue("CommaSeperated");
		Thread.sleep(1000);

		driver.findElement(By.xpath(properties.getProperty("sh_comma_textarea"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(properties.getProperty("sh_comma_textarea")))
				.sendKeys(("Gayatri,A,Stratapps,QAAutomationEngineer,"));
		driver.findElement(By.xpath(properties.getProperty("sh_comma_textarea")))
				.sendKeys(("Gayatri") + "_" + System.currentTimeMillis());
		driver.findElement(By.xpath(properties.getProperty("sh_comma_textarea"))).sendKeys("@getnada.com");

		driver.findElement(By.xpath(properties.getProperty("sh_verify"))).click();
		driver.findElement(By.xpath(properties.getProperty("sh_save"))).click();
		driver.findElement(By.xpath(properties.getProperty("sh_comma_accept"))).click();

	}

	@Test(priority = 8, enabled = false)
	public void manage_shareleads() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver
				.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[4]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		driver.findElement(
				By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[4]/ul/li[2]/a/span")).click();
	}

	@Test(priority = 9, enabled = false)
	public void manage_shareleads_op() throws InterruptedException {
		Thread.sleep(3000);
		Thread.sleep(2000);
		WebElement textbox2 = driver.findElement(
				By.xpath("//*[@id='manageContacts']/div/div/div/div/div/div/div/div[3]/div[2]/div/div/div[1]/select"));
		textbox2.sendKeys(Keys.ENTER);

		Select delimiter2 = new Select(driver.findElement(
				By.xpath("//*[@id='manageContacts']/div/div/div/div/div/div/div/div[3]/div[2]/div/div/div[1]/select")));
		delimiter2.selectByIndex(2);
		// textbox2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for a list']"));
		search.click();
		search.sendKeys("harish");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='manageContacts']/div/div/div/div/div/div/div/div[3]/div[2]/div/div/div[2]/div/button[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='campaignName']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='campaignName']")).sendKeys("harishlead" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[4]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='parnter-companies']/tbody/tr[2]/td[1]/div/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='admin-and-team-members-3056']/thead/tr/th[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partnerCompaniesPopup']/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partnerCompaniesPopup']/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[4]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='swal2-confirm styled']")).click();

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
