package com.program.easy;

import java.util.Arrays;
/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class HeightChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightChecker obj = new HeightChecker();
		int num = obj.heightChecker(new int[] {5,1,2,3,4});
		System.out.println(num);
	}
	
	public int heightChecker(int[] heights) {
		int num = 0;
		if(heights.length>=1 && heights.length<= 100) {
			int arr[] = heights.clone();
	        
	        Arrays.sort(arr);
	        for(int i = 0; i<heights.length; i++) {
	        	if(heights.length<1 || heights.length>100) return 0;
	        	
	        	if(heights[i]!=arr[i]) {
	        		num++;
	        	}
	        }
	        
		}
		return num;
        
    }

}
