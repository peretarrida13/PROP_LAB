package presentacio.vistes;

import presentacio.controladorsVistes.ControladorBarraSuperior;

import javax.swing.*;
import java.awt.*;

public class VistaBarraSuperior {
    /**
     * Classe encarregada de inicialitzar la barra superior on tenim un JPanel amb una etiqueta que ens mostra la cel·la
     * que tenim clicada, i al costat tenim la barra principal on l'usuari pot editar el text o llegir el text de la
     * cel·la
     */
    /**
     * JPanel principal on colocarem el total dels nostres elements ha de ser public ja que ha de ser accessible per la
     * classe de vista principal
     */
    public JPanel topBar;

    /**
     * JTextField on l'usuari pot editar el text de la cel·la seleccionada o veure el text que esta editant
     */
    private JTextField topBarInp;

    /**
     * JLabel que editem cada cop que seleccionem una cel·la diferent i que ens ajuda a mostrar el usuari quina cel·la
     * té seleccionada.
     */
    private JLabel selectedCell;

    /**
     * Funció creadora de la barra superior com a paramatre tenim la amplada de la pantalla ja que ens serveix per indicar
     * quina és la llargaria que hauria de tenir la topBarInp
     * @param amplada amplada de la pantalla.
     */
    public VistaBarraSuperior(int amplada){
        topBar = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JPanel cellContainer = new JPanel();

        selectedCell = new JLabel("A1");
        cellContainer.add(selectedCell);

        topBar.add(cellContainer);

        topBarInp = new JTextField("valor cella");
        topBarInp.setPreferredSize(new Dimension(amplada - 55, 30));

        topBar.add(topBarInp);
    }

    /**
     * Funció encarregada de canviar el text on veiem indicada la cel·la que tenim seleccionada.
     * @param text Nom de la nova cel·la que tenim seleccionada.
     */
    public void canviarCella(String text){
        selectedCell.setText(text);
    }

    /**
     * Funció encarregada de canviar el text de la topBarInp que es cridara des del exterior cada cop que l'usuari editi
     * una cel·la llavors veurem com aixi tambe canvia el text a la barra de dalt.
     * @param text nou text que l'usuari introdueix a la cel·la seleccionada.
     */
    public void canviarTextInput(String text){
        topBarInp.setText(text);
    }

    /**
     * Funció encarregada de retornar el text actual que tenim en el input. La farem servir principalment per actualitzar
     * el valor a la cel·la que tenim seleccionada, en cas que l'usuari editi el text des de la topBarInp.
     * @return Retorna el valor actual que conté la barra superior del text.
     */
    public String getTextInput(){
        return topBarInp.getText();
    }

    /**
     * Funcio encarregada de retornar el valor de la cel·la que tenim seleccionada, ens anirà bé tant per editar el valor
     * de la cel·la seleccionada com per comprovar que la cel·la es la correcte.
     * @return Retorna el valor del selectedCell que conte la cel·la seleccionada.
     */
    public String getNomCella(){
        return selectedCell.getText();
    }
}
