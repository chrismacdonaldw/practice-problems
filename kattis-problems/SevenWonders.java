import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String string = stdin.next();
        int t = 0;
        int c = 0;
        int g = 0;
        int last = 0;
        for (char letter : string.toCharArray()) {
            if (letter == 'T')
                t++;
            if (letter == 'C')
                c++;
            if (letter == 'G')
                g++;
        }
        int n = Math.min(t, Math.min(g, c));
        last += t * t;
        last += c * c;
        last += g * g;
        System.out.println(last + (n * 7));
    }
}
