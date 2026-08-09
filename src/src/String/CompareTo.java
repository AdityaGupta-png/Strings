package String;

public class CompareTo {
    static void main() {
        String s1 = "komal";
        String s2 = "kamal";
        System.out.println(compareTo(s1,s2));
    }

//    Method to check the which string is smaller
    public static int compareTo(String s1, String s2){

        if(s1 == s2){
            return 0;
        }

        for(int i = 0; i<Math.min(s1.length(),s2.length()); i++){

            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i);
            }
            /*
            here if both s1 == s2 --> return 0
            if s1 > s2 --> return positive value
            if s1 < s2 --> return negative value
            * */

        }
        return s1.length()-s2.length();
    }

}
