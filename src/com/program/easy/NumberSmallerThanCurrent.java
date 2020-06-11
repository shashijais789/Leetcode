package com.program.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberSmallerThanCurrent {

	public static void main(String[] args) {
		NumberSmallerThanCurrent obj =  new NumberSmallerThanCurrent();
		int arr[] = {7,0,9,1};
		int indices[] = obj.smallerNumbersThanCurrent(arr);
		for(int i = 0; i< indices.length; i++) {
			System.out.println(indices[i]);
		}
		
	}
	
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int copy[] = nums.clone();
        Arrays.sort(copy);
        
        for(int i =0; i<length; i++) {
        	map.putIfAbsent(copy[i], i);
        }
        for(int i =0; i<length; i++) {
        	copy[i] = map.get(nums[i]);
        }
        return copy;
    }
}
