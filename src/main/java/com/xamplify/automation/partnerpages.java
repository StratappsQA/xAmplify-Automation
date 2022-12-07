package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class partnerpages {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile(
			"D:\\git\\Partnerpages\\xAmplify-Automation\\src\\main\\resources\\partnerpages.properties");
	final Logger logger = LogManager.getLogger(PartnerLogin.class);

	@Test(priority = 1, enabled = true)
	public void clickpages() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);

		// Wait till the element is not visible

		WebElement pages = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(properties.getProperty("pages"))));
		pages.click(); // hover on campaign
	}

	@Test(priority = 2, enabled = true)
	public void pages_list() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("public_link"))).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search"))).sendKeys("Manual public");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("public_preview"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("public_preview_close"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copy"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copy_close"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("listanalytics"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("managepages"))).click();
		Thread.sleep(3000);

	}

	@Test(priority = 3, enabled = true)
	public void pages_grid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);

		driver.findElement(By.xpath(properties.getProperty("click_grid"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("public_link"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("search"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search"))).sendKeys("Manual public");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mouseover")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridpreview"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("public_preview_close"))).click();
		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridcopy"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridclose"))).click();
		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("gridanalytics"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("managepages"))).click();
	}

	@Test(priority = 4, enabled = true)
	public void pages_foler_grid_list() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		Thread.sleep(4000);
		clickpages();
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("clickonfoldergridview"))).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mouseoverongrid1")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("viewgrid"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("searchbaringrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("searchbaringrid"))).sendKeys("manual public");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("searchbaringrid"))).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("publicpreview3"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("public_preview_close1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copyingrid1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("closeingrid1"))).click();
		Thread.sleep(3000);

	}

	@Test(priority = 5, enabled = true)
	public void pages_foler_grid_grid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		Thread.sleep(4000);
		clickpages();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("clickonfoldergridview"))).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mouseoverongrid1")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("viewgrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("grid1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("public_link"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("search"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search"))).sendKeys("Manual public");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();
		Thread.sleep(3000);
		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("mouseover")));

		// Creating object of an Actions class
		Actions action1 = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridpreview"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("public_preview_close"))).click();
		Thread.sleep(3000);
		action.moveToElement(ele1).perform();
		driver.findElement(By.xpath(properties.getProperty("gridcopy"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridclose"))).click();
		Thread.sleep(3000);

		clickpages();

	}

	@Test(priority = 6, enabled = true)
	public void pages_foler_list_list() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		driver.findElement(By.xpath(properties.getProperty("gridview_list_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("togotofolderlistview"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search2"))).sendKeys("Manual public");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search_click1"))).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("public_preview2"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("public_preview_close2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copy2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("copy_close2"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridclick"))).click();

	}

	@Test(priority = 7, enabled = true)
	public void pages_folder_list_grid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mouseoverongrid")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridpreview1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("grid_preview_close"))).click();
		Thread.sleep(3000);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath(properties.getProperty("gridcopy1"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("gridclose1"))).click();
	}

	@Test(priority = 8, enabled = true)
	public void private_pages() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		Thread.sleep(4000);
		clickpages();
		/*
		 * driver.findElement(By.xpath(properties.getProperty("home"))).click();
		 * Thread.sleep(3000);
		 */

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("private"))).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search"))).sendKeys("regular");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("private_view"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("private_close"))).click();

	}

	@Test(priority = 9, enabled = true)
	public void private_grid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("private_grid1"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("search"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search"))).sendKeys("regular");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("search_click"))).click();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mouseoverprivate")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("private_grid_view"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("private_grid_view_close"))).click();

	}

	@Test(priority = 10, enabled = true)
	public void private_folder_grid_list() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		Thread.sleep(8000);
		clickpages();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("clickonfoldergridview"))).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mouseoverongrid1")));

//Creating object of an Actions class
		Actions action = new Actions(driver);

//Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("viewgrid"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("searchbaringrid"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("searchbaringrid"))).sendKeys("regular");
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("searchbaringrid"))).sendKeys(Keys.ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("private_grid_view_private"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("view1infolderlist"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("view1infolderlistclose"))).click();

	}

	@Test(priority = 11, enabled = true)
	public void private_folder_grid_grid() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("click_Grid"))).click();
		Thread.sleep(3000);
		/*
		 * driver.findElement(By.xpath(properties.getProperty("searchbaringrid"))).clear
		 * (); Thread.sleep(2000);
		 * driver.findElement(By.xpath(properties.getProperty("searchbaringrid"))).
		 * sendKeys("regular"); Thread.sleep(2000);
		 * driver.findElement(By.xpath(properties.getProperty("search_click"))).click();
		 */

		WebElement ele1 = driver.findElement(By.xpath(properties.getProperty("mouseoverongridin")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mouseoverongrid_click"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("mouseoverongrid_close"))).click();
		Thread.sleep(5000);
		clickpages();

	}

	@Test(priority = 12, enabled = true)
	public void pages_private_folder_list_list() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		Thread.sleep(6000);
		driver.findElement(By.xpath(properties.getProperty("folder4"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("expandlist"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("expandlist_search"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(properties.getProperty("expandlist_search"))).sendKeys("regular");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("expandlist_search"))).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("expandlist_preview"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("expandlist_close"))).click();
		Thread.sleep(3000);

	}

	@Test(priority = 13, enabled = true)
	public void pages_folder_list_grid_list() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		driver.findElement(By.xpath(properties.getProperty("expandlistgrid"))).click();

		WebElement ele = driver.findElement(By.xpath(properties.getProperty("mouseoverongrid3")));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mouseoverongrid_open")));
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("mouseoverongrid_close")));

	}
}