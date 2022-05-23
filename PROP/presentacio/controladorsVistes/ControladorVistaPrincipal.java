package presentacio.controladorsVistes;

import presentacio.vistes.VistaPrincipal;

import javax.naming.ldap.Control;

public class ControladorVistaPrincipal {
    /**
     * Controlador de la vista principal i encarregat de comunicar les altres vistes entre si, es per aixó que aquesta
     * classe es l'encarregada de obtenir tots els controladors de les vistes principals
     */

    /**
     * Controlador de la graella que la inicialitzara.
     */
    public ControladorGraella taula;

    /**
     * Controlador de la Barra superior i que la inicialitzara.
     */
    public ControladorBarraSuperior topBar;

    /**
     * Controlador del menu del les fulles, que serà inicialitzara.
     */
    public ControladorMenuFulles fullesBar;

    /**
     * Controlador de la vista advertencia que la inicialitzara.
     */
    public ControladorVistaAdv cntrl_adv;

    /**
     * Controlador de la vista d'error que la inicialitzara.
     */
    public ControladorVistaError cntrl_error;
    /**
     * Variable que tindrà totes les funcionalitats i components de la vista principal
     */
    public VistaPrincipal vp;

    /**
     * Funcio constructora. que inicialitza tots els controladors i la vista principal.
     */
    public ControladorVistaPrincipal(){
        taula = new ControladorGraella(this);
        topBar = new ControladorBarraSuperior(this);
        fullesBar = new ControladorMenuFulles(this);
        cntrl_adv = new ControladorVistaAdv(this);
        cntrl_error = new ControladorVistaError(this);

        vp = new VistaPrincipal();
    }

    /**
     * Funció encarregada d'afegir en la vista principal totes les components que la conformen.
     */
    public void inicialitzarVistaPrincipal(){
    }

    /**
     * Funcio que retorna l'amplada assignada al frame.
     * @return retorna l'amplada que té aquest frame.
     */
    public int getAmplada(){
        return vp.getAmplada();
    }

}
