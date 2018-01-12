package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class MyAssertNotNullTest {

	@Test
    public void testComprarNull() {
        Assert.assertNotNull(6);
    }

}
