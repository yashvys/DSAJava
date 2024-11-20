package MathematicalAlgorithms;

public class Factorial {
    public int factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: 0! = 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    public static void main(String[] args) {
        Factorial fact = new Factorial();
        System.out.println(fact.factorial(5));  // Output: 120 (5! = 5*4*3*2*1)
    }
}
