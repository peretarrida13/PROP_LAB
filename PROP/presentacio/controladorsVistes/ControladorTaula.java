package presentacio.controladorsVistes;

public class ControladorTaula {

    /**
     * Controlador el qual la seva funcio principal és controlar tot el que passa a la taula principal i que ens ajuda
     * a comunicar-nos amb la resta de controladors.
     */
    public ControladorTaula(){}

    /**
     * Funció que es crida quan el usuari vol copiar el valor de una cel·la
     * @pre: Ha d'haver-hi una cel·la seleccionada.
     * @post: El valor de la cel·la s'haurà copiat.
     */
    public void copiar(){}

    /**
     * Funcio que es crida quan el usuari vol enganxar el valor en una cel·la
     * @pre: Ha d'haver-hi una cel·la seleccionada.
     * @post: El nou valor de la cel·la s'haurà enganxat i la cel·la serà actualitzada.
     */
    public void enganxar(){}

    /**
     * Funcio que es crida quan el usuari vol retallar el valor en una cel·la
     * @pre: Ha d'haver-hi una cel·la seleccionada.
     * @post: El valor de la cel·la s'haurà copiat i la cel·la no contindrà cap valor.
     */
    public void retallar(){}

    /**
     * Funcio que es crida quan el usuari vol eliminar el valor de una cel·la
     * @pre: Ha d'haver-hi una cel·la seleccionada.
     * @post: La cel·la passa a estar buida.
     */
    public void eliminar(){}

    /**
     * Funcio que es crida quan la cel·la passa a ser unfocus, actualitzant el valor d'aquesta.
     * @pre: Ha d'haver-hi una cel·la seleccionada.
     * @post: El nou valor de la cel·la s'haurà guardat.
     */
    public void actualitzarValorCella(){}

    /**
     * Funcio encarregada de ordenar un bloc seleccionat
     * @pre: Ha d'haver-hi un bloc seleccionat.
     * @post: El bloc seleccionat s'ha ordenat.
     */
    public void ordenarBloc(){}

    /**
     * Funcio encarregada de copiar un bloc seleccionat
     * @pre: Ha d'haver-hi un bloc seleccionat.
     * @post: El bloc seleccionat s'ha copiat.
     */
    public void copiarBloc(){}

    /**
     * Funcio encarregada de enganxar un bloc seleccionat
     * @pre: Ha d'haver-hi una cel·la seleccionada.
     * @post: El bloc seleccionat s'ha enganxat.
     */
    public void enganxarBloc(){}

    /**
     * Funcio encarregada de retallar un bloc seleccionat
     * @pre: Ha d'haver-hi un bloc seleccionat.
     * @post: El bloc seleccionat s'ha copiat i eliminat els valors.
     */
    public void retallarBloc(){}

    /**
     * Funcio encarregada de eliminar un bloc seleccionat
     * @pre: Ha d'haver-hi un bloc seleccionat.
     * @post: El bloc seleccionat s'ha eliminat.
     */
    public void eliminarBloc(){}

    /**
     * Funcio encarregada de buscar un valor dins de la fulla.
     * @pre: -
     * @post: Es retorna una llista amb les cel·les que contenen aquest valor.
     */
    public void buscarValor(){}

    /**
     * Funcio encarregada d'actualitzar el valor tant del input en cas que es modifiqui com de actualitzar el valor que
     * indica quina cel·la tenim seleccionada.
     * @pre: Ha d'haver-hi una cel·la seleccionada.
     * @post: El bloc seleccionat s'ha ordenat.
     */
    public void actualitzarBarraSuperior(){}

    /**
     * Funció encarregada d'actualitzar els valors de les cel·les en el cas que s'activi una nova fulla.
     * @pre: -
     * @post: La taula ha estat actualitzada.
     */
    public void actualitzarTaula(){}

    /**
     * Funcio encarregada d'obtenir el valor de la cel·la seleccionada.
     * @pre: Ha d'haver-hi una cel·la seleccionada.
     * @post: tenim el valor de la cel·la que volem.
     */
    public void obtenirValorCella(){}

}
