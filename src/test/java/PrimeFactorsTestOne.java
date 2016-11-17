import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTestOne extends PrimeFactorsTestBase<PrimeFactorsImplOne>{
    PrimeFactors primeFactors;

    @Override
    protected PrimeFactorsImplOne createInstance() {
        return new PrimeFactorsImplOne();
    }

    @Before
    public void setUp() {
        primeFactors = createInstance();
    }

    public void testFive() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        assertEquals(list, primeFactors.generate(5));
    }

    public void testFifty() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(5);
        assertEquals(list, primeFactors.generate(50));
    }

    public void testSixty() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(list, primeFactors.generate(60));
    }

    public void testOneHundred() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(5);
        assertEquals(list, primeFactors.generate(100));
    }
}
