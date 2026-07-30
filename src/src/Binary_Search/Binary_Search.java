package Binary_Search;

public class Binary_Search {
    static void main() {
        int [] arr = {2,3,5,7,8,9,11,12,13,18};
        int key = 11;
        System.out.println(binary_Search(arr,key));
    }

//    Method to implement the binary search
    public static int binary_Search(int [] arr,int key){

        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1; // element nhi mile hai

    }

}
