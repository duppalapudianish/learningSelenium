package javalibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaLibrary {
	
	public String getCurrentTime () {
		Date date=new Date ();
		SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sdf.format(date);
		
	}
	/**
	 * This Method generate random number within the specified limit
	 * @param limit
	 * @return
	 */
	public int genrateRandomNum(int limit) {
		
		Random random=new Random();
		return random.nextInt(limit);
		
	}
	
}
