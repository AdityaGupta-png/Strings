package Arrays_Lectures;

public class Arrays_Demo {

    static void main() {
//        Making of an array
        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        arr[0] = 30;
        arr[1] = 40;
        arr[2] = 50;
        arr[3] = 60;
        arr[4] = 70;

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

//        Making the different array
        int[] other = arr;
        other[2] = -7;
        System.out.println(arr[2]);
    }
}
