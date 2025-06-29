import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }

    // Main method to run the test
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AssertionsTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println("Test failed: " + failure.toString());
        }

        if (result.wasSuccessful()) {
            System.out.println("✔ All tests passed.");
        }
    }
}