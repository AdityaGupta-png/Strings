package Arrays_Lectures;


public class Linear_Search {
    static void main() {
        int [] arr = {1,2,3,4,5,6,7};
        int key = 4;
        System.out.println("The Key at index of : " + linear_Search(arr,key));
    }

//    Making method for the Linear Search
    public static int linear_Search(int [] arr, int key){

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
