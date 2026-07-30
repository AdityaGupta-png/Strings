package Lecture_n0_1.Methods;

import java.util.Scanner;

public class ArmStrong {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong_Number(n));

        sc.close();

    }
//    To count the numbers
    public static int countOfDigit(int n){
        int count = 0;
        while(n > 0){
            n = n /10;
            count++;
        }
        return count;
    }

//    Making method to check armStrong number or not
    public static boolean isArmstrong_Number(int n){
        int d = countOfDigit(n);
        int sum = 0;
        int p = n;

        while(n > 0){
            int rem  = n %10;
            sum  += Math.powExact(rem,d);
            n = n/10;
        }

        if(sum == p){
            return true;
        }
        else{
            return false;
        }

    }
}
