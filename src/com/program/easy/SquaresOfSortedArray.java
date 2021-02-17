package com.program.easy;

/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class SquaresOfSortedArray {

	public static void main(String[] args) {
		SquaresOfSortedArray obj =  new SquaresOfSortedArray();
		int nums[] = {-1, -1, 0, 0, 1,2, 2,3};
		int result[] = obj.sortedSquares(nums);
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public int[] sortedSquares(int[] A) {
		int left = 0, right = 0, counter = 0, leftSq = 0, rightSq = 0, len = A.length;
        int result[] = new int[len];
		while(counter<len && A[counter]<0) {
			counter++;
		}
		right = counter;
		left = counter-1;
		counter = 0;
		//First positive or 0 element in Array
		while(counter<len) {

			if(left>=0 && right<len) {
				leftSq = A[left]*A[left];
				rightSq = A[right]*A[right];
				if(leftSq<rightSq) {
					result[counter] = leftSq;
					left--;
				} else {
					result[counter] = rightSq;
					right++;
				} 
	
			} else if(left<0){
				result[counter] = A[right]*A[right];
				right++;
			} else if(right>=len) {
				result[counter] = A[left]*A[left];
				left--;
			}
			counter++;
		}
        
        return result;
    }

}

