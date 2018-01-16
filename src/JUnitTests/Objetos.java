package JUnitTests;

import org.junit.Before;

import metodos.Persona;

public class Objetos {
	
	Persona[] personas = new Persona[3];
	@Before
    public void initInputs(){
        personas[0] = new Persona("dgdf", "Nats", 15000);
        personas[1] = new Persona(2, "Kalid", 25000);
        personas[2] = new Persona(3, "Krish", 5000);
    }
}
