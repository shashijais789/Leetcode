package com.program.easy;


public class SplitStringInBalancedStrings {

	public static void main(String[] args) {
		SplitStringInBalancedStrings obj =  new SplitStringInBalancedStrings();
		int result = obj.balancedStringSplit("RRLLLLLLL");
		System.out.println(result);
	}
	
	public int balancedStringSplit(String s) {
		int answer = 0;
	    int lCount = 0;
	    int rCount = 0;
	    
	    for (int i = 0; i < s.length(); i++) {
	    	if (s.charAt(i) == 'L')
	    		lCount++;
	    	else 
	    		rCount++;
	    	
	    	if (lCount == rCount) {
	    		answer++;
	    		lCount = 0;
	    		rCount = 0;
	    	}        		
	    }
		
		return answer;
    }

}

