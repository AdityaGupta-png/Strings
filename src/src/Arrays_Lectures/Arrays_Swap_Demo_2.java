package Arrays_Lectures;

public class Arrays_Swap_Demo_2 {
    static void main() {

//        making the array of the size 5
        int[] arr = {10,20,30,40,50,60};
        System.out.println(arr[0] + " " + arr[1]);
        swap(arr,0,1);
        System.out.println(arr[0] + " " + arr[1]);

    }

//    Making the Method to swap the element of the array
    public static void swap(int[] arr, int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
