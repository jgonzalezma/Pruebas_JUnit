package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class MyAssertNullTest {

	@Test
    public void testComprarNull() {
        Assert.assertNull(null);
    }

}
