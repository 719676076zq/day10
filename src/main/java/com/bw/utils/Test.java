package com.bw.utils;

import java.util.Date;

public class Test {
	
	
	private static Date date;

	public static void main(String[] args) {
		
	
		
		DateUtil d = new DateUtil();
		
		DateUtil.getDateByMonthInit(date);
		d.getDateByMonthLast(date)	;
		
	}
	
	public static int getDaysByFuture (Date future) {
		DateUtil d = new DateUtil();
		d.getDateByMonthInit(future);
		return 0;
		}
	
	public static int getDaysByDeparted (Date departed) {
		DateUtil d = new DateUtil();
		return DateUtil.getDaysByDeparted(departed);
		}
	
	
	public static Date getDateByMonthLast(Date src) {
		DateUtil d = new DateUtil();
		return d.getDateByMonthInit(src);
		}
}
