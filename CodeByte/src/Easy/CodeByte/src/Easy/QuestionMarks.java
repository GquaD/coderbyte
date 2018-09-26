package Easy;

//https://www.coderbyte.com/language/Questions%20Marks
//NOT SOLVED

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuestionMarks {

    public static String question(String str) {
        str.toLowerCase();
        char[] letters = str.toCharArray();
        int countQ = 0;
        char one, two;

        StringBuilder builder = new StringBuilder(str);

        //making all writing letters a-z equal to " "
        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(letters[i]).matches("[a-z]")){
                letters[i] = ' ';
            }
        }
        // composing string without writing letters. only numbers and ? left
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] != ' ') {
                builder.append(letters[i]);
            }
        }
        //finding position of numbers
        int[] numberPositions = new int[letters.length];
        for (int i = 0; i < letters.length; i++) {
            if (Character.toString(letters[i]).matches("[0-9]")){
                numberPositions[i] = 1;
            }
        }

        //finding first sum which is equal to 10

        int sum = 0;
        int position1, position2;

        for (int i = 0; i < builder.length(); i++) {

        }
        
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(question(s.nextLine()));
    }
}
