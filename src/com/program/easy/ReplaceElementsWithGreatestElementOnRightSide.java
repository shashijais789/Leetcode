package com.program.easy;

public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceElementsWithGreatestElementOnRightSide obj = new ReplaceElementsWithGreatestElementOnRightSide();
		int arr[] = new int[] {1};
		int result[] = obj.replaceElements(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.println(result[i]);
		}

	}
	
	public int[] replaceElements(int[] arr) {
		int len = arr.length;
		
		if(len>=1 && len<=10000) {
	        if (arr == null || len == 0) {
	            return arr;
	        }
	        int max = -1;
			// loop backwards, the last element is -1
	        for (int i = len - 1; i >= 0; i--) {
	            int temp = arr[i];
	            arr[i] = max;
				// update max after re-assigning value
	            max = Math.max(temp, max);
	        }
		}
		return arr;
    }

}
