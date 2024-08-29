package com.myntrajio.RegisterTest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.myntrajio.genric.PageRepository.RegisterPage;
import com.myntrajio.genric.commonlibrary.BaseTest;

import javalibrary.JavaLibrary;
@Listeners(com.myntrajio.genric.listenerlibrary.ListenerImplementtation.class)
public class RegisterTest extends BaseTest {
    @Test
    public void registerValidData(){
    	
    	
    	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	//step1:Verify the register page
    	Assert.assertEquals("title", "title", "Verified Register Page");
    	
    	//step2:Verify the Element
    	Assert.assertEquals("element", "element","Verified WebElement");
    	
    	//step3:creating an object for register page
    	RegisterPage regpage=new RegisterPage(webdriverlibrary.driver);
    	
    	//step4:Perform action--clear
    	regpage.getNametextfield().clear();
    	
    	//step5:Perform action --Name Enter
    	regpage.getNametextfield().sendKeys("anish");
    	//step6:Perform action --Email Enter
    	regpage.getEmailtextfield().sendKeys("admin@123gmail.com");
    	
    	//step7:Perform action --Password
    	regpage.getPasswordtextfield().sendKeys("Admin@#");
    	
    	//step8:Perform action --MobileNo
    	regpage.getMobiletextfield().sendKeys("8096883516");
    	
    	regpage.manalicheckbox().click();
    	
    	regpage.feedbacktextfield().sendKeys("Happy Sunday");
    	
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
    	Reporter.log("register with valid data success", true);
    	
    }
}
