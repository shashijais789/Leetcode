package com.program.easy;

public class TwoSumSorted {

	public static void main(String[] args) {
		TwoSumSorted obj =  new TwoSumSorted();
		int arr[] = {2,7,11,15};
		int indices[] = obj.twoSum(arr, 9);
		System.out.println(indices[0] + "," + indices[1]);
	}
	
	public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int left_pointer = 0, right_pointer = length -1, sum = 0;
        
        while(left_pointer < right_pointer) {
        	sum = nums[left_pointer] + nums[right_pointer];
        	if(sum > target) {
        		right_pointer--;
        	} else if(sum < target) {
        		left_pointer++;
        	} else {
        		return new int[] {left_pointer+1, right_pointer+1};
        	}
        }
        
        return new int[] {};
    }

}

