package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AutoResponseEmailToCampaign {

	WebDriver driver = Instance.getInstance();

	Properties properties = PropertiesFile.readPropertyFile("D:\\GitHub\\xAmplify-Automation\\src\\main\\resources\\Campaign.properties");

final Logger logger = LogManager.getLogger(AutoResponseEmailToCampaign.class);
	@Test

	public void autoResponsesEmailTo() throws InterruptedException {
		driver.findElement(By.xpath(properties.getProperty("email_to_autoresponse1"))).click(); // auto responses
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		Thread.sleep(4000);
		WebElement ele_drpdwn = driver.findElement(By.xpath(properties.getProperty("email_to_drop_down_click"))); // select dropdown
																											
		// rdrpdwn.click();
		Select when_to_send_email = new Select(ele_drpdwn);
		Thread.sleep(5000);
		when_to_send_email.selectByValue("20");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("email_to_arwv_subject")))
				.sendKeys("send immediately after clicked"); // select "send immediatley after clicked"
		Thread.sleep(5000);
		WebElement avaiable_dropdown1 = driver
				.findElement(By.xpath(properties.getProperty("email_to_select_earwv_avaiable_url"))); // select drop down
		avaiable_dropdown1.click();
		Select url = new Select(avaiable_dropdown1);
		Thread.sleep(5000);
		url.selectByVisibleText("https://www.facebook.com/"); // select facebook link
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("email_to_ar_frame1"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement()
				.sendKeys("Hello:send immediately after clicked,thanku for clicking immediately");

		driver.switchTo().defaultContent();
		Thread.sleep(6000);

		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(document.body.scrollHeight,0)");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_autoresponse2"))).click(); // auto response
		Thread.sleep(5000);

		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("email_to_subject2"))).sendKeys("send if not clicked"); // subject
		Thread.sleep(4000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("email_to_ar_frame2")))); // switch
																										// to
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello,send if not clicked:please click the mail");

		driver.switchTo().defaultContent();

		JavascriptExecutor js21 = (JavascriptExecutor) driver;
		js21.executeScript("window.scrollTo(document.body.scrollHeight,0)");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_autoresponse3"))).click(); // auto response
		Thread.sleep(5000);
		JavascriptExecutor js31 = (JavascriptExecutor) driver;
		js31.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		WebElement ele_drpdwn4 = driver.findElement(By.xpath(properties.getProperty("email_to_drop_down_click3"))); // drop down
		// ele_drpdwn4.click(); // click

		Select when_to_send_email2 = new Select(ele_drpdwn4); // select drop down
		Thread.sleep(5000);
		when_to_send_email2.selectByValue("21");
		Thread.sleep(8000);
		driver.findElement(By.xpath(properties.getProperty("email_to__xdays"))).sendKeys("1"); // select x days
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("email_to_subject3"))).sendKeys("schedule"); // subject
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("email_to_ar_frame3")))); // switch
																										// to
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:campgin is scheduled for 1 day...");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		WebElement avble_drpdwn = driver.findElement(By.xpath(properties.getProperty("email_to_select_earwv_avaiable_url3"))); // select
																														// drop
																														// down
		avble_drpdwn.click();
		Select url3 = new Select(avble_drpdwn);
		Thread.sleep(5000);
		url3.selectByVisibleText("https://www.facebook.com/"); // select facebook link
		// url.selectByValue(2);
		Thread.sleep(7000);

		JavascriptExecutor js211 = (JavascriptExecutor) driver;
		js211.executeScript("window.scrollTo(document.body.scrollHeight,0)");

		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_ar_visit"))).click(); // autoresponse
		Thread.sleep(5000);

		WebElement rdrpdwn = driver.findElement(By.xpath(properties.getProperty("email_to_aresponse_drpdwn"))); // select drop
																											// down
		// rdrpdwn.click();

		Select reason = new Select(rdrpdwn);
		Thread.sleep(5000);
		reason.selectByValue("13");
		Thread.sleep(7000);
		driver.findElement(By.xpath(properties.getProperty("email_to_arv_xdays"))).sendKeys("1"); // select x days
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("email_to_arvsubject1"))).sendKeys("email is opened"); // subject
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("email_to_ar_frame4")))); // switch
																										// to
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:email is opened,thanku for opening email");

		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("email_to_ar_visit2"))).click(); // autoresponse
		Thread.sleep(5000);

		JavascriptExecutor js13 = (JavascriptExecutor) driver;
		js13.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("email_to_arv2_xdays"))).sendKeys("1"); // select x days
		Thread.sleep(4000);

		driver.findElement(By.xpath(properties.getProperty("email_to_arvsubject2"))).sendKeys("email not opened---)"); // subject
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("email_to_ar_frame5")))); // switch the
																										// frame

		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:email is not opened;please open the email");

		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		JavascriptExecutor js14 = (JavascriptExecutor) driver;
		js14.executeScript("window.scrollTo(document.body.scrollHeight,0)");

		driver.findElement(By.xpath(properties.getProperty("email_to_ar_visit3"))).click(); // auto response
		Thread.sleep(5000);

		JavascriptExecutor js15 = (JavascriptExecutor) driver;
		js15.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement rdrpdwn2 = driver.findElement(By.xpath(properties.getProperty("email_to_aresponse_drpdwn3"))); // select
																											// drop
																											// down
		// rdrpdwn.click();
		Select reason1 = new Select(rdrpdwn2);
		Thread.sleep(5000);
		reason1.selectByValue("16");
		Thread.sleep(8000);

		driver.findElement(By.xpath(properties.getProperty("email_to_arvsubject3")))
				.sendKeys("send immeditely after email is opnd"); // subject
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("email_to_ar_frame6")))); // switch the
																										// frame
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello:send immeditely after email is opnd,thnku for opening");
		driver.switchTo().defaultContent();

		JavascriptExecutor js16 = (JavascriptExecutor) driver;
		js16.executeScript("window.scrollTo(document.body.scrollHeight,0)");

//		driver.findElement(By.xpath(properties.getProperty("email_ar_visit4"))).click(); // auto response
//		Thread.sleep(5000);
//
//		JavascriptExecutor js17 = (JavascriptExecutor) driver;
//		js17.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//
//		Thread.sleep(4000);
//		WebElement rdrpdwn11 = driver.findElement(By.xpath(properties.getProperty("e_aresponse_drpdwn4"))); // select
//																											// drop
//																											// down
		// rdrpdwn.click();
//		Select reason11 = new Select(rdrpdwn11);
//		Thread.sleep(3000);
//		reason11.selectByValue("22");
//		Thread.sleep(4000);
//
//		driver.findElement(By.xpath(properties.getProperty("e_arvsubject4"))).sendKeys(" redistribute mail.");
//		driver.findElement(By.xpath(properties.getProperty("e_arv_xdays_min"))).sendKeys("1"); // subject
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(properties.getProperty("e_arv_choosetemp"))).click(); // choosing the template
//
//		Thread.sleep(6000);
//		WebElement e_arv_templatesearch = driver
//				.findElement(By.xpath(properties.getProperty("e_arv_template_senddata")));
//		e_arv_templatesearch.sendKeys("basic");
//		e_arv_templatesearch.sendKeys(Keys.ENTER);
//	Thread.sleep(5000);
//
//		driver.findElement(By.xpath(properties.getProperty("e_arv_selecttemplate"))).click();
//		Thread.sleep(5000);
logger.info("Auto responses selected");

	}
}
