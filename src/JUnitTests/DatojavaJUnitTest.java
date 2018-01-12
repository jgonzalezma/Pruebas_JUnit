package JUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import metodos.DatojavaJUnit;

public class DatojavaJUnitTest {
	DatojavaJUnit datojavaJUnit = new DatojavaJUnit();
	@Test
	public void testSumar() {
		assertEquals(datojavaJUnit.sumar(3, 8), 11);
	}

	@Test
	public void testRestar() {
		assertEquals(datojavaJUnit.restar(5, 4), 2);
		 // 5 - 4 = 1, eso quiere decir que la prueba debería fallar porque 
		//estamos poniendo de resultado esperado 2 cuando no es correcto
		
	}

}
