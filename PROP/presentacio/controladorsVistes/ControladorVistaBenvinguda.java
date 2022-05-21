package presentacio.controladorsVistes;



public class ControladorVistaBenvinguda {
    /**
     * Classe que la seva funció principal es connectar la vista de benvinguda amb la app i fer d'intermediari entre la
     * classe App i la classe VistaBenvinguda.
     */
    public ControladorVistaBenvinguda(){}

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
}
