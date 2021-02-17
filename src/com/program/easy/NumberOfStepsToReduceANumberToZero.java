package com.program.easy;


public class NumberOfStepsToReduceANumberToZero {

	public static void main(String[] args) {
		NumberOfStepsToReduceANumberToZero obj =  new NumberOfStepsToReduceANumberToZero();
		int result = obj.numberOfSteps(123);
		System.out.println(result);
	}
	
	public int numberOfSteps (int num) {
        int count = 0;
        while(num>0) {
        	if(num%2==0) 
        		num = num/2;
        	else
        		num = num-1;
        	count++;
        }
        return count;
    }

}

