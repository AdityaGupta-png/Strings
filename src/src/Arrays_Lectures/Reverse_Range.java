package Arrays_Lectures;

import java.util.Scanner;

public class Reverse_Range {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int i = sc.nextInt();
        int j = sc.nextInt();
        reverse(arr,i,j);

//        Loop for printing the values
        for(int k= 0;k<arr.length;k++){
            System.out.print(arr[k] + " ");
        }


        sc.close();
    }
    public static void reverse(int [] arr, int i,int j){

        while(i <j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
