package com.xamplify.automation;

import java.sql.SQLException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PartnerLogin extends ExtentReportsClass{

	WebDriver driver = Instance.getInstance();
	Properties properties = PropertiesFile.readPropertyFile("src/main/resources/PartnerLogin.properties");
final Logger logger = LogManager.getLogger(PartnerLogin.class);


@Test(priority=202,enabled=false)

public void Partner_OpeningtheBrowser() throws InterruptedException {
	
	driver.get(properties.getProperty("baseurl_p"));
	driver.manage().window().maximize();
	Thread.sleep(3000);
    logger.info("Successfully open the Web application");
	
}

@Test (priority=203,enabled=true)

public void Partner_SigninProcess() throws InterruptedException, SQLException {

	
	driver.findElement(By.xpath(properties.getProperty("username"))).sendKeys("automated_partner@analytify.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath(properties.getProperty("password"))).sendKeys("Xamplify@11");
	Thread.sleep(1000);
	driver.findElement(By.xpath(properties.getProperty("sign_into_sandbox"))).click();
	Thread.sleep(8000);
    logger.info("Successfully log into the application");
	}


}
