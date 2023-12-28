package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplimentation extends Baseclass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+" testcase has been passed");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+" testcase has been failed");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+res+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+" testcase has been skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {

	}


}
