package metodos;

public class MyAssertTrue {
    public boolean isEvenNumberT(int number){
        //Este metodo comprueba si el numero es par, si no lo es saltará un error
       boolean result = false;
       if(number%2 == 0){
           result = true;
       }
       return result;
   }
}
