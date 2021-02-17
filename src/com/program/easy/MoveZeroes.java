package com.program.easy;
/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class MoveZeroes {

	public static void main(String[] args) {
		int A[] = {1,3,5,7,2};
		MoveZeroes obj = new MoveZeroes();
		int nums[] = obj.sortArrayByParity(A);
		for(int i = 0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

	}
	
	public int[] sortArrayByParity(int[] A) {
		int length = A.length;
		if(length>1 && length<=5000) {
			int shift = 0, temp =0;
			for(int i = 0; i<A.length; i++) {
				if(A[i]<0 || A[i]>5000) return A;
				if(A[i]%2!=0) shift++;
				else if(shift>0){
					temp = A[i-shift];
					A[i-shift] = A[i];
					A[i] = temp;
				}
			}
		}
		return A;
    }

}
