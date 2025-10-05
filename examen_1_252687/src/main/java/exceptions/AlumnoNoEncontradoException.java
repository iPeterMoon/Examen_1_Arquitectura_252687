package exceptions;

public class AlumnoNoEncontradoException extends Exception{
    
    public AlumnoNoEncontradoException(){
        super();
    }

    public AlumnoNoEncontradoException(String message){
        super(message);
    }
}
