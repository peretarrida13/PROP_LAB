package presentacio.controladorsVistes;

import presentacio.vistes.VistaBarraSuperior;
import presentacio.vistes.VistaMenuBar;

public class ControladorBarraSuperior {
    /**
     * Classe encarregada de comunicar la barra superior amb el controlador de domini i amb la part de la graella de la
     * part principal
     */

    /**
     * Variable que conté el component o vista a afegir a la VistaPrincipal.
     */
    private VistaBarraSuperior menu;

    /**
     * Controlador de la vista principal, aixo ens permet communicar-nos amb la resta dels components que conformen la
     * app
     */
    private ControladorVistaPrincipal cntlVp;

    /**
     * Funció constructora que li passem el controlador de la vista principal ja que d'aquesta manera ens podem comunicar
     * amb tots els components de la part principal del programa
     * @param inp Controlador de la vista principal que conté la resta de controladors i la resta de vistes que conformen
     *             la vista principal.
     */
    public ControladorBarraSuperior(ControladorVistaPrincipal inp){
        cntlVp = inp;
        menu = new VistaBarraSuperior(cntlVp.getAmplada());
    }

    /**
     * Obté el valor de la cel·la que l'usuari ha clicat. Aquesta funció ens serà util a l'hora d'actrualitzar valors.
     * @return Retorna el valor de la cel·la que l'usuari ha clicat.
     */
    public String obtenirValorCella(){
        return "";
    }

    /**
     * Funció que es crida cada cop que es canvia el valor del input de la barra de dalt. Aquest ens ajuda a actualitzar
     * el valor de la cel·la i que es vegi reflectit per pantalla.
     */
    public void actualitzarValorCella(){}

    /**
     * Funcio que ens dona les coordenades de la cel·la que l'usuari a clicat.
     */
    public void obtenirCoordenadesCella(){

    }

    /**
     * Funció encarregada de guardar el nou valor de la cel·la un cop hi hagi un unfocus d'aquesta.
     * @return valor que tindrà el nou valor de la cel·la.
     */
    public void canviarValorCella(String valor){}
}
