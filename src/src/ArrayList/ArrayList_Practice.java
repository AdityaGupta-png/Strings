package ArrayList;

import java.util.ArrayList;

public class ArrayList_Practice {
    static void main() {

//        Understand the Wrapper class
        /*
        There are 8 types of Wrapper class         --> exists only primitive Data types
        Primitive Data Types                 Wrapper class
        byte                    -->          Byte
        boolean                --->          Boolean
        short                  ---->         Short
        char                  ---->          Character
        int                   --->           Integer
        float                ---->           Float
        long                 ----->          Long
        double               --->            Double
        * */

//       AutoBoxing --> Primitive to Wrapper class
//        int a = 10;
//        Integer a1 = 12;
//        a1 = a;   // example of the AutoBoxing
//        System.out.println(a1);
//        a =a1;     // example of unboxing
//        System.out.println(a);


//        if range of Integer,Long,Short,Byte under (-128 to 127) --> true
//        if range of Integer,Long,Short,Byte not under (-128 to 127) --> not true

//        Integer C1 = 15;
//        Integer C2 = 15;
//        Integer C3 = 155;
//        Integer C4 = 155;
//
//        System.out.println(C1 == C2);
//        System.out.println(C3 == C4);


//        Creation of Arraylist
        ArrayList<Integer> ll = new ArrayList<>();  // Initial size is 10
//        when we add any element it is increase by 1.5x

//        Find the size of the arraylist
        System.out.println(ll.size());

//        Print the arraylist
        System.out.println(ll);

//        Add the element in the arraylist
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(2,60);
        System.out.println(ll);

//        get --> to get the value from the index
        System.out.println(ll.get(1));

//        set method --> means if i have to update the values
        ll.set(0,100);
        System.out.println(ll);
        ll.set(3,80);
        System.out.println(ll);

//        remove method --> to remove the element from the array list
        ll.remove(3);
        System.out.println(ll);




    }
}
