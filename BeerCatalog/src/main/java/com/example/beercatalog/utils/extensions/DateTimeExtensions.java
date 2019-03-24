package com.example.beercatalog.utils.extensions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeExtensions {
	
	private static String DATETIME_FMT = "yyyy-MM-dd'T'HH:mm:ssz";
	private static String DATE_FMT = "yyyy-MM-dd"; 
    private static String ZULU = "Z"; 
    private static String GMT = "GMT"; 
    private static String GMT_UTC_OFFSET = "GMT-00:00"; 
	
	public static Date ToDate(String format, String date) throws ParseException {
		return new SimpleDateFormat(format).parse(date);
	}
	
	
	public static boolean isValidDateTime(String inStr) { 
        return isParseableAsDateWithFmt(inStr, DATETIME_FMT); 
    } 
	
	public static boolean isValidDate(String inStr) {
		return isParseableAsDateWithFmt(inStr, DATE_FMT);
	}
		
	private static boolean isParseableAsDateWithFmt(String inStr, String dateFmt) { 
        if (inStr == null) { 
            return false; 
        } 
        // Set the format to use as a constructor argument. 
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFmt); 
        dateFormat.setLenient(false); 
 
        if (dateFmt.equals(DATETIME_FMT)) {  //ISO-8601 
            //SimpleDateFormat uses GMT[-+]hh:mm for the TZ which breaks things a bit. 
            if (inStr.endsWith(ZULU)) { 
                inStr = inStr.substring(0, inStr.length() - 1) + GMT_UTC_OFFSET; 
            } else { 
                int inset = 6; 
                try { 
                    String s0 = inStr.substring(0, inStr.length() - inset); 
                    String s1 = inStr.substring(inStr.length() - inset, inStr.length()); 
                    inStr = s0 + GMT + s1; 
                } catch (java.lang.StringIndexOutOfBoundsException obe) { 
                    return false; 
                } 
            } 
        } 
 
        try { 
            //parse the inDate parameter 
            dateFormat.parse(inStr.trim()); 
        } catch (ParseException pe) { 
            return false; 
        } 
        return true; 
    } 

}
