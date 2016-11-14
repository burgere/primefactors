import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {

    }

    public static List<Integer> generate(int number) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                list.add(i);
                number = number / i;
            }
        }
        return list;
    }
}
