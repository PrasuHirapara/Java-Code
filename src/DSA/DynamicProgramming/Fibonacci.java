package DSA.DynamicProgramming;

public class Fibonacci {

    public long Fibonacci_GoldenRatio(long n) {

        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    public long Fibonacci_Recursion(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return Fibonacci_Recursion(n - 1) + Fibonacci_Recursion(n - 2);
    }

}
