package com.program.easy;

public class DuplicateZeros {

	public static void main(String[] args) {
		int arr[] = new int[]{1,0,0,0,1,1,1,1,1};
		int len = arr.length;
		int shift = 0;
		
		for(int i = 0; i<(len-shift); i++) {
			if(arr[i]==0) {
				if(shift+1+i<len) {
					arr[len-shift-1] = 0;
					shift++;
				}else {
					arr[len-1] = 0;
					len--;
					break;
				}
			}
		}
		int pointer = len-shift-1;
		while(shift>0 && pointer>0) {
			
			if(arr[pointer] == 0) {
				shift--;
			}
			
			arr[pointer+shift] = arr[pointer];
			arr[pointer] = 0;
			pointer--;

			
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		

	}

	
	
//	public static void main(String[] args) {
//		int arr[] = new int[]{1,0,2,3,0,4,5,0};
//		int possibleDups = 0;
//        int len = arr.length - 1;
//
//        // Find the number of zeros to be duplicated
//        // Stopping when left points beyond the last element in the original array
//        // which would be part of the modified array
//        for (int i = 0; i <= len - possibleDups; i++) {
//
//            // Count the zeros
//            if (arr[i] == 0) {
//
//                // Edge case: This zero can't be duplicated. We have no more space,
//                // as left is pointing to the last element which could be included  
//                if (i == len - possibleDups) {
//                    // For this zero we just copy it without duplication.
//                    arr[len-1] = 0;
//                    len--;
//                    break;
//                }
//                possibleDups++;
//            }
//        }
//
//        // Start backwards from the last element which would be part of new array.
//        int last = len - possibleDups;
//
//        // Copy zero twice, and non zero once.
//		
//		for (int i = last; i >= 0; i--) {
//            if (arr[i] == 0) {
//                arr[i + possibleDups] = 0;
//                possibleDups--;
//                arr[i + possibleDups] = 0;
//            } else {
//                arr[i + possibleDups] = arr[i];
//            }
//        }
//		
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//			
//		}
//		
//
//	}
	
//	public static void main(String[] args) {
//		int arr[] = new int[]{1,0,0,3,0,0,5,0};
//		int len = arr.length;
//		
//		for(int i = 0; i<len; i++) {
//			if(arr[i]==0 && (i+1)<len) {
//				
//				for(int j = len-1; j>i; j--) {
//					arr[j] = arr[j-1];
//				}
//				arr[i++] = 0;
//			}
//			
//		}
//		
//		for(int i = 0; i<len; i++) {
//			System.out.println(arr[i]);
//			
//		}
//
//	}
}
