package TestDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {
	
	public static void main(String[] args) {
		//create the SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//Configure the spark Report information
		spark.config().setDocumentTitle("Regresstion Testing For the RegisterPage");
		
	    spark.config().setReportName("RegresstionSuite");
	    
	    spark.config().setTheme(Theme.DARK);
	    
	    //create extent Report
	    ExtentReports report = new ExtentReports();
	    
	    //configure the System information in Extent Report by Attaching
	    report.attachReporter(spark);
	    report.setSystemInfo("DiviceName","ANISH");
	    report.setSystemInfo("OS","WINDOWS10");
	    report.setSystemInfo("Browser","Chrome");
	    report.setSystemInfo("BrowserVersion","Chrome-128.0.6613.84");
	    
	    
	    //create the information
	    ExtentTest test = report.createTest("RegresstionTest");
	    
	    //steps information
	    test.log(Status.INFO,"Step1:Launching The Browser Sucessfull");
	    
	    test.log(Status.INFO,"Step2:Navigate to Applacation via URL Sucessfull");
	    
	    test.log(Status.PASS,"Step3:Verfied the Webpage Sucessfull");
	    
	    
	    if (true==true) {
			test.log(Status.PASS,"Step4:verified the WebElement Displayed Successfull");
		}else {
			test.log(Status.FAIL,"Step4:verified the WebElement Not Displayed ");
			
		}
	    test.log(Status.SKIP,"step5:Element is Hidden");
	    
	    
	    //flus the Report information
	    report.flush();
	    
	    System.out.println("execution Done");
	}
}
