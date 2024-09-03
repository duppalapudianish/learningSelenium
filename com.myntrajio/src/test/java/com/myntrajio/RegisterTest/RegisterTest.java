package com.myntrajio.RegisterTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntrajio.genric.PageRepository.RegisterPage;
import com.myntrajio.genric.commonlibrary.BaseTest;

@Listeners(com.myntrajio.genric.listenerlibrary.ListenerImplementtation.class)
public class RegisterTest extends BaseTest {
    @Test
    public void registerValidData(){
    	
    	String name=excellibrary.readData("Registerdetails", 1, 0);
    	String email=excellibrary.readData("Registerdetails", 1, 1);;
    	String Password=excellibrary.readData("Registerdetails", 1, 2);
    	//String mobileno=excellibrary.readData("Registerdetials", 1, 3);
    	String feedback=excellibrary.readData("Registerdetails", 1, 5);
    	
    	
    	
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		//	javalibrary.pause(5000);
		}	
			//Provide implicit Wait
			webdriverlibrary.waitUntilElementFound();
			
			
			String exptitle="LearningSelenium";
			String acttitle=webdriverlibrary.driver.getTitle();
			System.out.println(acttitle);
	
    	
	//	Object exptitle = null;
		//Object acttitle = null;
		//step1:Verify the register page
    	Assert.assertEquals(exptitle,acttitle,"Verified Register Page");
    	
    	RegisterPage regpage=new RegisterPage(webdriverlibrary.driver);
    	
    	boolean elementExpCondition=true;
    	boolean elementActCondition=regpage.getNametextfield().isDisplayed();
    	
    	//step2:Verify the Element
    	Assert.assertEquals(elementExpCondition,elementActCondition,"Verified NameTexField WebElement-it is Displayed");
    	
    	//step3:creating an object for register page
    	//RegisterPage regpage=new RegisterPage(webdriverlibrary.driver);
    	
    	//step4:Perform action--clear
    	regpage.getNametextfield().clear();
    	
    	//step5:Perform action --Name Enter
    	regpage.getNametextfield().sendKeys(name);
    	//step6:Perform action --Email Enter
    	regpage.getEmailtextfield().sendKeys(email);
    	
    	//step7:Perform action --Password
    	regpage.getPasswordtextfield().sendKeys(Password);
    	
    	//step8:Perform action --MobileNo
    	regpage.getMobiletextfield().sendKeys("8096883516");
    	
    	regpage.getMalecheckbox().click();
    	
    	regpage.getmanalicheckbox().click();
    	
    	regpage.getfeedbacktextfield().sendKeys(feedback);
    	
    	
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}    	
    	Reporter.log("register with valid data success", true);
    	
    }
}

