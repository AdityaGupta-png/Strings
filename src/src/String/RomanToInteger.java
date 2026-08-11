package String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    static void main() {
        String str = "MCMXCIV";
        System.out.println(roman_To_Integer(str));
    }

//    Now write the logic for convert the romain to integer
    public static int roman_To_Integer(String str){

//        Making the map to store the values
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0;  // for calculate the total

        for(int i = 0; i<str.length(); i++){
            int value = map.get(str.charAt(i));  // get the value of M from the map

            if(i+1 < str.length() && value <map.get(str.charAt(i+1)) ){
                total -= value;
            }
            else{
                total += value;
            }

        }
        return total;

    }

}
