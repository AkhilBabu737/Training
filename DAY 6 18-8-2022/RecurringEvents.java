package com.dateapi.java8;

import java.time.LocalDate;
import java.time.MonthDay;

public class RecurringEvents {
	
	public static void main(String args [])
	{
		LocalDate dateOfBirth = LocalDate.of(2010, 01, 14);
		
		MonthDay birthday = MonthDay.of(dateOfBirth.getMonth(), dateOfBirth.getDayOfMonth()); 
		MonthDay currentMonthDay = MonthDay.of(01,13); 
		
		if(currentMonthDay.equals(birthday))
		{ 
			System.out.println("Many Many happy returns of the day !!");
			}
		
		else{ 
			
			System.out.println("Sorry, today is not your birthday");
			}
		
	}

}
 