package Sorting;

public class Selection_Sort {
    static void main() {
        int [] arr = {5,3,-7,4,8,2};

//        Call the method of the Selection sort
        selection_Sort(arr);

//        Loop for the print of the element of the array
        for(int k = 0;k< arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }

//    Method for the Selection sort
    public static void selection_Sort(int [] arr){

        for(int i = 0;i< arr.length;i++){

//          here it is the minimum index value
            int mini = i;

//            Loop for the check the minimum index and
            for(int j = (i +1);j<arr.length;j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }

//           Code for the swapping the minimum index
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;

//
        }
    }
}
