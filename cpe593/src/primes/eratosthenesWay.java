package primes;

public class eratosthenesWay {
	public static boolean[] eratosthene(int a) {
		boolean[] primes = new boolean[a + 1];
		for(int i = 2; i < primes.length; i++) {
			primes[i] = true;
		}
		for(int i = 2; i < primes.length; i++) {
			if(primes[i]) {
				for(int j = i * i; j < primes.length; j += i) {
					primes[j] = false;
				}
			}
		}
		return primes;
	}
	public static boolean[] ear(int a) {
		boolean[] v = new boolean[a + 1];
		for(int i = 2; i < a + 1; i++) {
			v[i] = true;
		}
		for(int i = 4; i < a + 1; i += 2) {
			v[i] = false;
		}
		for(int i = 3; i < a + 1; i += 2) {
			if(v[i]) {
				for(int j = i * i; j < a + 1; j += 2 * i) {
					v[j] = false;
				}
			}
		}
		return v;
	}
	public static void main(String[] args) {
		boolean[] a = ear(80);
		for(int i = 0; i <= 80; i++) {
			if(a[i]) {
				System.out.println(i);
			}
		}
	}

}
