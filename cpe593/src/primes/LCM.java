package primes;

public class LCM {
	public static int gcdfind(int a,int b) {
		for(int i = Math.min(a, b); i >= 2; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		return 1;
	}
	public static int lcm(int a, int b){
	    return a * b / gcdfind(a, b);
	} 

}
