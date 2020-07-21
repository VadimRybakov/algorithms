package acmp.ru;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_692 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        if(N == 0 ) out.print("NO");
        else {
            while (N % 2 == 0) {
                N /= 2;
            }
            if (N == 1) out.print("YES");
            else out.print("NO");
        }
        out.flush();
    }
}
