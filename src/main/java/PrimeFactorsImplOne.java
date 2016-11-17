import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsImplOne implements PrimeFactors {

    public List<Integer> generate(Integer number) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                list.add(i);
                number = number / i;
            }
        }
        return list;
    }
}
