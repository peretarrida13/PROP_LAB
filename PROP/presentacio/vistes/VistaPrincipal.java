package presentacio.vistes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.File;
import java.util.*;

public class VistaPrincipal {

    /**
     * Classe encarregada de reunir totes les components amb les respectives funcionalitats per crear l'aplicació i totes
     * les funcionalitats.
     */

    /**
     * Frame total que uneix totes les components i conforme el core de l'aplicació.
     */
    public JFrame mainFrame;

    /**
     * Funció creadora que iniciaitza el frame i totes les propietats.
     */
    public VistaPrincipal() {
        mainFrame = new JFrame("test");
        mainFrame.getContentPane().setLayout(new GridBagLayout());

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1500, 1000);
    }

    /**
     * Funció que donat un booleà farà visible o amagarà el frame principal.
     * @param bool booleà que indica si el frame es visible o no.
     */
    public void setMainVPVisible(Boolean bool) {
        mainFrame.setVisible(bool);
    }

    /**
     * Funció que retorna l'amplada del frame.
     * @return retorna l'amplada del frame.
     */
    public int getAmplada(){
        return mainFrame.getWidth();
    }
    
}
