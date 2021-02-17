package com.program.easy;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int nums[] = {1,1,2};
		RemoveDuplicatesfromSortedArray obj = new RemoveDuplicatesfromSortedArray();
		System.out.println(obj.removeDuplicates(nums));

	}
	
	public int removeDuplicates(int[] nums) {
		int length = nums.length;
		if(length<=1) {
			return length;
		}
		int index = 1, shift = 0, prevNum = nums[0];
        while(index<length) {
        	if(shift>0 && nums[index] != prevNum) {
        		nums[index-shift] = nums[index];
        	}
        	if(nums[index] == prevNum) {
        		shift++;
        	}else {
        		prevNum = nums[index];
        	}       	
        	index++;
        }
        return length-shift;
    }

}
