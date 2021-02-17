package com.program.easy;

/**
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class ValidMountainArray {

	public static void main(String[] args) {
		int nums[] = {5,4,3,2,1};
		ValidMountainArray obj = new ValidMountainArray();
		System.out.println(obj.validMountainArray(nums));

	}
	
	public boolean validMountainArray(int[] A) {
		if(A.length<3 || A.length>10000) {
			return false;
		}
		int N = A.length;
		int i = 0;
		// walk up
        while (i+1 < N && A[i] < A[i+1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == N-1)
            return false;

        // walk down
        while (i+1 < N && A[i] > A[i+1])
            i++;

        return i == N-1;
    }

}
