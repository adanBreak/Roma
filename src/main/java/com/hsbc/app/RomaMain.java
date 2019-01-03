package com.hsbc.app;

import com.hsbc.service.RomanNumbericConverter;

public class RomaMain 
{
	public static void main(String[]args)
	{
		String numStr = System.getProperty("num");
		if(numStr == null)
		{
			System.out.println("Please set parameter in num.");
		}
		
		int num = 1;
		
		try
		{
			num = Integer.parseInt(numStr);
		}
		catch (NumberFormatException e)
		{
			System.out.println("Please input valid number.");
		}
		
		System.out.println(RomanNumbericConverter.convert(num));
	}
}
