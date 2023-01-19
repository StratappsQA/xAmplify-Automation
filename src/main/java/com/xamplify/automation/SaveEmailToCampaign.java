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
import org.testng.annotations.Test;

public class SaveEmailToCampaign extends ExtentReportsClass {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("src/main/resources/Campaign.properties");
	

	final Logger logger = LogManager.getLogger(SaveEmailToCampaign.class);

	@Test (priority=154,enabled=true)
	public void e_tosave() throws InterruptedException, SQLException {

		Thread.sleep(4000);

		EmailToCampaign e11 = new EmailToCampaign();
		e11.email_to_campaign();

		Thread.sleep(5000);

		// AutoResponseEmailCampaign ar_e1=new AutoResponseEmailCampaign();
		// ar_e1.autoResponsesEmail();

		// Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("email_to_testmail"))).click();
		// click on test mail

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("email_to_mailid"))).sendKeys("chmounika@stratapps.com"); // send to
																												// any
																												// mail
																												// id

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("email_to_submit"))).click();
		// submit
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("email_to_ok"))).click(); // ok
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_spamcheck"))).click();
		Thread.sleep(3000);

		WebDriverWait w7 = new WebDriverWait(driver, 30);
		WebElement we7 = w7.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("email_to_save_insidespamcheck"))));
		we7.click();

		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("email_to_save_inside_refresh"))).click();
		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("email_to_save_spam_close"))).click();
		Thread.sleep(7000);

		driver.findElement(By.xpath(properties.getProperty("email_to_save_click"))).click(); // click SAVE
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_save"))).click(); // click to save campaign
		Thread.sleep(8000);

		String email_to_save = driver.findElement(By.xpath(properties.getProperty("email_to_response_msg"))).getText(); // response
		// message

		Thread.sleep(5000);

		String expectedtitle = "Campaign saved successfully";
		Thread.sleep(5000);

		if (expectedtitle.equals(email_to_save)) {
			System.out.println(" email  Campaign saved successfully");
			Thread.sleep(5000);

		} else {
			System.out.println(" email Campaign failed");
		}

		logger.info("Email Campaign saved Successfully");

		Thread.sleep(10000);
	}

}
