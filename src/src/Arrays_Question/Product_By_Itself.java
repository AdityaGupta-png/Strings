package Arrays_Question;

// Question Link --> https://leetcode.com/problems/product-of-array-except-self/

import java.util.Arrays;

public class Product_By_Itself {
    static void main() {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(product_By_Itself(arr)));
    }

//    Method for the product of itself
    public static int[] product_By_Itself(int [] arr){

//       Length of the given array --> because we have to generate the left and right array
        int n = arr.length;

//       Generate of the left array
        int [] left = new int[n];
        left[0] = 1;
        for(int i = 1;i<arr.length;i++){
            left[i] = left[i-1] * arr[i-1];
        }

//        Generate of the right array
        int [] right = new int[n];
        right[n-1] = 1;
        for(int i = n-2; i>= 0;i--){
            right[i] = right[i+1] * arr[i+1];
        }

//        Now multiply both left and right array and store in the new integer array
        int [] multi = new int[n];

        for(int i = 0;i<n;i++){
            multi[i] = left[i] * right[i];
        }

        return multi;


    }


}
