package presentacio.vistes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.File;
import java.util.*;

public class VistaPrincipal {

    static JFrame mainFrame;
    
    static String fullaActiva;

    static HashMap<String, JScrollPane> fulles = new HashMap<>();

    public JLabel selectedCell;
    
    
    /*
        Funcio encarregada d'inicialitzar el mainframe amb totes les seves propiestats.
    */
    public VistaPrincipal() {
        mainFrame = new JFrame("test");
        mainFrame.getContentPane().setLayout(new GridBagLayout());
        
        setBackgroundColor();
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1500, 1000);

        VistaMenuBar vistaMenuBar = new VistaMenuBar(mainFrame, selectedCell, fullaActiva,fulles);
    
        mainFrame.setJMenuBar(vistaMenuBar.menuBar);

        GridBagConstraints gbc = new GridBagConstraints();


        JPanel topBar = vistaMenuBar.topTextBar;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        mainFrame.add(topBar, gbc);


        JScrollPane grid = new JScrollPane();

        for(int i = 1; i <= 3; ++i){
            JScrollPane fulla = new VistaGraella().mainGrid;

            fulles.put(""+i, fulla);

            grid.add(fulla);
        }

        
        /*
        1, 0, 0.3, 0.9, 1, 1, GridBagConstraints.BOTH
        */
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.3;
        gbc.weighty = 0.9;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        
        fullaActiva = "1";

        mainFrame.add(fulles.get("1"), gbc);

        // // 0, 1, 1.0, 0.1, 2, 1, GridBagConstraints.BOTH
        JPanel hojas = new VistaMenuFulles(mainFrame, fulles).panelFulles;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 0.005;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        mainFrame.add(hojas, gbc);
    }

    /*
        Funcio auxiliar de prova que posa color al fons de la pantalla (no fa falta era a la fase d'apendre treure al passar al final)
    */
    private static void setBackgroundColor(){
        mainFrame.getContentPane().setBackground(new Color(254, 100, 100));
    }

    public void setMainVPVisible(Boolean bool) {
        mainFrame.setVisible(bool);
    }
    
}
