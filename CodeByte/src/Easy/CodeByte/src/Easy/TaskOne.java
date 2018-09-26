package Easy;

import java.util.Scanner;

//https://www.coderbyte.com/editor/Longest%20Word:Java

public class TaskOne {
    public static void main(String[] args) {

            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(LongestWord(s.nextLine()));

    }
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
}
