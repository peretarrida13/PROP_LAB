package presentacio.vistes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;

public class VistaBarraFulles {
    /**
     * Classe encarregada de crear i gestionar el menu de sota que ens permet intereccionar amb les diverses funcionalitats
     * que tenen les fulles i accedir algunes d'aquestes funcionalitats de manera ràpida mitjançant botons.
     */

    /**
     * Panel que conté tots els botons i funcionalitas d'una fulla.
     */
    public JPanel panelFulles;


    /**
     * Funció Constructora encarregada d'afegir els botons que li toca a i les funcionalitats d'aquests. Aquesta funció
     * té com a parametre un frame ja que d'aquesta manera al treure el menu de pop ups surt al centre de la pantalla i
     * com no té un enter permet que si volem canviar el valor d'algun d'aquests parametres no haurem de tocar res.
     * @param mainFrame Frame principal en el cual activa els pop ups
     */
    public VistaBarraFulles(JFrame mainFrame){
        panelFulles = new JPanel();

        for(int i = 1; i <= 3; ++i){
            JButton btn = new JButton("" + i);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.gridx = 1;
                    gbc.gridy = 0;
                    gbc.weightx = 0.3;
                    gbc.weighty = 0.9;
                    gbc.gridwidth = 1;
                    gbc.gridheight = 1;
                    gbc.fill = GridBagConstraints.BOTH;

                    //mainFrame.remove(0);
                    System.out.println(btn.getText());
                }
            });

            panelFulles.add(btn);
        }
        
        JButton addFulla = new JButton("Afegir Fulla");
        addFulla.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                panelFulles.setVisible(true);
            }
        });
        
        JButton eliminarFulla = new JButton("Eliminar Fulla");
        
        eliminarFulla.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });
        
        panelFulles.add(addFulla);
        panelFulles.add(eliminarFulla);
        
        JPopupMenu menu = fullaClickDret(mainFrame);    
        panelFulles.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //right mouse click event
                if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1){
                    menu.show(panelFulles , e.getX(), e.getY());
                }        
            }
        });
        
        panelFulles.add(menu);
    }

    /**
     * Funció que nosaltres creem per quan fem click dret ens dongui les diverses opcions que podem realitzar en una fulla
     * podem d'aquesta manera veure el JPopUpMenu
     * @param mainFrame Frame actual del que extreiem les mides d'amplada i alçada.
     * @return Retorna el menu que apareixerà quan fem click dret en el menú de fulles.
     */
    private static JPopupMenu fullaClickDret(JFrame mainFrame){
        JPopupMenu menu = new JPopupMenu("menu");
        
        JMenuItem afegir = new JMenuItem("Afegir Fulla");
        menu.add(afegir);

        JMenuItem eli = new JMenuItem("Eliminar Fulla");
        menu.add(eli);
        
        menu.addSeparator();

        JMenuItem eliFila = new JMenuItem("Eliminar Fila");
        menu.add(eliFila);

        JMenuItem eliCol = new JMenuItem("Eliminar Columna");
        menu.add(eliCol);

        menu.addSeparator();

        JPopupMenu nom = menuCanviarNom();
        JMenuItem canviar = new JMenuItem(new AbstractAction("Canviar Nom Fulla") {
            public void actionPerformed(ActionEvent e) {
                int width = (int)(mainFrame.getSize().getWidth() / 2.4);
                int height = (int)(mainFrame.getSize().getHeight() / 3);

                nom.show(mainFrame, width, height);
            }
        });
        menu.add(canviar);
        
        return menu;
    }

    /**
     * Menú que apareix al fer click en el botó de canviar el nom de la fulla.
     * @return Retorna el menu que apareixerà quan fem click en el botó de canviar el nom.
     */
    private static JPopupMenu menuCanviarNom(){
        JPopupMenu menu = new JPopupMenu("menu");
        JLabel text = new JLabel("Introdueix el nou nom de la fulla actual:");
        JTextField inp = new JTextField("Nou nom");
        JPanel aux = new JPanel(new GridLayout(3, 1, 5, 10));

        inp.setPreferredSize(new Dimension(100, 20));

        aux.add(text);
        aux.add(inp);

        menu.setLayout(new GridBagLayout());
        menu.setPreferredSize(new Dimension(250,110));

        JButton btn = new JButton("Canviar Nom");
        aux.add(btn);
        
        menu.add(aux);
        return menu;
    }
    
}
