package presentacio.controladorsVistes;

import presentacio.vistes.VistaMenuBar;

public class ControladorMenu {
    /**
     * Controlador del menu de la part superior que conté totes les funcionalitats del programa, serà l'encarregat
     * d'ajudar el usuari a l'hora de realitzar aquestes funcions.
     */

    /**
     * Component principal d'aquesta classe està contingut en aquesta variable
     */
    public VistaMenuBar menuBar;

    /**
     * Controlador de la vista principal que ens ajudarà a comunicar-nos amb la resta del programa.
     */
    public ControladorVistaPrincipal vp;

    /**
     * Funció creadora que inicialitza el component prinicpal.
     * @param inp Controlador de la Vista principal per poder-nos comunicar amb la resta de components.
     */
    public ControladorMenu(ControladorVistaPrincipal inp){
        vp = inp;
        menuBar = new VistaMenuBar(inp.vp.mainFrame);
    }

    /**
     * Funcio que ajuda al usuari a fer la suma.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de suma al textinput.
     */
    public void suma(){}

    /**
     * Funcio que ajuda al usuari a fer la resta.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de resta al textinput.
     */
    public void resta(){}


    /**
     * Funcio que ajuda al usuari a fer la multiplicació.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de multiplicació al textinput.
     */
    public void multiplicacio(){}


    /**
     * Funcio que ajuda al usuari a fer la divisió.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de divisió al textinput.
     */
    public void divisio(){}


    /**
     * Funcio que ajuda al usuari a fer l'arrel.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda d'arrel al textinput.
     */
    public void arrel(){}

    /**
     * Funcio que ajuda al usuari a fer la potència.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de potència al textinput.
     */
    public void potencia(){}

    /**
     * Funcio que ajuda al usuari a fer el valor absolut.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de valor absolut al textinput.
     */
    public void valorAbsolut(){}


    /**
     * Funcio que ajuda al usuari a truncar valors.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de truncar valor al textinput.
     */
    public void truncar(){}

    /**
     * Funcio que ajuda al usuari a fer la mitjana.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de mitjana al textinput.
     */

    public void mitjana(){}
    /**
     * Funcio que ajuda al usuari a fer la mediana.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de mediana al textinput.
     */
    public void mediana(){}

    /**
     * Funcio que ajuda al usuari a fer la variancia.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de variancia al textinput.
     */
    public void variancia(){}

    /**
     * Funcio que ajuda al usuari a fer la covariancia.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de covariancia al textinput.
     */
    public void covariancia(){}

    /**
     * Funcio que ajuda al usuari a fer la desviació estàndard.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de desviació estàndard al textinput.
     */
    public void desviacioEstandard(){}

    /**
     * Funcio que ajuda al usuari a fer el coeficient de Pearson.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda de coeficient de Pearson al textinput.
     */
    public void coeficientPearson(){}

    /**
     * Funcio que ajuda al usuari a obtenir el any d'una data.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda d'obtenir any al textinput.
     */
    public void obtenirAny(){}

    /**
     * Funcio que ajuda al usuari a obtenir el dia d'una data.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda d'obtenir dia al textinput.
     */
    public void obtenirDia(){}

    /**
     * Funcio que ajuda al usuari a fer el coeficient de Pearson.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda d'obtenir mes al textinput.
     */
    public void obtenirMes(){}

    /**
     * Funcio que ajuda al usuari a obtenir el dia de la setmana d'una data.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda d'obtenir dia de la setmana al textinput.
     */
    public void obtenirDiaSetmana(){}

    /**
     * Funcio que ajuda al usuari a obtenir la longitud de un text.
     * @pre: hi ha una cel·la seleccionada
     * @post: hi ha la comanda d'obtenir la longitud del text al textinput.
     */
    public void longitudText(){}
}
