package com.xamplify.automation;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AutoresponsesVideoCampaign {
	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("src/main/resources/Campaign.properties");

final Logger logger = LogManager.getLogger(AutoresponsesVideoCampaign.class);	
	@Test
	public void autoResponsesVideo() throws InterruptedException {
		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_website_vst"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("a_r_w_v_sub1"))).sendKeys("s:send if not clicked");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("a_r_w_v_msg1"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("please click the link in mail(send if not clicked);");
		driver.switchTo().defaultContent();

		// auto response 2 //

		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_website_vst2"))).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		WebElement drpdwnv1 = driver.findElement(By.xpath(properties.getProperty("whn_to_snd_eml_drpdwn")));
		Select arv_vde = new Select(drpdwnv1);
		Thread.sleep(4000);
		arv_vde.selectByValue("20");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("a_r_w_v_sub2")))
				.sendKeys("s.send immediately after clicked");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("a_r_w_v_msg2"))));
		driver.findElement(By.xpath("html/body")).click();

		driver.switchTo().activeElement().sendKeys("tq for clicking immmediately (send immediately after clicked)");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

		// auto response 3 //

		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_website_vst3"))).click();
		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		WebElement drpdwnv3 = driver.findElement(By.xpath(properties.getProperty("whn_to_snd_eml_drpdwn2")));
		Select arv_vde1 = new Select(drpdwnv3);
		Thread.sleep(5000);
		arv_vde1.selectByValue("21");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("a_r_w_v_rply_days"))).sendKeys("1");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("a_r_w_v_sub3"))).sendKeys("s.schedule");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("a_r_w_v_msg3"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello..scheduled");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

		// auto visit 1 //

		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_email_vst"))).click();
		Thread.sleep(5000);
		WebElement rdrpdwnv = driver.findElement(By.xpath(properties.getProperty("Reason")));
		// rdrpdwn1.click();
		Select arve_vde = new Select(rdrpdwnv);
		Thread.sleep(5000);
		arve_vde.selectByValue("13");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("a_r_e_v_rply1"))).sendKeys("1");
		Thread.sleep(4000);
		driver.findElement(By.xpath(properties.getProperty("a_r_e_v_sub1"))).sendKeys("email is opened..");
		Thread.sleep(4000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("a_r_e_v_msg1"))));
		// iframe[@class='cke_wysiwyg_frame cke_reset']

		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Hello tq for  open the email(email is opened)");
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		// auto visit 2 //

		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_email_vst2"))).click();
		Thread.sleep(5000);
		WebElement rdrpdwnv2 = driver.findElement(By.xpath(properties.getProperty("Reason2")));
		// rdrpdwn.click();
		Select arve_vde1 = new Select(rdrpdwnv2);
		Thread.sleep(5000);
		arve_vde1.selectByValue("16");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("a_r_e_v_sub2")))
				.sendKeys("immediately after email opened.");
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("a_r_e_v_msg2"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement()
				.sendKeys("tq for opening email immediately(send immediately after email is opened) ");

		driver.switchTo().defaultContent();
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js6.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

		// auto visit 3 //
		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_email_vst3"))).click();
		Thread.sleep(5000);
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js7.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		WebElement rdrpdwnv3 = driver.findElement(By.xpath(properties.getProperty("Reason3")));
		Select arve_vde3 = new Select(rdrpdwnv3);
		Thread.sleep(4000);
		arve_vde3.selectByValue("1");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("a_r_e_v_rply2"))).sendKeys("1");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("a_r_e_v_sub3"))).sendKeys("s:video is played..");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("a_r_e_v_msg3"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Tq for playing video (video played)");
		driver.switchTo().defaultContent();

		JavascriptExecutor js8 = (JavascriptExecutor) driver;
		js8.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

		// auto visit 4 //
		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_email_vst4"))).click();
		Thread.sleep(5000);

		JavascriptExecutor js9 = (JavascriptExecutor) driver;
		js9.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		WebElement rdrpdwnv4 = driver.findElement(By.xpath(properties.getProperty("Reason4")));
		Select arve_vde4 = new Select(rdrpdwnv4);
		Thread.sleep(4000);
		arve_vde4.selectByValue("17");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("a_r_e_v_sub4")))
				.sendKeys("immediately after video played..");
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("a_r_e_v_msg4"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("Tq for imm playing video(immediately after video played)");

		driver.switchTo().defaultContent();
		JavascriptExecutor js66 = (JavascriptExecutor) driver;
		js66.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

		// auto visit 5 //

		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_email_vst5"))).click();
		Thread.sleep(5000);

		JavascriptExecutor js10 = (JavascriptExecutor) driver;
		js10.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		WebElement rdrpdwnv5 = driver.findElement(By.xpath(properties.getProperty("Reason5")));
		Select arve_vde5 = new Select(rdrpdwnv5);
		Thread.sleep(4000);
		arve_vde5.selectByValue("18");
		Thread.sleep(5000);

		driver.findElement(By.xpath(properties.getProperty("a_r_e_v_sub5"))).sendKeys("s;video is not  played..");
		Thread.sleep(5000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath(properties.getProperty("a_r_e_v_msg5"))));
		driver.findElement(By.xpath("html/body")).click();
		driver.switchTo().activeElement().sendKeys("please play the video(video  is not played)");

		driver.switchTo().defaultContent();

		driver.switchTo().defaultContent();
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);

		// auto visit 6 //

		driver.findElement(By.xpath(properties.getProperty("auto_rspnse_email_vst6"))).click();
		Thread.sleep(5000);

		JavascriptExecutor js12 = (JavascriptExecutor) driver;
		js12.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		WebElement rdrpdwnv6 = driver.findElement(By.xpath(properties.getProperty("Reason6")));
		Select arve_vde6 = new Select(rdrpdwnv6);
		Thread.sleep(4000);
		arve_vde6.selectByValue("23");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"form-reply-9\"]/div/div[1]/div[2]/div/input")).sendKeys("1");
		Thread.sleep(5000);
		driver.findElement(By.xpath(properties.getProperty("a_r_e_v_sub6"))).sendKeys("s;redistribute the video..");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"reply-9\"]/div[1]/div[2]/div/switch/div/div/span[3]")).click();
		;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='step-6']//ul[1]//li[1]//div[1]//div[1]//span[1]//label[1]")).click();

		Thread.sleep(5000);

logger.info("Auto responses selected");
	}
	
}