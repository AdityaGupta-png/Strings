package Two_2D_Arrays_Questions;

public class Search_In_2D_Matrix {
    static void main() {

        int [][] arr = {{1,4,7,11,15},
                        {2,5,8,12,19},
                        {3,6,9,16,22},
                        {10,13,14,17,24},
                        {18,21,23,26,30}};
        int target = 13;
        System.out.println(search_In_2D(arr,target));

    }

//    Method to search in 2D matrix
    public static boolean search_In_2D(int [][] arr,int target){

        int r = 0;  // row
        int c = arr[0].length-1; // for the last value of the 0th row

        while(r < arr.length && c>= 0){

            if(arr[r][c] == target){
                return true;
            }
            else if(arr[r][c] > target){
                c--;
            }
            else{
                r++;
            }

        }
        return false;


    }

}
