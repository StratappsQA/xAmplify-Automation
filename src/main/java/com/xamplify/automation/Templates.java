package com.xamplify.automation;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
	static WebDriver driver;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mharish\\Desktop\\New folder (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://xamplify.co/login");
	}

	@Test(priority = 1, enabled = true)
	public void login() {

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("automated_vendor@analytify.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Xamplify@11");
		driver.findElement(By.cssSelector("button[type*='submit']")).click();
	}

	@Test(priority = 2, enabled = false)
	public void design() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='design-name mDisableColor'])[1]")).click();

	}

	@Test(priority = 3, enabled = false)
	public void design1() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[1]")).click();

		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("Basic");
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

	}

	@Test(priority = 4, enabled = false)
	public void video() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[2]")).click();
	}

	@Test(priority = 5, enabled = false)
	public void video1() throws InterruptedException {

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
	}

	@Test(priority = 6, enabled = false)
	public void emailcobranding() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[3]")).click();
	}

	@Test(priority = 7, enabled = false)
	public void emailcobranding1() throws InterruptedException {

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
	}

	@Test(priority = 8, enabled = false)
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
	}

	@Test(priority = 9, enabled = false)
	public void videocobranding1() throws InterruptedException {

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
	}

	@Test(priority = 10, enabled = false)
	public void eventco() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[6]")).click();
	}

	@Test(priority = 11, enabled = false)
	public void eventco1() throws InterruptedException {

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
	}

	@Test(priority = 12, enabled = false)
	public void survey() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[3]/h5/a/span"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='filter'])[7]")).click();
	}

	@Test(priority = 13, enabled = false)
	public void survey1() throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for a template']")).sendKeys("survey");
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
	}

	@Test(priority = 14, enabled = false)
	public void managetemplates() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='design-name']")).click();
	}

	@Test(priority = 15, enabled = false)
	public void managetemplates_Email() throws InterruptedException {

		driver.findElement(By.xpath("//ul/li[@class='filter'][1]")).click();
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
		Thread.sleep(10000);
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

	@Test(priority = 16, enabled = false)
	public void managetemplates_video() throws InterruptedException {
		Thread.sleep(3000);
		managetemplates();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();

	}

	@Test(priority = 17, enabled = false)
	public void managetemplates_2() throws InterruptedException {

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
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 18, enabled = false)
	public void managetemplates_3() throws InterruptedException {

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
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 19, enabled = false)
	public void managetemplates_5() throws InterruptedException {

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
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 20, enabled = false)
	public void managetemplates_4() throws InterruptedException {

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
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 21, enabled = false)
	public void gridview() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_27706']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
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

	}

	@Test(priority = 22, enabled = false)
	public void gridview2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150216']/div/div[2]/a[2]/i")).click();
		Thread.sleep(20000);
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
	}

	@Test(priority = 23, enabled = false)
	public void gridview3() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150217']/div/div[2]/a[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150217']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
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
	}

	@Test(priority = 24, enabled = false)
	public void gridview4() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(2000);
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
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150218']/div/div[2]/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150218']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
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
	}

	@Test(priority = 25, enabled = false)
	public void gridview5() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='manage-email-template-list']/tbody/tr[1]/td[5]/div/div[2]/a[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@class='fa fa-times'])[2]")).click();
	}

	@Test(priority = 26, enabled = false)
	public void gridview6() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[1]/div/div/div[4]/h5/a/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-home/div/div/app-manage-template/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[8]"))
				.click();

		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//div[@class='bar'])[1]"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150223']/div/div[2]/a[1]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='email_spam_check']/div/div/div[1]/button")).click();
		Thread.sleep(2000);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='emailTemplateListDiv_150223']/div/div[2]/a[2]/i")).click();

		Thread.sleep(20000);
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
	}

	@Test(priority = 27, enabled = true)
	public void folder_gridview() throws InterruptedException {
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
		managetemplates_Email();
		managetemplates_video();
		managetemplates_2();
		managetemplates_3();
		managetemplates_4();
		managetemplates_5();
		
		
		
	}

}