import junit.framework.Test;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsTest extends TestCase {
    public void testOne() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        assertEquals(list, PrimeFactors.generate(1));
    }

    public void testFive() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        assertEquals(list, PrimeFactors.generate(5));
    }

    public void testFifty() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(5);
        assertEquals(list, PrimeFactors.generate(50));
    }

    public void testSixty() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(5);
        assertEquals(list, PrimeFactors.generate(60));
    }

    public void testOneHundred() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(5);
        assertEquals(list, PrimeFactors.generate(100));
    }
}
