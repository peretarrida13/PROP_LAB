package presentacio.controladorsVistes;

import presentacio.vistes.VistaBarraFulles;

public class ControladorMenuFulles {
    /**
     * Classe encarregada de la comunicació de la barra inferior i de les operacions amb fulles amb la resta de la app.
     * Aquesta classe avisarà en el cas de que es crei una fulla o es modifiqui alguna cosa d'aquesta.
     */

    /**
     * Controlador de la vista principal, aixo ens permet communicar-nos amb la resta dels components que conformen la
     * app
     */
    private ControladorVistaPrincipal vp;

    /**
     * Variable que conté el component o vista a afegir a la VistaPrincipal.
     */
    private VistaBarraFulles menu;

    /**
     * Funció constructora que li passem el controlador de la vista principal ja que d'aquesta manera ens podem comunicar
     * amb tots els components de la part principal del programa
     * @param inp Controlador de la vista principal que conté la resta de controladors i la resta de vistes que conformen
     *             la vista principal.
     */
    public ControladorMenuFulles(ControladorVistaPrincipal inp){
        vp = inp;
        menu = new VistaBarraFulles(vp.vp.mainFrame);
    }

    /**
     * Funció qeu cridem quan afegir una fulla en el document actual.
     */
    public void afegirFulla(){}

    /**
     * Funció que cridem quan volem eliminar la fulla actual.
     */
    public void eliminarFulla(){}

    /**
     * Funció que ens indica quina es la fulla actual i a partir d'aqui fem el display d'aquesta.
     */
    public void obtenirFullaActual(){}

    /**
     * Funció encarregada de actualitzar el valor de fullaActual del controlador de domini un cop s'acciona un dels botons
     * per canviar de fulla a la part inferior de UI.
     */
    public void canviFullaActual(){}

    /**
     * Funció encarregada de cridar la funcio de canviar nom del controlador de domini. I actualitzar la barra inferior
     * de la UI
     */
    public void canviarNomFulla(){}

    /**
     * Funció encarregada de cridar la funcio d'afegir fila controlador de domini.
     */
    public void afegirFila(){}

    /**
     * Funció encarregada de cridar la funcio de eliminar de fila del controlador de domini.
     */
    public void eliminarFila(){}

    /**
     * Funció encarregada de cridar la funcio d'afegir columna controlador de domini.
     */
    public void afegirColumna(){}

    /**
     * Funció encarregada de cridar la funcio de eliminar de columna del controlador de domini.
     */
    public void eliminarColumna(){}

    /**
     * Funció encarregada de cridar la funcio de buscar valor del controlador de domini.
     */
    public void buscarValor(){}

    /**
     * Funció encarregada de cridar la funcio de remplasar valor del controlador de domini.
     */
    public void remplasarValor(){}

}
