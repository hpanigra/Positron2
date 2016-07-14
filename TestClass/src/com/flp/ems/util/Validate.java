package com.flp.ems.util;

public class Validate {
public static boolean Validate(String date)
{
	boolean checkformat;
	if (date.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
	    checkformat=true;
	else
	   checkformat=false;
	return checkformat;
}
}
