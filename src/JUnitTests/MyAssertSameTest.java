package JUnitTests;

import org.junit.Assert;
import org.junit.Test;

public class MyAssertSameTest {
	//Este metodo comprueba si los 2 Strings son iguales, si no lo son
	//saltará un error
	@Test
    public void testComprarIgualPorReferencia() {
        Assert.assertSame("abcde", "abcde");
    }

}
