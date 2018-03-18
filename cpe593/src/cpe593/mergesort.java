package cpe593;

import java.util.Arrays;

public class mergesort {
	public static void merge(int[] a, int l, int mid, int r) {
		int i = l;
		int j = mid + 1;
		int k = 0;
		int[] temp = new int[a.length + 1];
		while(i <= mid && j <= r) {
			if(a[i] < a[j]) temp[k ++] = a[i ++];
			else temp[k ++] = a[j ++];
		}
		while(i <= mid) temp[k ++] = a[i ++];
		while(j <= r) temp[k ++] = a[j ++];
		for(int p = 0; p < k; p ++) {
			a[l + p] = temp[p];
		}
	}
	public static void mergesorts(int[] a, int l, int r) {
		if(l < r){
			int mid =(l + r)/2;
			mergesorts(a, l, mid);
			mergesorts(a, mid+1, r);
			merge(a, l, mid, r);	
		}
		
	}
	public static void main(String[] args) {
		int []arr = {9,8,7,6,5,4,3,2,1};
        mergesorts(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
	}

}
