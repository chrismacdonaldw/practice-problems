import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String string = stdin.next();
        boolean a = true, b = false, c = false;
        boolean t;

        for (char letter : string.toCharArray()) {
            if (letter == 'A') {
                t = a;
                a = b;
                b = t;
            } else if (letter == 'B') {
                t = b;
                b = c;
                c = t;
            } else {
                t = a;
                a = c;
                c = t;
            }
        }

        if (a) System.out.println("1");
        if (b) System.out.println("2");
        if (c) System.out.println("3");
    }
}
