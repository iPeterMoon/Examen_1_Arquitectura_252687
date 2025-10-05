package exceptions;

/**
 * InscripcionNoValidaException.java
 * 
 * Excepción que ocurre si una inscripción a taller no se puede realizar por
 * alguna razón
 * 
 * @author Pedro Luna Esquer - 252687
 */
public class InscripcionNoValidaException extends Exception {

    /**
     * Constructor vacío que llama al constructor de Exception
     */
    public InscripcionNoValidaException() {
        super();
    }

    /**
     * Constructor con mensaje de error
     * 
     * @param message mensaje de error
     */
    public InscripcionNoValidaException(String message) {
        super(message);
    }

}
