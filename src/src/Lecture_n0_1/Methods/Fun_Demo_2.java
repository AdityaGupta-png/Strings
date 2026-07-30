package Lecture_n0_1.Methods;

//Practice of the parameterised function
public class Fun_Demo_2 {
    static void main() {
        System.out.println("Hey");
        int a = 10;
        int b = 33;
        int i = 77;
        int j = 33;
        int c  = a +b;
        add(i,b);  // here i ka value a me jayega and b ka value b me
        add(a,b); // here a ka value a me jayega and b ka value b me
        System.out.println(c);

    }

//    Making of the Parameterised method
    public static void add(int a , int b){
        int c = a + b;
        System.out.println(c);
    }

}
