package JUnitTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import metodos.Persona;

public class Objetos {
	
	Persona[] personas = new Persona[3];
	@Before
    public void initInputs(){
        personas[0] = new Persona("Robert", "Baluta", 23);
        personas[1] = new Persona("Mauricio", "Diaz", 23);
        personas[2] = new Persona("Josu", "Gonzalez", 23);
    }
	
	@Test
    public void compararPersonas(){
        /**
         * conveierte la lista de objetos en un array de objetos
         */
        Object[] testeo = Persona.getEmpList().toArray();
        Assert.assertArrayEquals(personas, testeo);
    }
}
