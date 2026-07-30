package Two_2D_Arrays_Questions;

public class Spiral_Print {
    static void main() {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        spiral_Printing(arr);
    }

//    Method to print spiral
    public static void spiral_Printing(int [][] arr){

        int minrow = 0;
        int maxrow = arr.length-1;
        int mincol = 0;
        int maxcol = arr[0].length-1;
        int total_element = arr.length * arr[0].length;
        int count = 0;

        while(count < total_element) {

//        Loop for print outer value
            for (int i = mincol; i <= maxcol && count < total_element; i++) {
                System.out.print(arr[minrow][i] + " ");
                count++;
            }

            minrow++;  // for going the next row

            for (int i = minrow; i <= maxrow  && count < total_element; i++) {
                System.out.print(arr[i][maxcol] + " ");
                count++;
            }

            maxcol--; // for printing the last row
            for (int i = maxcol; i >= 0 && count < total_element; i--) {
                System.out.print(arr[maxrow][i] + " ");
                count++;
            }

            maxrow--;

            for (int i = maxrow; i >= minrow && count < total_element; i--) {
                System.out.print(arr[i][mincol] + " ");
                count++;
            }
            mincol++;
        }




    }
}
