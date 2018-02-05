import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        int m = stdin.nextInt();

        if (n == 0 && m == 0) {
            System.out.println("Not a moose");
            System.exit(0);
        }

        if (n == m) {
            System.out.println("Even " + (n + m));
            System.exit(0);
        }
        int large = Math.max(n,m);
        System.out.println("Odd " + (large + large));
    }
}
