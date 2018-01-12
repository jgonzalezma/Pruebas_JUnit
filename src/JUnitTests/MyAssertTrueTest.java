package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyAssertTrueTest {
	 
    public boolean isEvenNumber(int number){
         //Este metodo comprueba si el numero es par, si no lo es saltará un error
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
     
    @Test
    public void evenNumberTest(){
        MyAssertTrueTest asft = new MyAssertTrueTest();
        assertTrue(asft.isEvenNumber(4));
    }
}