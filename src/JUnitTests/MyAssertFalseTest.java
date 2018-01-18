package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;
import metodos.MyAssertFalse;

public class MyAssertFalseTest {
     
    @Test
    public void evenNumberTest(){
        MyAssertFalse asft = new MyAssertFalse();
        assertFalse(asft.isEvenNumberF(7));
    }
}