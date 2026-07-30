package Arrays_Lectures;

public class Rotate_Array_Leetcode {
    static void main() {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);

//        Loop for printing the output of the array
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

//    Method for the rotate array logic
    public static void rotate(int [] arr , int k){
        int n  = arr.length;
        k %= n;
        swap(arr,0,(n-k)-1);
        swap(arr,n-k,n-1);
        swap(arr,0,n-1);


    }

//    Method to swap the element of the array
    public static void swap(int [] arr, int i, int j){

        while(i <j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }





}
