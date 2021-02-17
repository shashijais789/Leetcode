package com.program.easy;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class KidsWithGreatestNumberOfCandies {

	public static void main(String[] args) {
		KidsWithGreatestNumberOfCandies obj =  new KidsWithGreatestNumberOfCandies();
		int arr[] = {12,1,12};
		List<Boolean> cList= obj.kidsWithCandies(arr, 10);
		System.out.println(cList);
	}
	
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		
		
		
		if((candies.length >= 2 && candies.length <=100) && (extraCandies >=1 && extraCandies <= 50) ) {
			int max = 0;
			List<Boolean> cList = new ArrayList<>();
			for(int i =0; i< candies.length; i++) {
				if(max<candies[i]) {
					max = candies[i];
				}
			}
			for(int i =0; i< candies.length; i++) {
				if(candies[i]+ extraCandies >= max) {
					cList.add(true);
				} else {
					cList.add(false);
				}
			}
			return cList;
		}
        return new ArrayList<>();
    }
}
