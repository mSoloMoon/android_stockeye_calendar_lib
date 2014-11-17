package com.msolo.stockeye.calendarstock;

import java.util.GregorianCalendar;

public class UtilCalTime {
	
	private static final UtilCalTime INSTANCE = new UtilCalTime();
	
	private UtilCalTime() {}
	
	/**
	 * 
	 * This function is to return a UtilCalTime Object that apply the Singleton pattern.
	 * 
	 * @return UtilCalTime
	 * 
	 */
	public static UtilCalTime getInstance() {
			return INSTANCE;
	}
	
	/**
	 * 
	 * This function is to get the int representation of the GregorianCalendar object
	 * 
	 * Example : return 20141116
	 * 
	 * @param cal 
	 * @return int
	 * 
	 */
	public int getIntCal(GregorianCalendar cal) {		
			return Integer.parseInt( getStrCal(cal).replace("-", "") );
	}

	/**
	 * 
	 * This function is to get the String object of the GregorianCalendar object
	 * 
	 * Example : 2014-11-16
	 * 
	 * @param cal
	 * @return String
	 * 
	 */
	public String getStrCal(GregorianCalendar cal) {		
			return String.format("%tF", cal);
	}
	
}

