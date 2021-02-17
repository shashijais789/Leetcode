package com.program.easy;

import java.util.HashMap;
import java.util.Map;


public class PathCrossing {

	public static void main(String[] args) {
		PathCrossing obj = new PathCrossing();
		System.out.println(obj.canArrange(new int[]{1,2,3,4,5,10,6,7,8,9}, 5));

	}
	
	public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int pair = 0, count=0;
        for(int i= 0; i<arr.length; i++) {
        	pair = k-arr[i];
        	if(map.containsKey(pair)) count++;
        	else map.put(arr[i], pair);
        }
        if(count==arr.length/2) return true;
        else return false;
    }

}
