import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double h = stdin.nextDouble();
        double v = stdin.nextDouble();
        v = Math.toRadians(v);
        int length = (int) Math.ceil(h / Math.sin(v));
        System.out.println(length);
    }
}
