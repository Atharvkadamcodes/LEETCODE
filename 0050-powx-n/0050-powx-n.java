class Solution {
    public double pow(double x, long N) {
        if(N == 0) {
            return 1;
        }

        double half = pow(x, N / 2);
        double fn = half * half;
        if(N % 2 != 0) {
            fn = x * half * half;
        }
        return fn;
    }

    public double myPow(double x, int n) {
        long N = n;
        if(n < 0) {
            x = 1 / x;
            N = -N;
        }

        return pow(x, N);
    }
}