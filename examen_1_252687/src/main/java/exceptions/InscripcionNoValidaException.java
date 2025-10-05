package exceptions;

public class InscripcionNoValidaException extends Exception{
    
    public InscripcionNoValidaException(){
        super();
    }

    public InscripcionNoValidaException(String message){
        super(message);
    }

}
