package com.program.easy;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		JewelsAndStones obj =  new JewelsAndStones();
		int jewels = obj.numJewelsInStones("z", "ZZZ");
		System.out.println(jewels);
	}
	
	public int numJewelsInStones(String J, String S) {
		Set<Character> Jewels = new HashSet<>();
        
		for (int i = 0; i < J.length(); i++) { 
			Jewels.add(J.charAt(i)); 
        } 
		int noOfJewels = 0;
		for (int i = 0; i < S.length(); i++) { 
			if(Jewels.contains(S.charAt(i))) {
				noOfJewels++;
			}
        } 
        return noOfJewels;
    }
}
