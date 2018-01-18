package metodos;

public class MyAssertFalse {
	public boolean isEvenNumberF(int number){
        //Este metodo comprueba que el numero es impar, si no lo es, devuelve un error
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}
