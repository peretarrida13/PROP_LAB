package presentacio.vistes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.File;

public class VistaBenvinguda {

    JFrame mainWelcomeScreen;

    JFrame menuCrear;

    public VistaBenvinguda(VistaPrincipal vp){
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
                        vp.setMainVPVisible(true);
                    }
                }
            }
        });

        menu.add(text);
        menu.add(createBTN);
        menu.add(importBTN);
        mainWelcomeScreen.add(menu);

        subMenuCrearDocument(vp);
    }

    /*
      Funcio encarregada d'inicialitzar el submenu per crear el document.
  */
    private void subMenuCrearDocument(VistaPrincipal vp){
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
                vp.setMainVPVisible(true);
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

    public void setMainWSVisible(Boolean bool) {
        mainWelcomeScreen.setVisible(bool);
    }

}
