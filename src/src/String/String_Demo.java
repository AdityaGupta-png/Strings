package String;

public class String_Demo {
    static void main() {
        String str = "Aditya";
        String str1 = "Aditya";
        String str2 = new String("Aditya");
        String str3 = new String("Aditya");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        String s1 = "hye";
        String s2 = "bye";
        s1 = s1.concat(s2);
        System.out.println(s1);
    }
}
