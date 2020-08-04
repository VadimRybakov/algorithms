package recursion;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fact(5));
//        System.out.println(recFact(5));

//        System.out.println(fibo(48));
//        System.out.println(recFibo(13));
//
//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));

//        System.out.println(multiply(3, 8));
//        System.out.println(recMultiply(3,8));

//        System.out.println(recursivePow(2, 8));
//        System.out.println(recursivePow(3, 21));

        int[] w = {3, 2, 12, 5, 1};
        int[] v = {2100, 4200, 10010, 150, 10};
        int N = 5;
        int W = 10;
        System.out.println(backpack(v, w, N, W));
    }

    public static int fact(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    public static int recFact(int n) {
        if (n <= 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    public static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    public static long recFibo(int n) {
        if (n <= 2) {
            return 1;
        }
        return recFibo(n - 1) + recFibo(n - 2);
    }

    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recTriangleNum(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n : " + n);
        }
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static int multiply(int a, int b) {
        int value = 0;
        for (int i = 0; i < b; i++) {
            value += a;
        }
        return value;
    }

    public static int recMultiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recMultiply(a, b - 1) + a;
    }

    public static int recursivePow(int base, int pow){
        if(pow == 0) return 1;
        else if (pow % 2 == 0) return recursivePow(base, pow/2) * recursivePow(base, pow/2);
        else  return base * recursivePow(base, pow - 1);
    }

    public static int backpack(int[] v, int[] w, int n, int W) {
        if (n == 0) return 0;
        if (w[n - 1] > W)
            return backpack(v, w, n - 1, W);
        else {
            return Math.max(backpack(v, w, n - 1, W), backpack(v, w, n - 1, W - w[n - 1]) + v[n - 1]);
        }
    }

}
