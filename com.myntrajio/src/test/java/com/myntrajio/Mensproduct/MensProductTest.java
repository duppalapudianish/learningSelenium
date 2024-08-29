package com.myntrajio.Mensproduct;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.genric.listenerlibrary.ListenerImplementtation.class)
public class MensProductTest {
	 @Test(groups= {"FT","RT"})
	   
	   public void addproduct() {
		Reporter.log("Mens Product added Succes", true);
	   }
	   @Test(groups= {"IT","RT"})
	   public void removeproduct() {
			Reporter.log("Mens Product remove Succes", true);
		   }
	   @Test(groups= {"ST","RT"})
	   public void updateproduct() {
			Reporter.log("Mens Product update Succes", true);
		   }
}
