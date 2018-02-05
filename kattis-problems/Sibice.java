import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        int w = stdin.nextInt();
        int h = stdin.nextInt();
        double len = w * w + h * h;
        while(n-- != 0) {
            int m = stdin.nextInt();
            System.out.println(m * m <= len ? "DA" : "NE");
        }
    }
}
