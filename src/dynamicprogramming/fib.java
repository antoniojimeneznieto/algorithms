package dynamicprogramming;

public class fib {

    public static void main(String[] args) {
        int n = 46;
        double t0 = System.currentTimeMillis();

        System.out.println(fib(n));
        System.out.println("Time taken: " + (System.currentTimeMillis() - t0) + "ms");
    }

    private static int fib(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    private static int fibMemo(int n) {
        if (n == 0) return 0;
        return fibMemo(n, new int[n + 1]);
    }

    private static int fibMemo(int n, int[] memo) {
        if (n <= 2) return 1;
        if (memo[n] == 0) {
            memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        }
        return memo[n];
    }
}
