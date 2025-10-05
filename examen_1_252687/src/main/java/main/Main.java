package main;

import modelo.ListaTalleresSubject;
import modelo_negocio.IModeloNegocio;
import modelo_negocio.ModeloNegocioImp;
import vista.IObserver;
import vista.ModelObserver;

/**
 * Main.java
 * 
 * Clase principal para ejecutar el programa.
 * 
 * @author Pedro Luna Esquer
 */
public class Main {

    /**
     * Metodo Main que se encarga de hacer el setup de la aplicación y del caso de uso
     */
    public static void main(String[] args) {

        //Crea la lista de talleres para tener los datos mockeados y cargarlos
        ListaTalleresSubject listaTalleres = ListaTalleresSubject.getInstance();

        //Agrega un observer a la lista de talleres para que cuando se generen aparezcan en la pantalla
        IObserver observer = new ModelObserver();
        listaTalleres.addObserver(observer);

        //Empieza el caso de uso desde el modeloNegocio.
        IModeloNegocio modeloNegocio = ModeloNegocioImp.getInstance();
        modeloNegocio.empezarCasoUso();
    }
    
}
