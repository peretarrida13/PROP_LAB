package presentacio.controladorsVistes;

public class ControladorApp {
    /**
     * Classe encarregada de controlar la app i inicialitzar-la i posar tot en funcionament.
     */

    /**
     * Controlador de la vista principal que conté totes les funcions i els components.
     */
    public ControladorVistaPrincipal vp;

    /**
     * Controlador de la vista de benvinguda que conté totes les funcions i els components de la pagina principal.
     */
    public ControladorVistaBenvinguda vB;

    /**
     * Funció creadora que incialitza els controladors.
     */
    public ControladorApp(){
        vp = new ControladorVistaPrincipal();
        vB = new ControladorVistaBenvinguda();
    }

    /**
     * funció que tanca el frame de benvinguda
     */
    public void tancarBenvinguda(){}

    /**
     * funció que obre el frame de benvinguda
     */
    public void oberirBenvinguda(){}

    /**
     * funció que tanca el frame principal
     */
    public void tancarPrincipal(){}

    /**
     * funció que obre el frame principal
     */
    public void obrirPrincipal(){}
}
