package com.myntrajio.genric.listenerlibrary;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.myntrajio.genric.commonlibrary.BaseTest;
public class ListenerImplementtation extends BaseTest implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();

		Reporter.log("TAKING SCEENSHOT --Start--:" + name, true);

		// Perform Typecasting-WebdriverType To TakesScreenshot
		TakesScreenshot tsref = (TakesScreenshot) webdriverlibrary.static_driver;
 
		// Call the screenshot Method and Save in Temp Path
		File temp = tsref.getScreenshotAs(OutputType.FILE);

		// Create a Permanent Path And Save it
		File permanent = new File("./src/test/resources/Screenshot/" + name + ".png");

		// Copy the File From Temp to Permanent
		try {
		FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("TAKING SCEENSHOT --COMPLETED--: " + name, true);
	}
	
}
