package arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        int size = 100000;

        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            myArrayList.add(rnd.nextInt(size + 1));
        }

        System.out.println(myArrayList.indexOf(2));

/*        long b = System.currentTimeMillis();
        myArrayList.bubbleSort();
        System.out.println("bubbleSort time is " + (System.currentTimeMillis() - b));*/

/*        long s = System.currentTimeMillis();
        myArrayList.selectionSort();
        System.out.println("selectionSort time is " + (System.currentTimeMillis() - s));*/

        long i = System.currentTimeMillis();
        myArrayList.insertionSort();
        System.out.println("insertionSort time is " + (System.currentTimeMillis() - i));
    }

}
