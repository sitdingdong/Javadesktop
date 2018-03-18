package search;

public class goldenmeanSearch {
	public static int gmsearch(int[] a) {
		double phi = (Math.sqrt(5) + 1) / 2;
		int l = 0;
		int r = a.length - 1;
		int s = (int)((r - l) / phi - 5);
		int x, y;
		while(l < r) {
			x = r - s;
			y = l + s;
			if(a[x] >= a[y]) {
				r = y;
				y = x;
				s = (int)((r - l) / phi - 5);
				x = r - s;
			}else {
				l = x;
				x = y;
				s = (int)((r - l) / phi - 5);
				y = l + s;
			}
		}
		return l;
	}
	public static void main(String[] args) {
		int[] a ={1, 2, 5, 6, 4, 2};
		int e = gmsearch(a);
		System.out.println(e);
	}

}
