package com.myntrajio.kideproduct;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.genric.listenerlibrary.ListenerImplementtation.class)
public class kidsProductTest {
	 @Test(groups= {"FT","RT"})
	   
	   public void addproduct() {
		Reporter.log("Kids Product added Succes", true);
	   }
	   @Test(groups= {"IT","RT"})
	   public void removeproduct() {
			Reporter.log("kids Product remove Succes", true);
		   }
	   @Test(groups= {"ST","RT"})
	   public void updateproduct() {
			Reporter.log("kids Product update Succes", true);
		   }
	   
}
