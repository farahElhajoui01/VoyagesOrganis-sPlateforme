package com.voyageOrganise.service.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.voyageOrganise.service.util.DateUtil;

public class StringUtil {
	DateUtil dateUtil;
	
	public static boolean isEmpty(String value){return value==null || value.isEmpty();}

    public static boolean isNotEmpty(String value){return !isEmpty(value);}
    
    public static Double toDouble(String value) {
		 if (isNotEmpty(value)) {
	            return Double.parseDouble(value);
	        }
	        return null;
	}

    public static Integer toInteger(String value){
        if (isNotEmpty(value)) {
            return Integer.parseInt(value);
        }
        return null;
    }
   
    public static Boolean toBoolean(String value){
        if (isNotEmpty(value)) {
            return Boolean.parseBoolean(value);
        }
        return null;
    }

    public static Long toLong(String value){
        if (isNotEmpty(value)) {
            return Long.parseLong(value);
        }
        return null;
    }
    public static String toString(Boolean value){
        if (value!=null){
            return value.toString();
        }
        return null;
    }
    public static Date toDate(String value) throws ParseException{
        if (isNotEmpty(value)) {
        	Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(value);
            return date1;
        }
        return null;
    }

    public static String toString(Long value){
        if (value!=null){
            return value.toString();
        }
        return null;
    }

    public static String toString(Integer value){
        if (value!=null){
            return value.toString();
        }
        return null;
    }
    public static String toString(Double value){
        if (value!=null){
            return value.toString();
        }
        return null;
    }
    public static String toString(Date value){
        if (value!=null){
            return value.toString();
        }
        return null;
    }

	


}
