package Arrays_Lectures;

public class Arrays_Swap_Demo_3 {
    static void main() {
        int [] arr = {10,20,30,40,50};
        int [] other = {100,200,300,400,500};
        System.out.println(arr[0] + " " + other[0]);
        swap(arr,other);
        System.out.println(arr[0] + " " + other[0]);
    }

//    Making the Swap method --> to understand JAVA is CALL BY VALUE
    public static void swap(int [] arr, int [] other){
        int [] temp = arr;
        arr = other;
        other = temp;

    }

//    Java doesNot work on the Call by REFERENCE
}
