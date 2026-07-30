package Two_2D_Arrays_Questions;

import java.util.Arrays;

public class Spiral_Matrix_2_Leetcode {
    static void main() {
        int n = 3;
        System.out.println(Arrays.deepToString(spiral_Printing(n)));

    }

//    Method to make the 2D array
    public static int[][] spiral_Printing(int n){




//        Making the new array to store the numbers
        int [][] arr = new int[n][n];

//        Making the variables that helps to make the 2D array
        int minRow = 0;
        int maxRow = n-1;
        int minCol  = 0;
        int maxCol = n-1;

//        Making the count to calculate the how many numbers wew used
        int count = 1;
        int size = n *n;

        while (count <= size){

            //        For printing the value of  1 st row element
            for(int i = minCol;i<=maxCol && count <= size;i++){
                arr[minRow][i] = count++;
            }
            minRow++;

//        For printing the value of  the last column
            for(int i = minRow;i<=maxRow  && count <= size;i++){
                arr[i][maxCol] = count++;
            }
            maxCol--;

//        For printing the value of last row element
            for(int i = maxCol;i>=minCol  && count <= size;i--){
                arr[maxRow][i] = count++;
            }
            maxRow--;


//        For printing the value of the first column
            for(int i =maxRow;i>=minRow && count <= size;i-- ){
                arr[i][minCol] = count++;
            }
            minCol++;

        }
        return arr;



    }


}
