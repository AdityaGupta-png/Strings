package String;

import java.util.Arrays;

public class Anagram {
    static void main() {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(checkAnagram(str1,str2));

    }

//    Method to check the anagram
    public static boolean checkAnagram(String s1,String s2){

//        Check length of both string
        if(s1.length() != s2.length()){
            return false;
        }

//       Convert string into the Character array
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

//        Now sort the both array
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1,char2);

    }
}
