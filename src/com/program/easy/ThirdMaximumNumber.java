package com.program.easy;
/**
 * @author shashijais789@gmail.com
 * Category: Array
 * Problem Type: Easy
 */
public class ThirdMaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdMaximumNumber obj = new ThirdMaximumNumber();
		int num = obj.thirdMax(new int[] {1,2,-2147483648});
		System.out.println(num);
	}

	public int thirdMax(int[] nums) {
		
		int len = nums.length;
		if(len==0) {
			return 0;
		}else if(len==1) {
			return nums[0];
		}else if(len==2) {
			return (nums[0]>nums[1])?nums[0]:nums[1];
		}else {
			int m = nums[0], m2 = m, m3 = m;
			int temp;
			System.out.println("m: "+m  + ", m2: " +m2 + ", m3: " +m3);
			for(int i = 1; i<len; i++) {
				if(nums[i]==m) continue;
				if(nums[i]>m) {
					temp = m;
					m=nums[i];
				}else temp=nums[i];
				if(temp==m2 && m2<m) continue; 
				else if(temp>m2 || (m2==m && temp<m)) {
					m3=m2;
					m2=temp;
				} else {
					if(temp==m3 && m3<m2)continue;
					else if(temp>m3 || (m3==m2 && temp<m2) || (m3>=m2 && temp<m3)) {
						m3=temp;
					} 
				}
				System.out.println("m: "+m  + ", m2: " +m2 + ", m3: " +m3);
			}
			System.out.println("m: "+m  + ", m2: " +m2 + ", m3: " +m3);
			if(m3<m2 && m2<m) return m3;
			else return m;
			
		}
    }

}
