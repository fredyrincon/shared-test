package testdirectory;

import android.test.InstrumentationTestCase;

/**
 * Created by SafeCode on 3/10/2014.
 */
public class ExampleTest extends  InstrumentationTestCase{
    public void test() throws Exception {
        final int expected = 1;
        final int reality = 5;
        assertEquals(expected, reality);
    }
}
