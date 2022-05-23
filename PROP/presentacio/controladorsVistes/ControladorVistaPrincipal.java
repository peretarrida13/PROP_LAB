package presentacio.controladorsVistes;

import presentacio.vistes.VistaPrincipal;

public class ControladorVistaPrincipal {
    /**
     * Controlador de la vista principal i encarregat de comunicar les altres vistes entre si.
     */

    public ControladorTaula taula;
    public ControladorBarraSuperior topBar;
    public ControladorBarraFulles fullesBar;
    public ControladorPopUpAdv cntrl_adv;
    public ControladorVistaError cntrl_error;

    public VistaPrincipal vp;

    /**
     * Funcio constructora.
     */
    public ControladorVistaPrincipal(){
        taula = new ControladorTaula(this);
        topBar = new ControladorBarraSuperior(this);
        fullesBar = new ControladorBarraFulles(this);
        cntrl_adv = new ControladorPopUpAdv(this);
        cntrl_error = new ControladorVistaError(this);

        vp = new VistaPrincipal();
    }

}
