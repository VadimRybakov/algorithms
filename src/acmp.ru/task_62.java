package acmp.ru;

import java.io.PrintWriter;
import java.util.Scanner;

public class task_62 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String horizontal = "ABCDEFGH";
        String vertical = "12345678";
        int h = 0, v = 0;
        String str = in.nextLine();
        for (int i = 0; i < 8; i++) {
            if(str.charAt(0) == horizontal.charAt(i)) {
                h = i;
            }
            if(str.charAt(1) == vertical.charAt(i)) {
                v = i;
            }
        }
        if((h%2 == 0  && v%2 ==0) || (h%2 != 0  && v%2 !=0)) out.println("BLACK");
        else out.println("WHITE");

        out.flush();
    }
}
