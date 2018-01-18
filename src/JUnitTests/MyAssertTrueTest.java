package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;
import metodos.MyAssertTrue;

public class MyAssertTrueTest {
    
    @Test
    public void evenNumberTest(){
        MyAssertTrue num = new MyAssertTrue();
        assertTrue(num.isEvenNumberT(4));
    }
}