package com.algo.array;
/**
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
 * @author daveyas1
 *
 */
public class ContinuousSubarrayRequiredSortWholeArray {
		void merge(int arr[], int l, int m, int r)
		{
			int n1 = m - l + 1;
			int n2 = r - m;

			int L[] = new int [n1];
			int R[] = new int [n2];

			for (int i=0; i<n1; ++i)
				L[i] = arr[l + i];
			for (int j=0; j<n2; ++j)
				R[j] = arr[m + 1+ j];
			int i = 0, j = 0;

			int k = l;
			while (i < n1 && j < n2)
			{
				if (L[i] <= R[j])
				{
					arr[k] = L[i];
					i++;
				}
				else
				{
					arr[k] = R[j];
					j++;
				}
				k++;
			}

			while (i < n1)
			{
				arr[k] = L[i];
				i++;
				k++;
			}

			while (j < n2)
			{
				arr[k] = R[j];
				j++;
				k++;
			}
		}

		void sort(int arr[], int l, int r)
		{
			if (l < r)
			{
				int m = (l+r)/2;

				sort(arr, l, m);
				sort(arr , m+1, r);

				merge(arr, l, m, r);
			}
		}

		public static int findUnsortedSubarray(int[] nums) {
			
			int temp[] = new int[nums.length];
			
			for (int i=0; i<nums.length; i++)
				temp[i]=nums[i];
		/*	for(int j=0 ; j<temp.length; j++)
		        System.out.print(temp[j]+" ");
			//System.out.println("");
			*/
			ContinuousSubarrayRequiredSortWholeArray ob = new ContinuousSubarrayRequiredSortWholeArray();
			ob.sort(temp, 0, temp.length-1);
			/*for(int j=0 ; j<temp.length; j++)
			        System.out.print(temp[j]+" ");
			System.out.println("");*/

			for (int i=0; i<nums.length-1; ++i)
			{
				if(temp[i]<nums[i]) {
					for(int j=nums.length-1;j>i;j--) {
						if(temp[j]>nums[j])
							return j-i+1;
					}
				}
			}
			return 0;
	        
	    }

	public static void main(String[] args) {
		int arr[] = {2,6,4,8,10,9,15};
		int i = findUnsortedSubarray(arr);
		System.out.println(i);
	}

}
