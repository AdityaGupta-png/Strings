package Lecture_n0_1.Methods;

public class Fun_demo {
    static void main() {
        System.out.println("Hey");
        int a = 9;
        int b = 7;
        int c = a + b;
        add();  // Calling of the add method
        System.out.println("The sum of the variable is : " + c);

    }
//    sum method creating
    public static  void add(){
        int a = 17;
        int b  =17;
        int c = a + b;
        sub(); // calling of the sub method
        System.out.println(c);
    }

//    Calling of the substraction method
    public static void sub(){
        int a = 30;
        int b = 20;
        int c = a-b;
        System.out.println(c);
    }

}
