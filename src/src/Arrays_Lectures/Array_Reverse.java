package Arrays_Lectures;

public class Array_Reverse {
    static void main() {
        int [] arr = {1,2,3,4,5,6,7};
        reverse(arr);

//        For printing the numbers
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

//    Making the method for the reverse array
    public static void reverse(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i <j){
            swap(i,j,arr);
            i++;
            j--;
        }
    }

//    Making the method to make the swap
    public static void swap(int i, int j,int [] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;


    }


}
