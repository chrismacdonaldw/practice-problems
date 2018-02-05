import java.util.Scanner;

public class BinaryReverse {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        String binary = Integer.toBinaryString(n);
        binary = new StringBuilder(binary).reverse().toString();
        System.out.println(Integer.parseInt(binary, 2));
    }
}
