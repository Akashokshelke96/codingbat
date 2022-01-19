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


        Iterator<Integer> it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(ll.size());

    }
}
