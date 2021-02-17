package com.program.easy;

public class SortArrayByParity {

	public static void main(String[] args) {
		int nums[] = {0,1};
		SortArrayByParity obj = new SortArrayByParity();
		obj.moveZeroes(nums);
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

	}
	
	public void moveZeroes(int[] nums) {
		int length = nums.length;
		if(length>1) {
			int zeroesCount = 0;
			for(int i = 0; i<nums.length; i++) {
				if(nums[i]==0) zeroesCount++;
				else if(zeroesCount>0){
					nums[i-zeroesCount] = nums[i];
					nums[i] = 0;
				}
			}
		}
		
    }

}
