package com.myntrajio.genric.commonlibrary;

import org.openqa.selenium.WebDriver;

import com.myntrajio.genric.Propertylibrary.ReadPropertyfile;
import com.myntrajio.genric.excellibrary.ReadExcelFile;
import com.myntrajio.genric.webdriverlibrary.WebdriverLibrary;

import javalibrary.JavaLibrary;

public class ObjectLibrary 
{
	public ReadExcelFile excellibrary;
	public JavaLibrary javalibrary;
	public ReadPropertyfile propertyfileLibrary;
	public WebdriverLibrary webdriverlibrary;
	//public WebDriver driver;
	
	public void createObject(){
		 excellibrary=new ReadExcelFile();
		 javalibrary=new JavaLibrary();
		 propertyfileLibrary=new ReadPropertyfile();
		 webdriverlibrary=new WebdriverLibrary();
		
	}
}
