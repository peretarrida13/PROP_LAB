package presentacio.controladorsVistes;

import presentacio.vistes.VistaAdvertencia;

import javax.swing.*;

public class ControladorVistaAdv {
    /**
     * Controlador especialitzat en comunicar si una funció ha de continuar o no la seva excecució després que el
     * pop up d'advertencia sigui activat pel fet de realitzar un gran canvi en el programa.
     */

    /**
     * Controlador de la vista principal, aixo ens permet communicar-nos amb la resta dels components que conformen la
     * app
     */
    private ControladorVistaPrincipal vp;

    /**
     * Variable que conté el component o vista a afegir a la VistaPrincipal.
     */
    private VistaAdvertencia vista;

    /**
     * Funció constructora que li passem el controlador de la vista principal ja que d'aquesta manera ens podem comunicar
     * amb tots els components de la part principal del programa
     * @param inp Controlador de la vista principal que conté la resta de controladors i la resta de vistes que conformen
     *             la vista principal.
     */
    public ControladorVistaAdv(ControladorVistaPrincipal inp){
        vp = inp;
        vista = new VistaAdvertencia();
    }

    /**
     * Funció encarregada de dir-li al pop up quin missatge d'error ha de posar i els botons amb les funcions que conté
     * cada un en cas de ser clicats
     * @pre hi ha un error
     * @post El missatge del pop up es el missatge passat.
     *
     * @param errorMsg Missatge que ha de fer display en el frame.
     * @param btn1 Botó que dona el usuari escollir una opció
     * @param btn2 Botó que dona el usuari escollir una altre opció.
     */
    public void inicialitzar(String errorMsg, JButton btn1, JButton btn2){
        vista.inicialitzar(errorMsg, btn1, btn2);
    }

    /**
     * Funció encarrega de tancar el pop up d'advertencia. sera activada quan el usuari esculli una de les dos opcions o
     * en cas que es cliqui el botó de tancar.
     */
    public void close(){
        vista.closeAdvertencia();
    }
}
