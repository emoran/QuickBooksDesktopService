package com.emoran;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Set;

public class Utils {
	
	/**
	 * 
	 * @param arrayValues
	 * @return
	 */
	public static String stringValueToCommaSeparatedf(Set<String> arrayValues){
		String result = "";
		if(arrayValues.size() > 0){
			String separator = ", ";
			int total = arrayValues.size() * separator.length();
			for (String s : arrayValues) {
			    total += s.length();
			}

			StringBuilder sb = new StringBuilder(total);
			for (String s : arrayValues) {
			    sb.append(separator).append("'"+s+"'");
			}
			result = sb.substring(separator.length()); // remove leading separator	
		}
	
		return result;
	}
	
	/**
	 * 
	 */
	public static String getTodaysDate(String dateformat){
		DateFormat dateFormat = new SimpleDateFormat(dateformat);
		Date date = new Date();	
		return dateFormat.format(date);
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
