package String;

public class String_Demo_3 {
    static void main() {


//         Non-primitive -->Address (==) --> compare
//        primitive --> content (==) --> compare

        String str = "Aditya";
        String str1 = new String("Aditya");
        String str2 = "Aditya";
        String str3 = new String("Aditya");

        System.out.println(str == str1);
        System.out.println(str1 == str3);
        System.out.println(str == str2);
    }
}
