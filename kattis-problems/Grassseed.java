import java.text.DecimalFormat;
import java.util.Scanner;

public class Grassseed {
    public static void  main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00000000");
        Scanner stdin = new Scanner(System.in);
        double cost = stdin.nextDouble();
        int lawns = stdin.nextInt();
        double area = 0;
        for(int i = 0; i < lawns; i++) {
            double w = stdin.nextDouble();
            double h = stdin.nextDouble();
            area += w * h;
        }
        System.out.println(df.format(area * cost));
    }
}
