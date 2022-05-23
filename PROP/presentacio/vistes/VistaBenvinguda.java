package presentacio.vistes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.File;

public class VistaBenvinguda {
    /**
     * Funció encarregada de gestionar la primera vista que li apareix al usuari al executar la app. en aquesta el usuari
     * podrà escollir si vol importar un document o un crear un de nou.
     */

    /**
     * Frame principal que contindrà tots els components possibles d'aquest.
     */
    JFrame mainWelcomeScreen;

    /**
     * Frame que apareixerar a l'hora que l'usuari vulgui crear un document nou.
     */
    JFrame menuCrear;

    /**
     * Funció creadora que tenim que inicialitza el Frame principal amb tots els seus components i les seves respectives
     * funcionalitats.
     */
    public VistaBenvinguda(){
        mainWelcomeScreen = new JFrame("Welcome");
        mainWelcomeScreen.getContentPane().setLayout(new GridBagLayout());


        mainWelcomeScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWelcomeScreen.setSize(1000, 750);

        JPanel menu = new JPanel(new GridLayout(3, 1, 10, 10));

        JLabel text = new JLabel("Benvingut, Escull una opcio");
        JButton createBTN = new JButton("Crear Document");
        JButton importBTN = new JButton("Importar Document");

        createBTN.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                menuCrear.setVisible(true);
            }
        });

        importBTN.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                menuCrear.setVisible(false);

                JFileChooser fileInput = new JFileChooser();
                int returnValue = fileInput.showOpenDialog(null);
                // int returnValue = jfc.showSaveDialog(null);

                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileInput.getSelectedFile();

                    if(selectedFile.getAbsolutePath() != null){
                        menuCrear.setVisible(false);
                        mainWelcomeScreen.setVisible(false);

                    }
                }
            }
        });

        menu.add(text);
        menu.add(createBTN);
        menu.add(importBTN);
        mainWelcomeScreen.add(menu);
    }

    /**
     * Funcio encarregada de inicialitzar el frame del menu que apareix al crear un nou document.
     */
    private void subMenuCrearDocument(){
        menuCrear = new JFrame("Crear");
        menuCrear.getContentPane().setLayout(new GridBagLayout());


        menuCrear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuCrear.setSize(500, 250);

        JPanel menu = new JPanel(new GridLayout(5, 1, 10, 10));

        JLabel textFiles = new JLabel("Introdueix les files: ");
        JTextField files = new JTextField("100");
        JLabel textCol = new JLabel("Introdueix les columnes: ");
        JTextField col = new JTextField("26");
        JButton createBTN = new JButton("Crear Document");

        createBTN.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                menuCrear.setVisible(false);
                mainWelcomeScreen.setVisible(false);
            }
        });

        menu.add(textFiles);
        menu.add(files);
        menu.add(textCol);
        menu.add(col);
        menu.add(createBTN);
        menuCrear.add(menu);

        menuCrear.setVisible(false);
    }

    /**
     * Funció encarregada de mostrar o amagar la pantalla en funció que l'usuari vulgui.
     * @param bool parametre que es passara a la funció i ens indica si em de mostrar el frame o no.
     */
    public void setMainWSVisible(Boolean bool) {
        mainWelcomeScreen.setVisible(bool);
    }

}
