package Easy;//https://www.coderbyte.com/results/Gquad7:Longest%20Word:Java

import java.util.Scanner;

public class LongestWord {
    public static String LongestWord(String sen) {

        String[] temp = sen.split("\\W+");
        sen = "";
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].length() > sen.length()){
                sen = temp[i];
            }
        }

        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        return sen;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}
