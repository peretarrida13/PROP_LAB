package presentacio.controladorsVistes;


import presentacio.vistes.VistaBenvinguda;

public class ControladorVistaBenvinguda {
    /**
     * Classe que la seva funció principal es connectar la vista de benvinguda amb la app i fer d'intermediari entre la
     * classe App i la classe VistaBenvinguda.
     */

    /**
     * Variable que conté la vista de benvinguda i tots els seus components.
     */
    private VistaBenvinguda vistaBenvinguda;

    /**
     * Funció creadora que crea una nova vista principal.
     */
    public ControladorVistaBenvinguda(){
            vistaBenvinguda = new VistaBenvinguda();
    }

    /**
     * Funció encarregada de avisar al controlador de domini perque aquest crei el nou documnet.
     * @pre no tenim cap document obert.
     * @post hi ha un document obert.
     */
    public void crearDocument(){}

    /**
     * Funcio encarregada de carregar el document escollit per l'usuari. Aquesta avisara al controlador de domini que
     * l'usuari vol exportar un document.
     * @pre no tenim cap document obert.
     * @post hi ha un document obert.
     */
    public void carregarDocument(){}

    /**
     * Funció encarregada de llegir un CSV i extreure les dades d'aquest i crear un document.
     * @param path path on està guardat el csv.
     */
    public void llegirCSV(String path){}

    /**
     * Funcio encarregada de llegir un arxiu de format JSON i extreure les dades necessaries d'aquest per crear un document.
     * @param path path on està guardat el json.
     */
    public void llegirJSON(String path){}

    /**
     * Funció que posa visible o no el frame en funció del valor de visible;
     * @param visible booleà que ens indica de si ha de posar en visible o no el frame.
     */
    public void setMainVisible(Boolean visible){
        vistaBenvinguda.setMainWSVisible(visible);
    }
}
