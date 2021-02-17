package com.program.easy;

import java.util.HashSet;
import java.util.Set;
/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class CheckIfNandItsDoubleExist {

	public static void main(String[] args) {
		int nums[] = {7,1,14,11};
		CheckIfNandItsDoubleExist obj = new CheckIfNandItsDoubleExist();
		System.out.println(obj.checkIfExist(nums));

	}
	
	public boolean checkIfExist(int[] arr) {
		if(arr.length<2 || arr.length>500) {
			return false;
		}
		Set<Integer> set = new HashSet<>();
		for(int i : arr){
			if(set.contains(i*2) || (i%2==0 && set.contains(i/2)))
				return true;
			set.add(i);
		}
		return false;
    }

}
