package String;

public class Palindrome {
    static void main() {
        String str = "nitiniii";
        System.out.println(check_palin(str));
    }

//    Making the method to check the string is palindrome or not

    public static boolean check_palin(String s1){

        int i = 0 ;// for the first index
        int j = s1.length()-1; // for the last index

        while (i <= j){

            if(s1.charAt(i) != s1.charAt(j)){
                return false;  // for first mismatch
            }
            i++;
            j--;
        }
        return true;  // for all match

    }
}
