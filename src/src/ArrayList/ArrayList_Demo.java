package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Demo {
    static void main() {
        ArrayList<Integer> ll = new ArrayList<>();
        System.out.println(ll);

//        Calculate the size
        System.out.println(ll.size());

//        For the add element
        ll.add(10);
        ll.add(20);
        ll.add(30);

//        For add element at certain index
        ll.add(1,15);
        ll.add(3,25);
        System.out.println(ll);
        System.out.println(ll.size());

//        For sort the arraylist
        Collections.sort(ll);
        System.out.println(ll);

//        For get values
        System.out.println(ll.get(2));
        System.out.println(ll.get(1));

//        Set values
        System.out.println(ll.set(2,50));
        System.out.println((ll));
        System.out.println(ll.set(3,60));
        System.out.println(ll);

//        Remove
        System.out.println(ll.remove(1));
        System.out.println(ll);


    }
}
