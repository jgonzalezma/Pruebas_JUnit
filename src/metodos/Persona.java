package metodos;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Persona (String nombre, String apellido, int edad){
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}
	
	public static List getEmpList(){
        List<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(new Persona("Robert", "Baluta", 23));
        listaPersonas.add(new Persona("Mauricio", "Diaz", 23));
        listaPersonas.add(new Persona("Josu", "Gonzalez", 23));
        return listaPersonas;
    }
}