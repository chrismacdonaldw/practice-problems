import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int[][] arr = new int[5][4];
        int[] points = new int[5];

        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 4; j++) {
                arr[i][j] = stdin.nextInt();
                points[i] += arr[i][j];
            }

        String winner = "";
        int win = 0;
        for (int i = 0; i < 5; i++)
            if (points[i] > win) {
                win = points[i];
                winner = (i + 1) + " " + points[i];
            }

        System.out.println(winner);
    }
}
