package Lecture_n0_1.Methods;

//Making the practice of the Return type
public class Fun_Demo_3 {
    static void main() {
        System.out.println("Aditya");
        int a = 9;
        int b = 10;
        int c = a + b;
        System.out.println(add(22,44)); // Making the argument while the calling of the method
        System.out.println(c);


    }

//    Making the method
    public static int add(int a , int b){  // making the parameter of the method
        int c = a +b;
        return c;
    }
}
