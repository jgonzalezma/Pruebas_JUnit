package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import metodos.MyAssertArrayEquals;

public class MyAssertArrayEqualsTest {

	@Test
    public void myTestMethod(){
       MyAssertArrayEquals pruebaEquals = new MyAssertArrayEquals();
        assertArrayEquals(MyAssertArrayEquals.PrimerArray(), MyAssertArrayEquals.SegundoArray());
    }

}
