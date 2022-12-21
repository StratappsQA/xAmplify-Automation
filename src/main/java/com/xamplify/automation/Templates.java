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

public class Templates {

	private static final TimeUnit Seconds = null;
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Partners.properties");
	final Logger logger = LogManager.getLogger(Templates.class);


	@Test(priority = 2, enabled = true)
	public void design() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='design-name mDisableColor'])[1]")).click();

	}

	@Test(priority = 3, enabled = true)
	public void design1() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//li[@class='filter'])[1]")).click();

		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("Basic");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='search-box-item-click']")).click();
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/a/i"))
				.click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("harish");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/button[2]"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();
	}

	@Test(priority = 4, enabled = true)
	public void video() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-manage-template/div/div[1]/ul/li[3]/a"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("simple");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='search-box-item-click']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/a/i"))
				.click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("harish");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/button[2]"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();
	}

	@Test(priority = 5, enabled = true)
	public void emailcobranding() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-manage-template/div/div[1]/ul/li[3]/a"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("NewsLetter2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='search-box-item-click']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/a/i"))
				.click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='save']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("harish");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/button[2]"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();
	}

	@Test(priority = 6, enabled = true)
	public void videocobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("video");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='search-box-item-click']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/a/i"))
				.click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[6]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("harish");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/button[2]"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();

	}

	@Test(priority = 7, enabled = true)
	public void event() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("event");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='search-box-item-click']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/a/i"))
				.click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[7]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("harish");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/button[2]"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();

	}

	@Test(priority = 8, enabled = true)
	public void eveco() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[1]/div/div[1]/div/ul/li[8]"))
				.click();

		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("eve");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='search-box-item-click']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-select-template/div[1]/div[2]/div/div/div[2]/div/div[2]/div/div/a/i"))
				.click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harish" + System.currentTimeMillis());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='save']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[8]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("harish");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/button[2]"))
				.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();

	}

	@Test(priority = 9, enabled = true)
	public void managetemplates() throws InterruptedException {

		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='design-name']")).click();
	}

	@Test(priority = 10, enabled = true)
	public void managetemplates_Email() throws InterruptedException {
		Thread.sleep(3000);
		managetemplates();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("Basic");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-inbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
		Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[1]/select")));
		dropdown.selectByVisibleText("Name (A-Z)");

	}

	@Test(priority = 11, enabled = true)
	public void managetemplates_video() throws InterruptedException {
		Thread.sleep(3000);
		managetemplates();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul/li[@class='filter'][2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("video1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-inbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[2]/i")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button")).click();

	}

	@Test(priority = 12, enabled = true)
	public void Email_cobranding() throws InterruptedException {

		Thread.sleep(3000);
		managetemplates();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li[@class='filter'][4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("email");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-inbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 13, enabled = true)
	public void Video_Cobranding() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='design-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li[@class='filter'][5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("vid");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-inbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[6]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 14, enabled = true)
	public void Event() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='design-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li[@class='filter'][6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("event");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-inbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[7]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 15, enabled = true)
	public void Event_cobranding() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='design-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li[@class='filter'][7]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("eventco");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-inbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[3]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[8]"))
				.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 16, enabled = true)
	public void gridview_email() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@placeholder='Search for a template']")).sendKeys("Email");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='search-box-item-click']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='bar'])[1]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[1]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(2000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 17, enabled = true)
	public void gridview_video() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@placeholder='Search for a template']")).sendKeys("video1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='search-box-item-click']")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='bar'])[1]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[1]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(2000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 18, enabled = true)
	public void gridview_Email_cobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
				.click();

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='bar'])[1]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[1]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button")).click();
		Thread.sleep(8000);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
	
	}

	@Test(priority = 19, enabled = true)
	public void gridview_video_cobranding() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[6]"))
				.click();

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='bar'])[1]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button/i[@class='fa fa-times'])[2]")).click();
		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 20, enabled = true)
	public void gridview_Event() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[7]"))
				.click();

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='bar'])[1]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
		Thread.sleep(3000);

		action.moveToElement(ele).perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 21, enabled = true)
	public void gridview_Event_Cobranding() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[8]"))
				.click();

		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[1]/i")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(2000);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 22, enabled = true)
	public void folder_gridview() throws InterruptedException {
		Thread.sleep(8000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
				.click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/app-category-folder-view-util/div/div[2]/div/div/div/div[2]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/app-category-folder-view-util/div/div[2]/div/div/div/div[2]/a/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul/li[@class='filter'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("Basic");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[1]/a/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[1]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[1]/select")));
		dropdown.selectByVisibleText("Name (A-Z)");

	}

	@Test(priority = 23, enabled = true)
	public void folder_gridview_video() throws InterruptedException {
		Thread.sleep(8000);

		driver.findElement(By.xpath("(//ul/li[@class='filter'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("video");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[1]/a/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[1]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[1]/select")));
		dropdown.selectByVisibleText("Name (A-Z)");

	}

	@Test(priority = 24, enabled = true)
	public void folder_gridview_EmailCobranding() throws InterruptedException {
		Thread.sleep(8000);

		driver.findElement(By.xpath("(//ul/li[@class='filter'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("email");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[1]/a/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[1]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[1]/select")));
		dropdown.selectByVisibleText("Name (A-Z)");

	}

	@Test(priority = 25, enabled = true)
	public void folder_gridview_VideoCobranding() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//ul/li[@class='filter'])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("video");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[1]/a/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[1]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[1]/select")));
		dropdown.selectByVisibleText("Name (Z-A)");

	}

	@Test(priority = 26, enabled = true)
	public void folder_gridview_Event() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//ul/li[@class='filter'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("event");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[1]/a/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[1]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[1]/select")));
		dropdown.selectByVisibleText("Name (Z-A)");
	}

	@Test(priority = 27, enabled = true)
	public void folder_gridview_EventCobranding() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//ul/li[@class='filter'])[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("event");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[1]/a/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/div[2]/a[1]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

		Select dropdown = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[1]/select")));
		dropdown.selectByVisibleText("Name (Z-A)");
	}

	@Test(priority = 28, enabled = true)
	public void folder_gridview_grid_Email() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
				.click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/app-category-folder-view-util/div/div[2]/div/div/div/div[2]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/app-category-folder-view-util/div/div[2]/div/div/div/div[2]/a/i"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("email");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 29, enabled = true)
	public void folder_gridview_grid_video() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("video");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 30, enabled = true)
	public void folder_gridview_grid_EmailCobranding() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("email");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 31, enabled = true)
	public void folder_gridview_grid_VideoCobranding() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[6]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("video");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 32, enabled = true)
	public void folder_gridview_grid_Event() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[7]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("event");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}

	@Test(priority = 32, enabled = true)
	public void folder_gridview_grid_EventCobranding() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[8]"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("event");
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='show_email_template_preivew']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
				.click();
	}

	@Test(priority = 33, enabled = true)
	public void folder_gridview_list_Email() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fa-folder-custom-size']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
				.click();
		Select dropdown = new Select(driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/select")));
		dropdown.selectByVisibleText("Name (Z-A)");
		//

		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("Basic");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-inbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[2]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 34, enabled = true)
	public void folder_gridview_list_Video() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
				.click();
		Thread.sleep(3000);
		//
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("video");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[1]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[2]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 35, enabled = true)
	public void folder_gridview_list_EmailCobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("email");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[1]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[2]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 36, enabled = true)
	public void folder_gridview_list_VideoCobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("video");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[1]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[2]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 37, enabled = true)
	public void folder_gridview_list_Event() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);

		
		////
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[7]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("event");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[1]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[2]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);

	}

	@Test(priority = 38, enabled = true)
	public void folder_gridview_list_EventCobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		//
		
		
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[8]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("event");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[1]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[3]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr/td[5]/div/a[2]/i")).click();
		Thread.sleep(15000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 39, enabled = true)
	public void folder_gridview_list_grid_Email() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("email");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
}
	@Test(priority = 40, enabled = true)
	public void folder_gridview_list_grid_Video() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("video");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button/i")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[2]")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();

	}
	@Test(priority = 41, enabled = true)
	public void folder_gridview_list_grid_EmailCobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("email");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27705']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
	
}
	@Test(priority = 41, enabled = true)
	public void folder_gridview_list_grid_videoCobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(3000);
		//
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("video");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27595']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
	
}
	@Test(priority = 42, enabled = true)
	public void folder_gridview_list_grid_Event() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(3000);
		//
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("event");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150222']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
	
}
	@Test(priority = 43, enabled = true)
	public void folder_gridview_list_grid_EventCobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[4]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(3000);
		//
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[8]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys("event");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id='list-folder-items']/td/app-email-templates-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/div/div[2]/div/input"))
				.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]"));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[1]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id='email_spam_check']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();

		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='show_email_template_preivew']/div/div/div[1]/button)[1]")).click();
		Thread.sleep(3000);
		action1.moveToElement(ele1).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_149914']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/input[@value='Update']")).click();
driver.quit();
}

}
