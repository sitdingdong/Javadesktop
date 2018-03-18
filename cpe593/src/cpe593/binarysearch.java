package cpe593;

public class binarysearch {
	public static int bsearch(int[] a,int target) {
		int start = 0;
		int end = a.length - 1;
		int mid = (start + end) / 2;
		while(start <= end) {
			if(a[mid] == target) return mid;
			else if(a[mid] < target) start = mid + 1;
			else end = mid - 1;
			mid = (start + end) / 2;
		}
		return -1;
		
	}
	public static int bsearchrec(int[] a, int target, int start, int end) {
		int mid = (end - start) / 2 + start;
		if(a[mid] == target) {
			return mid;
		}
		if(start >= end) {
			return -1;
		}
		else if(a[mid] > target) {
			return bsearchrec(a, target, start, mid - 1);
		}
		else if(a[mid] < target) {
			return bsearchrec(a, target, mid + 1, end);
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] a = {1, 3, 5, 6, 7, 8};
		int b =bsearch(a, 3);
		System.out.println(b);
		int c =bsearchrec(a, 3, 0, a.length - 1);
		System.out.println(c);
	}

}
