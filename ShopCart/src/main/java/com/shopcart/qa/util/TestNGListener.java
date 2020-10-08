package com.shopcart.qa.util;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.shopcart.qa.base.TestBase;

public class TestNGListener extends TestBase implements ITestListener{

	public void onFinish(ITestContext arg0) {
		System.out.println("**********On Finish**********************");
	}

	public void onStart(ITestContext arg0) {
		System.out.println("**********On Start**********************");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("********** onTestFailedButWithinSuccessPercentage**********************");
		
	}

	public void onTestFailure(ITestResult arg0) {
		failed(arg0.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("**********On Test Skipped**********************");
		
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("**********On Test Start**********************");
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("**********On Test Success**********************");
		
	}

	
}
