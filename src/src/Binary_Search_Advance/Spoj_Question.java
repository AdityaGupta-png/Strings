package Binary_Search_Advance;

import java.util.Arrays;
import java.util.Scanner;

public class Spoj_Question {
    static void main() {
        Scanner sc = new Scanner(System.in);

//        Taking the input of the Numbers of Cows
        System.out.println("Enter the number of cow : ");
        int noc = sc.nextInt();

//        Taking the input for the numbers of stalls
        System.out.println("Enter the numbers of stall : ");
        int nos = sc.nextInt();

//        Making the array of the numbers of stall
        int [] stall = new int[nos];

//        Taking the stall array as the input
        for(int i = 0;i<stall.length;i++){
            stall[i] = sc.nextInt();
        }

        Arrays.sort(stall);

        System.out.println("The largest minimum distance is : " + minDistance(stall,noc));

        sc.close();
    }

//    Making the method for the MinDistance
    public static int minDistance(int[] stall, int noc){

        int ans = 0 ;
        int n = stall.length-1;
        int low = stall[0];
        int high = stall[n];

        while(low <= high){

            int mid = low + ((high - low)/2);

            if(itIsPossible(stall,noc,mid) == true){
                ans = mid;
                low = mid +1;
            }
            else {
                high = mid-1;
            }

        }
        return ans;

    }

    private static boolean itIsPossible(int[] stall, int noc, int mid) {

        int pos = stall[0];

        int cowCount = 1;

        for(int i = 1;i<stall.length;i++){
            if(stall[i]-pos >= mid){
                cowCount++;
                pos = stall[i];
            }

            if(cowCount == noc){
                return true;
            }
        }
        return false;
    }
}
