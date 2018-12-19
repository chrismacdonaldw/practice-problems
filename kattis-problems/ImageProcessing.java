import java.util.Scanner;

public class ImageProcessing {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int h = stdin.nextInt();
        int w = stdin.nextInt();
        int n = stdin.nextInt();
        int m = stdin.nextInt();

        int image[][] = new int[h][w];
        int kernel[][] = new int[n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                image[i][j] = stdin.nextInt();
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                kernel[i][j] = stdin.nextInt();
            }
        }

        for (int i = 0; i + n <= h; i++) {
            for (int j = 0; j + m <= w; j++) {
                long num = 0;
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++) {
                        num += image[i + k][j + l] * kernel[k][l];
                    }
                }
                System.out.print(num + " ");
            }
            System.out.print("\n");
        }
    }
}
