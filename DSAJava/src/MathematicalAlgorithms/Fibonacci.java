package MathematicalAlgorithms;

public class Fibonacci {
	public int fibonacci(int n) {
		if (n <= 1) {
			return n; // Base case
		}
		return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.fibonacci(6)); // Output: 8 (Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8)
	}
}
