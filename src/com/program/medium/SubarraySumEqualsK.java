package com.program.medium;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubarraySumEqualsK obj = new SubarraySumEqualsK();
		System.out.println(obj.subarraySum(new int[] {1}, 0));

	}
	
	public int subarraySum(int[] nums, int k) {
        int sum =0, count = 0, x = 0;
        if(nums.length<1 || nums.length>20000) return 0;
        for(int i = 0; i<nums.length; i++) {
        	
        }
        sum = 0;
        for(int i = 0; i<nums.length; i++) {
        	sum = sum + nums[i];
        	if(sum>=k) {
        		if(sum==k) {
        			count++;
        			System.out.println((x+1) + "," + (i+1));
        		}
        		sum = sum - nums[x];
        		x++;   	
        		if(sum==k) { 
        			count++;
        			System.out.println((x+1) + "," + (i+1));
        		}
        	}
        }
        return count;
    }

}
