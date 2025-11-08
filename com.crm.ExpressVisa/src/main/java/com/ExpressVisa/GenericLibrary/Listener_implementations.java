//package com.ExpressVisa.GenericLibrary;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//
//public class Listener_implementations  implements ITestListener {
//public ExtentTest test;
//	@Override
//	public void onFinish(ITestContext context) {
//		
//	}
//
//	@Override
//	public void onStart(ITestContext context) {
//		
//	}
//
//	@Override
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	}
//
//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		
//	}
//
//	@Override
//	public void onTestFailure(ITestResult result) {
//
//	}
//
//	@Override
//	public void onTestSkipped(ITestResult result) {
//		
//	}
//
//	@Override
//	public void onTestStart(ITestResult result) {
//		ExtentSparkReporter reporter=new ExtentSparkReporter("./ExtentReport/report.html");
//		reporter.config().setDocumentTitle();
//	}
//
//	@Override
//	public void onTestSuccess(ITestResult result) {
//	
//	}
//}
