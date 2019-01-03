package com.hsbc.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumbericConverterTest 
{
	@Test
	public void test() 
	{
		assertEquals("I", RomanNumbericConverter.convert(1));
		assertEquals("II", RomanNumbericConverter.convert(2));
		assertEquals("III", RomanNumbericConverter.convert(3));
		assertEquals("IV", RomanNumbericConverter.convert(4));
		assertEquals("V", RomanNumbericConverter.convert(5));
		assertEquals("VI", RomanNumbericConverter.convert(6));
		assertEquals("VII", RomanNumbericConverter.convert(7));
		assertEquals("IX", RomanNumbericConverter.convert(9));
		assertEquals("X", RomanNumbericConverter.convert(10));
		assertEquals("XI", RomanNumbericConverter.convert(11));
		assertEquals("XIV", RomanNumbericConverter.convert(14));
		assertEquals("XV", RomanNumbericConverter.convert(15));
		assertEquals("XX", RomanNumbericConverter.convert(20));
		assertEquals("XXI", RomanNumbericConverter.convert(21));
		assertEquals("XXIV", RomanNumbericConverter.convert(24));
		assertEquals("L", RomanNumbericConverter.convert(50));
		assertEquals("C", RomanNumbericConverter.convert(100));
		assertEquals("CXXIV", RomanNumbericConverter.convert(124));
		assertEquals("D", RomanNumbericConverter.convert(500));
		assertEquals("M", RomanNumbericConverter.convert(1000));
		assertEquals("CMXCIX", RomanNumbericConverter.convert(999));
	}
}
