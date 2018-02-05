import java.util.Scanner;

public class A1Paper {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int req = 1;
        double perim = 0.0;
        double p2 = 2.0 * (Math.pow(2.0,-5.0 / 4) + Math.pow(2.0, -3.0 / 4));
        double p1 = Math.sqrt(2) * p2;

        int n = stdin.nextInt();
        int x;
        for(int i = 2; i <= n && req > 0; i++) {
            req *= 2;
            x = stdin.nextInt();
            if(x >= req) {
                perim += req * p2;
                req = 0;
            } else {
                req -= x;
                perim += x * p2;
            }
            p2 /= Math.sqrt(2);
        }

        double answer = (perim - p1) / 2.0;
        if(req == 0.0)
            System.out.println(answer);
        else
            System.out.println("impossible");
    }
}
