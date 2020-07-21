package acmp.ru;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_52 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int N = in.nextInt();
        int tail = 0;
        int sumRight = 0;
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            tail= N % 10;
            N = N / 10;
            if(i < 3) sum += tail;
            else sum -= tail;
        }
        if( sum == 0) out.println("YES");
        else out.println("NO");
        out.flush();
    }
}
