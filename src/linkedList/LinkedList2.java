package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(39);
        ll.add(23);


        for (Integer integer : ll) {
            System.out.println(integer);
        }
        System.out.println(ll.size());
        System.out.println(ll.contains(30));

    }
}
