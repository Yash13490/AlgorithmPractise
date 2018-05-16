package com.algo.array;

public class ThirdHigest {

	public static void main(String[] args) {

		int[] arr = {2,2,3,1};
		ThirdHigest sol5= new ThirdHigest();
		System.out.println("Output::" + sol5.thirdMax(arr));
	}
	public int thirdMax(int[] nums) {
		if( nums.length == 1 )
			return nums[0];
		
		if(nums.length == 2) {
			if(nums[0] < nums[1])
				return nums[1];
			else
				return nums[0];
		}
		int max1=nums[0], max2=0, max3=0;

		for(int i=1; i < nums.length ; i++) {
			if(max1 < nums[i] ) {
				max3 = max2;
				max2 = max1;
				max1 = nums[i];

			}
			else if(max2 < nums[i] ) {
				max3 = max2;
				max2 = nums[i];
			}
			else if(max3 < nums[i]) {
				max3 = nums[i];
			}
			System.out.println(max1+"\t\t"+max2+"\t\t"+max3);
		}
		return max3;
	}
}
