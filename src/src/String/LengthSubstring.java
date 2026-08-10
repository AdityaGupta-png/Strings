package String;

public class LengthSubstring {
    static void main() {
        String str = "83415";
        lengthSubstring(str);
    }

//    Making the method to print the substring

    public static void lengthSubstring(String str){

//        loop for the length
        for(int len = 0; len <= str.length(); len++){

//            start the len as the j
            for(int j = len; j<=str.length(); j++){

                int i = j - len;
                System.out.println(str.substring(i,j));
            }
        }
    }
}
