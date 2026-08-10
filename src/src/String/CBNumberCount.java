package String;

public class CBNumberCount {
    static void main() {
        String str = "81615";
    }

//    Method to print the SubstringLength
    public static int  lengthSubstring(String s){

        int count = 0;
        boolean [] visited = new boolean[s.length()];

        for(int len = 1; len <= s.length(); len++){
            for(int j = len; j <= s.length(); j++){

                int i = j - len;
                String str = s.substring(i,j);

                if(isCBNumber(Long.parseLong(str))  && isValid(visited,i,j)){
                    count++;

//                    i to j-1 --> ki ye Cb ban chuka hai
                    for(int k = i; k<j; k++){
                        visited[k] = true;
                    }
                }
            }
        }
        return count;
    }

    private static boolean isValid(boolean[] visited,int i ,int j) {

        for(int k = i; k<j ; k++){
            if (visited[i]){
                return false;
            }
        }
        return true;

    }

    //    Method to find proof the CB numbers
    public static boolean isCBNumber(long num){

        if(num == 0 || num == 1){
            return false;
        }

//        Craeting an array of the prime numbers 2 - 29
        int [] arr = {2,3,5,7,11,13,17,19,23,29};

        for(int i = 0; i< arr.length; i++){
            if (num == arr[i]){
                return true;
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(num % arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}
