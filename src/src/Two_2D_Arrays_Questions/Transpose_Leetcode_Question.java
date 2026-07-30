package Two_2D_Arrays_Questions;

import java.util.Arrays;

public class Transpose_Leetcode_Question {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] transposes = transpose(arr);
        System.out.println(Arrays.deepToString(transposes));
    }

    // Method to transpose the matrix
    public static int[][] transpose(int [][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        // Notice: dimensions are swapped
        int [][] result = new int[col][row];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                result[j][i] = arr[i][j];  // copy into transposed position
            }
        }
        return result;
    }
}
