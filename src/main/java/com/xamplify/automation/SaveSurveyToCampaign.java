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

public class SaveSurveyToCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

	final Logger logger = LogManager.getLogger(SaveSurveyToCampaign.class);

	@Test

	public void s_to_camp_Save() throws InterruptedException, SQLException

	{
		Thread.sleep(4000);
		SurveyToCampaign s1 = new SurveyToCampaign();
		s1.scampaign(); // Method Calling
		Thread.sleep(5000);

		// AutoResponsesSurveyCampaign ar_s=new AutoResponsesSurveyCampaign();
		// ar_s.autoResponsesSurvey();

//		Thread.sleep(3000);

		driver.findElement(By.xpath(properties.getProperty("s_to_camp_save"))).click(); // Click on Save
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		logger.info("Click on Save");

		driver.findElement(By.xpath(properties.getProperty("s_to_camp_sendTextMail"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_to_camp_sendTextBox")))
				.sendKeys("chmounika@stratapps.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_to_camp_sendTextSubmit"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_to_camp_sendTextMail_OK"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("s_to_camp_spamCheck"))).click();
		Thread.sleep(4000);

		WebDriverWait spam1 = new WebDriverWait(driver, 30);
		WebElement spam11 = spam1.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(properties.getProperty("s_to_campsave_insidespamcheck"))));
		spam11.click();

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("s_to_camp_refresh"))).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("s_to_camp_spam_close"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(properties.getProperty("s_to_camp_save1"))).click(); // Click on Save
		Thread.sleep(5000);

		String s_to_camp_save = driver.findElement(By.xpath(properties.getProperty("s_to_camp_response_msg")))
				.getText(); // response
		// message
		logger.info("Survey To Campaign Saved Successfully");
		String Result = "Campaign saved successfully";

		if (Result.equals(s_to_camp_save)) {
			// Thread.sleep(2000);
			System.out.println("Survey To Campaign Saved Successfully");
		} else {
			Thread.sleep(2000);

			System.out.println("Survey To Campaign Saved failed");
		}
	}

}
