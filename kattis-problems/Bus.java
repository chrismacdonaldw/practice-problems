import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();

        for(int i = 0; i < n; i++) {
            int x = stdin.nextInt();
            System.out.println((int)Math.pow(2,x) - 1);
        }
    }
}
