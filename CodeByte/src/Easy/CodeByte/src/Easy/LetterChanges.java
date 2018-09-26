package Easy;//https://www.coderbyte.com/information/Letter%20Changes

import java.util.Scanner;

public class LetterChanges {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(change2(s.nextLine()));
    }


    /*public static String change(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(((char)(str.charAt(i) + 1))) == "[aeiou]"){
                String temp = Character.toString((char)(str.charAt(i) + 1));
                s += temp.toUpperCase();
            } else {
                s+= (char) (str.charAt(i) + 1);
            }
        }
        return s;
    }*/
    public static String change2(String str){
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(str.charAt(i)).matches("[a-z]")){
                if (Character.toString((char)(str.charAt(i) + 1)).matches("[aeiou]")){
                    s += Character.toUpperCase ((char)(str.charAt(i) + 1));
                } else {
                    if (str.charAt(i) == 'z'){
                        s += 'A';
                    } else {
                        s += (char) (str.charAt(i) + 1);
                    }
                }
            } else {
                s += str.charAt(i);
            }

        }
        return s;
    }
}
