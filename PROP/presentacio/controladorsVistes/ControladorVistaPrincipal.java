package presentacio.controladorsVistes;

import presentacio.vistes.VistaPrincipal;

public class ControladorVistaPrincipal {

    public ControladorTaula taula;
    public ControladorBarraSuperior topBar;
    public VistaPrincipal vp;


    public ControladorVistaPrincipal(){
        taula = new ControladorTaula(this);
        topBar = new ControladorBarraSuperior(this);
        vp = new VistaPrincipal();
    }

}
