package Binary_Search;

public class Kth_Root_Problem {
    static void main() {
        int N = 87;
        int k = 3;
        System.out.println(kth_Root_Find(87,3));
    }

//    Method to find the  Value of the X
    public static int kth_Root_Find(int N, int k){

        int low = 1;
        int high = 87;
        int ans = 0;

        while(low <= high){

            int mid = (low + high)/2;

            if((int)Math.pow(mid,k) <= N){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid-1;
            }

        }
        return ans;






    }

}
