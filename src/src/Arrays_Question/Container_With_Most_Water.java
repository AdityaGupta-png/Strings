package Arrays_Question;

// QUESTION LINK --> https://leetcode.com/problems/container-with-most-water/description/

public class Container_With_Most_Water {
    static void main() {
        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(max_Area(arr));
    }

//    Method to find the area of the container
    public static int max_Area(int [] arr){
        int left = 0;
        int right = arr.length-1;
        int maxArea = 0;

        while(left < right){
            int width = right-left;
            int length = Math.min(arr[left],arr[right]);
            int area = length * width;

            maxArea = Math.max(maxArea,area);

            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;



    }
}
