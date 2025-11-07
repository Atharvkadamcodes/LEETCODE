class Solution {
    public int fibonacci(int n, int a, int b) {
        if(n == 0) {
            return a;
        }
        if(n == 1) {
            return b;
        }
        int c = a + b;
        return fibonacci(n - 1, b, c);
    }
    public int fib(int n) {
        int a = 0;
        int b = 1;
        return fibonacci(n, a, b);
    }
}