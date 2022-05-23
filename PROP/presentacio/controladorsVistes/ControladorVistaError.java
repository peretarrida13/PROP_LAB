package presentacio.controladorsVistes;

import presentacio.vistes.VistaError;

public class ControladorVistaError {

    /**
     * Classe encarregada de contenir el component i les funcionalitats del pop Up que surt per pantalla en cas que el
     * usuari intenti realitzar una operació o funcionalitat i hi hagi un error.
     */

    private ControladorVistaPrincipal vp;

    /**
     * Frame que conté la el missatge i els botons del pop Up d'advertencia.
     */
    private VistaError vista;

    /**
     * Funció creadora que inicialitza el frame pero no posa cap dels components que conté aquests.
     */
    public ControladorVistaError(ControladorVistaPrincipal inp){
        vp = inp;
        vista = new VistaError();
    }

    /**
     * Funció encarregada de dir-li al pop up quin missatge d'error ha de posar.
     * @pre hi ha un error
     * @post El missatge del pop up es el missatge passat.
     *
     * @param errorMsg missatge d'error que tindrà el frame.
     */
    public void setText(String errorMsg){
        vista.inicialitzar(errorMsg);
    }
}
