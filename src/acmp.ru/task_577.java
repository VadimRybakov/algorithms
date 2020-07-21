package acmp.ru;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x = in.nextInt();
        int y = in.nextInt();
        String arr = "0123456789";
        int[] freq = new int[10];

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                String str = Integer.toString(i * j);
                for (int k = 0; k < arr.length(); k++) {
                    for (int l = 0; l < str.length(); l++) {
                        if (str.charAt(l) == arr.charAt(k))
                            freq[k]++;
                    }
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            out.println(freq[i]);
        }
        out.flush();
    }
}
