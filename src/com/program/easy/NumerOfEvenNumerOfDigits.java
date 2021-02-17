package com.program.easy;

/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class NumerOfEvenNumerOfDigits {

	public static void main(String[] args) {
		NumerOfEvenNumerOfDigits obj =  new NumerOfEvenNumerOfDigits();
		int nums[] = {12,345,2,6,7896};
		int result = obj.findNumbers(nums);
		System.out.println(result);
	}
	
	public int findNumbers(int[] nums) {
        int res = 0, count = 0;
		for(int i =0; i< nums.length;i++) {
			int n = nums[i];
			count = 0;
			while(n>0) {
				n=n/10;
				count++;
			}
			if(count%2==0) res++;
		}
		
        
        return res;
    }

}

