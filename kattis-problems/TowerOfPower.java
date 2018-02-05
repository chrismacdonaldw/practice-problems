import java.util.*;

public class TowerOfPower {
    private static Map<String,Double> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        // Get amount of values from user
        System.out.println("Enter the amount of values: ");
        int n = stdin.nextInt();

        // Calculate the numerical values of input
        System.out.println("Enter values: ");
        for(int i = 0; i < n; i++) power(stdin.next());

        // Sorts the map using the key's numerical counterparts
        Set<Map.Entry<String,Double>> set = map.entrySet();
        List<Map.Entry<String,Double>> list = new ArrayList<>(set);
        list.sort(Comparator.comparing(o -> (o.getValue())));

        // Print out the keys (originally entered values)
        System.out.println("Sorted input");
        for(Map.Entry<String,Double> entry:list) System.out.println(entry.getKey());
    }

    /**
     * Converts an input from form (x^x^x) to a numerical value
     * It will count the amount of powers and calculate the number.
     * @param value - input from user
     */
    private static void power(String value) {
        Scanner stdin = new Scanner(value).useDelimiter("\\^");
        int powCount = 0;
        double num = 1;

        for(char c : value.toCharArray()) if(c == '^') powCount++;

        if(powCount == 0) {
            map.put(value, Double.parseDouble(value));
            return;
        }

        for(int i = 0; i < powCount; i++) {
            if(i == 0) num = stdin.nextInt();
            num = Math.pow(num, stdin.nextInt());
        }
        map.put(value,num);
    }
}
