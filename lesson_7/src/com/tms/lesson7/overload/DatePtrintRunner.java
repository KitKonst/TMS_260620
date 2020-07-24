package com.tms.lesson7.overload;

import com.tms.lesson7.Runner;
import com.tms.lesson7.initialization.Child;

import java.util.Date;
import static java.util.Date.*;

public class DatePtrintRunner {
	
	public static void main(String[] args) {
		
		DatePrinter dp = new DatePrinter();
		
		dp.printDate("01.01.2015");
		dp.printDate(new Date());
		dp.printDate(1, 1, 2015);

	}
}
