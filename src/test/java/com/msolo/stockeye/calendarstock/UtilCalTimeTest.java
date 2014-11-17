package com.msolo.stockeye.calendarstock;

import static org.junit.Assert.*;

import java.util.GregorianCalendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UtilCalTimeTest {

	private UtilCalTime utilCalTime;
	
	@Before
	public void setUp() throws Exception {
			utilCalTime = UtilCalTime.getInstance();
	}

	@After
	public void tearDown() throws Exception {
			utilCalTime = null;
	}

	@Test
	public void testAssertClassSingleton() {
		  UtilCalTime utilCalTimeAnother = UtilCalTime.getInstance();
		  assertSame("should be same", utilCalTime, utilCalTimeAnother);
	}

	@Test
	public void testGetIntCal() {
		  int intCal = utilCalTime.getIntCal(new GregorianCalendar(2014, 10, 8));
		  int intCalTest = 20141108;
		  assertEquals("should be equal", intCal, intCalTest);
	}
	
	@Test
	public void testGetStrCal() {
		  String strCal = utilCalTime.getStrCal(new GregorianCalendar(2014, 10, 8));
		  String strCalTest = "2014-11-08";
		  assertNotEquals("objects should be not equal", strCal, strCalTest);
		  assertTrue( "values should be equal", strCal.equals(strCalTest) ); 
	}

}

