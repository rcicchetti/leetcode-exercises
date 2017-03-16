package com.github.rcicchetti.leetcode.easy;

public class ReverseInteger 
{
	public int reverse(int number)
	{
		long reverseNumber = 0;		
		while (number != 0)
		{
			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}
		
		if (reverseNumber > Integer.MAX_VALUE || reverseNumber < Integer.MIN_VALUE)
		{
			return 0;
		}
		
		return (int) reverseNumber;
	}
}
