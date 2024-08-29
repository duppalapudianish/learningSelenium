package com.myntrajio.Womenproduct;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.myntrajio.genric.listenerlibrary.ListenerImplementtation.class)
public class WomensProductTest {
	 @Test(groups= {"FT","RT"})
	   
	   public void addproduct() {
		Reporter.log("Womens Product added Succes", true);
	   }
	   @Test(groups= {"IT","RT"})
	   public void removeproduct() {
			Reporter.log("Womens Product remove Succes", true);
		   }
	   @Test(groups= {"ST","RT"})
	   public void updateproduct() {
			Reporter.log("Womens Product update Succes", true);
		   }

}
