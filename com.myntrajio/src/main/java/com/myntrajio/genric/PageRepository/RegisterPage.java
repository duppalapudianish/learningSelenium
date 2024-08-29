package com.myntrajio.genric.PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		
		//Initialize the page
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="name")
	private WebElement nametextfield;
	
	@FindBy(id="email")
	private WebElement emailtextfield;
	
	@FindBy(id="password")
	private WebElement passwordtextfield;
	
	@FindBy(id="mobile")
	private WebElement mobiletextfield;
	
	@FindBy(id="manali")
	private WebElement manalicheckbox;
	
	@FindBy(id="feedback")
	private WebElement feedbacktextfield;
	

	public WebElement getNametextfield() {
		return nametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getMobiletextfield() {
		return mobiletextfield;	
	}
	public WebElement manalicheckbox() {
		return manalicheckbox;	
	}
	public WebElement feedbacktextfield() {
		return feedbacktextfield;
	}
}
