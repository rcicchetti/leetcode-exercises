package com.github.rcicchetti.leetcode.easy;

public class LongestCommonPrefix 
{
	public String longestCommonPrefix(final String[] strs) 
	{		
		if (strs == null || strs.length < 1)
		{
			return "";
		}
		
		int minimalLength = Integer.MAX_VALUE;
		for (final String str : strs)
		{
			int length = str.length();
			if (length < minimalLength)
			{
				minimalLength = str.length();
			}
		}
		
		String longestCommonPrefix = "";
		for (int i = 0; i < minimalLength; i++)
		{
			char currentCharacter = strs[0].charAt(i);
			for (final String str : strs)
			{
				if (str.charAt(i) != currentCharacter)
				{
					return longestCommonPrefix;
				}
			}
			longestCommonPrefix += currentCharacter;
		}
		
		return longestCommonPrefix;
	}
}
