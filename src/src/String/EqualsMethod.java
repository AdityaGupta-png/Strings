package String;

public class EqualsMethod {
    static void main() {
        String s1 = "hello";
        String s2 = "helo";
        System.out.println(equals(s1,s2));
    }

//    Making the method of the string
    public static boolean equals(String s1, String s2){

        if(s1 == s2){
            return true;
        }

        if(s1.length() != s2.length()){
            return false;
        }

        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i) == s2.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
