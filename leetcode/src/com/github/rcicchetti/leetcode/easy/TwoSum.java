package com.github.rcicchetti.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
	public int[] twoSum(int[] nums, int target)
	{
		if (nums == null || nums.length < 2)
		{
			return new int[]{0,0};
		}
		
		final Map<Integer, Integer> numberMap = new HashMap<>();
		for (int index = 0; index < nums.length; index++)
		{
			final Integer number = Integer.valueOf(nums[index]);
			if (numberMap.containsKey(number))
			{
				return new int[]{numberMap.get(number).intValue(),index};
			}
			else
			{
				numberMap.put(Integer.valueOf(target - number), Integer.valueOf(index));
			}
		}
		
		return new int[]{0,0};
	}
}
