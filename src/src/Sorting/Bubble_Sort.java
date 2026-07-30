package Sorting;

public class Bubble_Sort {
    static void main() {
        int [] arr = {2, 13, -4, 5, 7};

//        Call the method of the sorting
        sort(arr);
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

//    Method of the bubble sort
    public static void sort(int [] arr){
        for(int turn = 0; turn<arr.length-1;turn++){


            for(int i = 0; i< arr.length-1-turn ;i++){
                if(arr[i] > arr[i+1]){
//                    Do swapping
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
