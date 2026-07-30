package Two_2D_Arrays_Theory;

import java.util.Scanner;

public class User_Input_2D {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();  // for row input
        int c = sc.nextInt();  // for column input

        int [][] arr = new int[r][c];
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        display(arr);
        sc.close();
    }


//    Method to print the 2D array
    public static void display(int [][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
