import java.util.Scanner;

public class OwlAndFox {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();
        stdin.nextLine();

        for (int i = 0; i < n; i++) {
            int num = stdin.nextInt();
            int count = 0;
            while (num % 10 == 0) {
                if (num % 10 == 0) {
                    num /= 10;
                    count++;
                }
            }
            num--;
            for (int j = 0; j < count; j++) {
                num *= 10;
            }
            System.out.println(num);
        }
    }
}
