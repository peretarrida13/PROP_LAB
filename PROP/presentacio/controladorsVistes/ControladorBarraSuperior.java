package presentacio.controladorsVistes;

import presentacio.vistes.VistaMenuBar;

public class ControladorBarraSuperior {
    /**
     * Classe encarregada de comunicar la barra superior amb el controlador de domini i amb la part de la graella de la
     * part principal
     */
    private VistaMenuBar menu;
    private ControladorVistaPrincipal cntlVp;

    public ControladorBarraSuperior(ControladorVistaPrincipal inp){
        menu = new VistaMenuBar();
        cntlVp = inp;

    }

    /**
     * Obté el valor de la cel·la que l'usuari ha clicat.
     */
    public void obtenirValorCella(){}

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
     */
    public void canviarValorCella(){}
}
