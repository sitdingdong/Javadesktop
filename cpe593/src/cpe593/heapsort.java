package cpe593;

import java.util.Arrays;

public class heapsort {
	public static void heap(int[] a, int start, int length) {
		int j;
		int temp = a[start];
		for(j = 2 * start + 1; j < length; j = 2 * j + 1) {
			if(j < length - 1 && a[j] < a[j + 1]) {
				j++;
			}
			if(temp >= a[j]) {
				break;
			}else {
				a[start] = a[j];
				start = j;
			}
		}
		a[start] = temp;
	}
	public static void heapsorts(int[] a) {
		for(int i = a.length / 2 - 1; i >= 0; i--){
			heap(a, i, a.length - 1);
		}
		for(int i = a.length - 1; i >= 0; i--) {
			int temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heap(a, 0, i);
		}
	} 
	public static void main(String[] args) {
		int []arr = {9,8,7,6,5,4,3,2,1};
        heapsorts(arr);
        System.out.println(Arrays.toString(arr));
	}

}
