package com.program.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		TwoSum obj =  new TwoSum();
		int arr[] = {2,7,11,15};
		int indices[] = obj.twoSum(arr, 9);
		System.out.println(indices[0] + "," + indices[1]);
	}
	
	public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<length; i++) {
        	int complement = target - nums[i];
        	
        	if(map.containsKey(complement)) {
        		return new int[] {map.get(complement), i};
        	} else {
        		map.put(nums[i], i);
        	}
        }
        
        return new int[] {};
    }

}
