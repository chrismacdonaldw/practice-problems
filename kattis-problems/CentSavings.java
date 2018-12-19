
import java.util.*;

// one class needs to have a main() method
public class CentSavings
{
    static final int MAXN = 20000000;
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner(System.in);
        int price[] = new int[2001];
        int sum[] = new int[2001];
        int arr[][] = new int[2001][22];

        int n = stdin.nextInt();
        int d = stdin.nextInt();

        d++;

        sum[0] = 0;

        for (int i = 1; i <= n; i++) {
            price[i] = stdin.nextInt();
            sum[i] = sum[i-1] + price[i];
            System.out.println("sum[" + i + "] = sum[" + (i - 1) + "] + price[" +i+ "]");
            for (int j = 1; j <= d; j++) {
                arr[i][j] =  round(sum[i]);
            }
            arr[i][0] = MAXN;
        }

        for (int i = 1; i <= n; i++) {
            for (int k = 2; k <= d; k++) {
                for (int j = 0; j < i; j++) {
                    System.out.println("arr[" + i + "][" + k + "] = min of " + arr[i][k] + " and " + round(sum[i] - sum[j]));
                    arr[i][k] = (Math.min(arr[i][k], arr[j][k-1] + round(sum[i] - sum[j])));
                }
            }
        }
        System.out.println(arr[n][d]);
    }

    public static int round(int cents) {
        int tail = cents % 10;
        if(tail >= 5) return cents + (10-tail);
        return cents - tail;
    }
}
