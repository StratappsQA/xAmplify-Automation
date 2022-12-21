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

public class shareleads {
	private static final TimeUnit Seconds = null;
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Partners.properties");
	final Logger logger = LogManager.getLogger(shareleads.class);


	

	@Test(priority = 2, enabled = true)
	public void movingtoshareleads() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver
				.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[4]/a"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[4]/ul/li[1]/a/i"))
				.click();
	}

	@Test(priority = 3, enabled = true)
	public void addoneatatime() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='contactListName']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='contactListName']")).sendKeys("harish" + System.currentTimeMillis());
		driver.findElement(By.xpath("//button[@id='addContacts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email1']")).click();
		driver.findElement(By.xpath("//input[@id='email1']"))
				.sendKeys("m.harish" + System.currentTimeMillis() + "@getnada.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("harry");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("potter");
		driver.findElement(By.cssSelector("input[id='company']")).sendKeys("company");
		driver.findElement(By.cssSelector("input[placeholder='Job Title']")).sendKeys("jobtitle");
		driver.findElement(By.cssSelector("input[placeholder='Address']")).sendKeys("Address");
		driver.findElement(By.cssSelector("input[placeholder='State']")).sendKeys("state");

		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile no']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//*[@id=\"addContactModal\"]/div/div/div[2]/form/div[8]/div[2]/select")).click();
		driver.findElement(By.xpath("//*[@id=\"addContactModal\"]/div/div/div[2]/form/div[8]/div[2]/select"))
				.sendKeys("india");
		driver.findElement(By.xpath("//*[@id=\"addContactModal\"]/div/div/div[2]/form/div[8]/div[2]/select"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@placeholder='Select Legal Basis']")).click();// click legal basis field to
																							// get the list
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Select Legal Basis']"))
				.sendKeys("Legitimate interest - prospect/lead");// enter data for legal basis field

		WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='Select Legal Basis']"));
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Zip Code']")).sendKeys("567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"addContactModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"sample_editable_1_new\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='tcModal']/div/div/div[3]/button[2]")).click();
	}

	@Test(priority = 4, enabled = true)
	public void addoneatatime1() throws InterruptedException {
		Thread.sleep(6000);
		movingtoshareleads();
	}

	@Test(priority = 5, enabled = true)
	public void Copy_list_from_clipboard() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(5000);
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30,1));

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//*[@id='copyFromClipBoard']span")));

		driver.findElement(By.xpath("//*[@id='copyFromClipBoard']")).click();// click copy from clipboard
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='contactListName']")).click();
		driver.findElement(By.xpath("//input[@id='contactListName']"))
				.sendKeys("harishleadlist" + System.currentTimeMillis());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='e-dropdownbase']")).click();
		driver.findElement(By.xpath("//input[@class='e-dropdownbase']"))
				.sendKeys("Legitimate interest - prospect/lead");
		WebElement textbox1 = driver.findElement(By.xpath("//input[@class='e-dropdownbase']"));
		textbox1.sendKeys(Keys.ENTER);

		Select delimiter1 = new Select(driver.findElement(By.xpath("//select[@class='opts form-control']")));
		delimiter1.selectByValue("TabSeperated");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='copyFromclipTextArea']")).click();
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript(
				"document.getElementById('copyFromclipTextArea').value='hari	M	Stratapps	QAAutomationEngineer	';");
		Thread.sleep(5000);
		driver.findElement(By.id("copyFromclipTextArea"))
				.sendKeys(System.currentTimeMillis() + "harish@stratapps.com	");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='btn green'])[2]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='tcModal']/div/div/div[3]/button[2]")).click();

	}

	@Test(priority = 6, enabled = true)
	public void addcsv() throws InterruptedException, IOException {
		Thread.sleep(5000);
		movingtoshareleads();
		Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id='contactListName']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='contactListName']")).sendKeys("Harish" + System.currentTimeMillis());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='uploadCSV']/input")).sendKeys("D:\\Selenium\\files\\shareleads.csv");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='multiselectelement']/div/div/span[3]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='multiselectelement']/div/div/span[3]/input")).sendKeys("Not applicable");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='multiselectelement']/div/div/span[3]/input")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='sample_editable_1_new']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='tcModal']//button[2]")).click();
}

	@Test(priority = 7, enabled = true)
	public void addoneatatime2() throws InterruptedException {
		movingtoshareleads();
	}

	@Test(priority = 8, enabled = true)
	public void Copy_list_from_clipboard_commaseperated() throws InterruptedException, SQLException, IOException

	{
		Thread.sleep(4000);
		
		// WebDriverWait wait = new WebDriverWait(driver,30);

					// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("copyFromClipBoard")));
					// logger.debug("Starting creating partner using copy from clipboard - comma
					// separated");

					driver.findElement(By.xpath("//*[@id='contactListName']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id='contactListName']")).sendKeys("harish" + System.currentTimeMillis());

					driver.findElement(By.xpath("//*[@id='copyFromClipBoard']/span")).click();// click copy from clipboard
					Thread.sleep(2000);
					driver.findElement(By.xpath(("//*[@id='multiselectelement']/div/div/span[3]/input"))).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath(("//*[@id='multiselectelement']/div/div/span[3]/input")))
							.sendKeys("Legitimate interest - prospect/lead");// enter data for legal basis
					WebElement textbox1 = driver.findElement(By.xpath("//*[@id='multiselectelement']/div/div/span[3]/input"));
					textbox1.sendKeys(Keys.ENTER);
					Thread.sleep(3000);

					Select delimiter2 = new Select(driver.findElement(By.xpath(
							"/html/body/app-root/app-home/div/div/app-add-contacts/div[1]/div[5]/form/div/div/div[5]/div/div[1]/div[1]/select")));
					delimiter2.selectByValue("CommaSeperated");

					driver.findElement(By.xpath(("//*[@id='copyFromclipTextArea']")))
							.sendKeys(("harish,M,Stratapps,QAAutomationEngineer,"));
					driver.findElement(By.xpath("//*[@id='copyFromclipTextArea']"))
							.sendKeys(("harish") + "_" + System.currentTimeMillis());
					driver.findElement(By.xpath("//*[@id='copyFromclipTextArea']")).sendKeys(("@getnada.com"));
					Thread.sleep(3000);
					driver.findElement(By.xpath(
							"(//div/button[@class='btn btn-default'])[2]"))
							.click();
					Thread.sleep(2000);
					JavascriptExecutor js = (JavascriptExecutor) driver;
                    js.executeScript("window.scrollBy(0,-350)","");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[@id='sample_editable_1_new']")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id='tcModal']/div/div/div[3]/button[2]")).click();

				

	}

	@Test(priority = 9, enabled = true)
	public void manage_shareleads() throws InterruptedException {
		Thread.sleep(3000);
		WebElement ele = driver
				.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[4]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[4]/ul/li[2]/a/span")).click();
	}

	@Test(priority = 10, enabled = true)
	public void manage_shareleads_op() throws InterruptedException {
		Thread.sleep(3000);
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
		driver.findElement(By.xpath("//*[@id='saveAsModal']/div/div/div[3]/button[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[4]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='parnter-companies']/tbody/tr[2]/td[1]/div/a/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='admin-and-team-members-2102']/thead/tr/th[1]/input")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partnerCompaniesPopup']/div/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partnerCompaniesPopup']/div/div/div[3]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='partner_contact_list']/tbody/tr[1]/td[6]/div/a[4]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='swal2-confirm styled']")).click();

	}

	@Test(priority = 11, enabled = true)
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
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("/html/body/app-root/app-home/div/div/app-manage-contacts/div[1]/div[1]/ul/li[2]/a")).click();

	}

}
