package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoResponses_RedistributionSurveyCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile
			.readPropertyFile("D:\\git\\xAmplify-Automation\\src\\main\\resources\\RedistributionCampaign.properties");

	final Logger logger = LogManager.getLogger(AutoResponses_RedistributionSurveyCampaign.class);

	@Test
	public void autoResponses_redistributionSurvey() throws InterruptedException {
		driver.findElement(By.xpath(properties.getProperty("click_autores_website"))).click(); // Website - auto responses
		Thread.sleep(5000);
		logger.info("clicked on Autorespones for Website");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,300)");

		Thread.sleep(4000);
		WebElement responses_drpdwn = driver.findElement(By.xpath(properties.getProperty("click_ar_website_drp"))); // select dropdown
		//responses_drpdwn.click();
		Thread.sleep(3000);
		// rdrpdwn.click();
		Select when_to_send_email = new Select(responses_drpdwn);
		Thread.sleep(5000);
		when_to_send_email.selectByValue("20");
		Thread.sleep(4000);
		logger.info("send immediatley after clicked");
		driver.findElement(By.xpath(properties.getProperty("ar_subject1")))
				.sendKeys("send immediately after clicked"); // select "send immediatley after clicked"
		Thread.sleep(5000);
		logger.info("click on available URL's Dropdown");
		WebElement avaiable_dropdown1 = driver
				.findElement(By.xpath(properties.getProperty("click_available_URL's"))); // select available URL's drop down
//		avaiable_dropdown1.click();
		Thread.sleep(3000);
		Select url = new Select(avaiable_dropdown1);
		Thread.sleep(5000);
		url.selectByValue("2: https://www.facebook.com/"); // select facebook link
		Thread.sleep(5000);
		logger.info("Facebook Clicked");

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("ar_message_body"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement()
				.sendKeys("Hello:send immediately after clicked,thanku for clicking immediately");
		logger.info("Message given");
		driver.switchTo().defaultContent();
		Thread.sleep(4000);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(document.body.scrollHeight,300)");

		Thread.sleep(5000);
		
		logger.info("Click on '+' for website auto response2");

		driver.findElement(By.xpath(properties.getProperty("click_autores_website2"))).click(); // Website auto response2
		Thread.sleep(4000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(document.body.scrollHeight,300)");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("ar_subject2"))).sendKeys("send if not clicked"); // subject
		Thread.sleep(4000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("ar_message_body2")))); // switch
																										// to
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello,send if not clicked:please click the mail");

		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);

		JavascriptExecutor js21 = (JavascriptExecutor) driver;
		js21.executeScript("window.scrollTo(document.body.scrollHeight,300)");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("click_autores_website3"))).click(); // auto response
		Thread.sleep(5000);
		JavascriptExecutor js31 = (JavascriptExecutor) driver;
		js31.executeScript("window.scrollTo(document.body.scrollHeight,300)");
		Thread.sleep(5000);
		WebElement responses_drpdwn2 = driver.findElement(By.xpath(properties.getProperty("click_ar_website_drp3"))); // drop down
		// ele_drpdwn4.click(); // click

		Select when_to_send_email2 = new Select(responses_drpdwn2); // select drop down
		Thread.sleep(5000);
		when_to_send_email2.selectByValue("21");
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("click_Wait_X_days"))).sendKeys("1"); // select x days
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("ar_subject3"))).sendKeys("schedule"); // subject
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("ar_message_body3")))); // switch
																										// to
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:campgin is scheduled for 1 day...");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		logger.info("Auto responses to Website visit Completed");

		JavascriptExecutor js211 = (JavascriptExecutor) driver;
		js211.executeScript("window.scrollTo(document.body.scrollHeight,300)");

		Thread.sleep(5000);

		logger.info("click on the Auto responses to your email");
		driver.findElement(By.xpath(properties.getProperty("click_autoresponse_email"))).click(); //click email autoresponse
		Thread.sleep(5000);

		logger.info("click on the Auto responses reason dropdown");

		WebElement reason_drpdwn = driver.findElement(By.xpath(properties.getProperty("email_ar_response_reason_drpdwn"))); // select drop down
		// rdrpdwn.click();

		Select reason = new Select(reason_drpdwn);
		Thread.sleep(5000);
		reason.selectByValue("13");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("email_ar_xdays"))).sendKeys("1"); // select x days
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("email_ar_subject1"))).sendKeys("email is opened"); // subject
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("ar_message_body4")))); // switch
																										// to
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:email is opened,thanku for opening email");

		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("click_autoresponse_email2"))).click(); // autoresponse
		Thread.sleep(5000);

		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		js13.executeScript("window.scrollTo(300,document.body.scrollHeight)");

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("email_ar_xdays2"))).sendKeys("1"); // select x days
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("email_ar_subject2"))).sendKeys("email not opened---)"); // subject
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("ar_message_body5")))); // switch the
																										// frame

		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:email is not opened;please open the email");

		driver.switchTo().defaultContent();
		Thread.sleep(5000);

//		JavascriptExecutor js14 = (JavascriptExecutor) driver;
//		js14.executeScript("window.scrollTo(document.body.scrollHeight,300)");

		driver.findElement(By.xpath(properties.getProperty("click_autoresponse_email3"))).click(); // auto response
		Thread.sleep(5000);

		JavascriptExecutor js15 = (JavascriptExecutor) driver;
		js15.executeScript("window.scrollTo(200,document.body.scrollHeight)");
		WebElement rdrpdwn2 = driver.findElement(By.xpath(properties.getProperty("email_ar_response_reason_drpdwn2"))); // select
																											// drop
																											// down
		// rdrpdwn.click();
		Select reason1 = new Select(rdrpdwn2);
		Thread.sleep(5000);
		reason1.selectByValue("16");
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("email_ar_subject3")))
				.sendKeys("send immediately after email is opend"); // subject
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("ar_message_body6")))); // switch the
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:send immediately after email is opend,thanku for opening");
		driver.switchTo().defaultContent();

		JavascriptExecutor js16 = (JavascriptExecutor) driver;
		js16.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(3000);

		logger.info("Auto responses selected");

	}

}
