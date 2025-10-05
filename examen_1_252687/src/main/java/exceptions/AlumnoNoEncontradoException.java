package exceptions;

/**
 * AlumnoNoEncontradoException.java
 * 
 * Excepción en caso de que no se encuentre a un alumno buscado en la base de datos
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class AlumnoNoEncontradoException extends Exception{
    
    /**
     * Constructor vacío que llama al constructor de Exception
     */
    public AlumnoNoEncontradoException(){
        super();
    }

    /**
     * Constructor con mensaje de error
     * @param message mensaje de error
     */
    public AlumnoNoEncontradoException(String message){
        super(message);
    }
}
