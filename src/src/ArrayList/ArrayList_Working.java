package ArrayList;

import java.util.ArrayList;

public class ArrayList_Working {
    static void main() {
        ArrayList<Integer> ll = new ArrayList<>();

//        Add the element
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(2,-6);
        System.out.println(ll);
        System.out.println(ll.size());

//        Printing the every element of list
        for(int i = 0;i<ll.size();i++){
            System.out.print(ll.get(i) + " ");
        }





    }
}
