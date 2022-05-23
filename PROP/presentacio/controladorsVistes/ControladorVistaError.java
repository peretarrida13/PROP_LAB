package presentacio.controladorsVistes;

public class ControladorVistaError {

    /**
     * Controlador especialitzat en comunicar si una funció ha de continuar o no la seva excecució després que el
     * pop up d'advertencia sigui activat pel fet de realitzar un gran canvi en el programa.
     */
    private ControladorVistaPrincipal vp;
    private vistaError vista;

    public ControladorVistaError(ControladorVistaPrincipal inp){
        vp = inp;
        vista = new vistaError();
    }

    /**
     * Funció encarregada de dir-li al pop up quin missatge d'error ha de posar.
     * @pre hi ha un error
     * @post El missatge del pop up es el missatge passat.
     */
    public void setText(String errorMsg){
        vistaError.canviaText();
    }
}
