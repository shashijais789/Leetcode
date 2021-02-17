package com.program.easy;

import java.util.ArrayList;
/**
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class TargetArrayInGivenOrder {

	public static void main(String[] args) {
		TargetArrayInGivenOrder obj =  new TargetArrayInGivenOrder();
		int nums[] = {1,2,3,4,0}, index[] = {0,1,2,3,0};
		int resultArr[] = obj.createTargetArray(nums, index);
		for(int i =0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
		
	}
	
	public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++) {
            list.add(index[i],nums[i]);
        }
		
        int[] res = new int[nums.length];
        
        for(int i=0; i<nums.length; i++)
            res[i] = list.get(i);
        
        return res;
    }

}

