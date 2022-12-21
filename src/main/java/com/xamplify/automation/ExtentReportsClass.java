package com.xamplify.automation;

import java.io.File;

	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.SkipException;
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;

	public class ExtentReportsClass {
		
		static ExtentTest logger;
		static ExtentReports reports;

		@BeforeSuite
		public void starttest() {
			reports = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReportsResult.html", true);
			
			reports.addSystemInfo("Host Name", "Automation")
			.addSystemInfo("Environment", "xAmplify")
			.addSystemInfo("User Name", "Mounika");
			//reports.loadConfig(new File(System.getProperty("user.dir")+"/test-output/extent-config.xml"));
		}
		
		@Test
		public void  OpeningWebApplication(){
			
			
			logger = reports.startTest("passTest");
			/*
			 * Assert.assertTrue(true); logger.log(LogStatus.PASS, "Test Case Passed");
			 */
			}
		
		@AfterMethod
		public void getResult(ITestResult result) {
	if(result.getStatus()==ITestResult.SUCCESS) {
				
				logger.log(LogStatus.PASS, "Test Case passed-" +result.getMethod().getMethodName());
				logger.log(LogStatus.PASS, "Test Case passed-" +result.getTestClass().getName());
			
			}
			

	else if(result.getStatus()==ITestResult.FAILURE) {
				
				logger.log(LogStatus.FAIL, "Test Case failed-" +result.getMethod().getMethodName());
				logger.log(LogStatus.PASS, "Test Case failed-" +result.getTestClass().getName());
				logger.log(LogStatus.FAIL, "Test Case failed-" +result.getThrowable());
			}
			
			else if(result.getStatus()==ITestResult.SKIP) {
				
				logger.log(LogStatus.FAIL, "Test Case skipped-" +result.getMethod().getMethodName());
				logger.log(LogStatus.FAIL, "Test Case skipped-" +result.getTestClass().getName());
				logger.log(LogStatus.FAIL, "Test Case skipped-" +result.getThrowable());
			}
		reports.endTest(logger);
		}
		@AfterSuite
		
		public void endTest() {
			
			reports.flush();
			reports.close();
		}
		
	}
