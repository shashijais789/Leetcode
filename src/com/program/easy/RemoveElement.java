package com.program.easy;
/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class RemoveElement {

	public static void main(String[] args) {
		int nums[] = {2,1,2,2,3,0,4,2,2};
		int val = 2;
		RemoveElement obj = new RemoveElement();
		System.out.println(obj.removeElement(nums, val));

	}
	
	public int removeElement(int[] nums, int val) {
		int length = nums.length;
		int index = 0, shift = 0;
        while(index<length) {
        	if(shift>0 && nums[index] != val) {
        		nums[index-shift] = nums[index];
        	}
        	if(nums[index] == val) {
        		shift++;
        	}
        	index++;
        }
        return length-shift;
    }

}
