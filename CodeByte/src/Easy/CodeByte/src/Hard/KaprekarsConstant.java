package Hard;

//https://www.coderbyte.com/editor/Kaprekars%20Constant:Java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class KaprekarsConstant {
    public static int KaprekarsConstant(int num) {
        int count = 0;
        while(num != 6174){
            num = sortDesc(num) - sortAsc(num);
            count++;
        }
        return count;
    }

    static int sortAsc(int num){
        char[] chars = (num + "").toCharArray();
        Arrays.sort(chars);
        StringBuilder builder = new StringBuilder();
        if (builder.length() < 4) {
            builder.append('0');
        }
        for (int i = 0; i < chars.length; i++) {
            builder.append(chars[i]);
        }
        return Integer.parseInt(builder.toString());
    }

    static int sortDesc(int num){
        char[] chars = (num + "").toCharArray();
        Arrays.sort(chars);
        StringBuilder builder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        if (builder.length() < 4) {
            builder.append('0');
        }
        return Integer.parseInt(builder.toString());
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(KaprekarsConstant(s.nextInt()));
    }
}
