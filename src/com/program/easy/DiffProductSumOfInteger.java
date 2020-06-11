package com.program.easy;



public class DiffProductSumOfInteger {

	
	public static void main(String[] args) {
		DiffProductSumOfInteger obj =  new DiffProductSumOfInteger();
		System.out.println(obj.subtractProductAndSum(7));
	}
	public int subtractProductAndSum(int n) {
		int product = 1, sum = 0, digit = 0;
        while(n>0) {
        	digit = n%10;
        	System.out.println(digit);
        	product = product * digit;
        	sum = sum + digit;
        	n = n/10;
        	
        }
        return (product - sum);
	}

}
