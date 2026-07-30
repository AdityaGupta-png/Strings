package Sorting;

public class Insertion_Sort {
    static void main() {

        int [] arr = {3,5,2,4,6};
        insertion_Sort(arr);

//        Printing the element of the array after sorting
        for(int k =0;k< arr.length;k++){
            System.out.print(arr[k] + " ");
        }

    }

//    Method for the Insertion sort
    public static void insertion_Sort(int [] arr){

//        Single element is sorted due to this reason we start the loop from Index --> 1
        for(int i = 1;i<arr.length;i++){
            int picked = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > picked){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = picked;
        }
    }
}
