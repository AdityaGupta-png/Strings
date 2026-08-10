package String;

// Question link --> https://leetcode.com/problems/valid-palindrome-ii/description/

public class ValidPalindrone_Two {
    static void main() {
        String str = "abca";
        System.out.println(check_Palindrome(str));
    }

//    Method to check the palindrome
    public static boolean check_Palindrome(String str){

        int i = 0;
        int j = str.length()-1;

        while(i<= j){

            if(str.charAt(i) != str.charAt(j)){
//
                return isValidPalindrome(str,i+1,j) || isValidPalindrome(str,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isValidPalindrome(String str, int i, int j) {

        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;


    }
}
