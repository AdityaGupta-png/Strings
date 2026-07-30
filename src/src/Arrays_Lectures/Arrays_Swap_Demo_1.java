package Arrays_Lectures;

public class Arrays_Swap_Demo_1 {
    static void main() {
//        Making an array
        int[] arr = {10,20,30,40,50};
        System.out.println(arr[0] + " " + arr[1]);
        swap(arr[0],arr[1]);
        System.out.println(arr[0] + " " + arr[1]);

    }

//    Making the Swap method
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
