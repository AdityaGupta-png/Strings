package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_Element_Add {
    static void main() {
        Scanner sc = new Scanner(System.in);

//        input size of first array
        int n = sc.nextInt();
        int [] arr1 = new int[n];


        for(int i = 0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }

//        input size of second array
        int m = sc.nextInt();
        int [] arr2 = new int[m];

        for(int i = 0;i< arr2.length;i++){
            arr2[i] = sc.nextInt();
        }

        add_Arrays(arr1,arr2);
        sc.close();
    }

//    Making the method for add arrays
    public static void add_Arrays(int [] arr1, int [] arr2){

        ArrayList<Integer> ll = new ArrayList<>();
        int i = arr1.length-1; // last index of the array1
        int j = arr2.length-1; // last index of the array2

        int carry = 0; // for taking the carry

        while(i >=0 && j>= 0){

            int sum = arr1[i]+arr2[j]+carry;
            ll.add(sum %10);
            carry = sum/10;
            i--;
            j--;
        }

        while(i>=0){
            int sum  = arr1[i] + carry;
            ll.add(sum %10);
            carry = sum/10;
            i--;

        }

        while(j >= 0){
            int sum = arr2[j] + carry;
            ll.add(sum%10);
            carry = sum/10;
            j--;
        }

        if(carry > 0){
            ll.add(carry);
        }

        for(int k = ll.size()-1;k>=0;k--){
            System.out.print(ll.get(k) + " ");
        }


    }
}
