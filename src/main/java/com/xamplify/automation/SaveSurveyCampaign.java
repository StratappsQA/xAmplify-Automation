package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SaveSurveyCampaign extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(SaveSurveyCampaign.class);

	@Test (priority=169,enabled=true)

	public void sSave() throws InterruptedException, SQLException

	{
		Thread.sleep(4000);
		SurveyCampaign s1 = new SurveyCampaign();
		s1.scampaign();
		Thread.sleep(5000);

		// AutoResponsesSurveyCampaign ar_s=new AutoResponsesSurveyCampaign();
		// ar_s.autoResponsesSurvey();

		driver.findElement(By.xpath(properties.getProperty("s_save"))).click(); // Click on Save
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // Scroll down
		Thread.sleep(5000);
		logger.info("Click on Save");

		driver.findElement(By.xpath(properties.getProperty("s_sendTextMail"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_sendTextBox"))).sendKeys("chmounika@stratapps.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_sendTextSubmit"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_sendTextMail_OK"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_spamCheck"))).click();
		Thread.sleep(4000);

		WebDriverWait spam1 = new WebDriverWait(driver, 30);
		WebElement spam11 = spam1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("ssave_insidespamcheck"))));
		spam11.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("s_refresh"))).click(); // Refresh
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("s_spam_close"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_save1"))).click(); // Click on Save
		Thread.sleep(5000);

		String s_save = driver.findElement(By.xpath(properties.getProperty("s_response_msg"))).getText(); // response
		// message
		logger.info("Survey Campaign Saved Successfully");
		String Result = "Campaign saved successfully";

		if (Result.equals(s_save)) {
			// Thread.sleep(2000);
			System.out.println("Survey Campaign Saved Successfully");
		} else {
			Thread.sleep(2000);

			System.out.println("Survey Campaign Saved failed");
	
		}
		
		Thread.sleep(10000);
	}

}
