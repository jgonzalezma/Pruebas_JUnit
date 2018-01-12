package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyAssertArrayEqualsTest {

	@Test
    public void myTestMethod(){
        
        //assume that the below array represents expected result
        String[] expectedOutput = {"apple", "mango", "grape"};
        //assume that the below array is returned from the method 
        //to be tested.
        String[] methodOutput = {"apple", "mango", "grape"};
        assertArrayEquals(expectedOutput, methodOutput);
    }

}
