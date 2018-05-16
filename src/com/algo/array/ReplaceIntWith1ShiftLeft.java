package com.algo.array;

import java.util.Arrays;

public class ReplaceIntWith1ShiftLeft {
	// Given an array replace all occurrence of p from array replace it with 1 and shift it to left most side of array and remaining array to right side... 
	public static void main(String args[]) {
		int[] a = {11,13,12,15,11,12,11,17};
		int remove =  11;
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		// solution
		int[] b = new int[a.length];
		Arrays.fill(b, 1);
		int i=b.length - 1 ;
		for(int j = a.length - 1; j > 0 ; j--) {
			if(a[j] != remove) {
				b[i] = a[j];
				i--;
			}
		}
		for(int k=0;k<a.length;k++)
			System.out.print(b[k]+"\t");
	}
	

	


}
