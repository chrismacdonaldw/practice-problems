import java.util.Scanner;

public class DifferentProblem {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        while (stdin.hasNextLong()) {
            long a = stdin.nextLong(),
                    b = stdin.nextLong();
            System.out.println(b < a ? a - b : b - a);
        }
    }
}
