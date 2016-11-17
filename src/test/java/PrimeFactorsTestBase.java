import org.junit.Before;
import org.junit.Test;

public abstract class PrimeFactorsTestBase<T extends PrimeFactors> {
    private T instance;

    protected abstract T createInstance();

    @Before
    public void setUp() {
        instance = createInstance();
    }

    @Test
    public void testFive() throws Exception{};

    @Test
    public void testFifty() throws Exception{};

    @Test
    public void testSixty() throws Exception{};

    @Test
    public void testOneHundred() throws Exception{};
}
