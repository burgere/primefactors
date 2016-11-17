import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsImplTwo implements PrimeFactors {

    public List<Integer> generate (Integer number) {
        List<Integer> factorList = new ArrayList<Integer>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factorList.add(i);
                number /= i;
            }
        }
        return factorList;
    }
}
