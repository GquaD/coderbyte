import java.util.Scanner;


//https://www.coderbyte.com/editor/Simple%20Adding:Java
public class SimpleAdd {

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SimpleAdding(s.nextInt()));
    }

    public static int SimpleAdding(int num) {
        return num == 1 ? 1 : SimpleAdding(num - 1) + num;
    }
}
