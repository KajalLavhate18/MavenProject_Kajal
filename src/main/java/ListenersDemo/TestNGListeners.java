package ListenersDemo;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteUtility.Utility;

public class TestNGListeners implements ITestListener{
      
    public void onTestSuccess(ITestResult result) {
    	Reporter.log("Welcome,TC is passed TC name is"+result.getName(), true);
    	
    	
    }
      
    public void onTestFailure(ITestResult result) {
    	
    	try {
			Utility.pickScreenshot(result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }
}
