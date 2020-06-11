package com.program.easy;


public class ShuffleTheArray {

	public static void main(String[] args) {
		ShuffleTheArray obj =  new ShuffleTheArray();
		int arr[] = {1,1,2,2};
		int result[] = obj.shuffle(arr, 2);
		for(int i = 0; i< result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public int[] shuffle(int[] nums, int n) {
		
		if((n >= 1 && n <= 500) && nums.length == 2*n ) {
			int result[] = new int[2*n];
			int pointer = 0, position = -1;
			while(pointer<n) {
				result[++position] = nums[pointer];
				result[++position] = nums[pointer+n];
				pointer++;
			}
			return result;
		}
        return nums;
    }

}
