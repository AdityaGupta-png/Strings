package Two_2D_Arrays_Questions;

public class Question_no_One {
    static void main() {

//        define hardcore 2D array
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        display_2D(arr);
    }

//    method to display the array
    public static void display_2D(int [][] arr){

//        loop of the column
        for(int col = 0;col<arr[0].length;col++){

//            Odd and even condition for row
            if(col %2 == 0){
                for(int row = 0;row<arr.length;row++){
                    System.out.print(arr[row][col] + " ");
                }
            }
            else{
                for(int row = arr.length-1;row>=0;row--){
                    System.out.print(arr[row][col] + " ");
                }

            }
        }
    }

}
