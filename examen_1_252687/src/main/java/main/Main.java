package main;

import vista.PantallaInscripcion;

/**
 * Main.java
 * 
 * Clase principal para ejecutar el programa.
 * 
 * @author Pedro Luna Esquer
 */
public class Main {

    public static void main(String[] args) {
        PantallaInscripcion pantalla = PantallaInscripcion.getInstance();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
    
}
