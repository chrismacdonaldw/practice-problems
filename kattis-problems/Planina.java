import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        n = (int) Math.pow((Math.pow(2, n) + 1), 2);
        System.out.println(n);
    }
}
