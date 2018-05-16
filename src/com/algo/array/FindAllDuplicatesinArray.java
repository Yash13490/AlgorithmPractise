package com.algo.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesinArray {

	public static void main(String[] args) {
		FindAllDuplicatesinArray allDuplicatesinArray = new FindAllDuplicatesinArray();
		int a[] = {4,3,2,7,8,2,3,1};
		System.out.println(allDuplicatesinArray.findDuplicates(a));
	}// 4,3,2,7,8,2,3,1

	
	  public List<Integer> findDuplicates(int[] nums) {
		  Set<Integer> set = new HashSet<Integer>();
		  List<Integer> b = new ArrayList<Integer>();
		  for(int i=0 ; i <nums.length ; i++ ) {
			  if(!set.add(nums[i])){
					b.add(nums[i]);
			  }
		  }
		return b;
	   }
}
