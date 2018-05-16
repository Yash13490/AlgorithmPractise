package com.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FindAllNumbersDisappearedinArray {

	public static void main(String[] args) {
		FindAllNumbersDisappearedinArray findAllNumbersDisappearedinArray =  new FindAllNumbersDisappearedinArray();
		int a[]= {4,3,2,7,8,2,3,1};  // 1,2,2,3,3,4,7,8
		System.out.println(findAllNumbersDisappearedinArray.findDisappearedNumbers(a));;
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		Integer a[] = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
		 List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
		List<Integer> newlit = new ArrayList<Integer>();
		for(int i=1 ; i<=nums.length ; i++) {
			if(!list.contains(i))
				newlit.add(i);
		}
		return newlit;
	}
}
