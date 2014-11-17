package com.msolo.stockeye.calendarstock;

import java.util.GregorianCalendar;

public class UtilCalTime {
	
	private static final UtilCalTime INSTANCE = new UtilCalTime();
	
	private UtilCalTime() {}
	
	public static UtilCalTime getInstance() {
			return INSTANCE;
		}
	
	public int getIntCal(GregorianCalendar cal) {		
			return Integer.parseInt( getStrCal(cal) );
		}

	public String getStrCal(GregorianCalendar cal) {		
			return String.format("%tF", cal).replace("-", "");
		}
	
}

