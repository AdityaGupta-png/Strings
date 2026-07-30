package Arrays_Lectures;

import java.util.Scanner;

public class Arrays_Input {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n  =  sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        displayArr(arr);
        sc.close();
    }

//    Method to Display the Array
    public static void displayArr(int [] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
