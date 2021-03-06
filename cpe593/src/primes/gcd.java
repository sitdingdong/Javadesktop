package primes;

public class gcd {
	public static int gcdfind(int a,int b) {
		for(int i = Math.min(a, b); i >= 2; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;
	}
	public static int gcd22(int a, int b){
	    if (a == 0 || b == 0){
	        return ( a & b);
	    }
	    while ( b != 0){
	        int tmp = b;
	        b = a % b;
	        a = tmp;    
	    }
	    return a;
	}
	public static void main(String[] args) {
		System.out.println(gcdfind(3025, 1025));
		System.out.println(gcd22(8,12));
	}

}
