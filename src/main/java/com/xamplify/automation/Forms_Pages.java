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
	private static final TimeUnit Seconds = null;
	static WebDriver driver = Instance.getInstance();
	static Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Partners.properties");
	final Logger logger = LogManager.getLogger(Forms_Pages.class);

		

		@Test(priority = 2, enabled = true)
		public void design_general() throws InterruptedException {
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[3]/h5/a/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys("yoga");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/button[2]"))
					.click();
			Thread.sleep(2000);
			WebElement ele1 = driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[2]/div/div/div/div[2]"));

	// Creating object of an Actions class
			Actions action1 = new Actions(driver);

	// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[2]/div/div/div/div[2]/a/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formName']")).sendKeys("harish" + System.currentTimeMillis());
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='full-screen'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(2000);
			// Create object of the Select class
			Select se = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[1]/select")));
			se.selectByIndex(4);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("harish");
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='template-delete']/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();
			Thread.sleep(2000);

		}

		@Test(priority = 3, enabled = true)
		public void design_quiz() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-manage-form/div/div[1]/ul/li[2]/a"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[3]/h5/a/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys("Default");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/button[2]"))
					.click();
			Thread.sleep(2000);
			WebElement ele1 = driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[2]/div/div/div/div[2]"));

	// Creating object of an Actions class
			Actions action1 = new Actions(driver);

	// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[2]/div/div/div/div[2]/a/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formName']")).sendKeys("harish" + System.currentTimeMillis());
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='full-screen'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();
			Thread.sleep(2000);
			// Create object of the Select class
			Select se = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[1]/select")));
			se.selectByIndex(4);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("harish");
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='template-delete']/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();
			Thread.sleep(2000);
		}

		@Test(priority = 4, enabled = true)
		public void design_survey() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-manage-form/div/div[1]/ul/li[2]/a"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[3]/h5/a/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys("follow");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/button[2]"))
					.click();
			Thread.sleep(2000);
			WebElement ele1 = driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[2]/div/div/div/div[2]"));

	// Creating object of an Actions class
			Actions action1 = new Actions(driver);

	// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-form/div/div[2]/div/div/div[2]/div/div/div/div[2]/a/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formName']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formName']")).sendKeys("harish" + System.currentTimeMillis());
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='full-screen'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[4]"))
					.click();
			Thread.sleep(2000);
			// Create object of the Select class
			Select se = new Select(driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[1]/select")));
			se.selectByIndex(4);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("harish");
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='template-delete']/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[1]")).click();
			Thread.sleep(2000);

		}

		@Test(priority = 5, enabled = true)
		public void design_Manage_Forms_List() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-manage-form/div/div[1]/ul/li[2]/a"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[2]/div/div/div[4]/h5/a/span"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("Regular");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[2]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='portlet-height']/div[1]/div[2]/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-fields']/div/div/div[2]/div[2]/div/div/button[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-fields']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='portlet-height']/div[1]/div[3]/div/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.sendKeys("#001");
			Thread.sleep(2000);
			WebElement element = driver
					.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 pl0']//input[@id='cmn-toggle-4']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[10]/div/div/div/div[2]/div/label"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='full-screen'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
		}

		@Test(priority = 6, enabled = true)
		public void design_Manage_Forms_List_quiz() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();
			Thread.sleep(2000);
			// **********************************************************************************************************************************************

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("quiz");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a/i[@class='fa fa-eye']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[2]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='portlet-height']/div[1]/div[2]/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-fields']/div/div/div[2]/div[2]/div/div/button[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-fields']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='portlet-height']/div[1]/div[3]/div/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.sendKeys("#001");
			Thread.sleep(2000);
			WebElement element = driver
					.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 pl0']//input[@id='cmn-toggle-4']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[10]/div/div/div/div[2]/div/label"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='full-screen'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}

		@Test(priority = 7, enabled = true)
		public void design_Manage_Forms_List_survey() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[4]"))
					.click();
			Thread.sleep(2000);
			// **********************************************************************************************************************************************

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("survey");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-eye']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[2]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='portlet-height']/div[1]/div[2]/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-fields']/div/div/div[2]/div[2]/div/div/button[4]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-fields']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='portlet-height']/div[1]/div[3]/div/button/span")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[1]/div/div[2]/div/input"))
					.sendKeys("#001");
			Thread.sleep(2000);
			WebElement element = driver
					.findElement(By.xpath("//div[@class='col-md-6 col-lg-6 pl0']//input[@id='cmn-toggle-4']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(5000);
			driver.findElement(
					By.xpath("//*[@id='add-form-designs']/div/div/div[2]/div/div/div[10]/div/div/div/div[2]/div/label"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='full-screen'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}

		@Test(priority = 8, enabled = true)
		public void design_Manage_Forms_Grid_Regular() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath("//span/i[@class='fa fa-th-large p10']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//ul/li[@class='filter'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("regular");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]"));

			Actions action1 = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			action1.moveToElement(ele1).perform();
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[3]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
		}

		@Test(priority = 9, enabled = true)
		public void design_Manage_Forms_Grid_quiz() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath("//span/i[@class='fa fa-th-large p10']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//ul/li[@class='filter'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("quiz");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]"));

			Actions action1 = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			action1.moveToElement(ele1).perform();
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[3]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
		}

		@Test(priority = 10, enabled = true)
		public void design_Manage_Forms_Grid_survey() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath("//span/i[@class='fa fa-th-large p10']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//ul/li[@class='filter'])[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys("survey");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]"));

			Actions action1 = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			action1.moveToElement(ele1).perform();
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[3]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}

		@Test(priority = 11, enabled = true)
		public void design_Manage_Forms_Folder_Gridview_Regular() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(5000);

			WebElement ele1 = driver.findElement(By.xpath(
					
			"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/app-category-folder-view-util/div/div[3]/div/div/div/div[2]"));
			Actions action1 = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/app-category-folder-view-util/div/div[3]/div/div/div/div[2]/a/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[2]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
		}

		@Test(priority = 12, enabled = true)
		public void design_Manage_Forms_Folder_Gridview_quiz() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[2]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}

		@Test(priority = 13, enabled = true)
		public void design_Manage_Forms_Folder_Gridview_survey() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[4]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[2]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/div[1]/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
		}

		@Test(priority = 14, enabled = true)
		public void design_Manage_Forms_Folder_Gridview_Gridview_Regular() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(2000);

			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]"));
			Actions action1 = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[2]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);

			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[1]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}

		@Test(priority = 15, enabled = true)
		public void design_Manage_Forms_Folder_Gridview_Gridview_quiz() throws InterruptedException {
			Thread.sleep(15000);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();
			Thread.sleep(3000);

			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]"));
			Actions action1 = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[2]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);

			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[1]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
		}

		@Test(priority = 16, enabled = true)
		public void design_Manage_Forms_Folder_Gridview_Gridview_survey() throws InterruptedException {
			Thread.sleep(15000);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[1]/ul/li[4]"))
					.click();
			Thread.sleep(3000);

			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]"));
			Actions action1 = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[2]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[1]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();

		}

		@Test(priority = 17, enabled = true)
		public void design_Manage_Forms_Folder_list_view_list_view_regular() throws InterruptedException {
			Thread.sleep(10000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='form-preview-modal']/div/div/div[1]/button/i)[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[3]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='form-url-modal']/div/div/div[1]/button/i)[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}

		@Test(priority = 18, enabled = true)
		public void design_Manage_Forms_Folder_list_view_list_view_quiz() throws InterruptedException {
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='form-preview-modal']/div/div/div[1]/button/i)[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[3]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='form-url-modal']/div/div/div[1]/button/i)[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
		}

		@Test(priority = 19, enabled = true)
		public void design_Manage_Forms_Folder_list_view_list_view_Survey() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[1]/ul/li[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='form-preview-modal']/div/div/div[1]/button/i)[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[3]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='form-url-modal']/div/div/div[1]/button/i)[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-row']/div/a[1]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();
		}

		@Test(priority = 20, enabled = true)
		public void design_Manage_Forms_Folder_list_view_Grid_view_regular() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(2000);

			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]"));
			Actions action1 = new Actions(driver);

			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[2]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1466']/div/div[4]/a[1]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}

		@Test(priority = 21, enabled = true)
		public void design_Manage_Forms_Folder_list_view_Grid_view_quiz() throws InterruptedException {
			Thread.sleep(25000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();
			Thread.sleep(3000);

			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]"));
			Actions action1 = new Actions(driver);

			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[2]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1521']/div/div[4]/a[1]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}

		@Test(priority = 22, enabled = true)
		public void design_Manage_Forms_Folder_list_view_Grid_view_survey() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/div[1]/div/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-form/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();

			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-forms-list-view-util/div[2]/div/div/div[1]/div/div/div[1]/ul/li[4]"))
					.click();
			Thread.sleep(3000);

			WebElement ele1 = driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]"));
			Actions action1 = new Actions(driver);

			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[2]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='form-preview-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='form-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(3000);
			action1.moveToElement(ele1).perform();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='formListDiv_1346']/div/div[4]/a[1]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='bottom-right']/button[1]")).click();

		}
		
		
		@Test(priority = 23, enabled = true)
		public void design_reg_public() throws InterruptedException {
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html/body/app-root/app-home/div/app-leftsidebar/div/div/ul/li[5]/a/span[1]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[3]/h5/a/span"))
					.click();
			Thread.sleep(8000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(3000);
			//

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys("demo");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/button[2]/i"))
					.click();
			Thread.sleep(3000);

			WebElement ele = driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[2]/div/div/div/div"));

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[2]/div/div/div/div/a/i"))
					.click();

			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-add-landing-page/div/div[2]/div/div/div[1]/button/input"))
					.click();
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harishreg" + System.currentTimeMillis());
			Thread.sleep(2000);
			Select se = new Select(driver.findElement(By.xpath("//*[@id='pageType']")));

			// Select the option by index
			se.selectByVisibleText("PUBLIC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='save']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("harish");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[3]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[2]/button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[1]/ul/li[1]/a[2]"))
					.click();
			Thread.sleep(3000);

		}

		@Test(priority = 24, enabled = true)
		public void design_reg_private() throws InterruptedException {
			Thread.sleep(10000);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[3]/h5/a/span"))
					.click();
			Thread.sleep(8000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys("audy");
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/button[2]/i"))
					.click();
			Thread.sleep(3000);
			//
			WebElement ele = driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[2]/div/div/div/div"));
			Thread.sleep(2000);

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[2]/div/div/div/div/a/i"))
					.click();

			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-add-landing-page/div/div[2]/div/div/div[1]/button/input"))
					.click();
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harishreg" + System.currentTimeMillis());
			Thread.sleep(2000);
			Select se = new Select(driver.findElement(By.xpath("//*[@id='pageType']")));

			// Select the option by index
			se.selectByVisibleText("PRIVATE");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='save']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("harish");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[3]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[2]/button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[1]/ul/li[1]/a[2]"))
					.click();
			Thread.sleep(3000);

		}

		@Test(priority = 25, enabled = true)
		public void design_cobranded_private() throws InterruptedException {
			Thread.sleep(5000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[3]/h5/a/span"))
					.click();
			Thread.sleep(8000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys("test saving");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[2]/div/div/div/div"));
			Thread.sleep(2000);

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[2]/div/div/div/div/a/i"))
					.click();
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-add-landing-page/div/div[2]/div/div/div[1]/button/input"))
					.click();
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harishreg" + System.currentTimeMillis());
			Thread.sleep(2000);
			Select se = new Select(driver.findElement(By.xpath("//*[@id='pageType']")));

			// Select the option by index
			se.selectByVisibleText("PRIVATE");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='save']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("harish");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[2]/button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[1]/ul/li[1]/a[2]"))
					.click();
			Thread.sleep(3000);
		}

		@Test(priority = 26, enabled = true)
		public void design_cobranded_public() throws InterruptedException {
			Thread.sleep(8000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[3]/h5/a/span"))
					.click();
			Thread.sleep(8000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[1]/ul/li[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys("test saving");
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/input"))
					.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[2]/div/div/div/div"));
			Thread.sleep(2000);

			// Creating object of an Actions class
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-select-landing-page/div/div[2]/div/div/div[2]/div/div/div/div/a/i"))
					.click();
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-add-landing-page/div/div[2]/div/div/div[1]/button/input"))
					.click();
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[@id='templateNameId']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='templateNameId']")).sendKeys("harishreg" + System.currentTimeMillis());
			Thread.sleep(2000);
			Select se = new Select(driver.findElement(By.xpath("//*[@id='pageType']")));

			// Select the option by index
			se.selectByVisibleText("PUBLIC");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='save']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("harish");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-trash-o']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div/div[2]/button[1]")).click();
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[1]/ul/li[1]/a[2]"))
					.click();

		}

		@Test(priority = 27, enabled = true)
		public void Manage_Regular_public() throws InterruptedException {
			Thread.sleep(20000);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[4]/h5/a/span"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("regular");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[1]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-clipboard']")).click();//
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div/button[@class='close-circle'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

		}

		@Test(priority = 28, enabled = true)
		public void Manage_Regular_private() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("regularprivate");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[1]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-clipboard']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='fa fa-pencil-square-o mDisableColor']")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 29, enabled = true)
		public void Manage_Regular_Cobranded_private() throws InterruptedException {
			Thread.sleep(20000);
			//

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("Cobranded private");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[1]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-clipboard']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='fa fa-pencil-square-o mDisableColor']")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 30, enabled = true)
		public void Manage_Regular_Cobranded_public() throws InterruptedException {
			Thread.sleep(20000);
			
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("cobranded public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[1]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-clipboard']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='fa fa-pencil-square-o mDisableColor']")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 31, enabled = true)
		public void Gridview_Manage_regular_public() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("regular public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[3]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(4000);

			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();

			Thread.sleep(5000);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[1]/i")).click();
			Thread.sleep(20000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

		}

		@Test(priority = 32, enabled = true)
		public void Gridview_Manage_regular_private() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("regularprivate");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[3]/i")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(2000);

			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[2]/i")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();

			Thread.sleep(3000);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[1]")).click();
			Thread.sleep(20000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
			Thread.sleep(5000);

			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 33, enabled = true)
		public void Gridview_Manage_Cobranded_public() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("cobranded public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[3]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button/i")).click();
			Thread.sleep(4000);

			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button/i")).click();

			Thread.sleep(4000);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[1]/i")).click();
			Thread.sleep(20000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

		}

		@Test(priority = 34, enabled = true)
		public void Gridview_Manage_Cobranded_private() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("cobranded private");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[3]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button/i")).click();
			Thread.sleep(3000);

			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[2]/i")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='float-right']")).click();

			Thread.sleep(5000);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[1]/i")).click();
			Thread.sleep(20000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

		}

		@Test(priority = 35, enabled = true)
		public void Folder_Gridview_Manage_regular_public() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(5000);

			WebElement ele = driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[3]/div/div/div/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[3]/div/div/div/div[2]/a/i"))
					.click();
			Thread.sleep(3000);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("regular public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[1]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-clipboard']")).click();//
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div/button[@class='close-circle'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-pencil-square-o mDisableColor']")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

		}

		@Test(priority = 36, enabled = true)
		public void Folder_Gridview_Manage_regular_private() throws InterruptedException {
			Thread.sleep(20000);
			
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("regularprivate");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[1]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-clipboard']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//i[@class='fa fa-pencil-square-o mDisableColor']")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 37, enabled = true)
		public void Folder_Gridview_Manage_cobranded_public() throws InterruptedException {
			Thread.sleep(20000);
			
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("cobranded public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[1]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-clipboard']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//i[@class='fa fa-pencil-square-o mDisableColor']")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 38, enabled = true)
		public void Folder_Gridview_Manage_cobranded_private() throws InterruptedException {
			Thread.sleep(20000);

			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("Cobranded private");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp ']/div/div[1]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//a/i[@class='fa fa-clipboard']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//i[@class='fa fa-pencil-square-o mDisableColor']")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 39, enabled = true)
		public void Folder_Gridview_grid_Manage_regular_public() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("regular public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[3]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(4000);

			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();

			Thread.sleep(5000);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[1]/i")).click();
			Thread.sleep(20000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

		}

		@Test(priority = 40, enabled = true)
		public void Folder_Gridview_grid_Manage_regular_private() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
					.click();

			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("regularprivate");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[3]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button")).click();
			Thread.sleep(4000);

			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();

			Thread.sleep(3000);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[1]")).click();
			Thread.sleep(20000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 41, enabled = true)
		public void Folder_Gridview_grid_Manage_regular_cobrandedpublic() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("cobranded public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[3]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button/i")).click();
			Thread.sleep(4000);

			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[2]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button/i")).click();

			Thread.sleep(3000);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[1]/i")).click();
			Thread.sleep(20000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

		}

		@Test(priority = 42, enabled = true)
		public void Folder_Gridview_grid_Manage_regular_cobrandedprivate() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[2]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).clear();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys("cobranded private");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='sort-text']")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]"));
			Actions action = new Actions(driver);

			// Performing the mouse hover action on the target element.
			action.moveToElement(ele).perform();

			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[3]/i")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='landing-page-url-modal']/div/div/div[1]/button/i")).click();
			Thread.sleep(4000);

			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[2]/i")).click();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='over-flow-y']/div[1]/button")).click();

			Thread.sleep(4000);
			action.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[1]/i")).click();
			Thread.sleep(20000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
			Thread.sleep(2000);

			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
			

		}

		@Test(priority = 43, enabled = true)
		public void Folder_listview_grid_Manage_regular_regularpublic() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys("regular public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[3]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[@id='landing-page-url-modal']/div/div/div[1]/button)[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[2]/i")).click();//
			Thread.sleep(8000);
			driver.findElement(By.xpath("(//*[@id='over-flow-y']/div[1]/button)[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[1]/i")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

		}

		@Test(priority = 44, enabled = true)
		public void Folder_listview_grid_Manage_regular_regularprivate() throws InterruptedException {
			Thread.sleep(20000);
			/*driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-design/div/div[2]/div/div/div[2]/div/div[3]/div/div/div[4]/h5/a/span")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))*/
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(6000);
			driver.findElement(By.xpath(
					"//span[@class='btn btn-xs hidden-xs l-g-view margin-space folder-list-span-custom-width']"))
					.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(
			"//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
			.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys("regularprivate");
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[3]/i")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//*[@id='landing-page-url-modal']/div/div/div[1]/button)[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[2]/i")).click();//
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//*[@id='over-flow-y']/div[1]/button)[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[1]/i")).click();
	Thread.sleep(15000);
	driver.switchTo().frame(0);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//*[@id='update']")).click();

	}
		@Test(priority = 45, enabled = true)
		public void Folder_listview_grid_Manage_regular_cobrandedpublic() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(15000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[4]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys("cobranded public");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[3]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[@id='landing-page-url-modal']/div/div/div[1]/button)[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[2]/i")).click();//
			Thread.sleep(8000);
			driver.findElement(By.xpath("(//*[@id='over-flow-y']/div[1]/button)[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[1]/i")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='update']")).click();

			}
		@Test(priority = 46, enabled = true)
		public void Folder_listview_grid_Manage_regular_cobrandedprivate() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys("cobranded private");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[3]/i")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[@id='landing-page-url-modal']/div/div/div[1]/button)[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[2]/i")).click();//
			Thread.sleep(8000);
			driver.findElement(By.xpath("(//*[@id='over-flow-y']/div[1]/button)[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id='actions-td-width-xamp']/div/a[1]/i")).click();
			Thread.sleep(15000);
			driver.switchTo().frame(0);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div[2]/button")).click();
			Thread.sleep(4000);
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			driver.findElement(By.xpath("//*[@id='update']")).click();
			
	}
		@Test(priority = 47, enabled = true)
		public void Folder_gridview_grid_Manage_regular_public() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[2]"))
					.click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys("regular public");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]"));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[3]/i")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@id='landing-page-url-modal']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(4000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[2]/i")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//*[@id='over-flow-y']/div[1]/button)[1]")).click();

		Thread.sleep(5000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='landingPageListDiv_965']/div[2]/a[1]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='update']")).click();


		}

		@Test(priority = 48, enabled = true)
		public void Folder_gridview_grid_Manage_regular_private() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[3]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys("regularprivate");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]"));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='landing-page-url-modal']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[2]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id='over-flow-y']/div[1]/button/i)[1]")).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='landingPageListDiv_1099']/div[2]/a[1]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='update']")).click();
		

	}
		@Test(priority = 49, enabled = true)
		public void Folder_gridview_grid_Manage_cobranded_public() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[4]"))
					.click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys("cobranded public");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]"));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='landing-page-url-modal']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[2]/i")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//*[@id='over-flow-y']/div[1]/button/i)[1]")).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='landingPageListDiv_967']/div[2]/a[1]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='update']")).click();
		}

		@Test(priority = 50, enabled = true)
		public void Folder_gridview_grid_Manage_cobranded_private() throws InterruptedException {
			Thread.sleep(20000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/div[1]/div/div[2]/div/span[3]/i"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath(
					"/html/body/app-root/app-home/div/div/app-manage-landing-page/div/div[3]/div/div/app-category-folder-view-util/div/div[1]/div/div/div/span[4]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@id='fa-folder-custom-size'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(
					"//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[1]/div/ul/li[5]"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='list-folder-items']/td/app-landing-pages-list-view-util/div[2]/div/div/div[1]/div/div[2]/div/span[2]/i")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys("cobranded private");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='sort-text'])[2]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]"));
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();

		driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[3]/i")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@id='landing-page-url-modal']/div/div/div[1]/button/i)[1]")).click();
		Thread.sleep(2000);

		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[2]/i")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@id='over-flow-y']/div[1]/button/i)[1]")).click();

		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id='landingPageListDiv_1100']/div[2]/a[1]/i")).click();
		Thread.sleep(20000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'SAVE')]/..")).click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id='update']")).click();


	}


	}


