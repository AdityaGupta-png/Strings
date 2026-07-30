package Arrays_Question;

//  Question Link --> https://leetcode.com/problems/trapping-rain-water/description/

public class Rain_Water_Trapping {
    static void main() {
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(Water_Trapping(arr));
    }

//    Method for the water_Trapping calculation
    public static int Water_Trapping(int [] arr){

        int sum = 0;

//        Calculate the length of the array
        int n = arr.length;

//        Making the new array --> left_Maximum
        int [] left = new int[n];

        left[0] = arr[0];
        for(int i = 1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }

//        Making the new array --> right_maximum
        int [] right = new int[n];
        right[n-1] = arr[n-1];

        for(int j = n-2;j>=0;j--){
            right[j] = Math.max(right[j+1],arr[j]);
        }

        for(int i = 0;i< arr.length;i++){
            sum += Math.min(left[i],right[i]) - arr[i];
        }
        return sum;




    }
}
