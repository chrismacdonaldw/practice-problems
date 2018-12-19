import java.util.Scanner;

public class MeowFactor {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        long meow = stdin.nextLong();
        for (long i = (long)Math.pow(meow, (1.0/9)) + 1; i >= 0; i--) {
            long num = 1;
            for (int j = 0; j < 9; j++) {
                num = num * i;
            }

            if (meow % num == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
