package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class MyAssertNotSameTest {

	
	
	@Test
    public void testComprarIgualPorReferencia() {
        Assert.assertNotSame("abcde", "fghij");
    }

}
