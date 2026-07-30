package Arrays_Lectures;

public class Maximum_Number_In_Array {
    static void main() {
        int [] arr = {1,22,44,-1,33,66,0,44};
        System.out.println("The maximum number in the array is : " + largest_Number(arr));
    }

//    Making an method to find the Largest Number in the array
    public static int largest_Number(int [] arr){

//        Let assume the maximum number
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }

}
