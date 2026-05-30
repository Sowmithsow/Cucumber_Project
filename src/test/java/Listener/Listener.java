package Listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult Result) {
		System.out.println("Testing started");
	}
   
	@Override
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Testcase success");
	}
	
	@Override
	public void onTestSkipped(ITestResult Result) {
		
		System.out.println("Test case skipped");
		}
	
	@Override
	public void onTestFailure(ITestResult Result) {
		System.out.println("Test case Failed");
	}
	
	}
