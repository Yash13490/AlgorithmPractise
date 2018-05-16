package com.actual.algo;

public class Heap {

	public static void main(String[] args) {
		int a[]= {42,41,53,6,23,25};
		Heap heap = new Heap();
	//	for(int i=0; i< a.length; i ++)
		heap.heapi(a,0,a.length-1);
		System.out.println(a);
	}
	
	public void heapi(int[] a, int i, int n) {
		int left = 2 * i;
		int right= 2 * i +1;
		int max= 0;
		if(left <= n && a[left] > a[i])
			max = left;
		else
			max = i;
		
		if(right <= n && a[right]>a[max])
			max = right;
		if(max != i ) {
			swap(a[max],a[i], a);
			heapi(a,max,a.length-1);
		}
	}
	
	public void swap(int i, int j, int a[]) {
		int temp=0;
		temp=a[i];
		a[i]=a[j];
		a[j]=a[temp];
	}

}
