package com.algo.array;
import java.util.HashMap;
import java.util.Map;
/**
 * Contains Duplicate
 * @author daveyas1
 *
 */
public class ContainsDuplicate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		ContainsDuplicate sol1 = new ContainsDuplicate();
		System.out.println(sol1.containsDuplicate(arr));
	}

	   public boolean containsDuplicate(int[] nums) {
	    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    	for(int i=0 ; i<nums.length ; i++) {
	    		if(map.containsKey(nums[i])) {
	    			return true;
	    		}
	    		else
	    			map.put(nums[i], nums[i]);
	    	}
			return false;
	    }
}
