import java.util.Scanner;

public class Batter {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        double last = 0;
        int m = n;
        for (int i = 0; i < n; i++) {
            int num = stdin.nextInt();
            if (num  >= 0)
                last += num;
            else
                m--;
        }
        System.out.println(last / m);
    }
}
