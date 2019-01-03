package com.hsbc.service;

public class RomanNumbericConverter 
{
	public static String convert(int arabicNumber)
	{
		int[] num = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String []romanCharacter = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		int tmp = arabicNumber;
		StringBuffer sb = new StringBuffer();
		int i = 0;
		
		while(tmp > 0)
		{
			if(tmp >= num[i])
			{
				sb.append(romanCharacter[i]);
				tmp-=num[i];
			}
			else
			{
				i++;
			}
		}
		
		
		return sb.toString();
	}
}
