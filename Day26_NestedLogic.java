package Hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Day26_NestedLogic {
	
	private static final TimeUnit DAYS = null;

	public static long getDateDiff(Date deliveryDate, Date expectedDate, TimeUnit timeUnit) {
		long diffInMillies = deliveryDate.getTime() - expectedDate.getTime();
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	  
	    return diff;
	}
	
	public static long numberOfDays(String deliveryDate, String expectedDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		Date firstDate = null;
		Date secondDate = null;
		
		try {
			firstDate = sdf.parse(deliveryDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		try {
			secondDate = sdf.parse(expectedDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		long days = getDateDiff(firstDate, secondDate, DAYS);
		
		return days;
	}
	
	public static boolean yearChanged(String deliveryDate, String expectedDate) {
		String[] firstDate  = deliveryDate.split(" ");
		String[] secondDate  = expectedDate.split(" ");
		
		String year1 = firstDate[2];
		String year2 = secondDate[2];
		
		int deliveryYear = Integer.parseInt(year1); 
		int expectedYear = Integer.parseInt(year2);
		
		if (deliveryYear > expectedYear) {
			return true;
		} else {
			return false;
		}
	}
	
	public static long fineCalculator(String deliveryDate, String expectedDate) {
		long fine = 0;
		long numberOfDays = numberOfDays(deliveryDate, expectedDate);
		
		if (numberOfDays > 365 || yearChanged(deliveryDate, expectedDate)) {
			fine = 10000;
		} else if (numberOfDays > 0 && numberOfDays<=30) {
			fine =  numberOfDays * 15;
		} else if (numberOfDays > 30 && numberOfDays <= 365) {
			fine = (numberOfDays / 30) * 500;
		}
		
		return fine;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Delivery date: ");
		String deliveryDate = scan.nextLine();
		System.out.print("Expected date: ");
		String expectedDate = scan.nextLine();
		
		System.out.println("Total amount: €" + fineCalculator(deliveryDate, expectedDate));
		
        scan.close();
	}

}
