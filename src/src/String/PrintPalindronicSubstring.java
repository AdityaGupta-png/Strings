package String;

public class PrintPalindronicSubstring {
    static void main() {
        String s1 = "kanak";
        printingSubstring(s1);
    }

//    Method to Printing the substring of the strings
    public static void printingSubstring(String str){

        for(int i =0; i<str.length(); i++){
            for(int j = (i+1); j<= str.length();j++){
                String sub = str.substring(i,j);
                if (check_Palindrome(sub)){
                    System.out.println(sub);
                }
            }
            System.out.println();
        }

    }

//    Method to check the given string is palindrome is not
    public static boolean check_Palindrome(String str){

        int i = 0;  // for the element of index 0
        int j = str.length()-1;  // for the element of last index

        while (i <= j){

            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
