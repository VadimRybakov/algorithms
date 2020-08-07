package tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyTreeMap<Integer, Integer>> list = new ArrayList<>();
        int unBalanced = 0;
        for (int i = 0; i < 2000000; i++) {
            list.add(new MyTreeMap<>());
            while (list.get(i).height() < 6) {
                list.get(i).put(
                        (int)(-100 + Math.random() * 200),
                        (int)(-100 + Math.random() * 200)
                );
            }
            if(!list.get(i).isBalanced())
                unBalanced++;
        }
//        System.out.println(list.get(1).height());
//        System.out.println(list.get(7).toString());
        System.out.println(unBalanced);
        double percentBalanced = 100 * (double)unBalanced / list.size();
        System.out.println(percentBalanced);
    }
}
