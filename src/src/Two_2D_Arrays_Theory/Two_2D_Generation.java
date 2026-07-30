package Two_2D_Arrays_Theory;

public class Two_2D_Generation {
    static void main() {
        int [][] arr = new int[3][3];
        System.out.println(arr);
        System.out.println(arr[1]);
        System.out.println(arr[1][1]);
        display(arr);
    }

//    Method to display the 2D array
    public static void display(int [][] arr){

        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
