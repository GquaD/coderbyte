package Easy;

//https://www.coderbyte.com/language/AB%20Check

import java.util.Arrays;
import java.util.Scanner;

public class ABcheck {

    public static String ABcheck(String str) {
        char[] letters = str.toCharArray();
        Arrays.sort(letters);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < letters.length; i++) {
            builder.append(letters[i]);
        }
        return builder.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ABcheck(s.nextLine()));
    }

}
