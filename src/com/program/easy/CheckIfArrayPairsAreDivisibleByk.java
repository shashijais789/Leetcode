package com.program.easy;

import java.util.HashMap;

public class CheckIfArrayPairsAreDivisibleByk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfArrayPairsAreDivisibleByk obj = new CheckIfArrayPairsAreDivisibleByk();
		System.out.println(obj.canArrange(new int[] {-1,1,-2,2,-3,3,-4,4}, 3));

	}
	
	public boolean canArrange(int[] arr, int k) {
		if (arr.length % 2 == 1) 
            return false; 
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        for (int i = 0; i < arr.length; i++){ 
            int rem = arr[i] % k; 
            if (!hm.containsKey(rem)){ 
                hm.put(rem, 0); 
            } 
            hm.put(rem, hm.get(rem) + 1); 
        } 
        for (int i = 0; i < arr.length; i++) { 
            int rem = arr[i] % k; 
            if (2 * rem == k) { 
                if (hm.get(rem) % 2 == 1) 
                    return false; 
            } else if (rem == 0) { 
                if (hm.get(rem) % 2 == 1) 
                    return false; 
            }else { 
                if (hm.get(k - rem) != hm.get(rem)) 
                    return false; 
            } 
        } 
        return true; 
    }

}


