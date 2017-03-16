package com.github.rcicchetti.leetcode.easy;

public class Palindrome
{
    public boolean isPalindrome(final int number) 
    {
    	final char[] digits = (String.valueOf(number)).toCharArray();
    	
    	int j = digits.length -1;
    	for (int i = 0; i <= j; i++)
    	{
    		if (digits[i] != digits[j])
    		{
    			return false;
    		}
    		j--;
    	}
    	
        return true;
    }
}
