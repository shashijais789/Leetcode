package com.program.easy;

public class MaximumProductOfTwoElements {
	public static void main(String[] args) {
		MaximumProductOfTwoElements obj =  new MaximumProductOfTwoElements();
		int arr[] = {10,2,5,2};
		int maxProduct = obj.maxProduct(arr);
		System.out.println(maxProduct);
	}
	
	public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;
        for(int i=0; i<nums.length; i++) {
        	if(max1 < nums[i]) {
        		max2 = max1;
        		max1 = nums[i];
        	} else if(max2<nums[i]) {
        		max2 = nums[i];
        	}
        }
        
        return (max1-1)*(max2-1);
    }
}
