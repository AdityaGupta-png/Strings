package String;

public class AddStrings {
    static void main() {
        String str1 = "11";
        String str2 = "123";
        System.out.println(AddTwoStrings(str1,str2));
    }

    //    Method to add the two strings
    public static String AddTwoStrings(String str1, String str2) {

        int sum1 = 0;  // for adding element of the string 1
        int sum2 = 0; // for adding the element of the string 2

        for (int i = 0; i < str1.length(); i++) {
                // loop for the traverse the whole strings
                if (str1.charAt(i) > 0) {
                    sum1 = (sum1 * 10) + (str1.charAt(i) % 10);

                }

        }
        System.out.println(sum1);


        for (int j = 0; j < str2.length(); j++) {  // loop for the traverse the whole strings
            if (str2.charAt(j) > 0) {
                sum2 = (sum2 * 10) + (str2.charAt(j) % 10);
            }

        }
        System.out.println(sum2);

        int final_sum = sum1 + sum2;
        return String.valueOf(final_sum);
    }
}
