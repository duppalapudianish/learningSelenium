package com.myntrajio.Electronicproduct;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.genric.listenerlibrary.ListenerImplementtation.class)
public class ElectronicproductTest {
   @Test(groups= {"FT","RT"})
   
   public void addproduct() {
	Reporter.log("Electronic Product added Succes", true);
   }
   @Test(groups= {"IT","RT"})
   public void removeproduct() {
		Reporter.log("Electronic Product remove Succes", true);
	   }
   @Test(groups= {"ST","RT"})
   public void updateproduct() {
		Reporter.log("Electronic Product update Succes", true);
	   }
   
}
