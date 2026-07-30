package Two_2D_Arrays_Questions;

public class Transpose_Of_Matrix {
    static void main() {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        Call the transpose method
        transpose(arr);

//        Printing the value of the array
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//    Method for the Transpose of the matrix
    public static void transpose(int [][] arr){

        for(int row = 0;row<arr.length;row++){
            for(int col = row+1;col<arr[0].length;col++){

//                here i have to only perform the swapping
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }

}
