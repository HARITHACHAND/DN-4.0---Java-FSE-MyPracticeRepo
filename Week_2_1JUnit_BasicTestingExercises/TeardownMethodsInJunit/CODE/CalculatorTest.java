import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculatorTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("Test failed: " + failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
