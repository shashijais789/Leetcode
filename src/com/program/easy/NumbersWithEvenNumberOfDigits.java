package com.program.easy;
/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class NumbersWithEvenNumberOfDigits {

	public static void main(String[] args) {

		NumbersWithEvenNumberOfDigits obj =  new NumbersWithEvenNumberOfDigits();
		System.out.println(obj.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
		
	}
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max=0;
        for(int i =0; i< nums.length; i++){
            if(nums[i]==0){
                count = 0;
            } else{
                count++;
                if(max<count) max = count;
            }
        }
        return max;
    }

}
