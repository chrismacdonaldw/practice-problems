import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[] arr = new int[10];
        int n = 0;
        int count = 0;
        while (n != -1) {
            int prev = 0;
            n = stdin.nextInt();
            for (int i = 0; i < n; i++) {
                int speed = stdin.nextInt();
                int time = stdin.nextInt();
                arr[count] += speed * (time - prev);
                prev = time;
            }
            count++;
        }
        for (int anArr : arr) {
            if (anArr != 0)
                System.out.println(anArr + " miles");
        }
    }
}
