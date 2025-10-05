package main;

import modelo.ListaTalleresSubject;
import modelo_negocio.IModeloNegocio;
import modelo_negocio.ModeloNegocioImp;
import vista.IObserver;
import vista.ModelObserver;
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

        ListaTalleresSubject listaTalleres = ListaTalleresSubject.getInstance();
        
        IObserver observer = new ModelObserver();
        
        listaTalleres.addObserver(observer);

        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.empezarCasoUso();
    }
    
}
