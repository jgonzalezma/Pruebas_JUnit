package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class MyAssertSameTest {

	@Test
    public void testComprarIgualPorReferencia() {
        Assert.assertSame("abcde", "abcde");
    }

}
