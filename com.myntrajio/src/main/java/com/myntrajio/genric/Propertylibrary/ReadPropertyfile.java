package com.myntrajio.genric.Propertylibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Reporter;

import com.myntrajio.genric.commonlibrary.FrameworkConstant;

public class ReadPropertyfile implements FrameworkConstant {
	FileInputStream fis = null;
	FileOutputStream fos=null;
	Properties property = null;
	

	public String readData(String Key) {
		// create an object of file
		// converting physical file into java understandable using Fileinputstream
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		//2. create an object for property class
		Properties property = new Properties();

		// 3.load the property file
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//4.fetch the data by calling get property
		String data = property.getProperty(Key);
		return data;
	}

	public String writeData(String key,String value) {
		//enter the data 
		property.put(key,value);

		// create instance for file output stream
		try {
			fos = new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}
		//store the data 
		try {
			property.store(fos,"Update the New key-value successfull");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void displayData(String key) {
		// converting physical file into java understandable using Fileinputstream
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		// create an object for property class
		Properties property = new Properties();

		// load the property file
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// fetch the data by calling get property
		String data = property.getProperty(key);

		// display the data
		Reporter.log(key + " : " + data, true);
	}

}
