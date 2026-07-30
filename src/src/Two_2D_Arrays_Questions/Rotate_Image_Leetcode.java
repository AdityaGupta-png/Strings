package Two_2D_Arrays_Questions;

// QUESTION LINK --> https://leetcode.com/problems/rotate-image/

public class Rotate_Image_Leetcode {
    static void main() {
        int [][] arr  = {{1,2,3},{4,5,6},{7,8,9}};

//         Call the method
        rotate(arr);

//        Print the array
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

//    Method to rotate the 2D array --> 90 degree --> clockwise direction
//    1 --> Take the Transpose of the given matrix
//    2 --> change the 1st column and last column of the transpose matrix

    public static void rotate(int [][] arr){

        int n = arr.length;

//    code for the transpose of the matrix
        for(int i = 0;i<arr.length;i++){
            for(int j = (i+1);j<arr[i].length;j++){
                // Logic for swap the element of the 2d array
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }

//        Swap the element of the 1st and the last column
        for(int i = 0;i<arr.length;i++){
            for(int j= 0;j<n/2;j++){

//                For swap the 1st and the last column element
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;

            }
        }
    }


}
