package acmp.ru;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class task_367 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A = in.nextInt();
        int N = in.nextInt();
        BigInteger result = new BigInteger(String.valueOf(A));
        for (int i = 0; i < N - 1; i++) {
            result = result.multiply(BigInteger.valueOf(A));
        }
        out.println(result);

        out.flush();
    }
}
