package presentacio.controladorsVistes;

public class ControladorPopUpAdv {
    /**
     * Controlador especialitzat en comunicar si una funció ha de continuar o no la seva excecució després que el
     * pop up d'advertencia sigui activat pel fet de realitzar un gran canvi en el programa.
     */
    private ControladorVistaPrincipal vp;
    private vistaAdvertencia vista;

    public ControladorPopUpAdv(ControladorVistaPrincipal inp){
        vp = inp;
        vista = new VistaAdvertencia();
    }

    /**
     * Funció encarregada de dir-li al pop up quin missatge d'error ha de posar.
     * @pre hi ha un error
     * @post El missatge del pop up es el missatge passat.
     */
    public void setText(String errorMsg){
        vistaError.canviaText();
    }

    /**
     * Funció encarregada de dir-li al programa si ha de continuar o no la seva execució.
     * @pre -
     * @post en funció del botó clicat per l'usuari el programa abortara la funció que esta realitzant.
     */
    public void realitzarFuncio(){
    }

}
