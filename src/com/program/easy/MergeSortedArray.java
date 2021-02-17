package com.program.easy;
/**
 * 
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class MergeSortedArray {

	public static void main(String[] args) {
		int nums1[] = {3,5,6,0,0,0};
		int nums2[] = {1,7,8};
		int m = 3, n =3;
		MergeSortedArray.merge(nums1, m, nums2, n);

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int counter = nums1.length-1;
		
		if(m+n==nums1.length) {
			m--;
			n--;
			while(counter>=0 && m>=0 && n>=0) {
				if(nums1[m]>=nums2[n]) {
					nums1[counter] = nums1[m];
					m--;
				} else {
					nums1[counter] = nums2[n];
					n--;
				}
				counter--;
			}
			if(m==-1) {
				while(n>=0) {
					nums1[counter] = nums2[n];
					n--;
					counter--;
				}
			} else {
				while(m>=0) {
					nums1[counter] = nums1[m];
					m--;
					counter--;
				}
			}
		}
        for(int i=0; i<nums1.length; i++) {
        	System.out.println(nums1[i]);
        }
    }

}
