package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SaveEmailCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(SaveEmailCampaign.class);

	@Test
	public void esave() throws InterruptedException, SQLException {

		Thread.sleep(4000);

		EmailCampaign e11 = new EmailCampaign();
		e11.ecampaign();

		Thread.sleep(5000);

		// AutoResponseEmailCampaign ar_e1=new AutoResponseEmailCampaign();
		// ar_e1.autoResponsesEmail();

		// Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("e_testmail"))).click();
		// click on test mail

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("e_mailid"))).sendKeys("agayatri@stratapps.com"); // send to
																												// any
																												// mail
																												// id

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("submit"))).click();
		// submit
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("ok"))).click(); // ok
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("espamcheck"))).click();
		Thread.sleep(3000);

		WebDriverWait w7 = new WebDriverWait(driver, 30);
		WebElement we7 = w7.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("esave_insidespamcheck"))));
		we7.click();

		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("esave_inside_refresh"))).click();
		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("esave_spam_close"))).click();
		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("esave_click"))).click(); // click SAVE
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("esave"))).click(); // click to save campaign
		Thread.sleep(8000);

		String e_save = driver.findElement(By.xpath(properties.getProperty("e_response_msg"))).getText(); // response
		// message

		Thread.sleep(5000);

		String expectedtitle = "Campaign saved successfully";
		Thread.sleep(5000);

		if (expectedtitle.equals(e_save)) {
			System.out.println(" email  Campaign saved successfully");
			Thread.sleep(5000);

		} else {
			System.out.println(" email Campaign failed");
		}

		logger.info("Email Campaign saved Successfully");
		Thread.sleep(8000);
	}

}
