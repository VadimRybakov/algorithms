package stackAndQueue;

public class Main {
    static void inverseStrings(String s){
        MyStack stack = new MyStack(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            System.out.print((char)stack.pop());
        }
    }

    public static void main(String[] args) {
        inverseStrings("carpe diem");
        Dec dec = new Dec(25);
        dec.insertLeft(25);
        dec.insertLeft(34);
        System.out.println(dec.removeRight());
        dec.insertRight("cap");
        System.out.println(dec.removeLeft());
        System.out.println(dec.removeRight());

    }
}
