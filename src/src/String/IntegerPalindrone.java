package String;

//https://leetcode.com/problems/palindrome-number/description/

public class IntegerPalindrone {
    static void main() {
        int  x = -121;
        System.out.println(palindrone(x));
    }

//    Method to check the integer palindrone
    public static boolean palindrone(int x){

        int store1 = x;
        int store2 = 0;

        while(x > 0){

            int remain = x %10; // here to store the remainder
            store2 = (store2*10) + remain;
            x = x/10;

        }


        if(store1 != store2){
            return false;
        }
        return true;
    }
}
