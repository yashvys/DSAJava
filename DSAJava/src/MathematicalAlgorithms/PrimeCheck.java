package MathematicalAlgorithms;

public class PrimeCheck {
	public boolean isPrime(int n) {
		if (n <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false; // If divisible by any number, not prime
			}
		}
		return true; // Prime number
	}

	public static void main(String[] args) {
		PrimeCheck checker = new PrimeCheck();
		System.out.println(checker.isPrime(7)); // Output: true
		System.out.println(checker.isPrime(10)); // Output: false
	}
}
