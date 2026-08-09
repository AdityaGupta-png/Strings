package String;

public class Substring_Printing {
    static void main() {
        String str = "nitin";
        printSubstring(str);
    }

//    Making the method to print the substring

    public static void printSubstring(String str){

        for(int i = 0;i<str.length();i++){
            for(int j = (i+1);j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
            System.out.println();
        }

    }
}
