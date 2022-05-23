package presentacio.vistes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.File;
import java.util.*;

public class VistaMenuBar {
    /**
     * Classe encarregada de crear i inicilitzar el menu de la part superior que conté totes les funcionalitats que
     * s'usen freqüentment o no tant freqüentment en el programa.
     */

    /**
     * Menu principal de la part superior del programa.
     */
    public JMenuBar menuBar;

    /**
     * Menu que apareix quan volem afegir una fulla nova.
     */
    static JFrame menuAfegirFulla;

    /**
     * Funcio creadora que inicialitza la barra del menu amb tots els submenus corresponents.
     * @param mainFrame Passem el mainFrame per poder fer el display correctament dels parametres en el centre de la pantalla.
     */
    public VistaMenuBar(JFrame mainFrame) {
        menuBar = new JMenuBar();
        menuBar.add(DocumentMenu());
        menuBar.add(FullaMenu(mainFrame));
        menuBar.add(BlocMenu(mainFrame));
        menuBar.add(FuncionsMenu());
    }

    /**
     * Funció encarregada de crear la part que corresponent al document a la part superior.
     * @return El menu que s'ha d'afegir a la part superior de la pantalla.
    */
    private static JMenu DocumentMenu() {
        JMenu fileMenu = new JMenu("Document");
   
        JMenuItem openItem = new JMenuItem(new AbstractAction("Guardar") {
            public void actionPerformed(ActionEvent e) {
                // Button pressed logic goes here
                JFileChooser fileInput = new JFileChooser();
                
                fileInput.showSaveDialog(fileInput);

                File f = fileInput.getSelectedFile();
            }
        });
        
        fileMenu.add(openItem);
        return fileMenu;
    }

    /**
     * Funció que crea la part del menu corresponent a la fulla.
     * @param mainFrame MainFrame del que extreiem les dimensions.
     * @return retorna el menu de les fulles amb totes les funcionalitats.
     */
    private static JMenu FullaMenu(JFrame mainFrame) {
        JMenu fileMenu = new JMenu("Fulla");
        JMenuItem newItem = new JMenuItem(new AbstractAction("Afegir Fulla") {
            public void actionPerformed(ActionEvent e) {
                menuAfegirFulla.setVisible(true);
            }
        });
        fileMenu.add(newItem);


        JMenuItem deleItem = new JMenuItem(new AbstractAction("Eliminar Fulla") {
            public void actionPerformed(ActionEvent e) {
                //avisa el controlador que vol eliminar una fulla
            }
        });


        fileMenu.add(deleItem);
        JPopupMenu nom = menuCanviarNom();
        JMenuItem canviar = new JMenuItem(new AbstractAction("Canviar Nom Fulla") {
            public void actionPerformed(ActionEvent e) {
                int width = (int)(mainFrame.getSize().getWidth() / 2.4);
                int height = (int)(mainFrame.getSize().getHeight() / 3);

                nom.show(mainFrame, width, height);
            }
        });
        fileMenu.add(canviar);
        fileMenu.addSeparator();

        //APLICAR LA FUNCIÓ DE RENDER AGAIN UN COP EL CNTR DE DOMINI MODIFIQUI LA FULLA RECARREGAR LA VISTA.
        JMenuItem addCol = new JMenuItem("Afegir Columna");
        fileMenu.add(addCol);
        //APLICAR LA FUNCIÓ DE RENDER AGAIN UN COP EL CNTR DE DOMINI MODIFIQUI LA FULLA RECARREGAR LA VISTA.
        JMenuItem addRow = new JMenuItem("Afegir Fila");
        fileMenu.add(addRow);
        fileMenu.addSeparator();
        //APLICAR LA FUNCIÓ DE RENDER AGAIN UN COP EL CNTR DE DOMINI MODIFIQUI LA FULLA RECARREGAR LA VISTA.
        JMenuItem delCol = new JMenuItem("Eliminar Columna");
        fileMenu.add(delCol);
        //APLICAR LA FUNCIÓ DE RENDER AGAIN UN COP EL CNTR DE DOMINI MODIFIQUI LA FULLA RECARREGAR LA VISTA.
        JMenuItem delRow = new JMenuItem("Eliminar Fila");
        fileMenu.add(delRow);

        fileMenu.addSeparator();
        JPopupMenu jp = menuBuscar();
        JMenuItem buscar = new JMenuItem(new AbstractAction("Buscar Valor") {
            public void actionPerformed(ActionEvent e) {
                int width = (int)mainFrame.getSize().getWidth() - 275;

                jp.show(mainFrame, width,55);
            }
        });
        fileMenu.add(buscar);

        JPopupMenu rempl = menuRemplazar();
        JMenuItem rem = new JMenuItem(new AbstractAction("Remplasar Valor") {
            public void actionPerformed(ActionEvent e) {
                int width = (int)mainFrame.getSize().getWidth() - 300;

                rempl.show(mainFrame, width,55);
            }
        });
        fileMenu.add(rem);
        return fileMenu;
    }

    /**
     * Funció que crea la part del menu corresponent a la Bloc.
     * @param mainFrame MainFrame del que extreiem les dimensions.
     * @return retorna el menu de les fulles amb totes les funcionalitats.
     */
    private static JMenu BlocMenu(JFrame mainFrame) {
        JMenu fileMenu = new JMenu("Bloc");
        //ELIMINA EL DOCUMENT ACTUAL I TREU UN POP UP PER QUE ENTRI LES FILES COLUMNES ETC. treure pop up alertant.
        JPopupMenu seleccionar = seleccionarBloc();
        JMenuItem sel = new JMenuItem(new AbstractAction("Seleccionar Bloc") {
            public void actionPerformed(ActionEvent e) {
                int width = (int)(mainFrame.getSize().getWidth() - 375);
                int height = 55;

                seleccionar.show(mainFrame, width, height);
            }
        });
        fileMenu.add(sel);

        JMenuItem copiar = new JMenuItem("Copiar Bloc");
        fileMenu.add(copiar);

        JMenuItem eng = new JMenuItem("Enganxar Bloc");
        fileMenu.add(eng);

        JMenuItem el = new JMenuItem("Eliminar Bloc");
        fileMenu.add(el);

        JMenuItem ret = new JMenuItem("Retallar Bloc");
        fileMenu.add(ret);

        JMenuItem ord = new JMenuItem("Ordenar Bloc");
        fileMenu.add(ord);

        //POP UP AMB LLES 2 OPCIONS
        return fileMenu;
    }

    /**
     * Funció encarregada de crear la part que corresponent a les funcions a la part superior.
     * @return El menu que s'ha d'afegir a la part superior de la pantalla.
     */
    private static JMenu FuncionsMenu() {
        //TOT AQUEST S'IMPLEMENTARA AMB EL CONTROLADOR DE DOMINI PASSANT ELS VALORS DE LA CEL·LA.
        JMenu fileMenu = new JMenu("Funcions");
        
        JMenu aritmeticMenu = new JMenu("Operacions aritmetiques");
        JMenuItem suma  = new JMenuItem("Suma");
        aritmeticMenu.add(suma);
        JMenuItem resta  = new JMenuItem("Resta");
        aritmeticMenu.add(resta);
        JMenuItem mult  = new JMenuItem("Multiplicacio");
        aritmeticMenu.add(mult);
        JMenuItem div  = new JMenuItem("Divisio");
        aritmeticMenu.add(div);
        JMenuItem arrel  = new JMenuItem("Arrel");
        aritmeticMenu.add(arrel);
        JMenuItem pot  = new JMenuItem("Potencia");
        aritmeticMenu.add(pot);
        JMenuItem valorAbs  = new JMenuItem("Valor Absolut");
        aritmeticMenu.add(valorAbs);
        JMenuItem truncar  = new JMenuItem("Truncar Valor");
        aritmeticMenu.add(truncar);
        fileMenu.add(aritmeticMenu);
        fileMenu.addSeparator();

        JMenu funcionsCalcul = new JMenu("Operacions estadistica");
        JMenuItem mitjana = new JMenuItem("Mitjana");
        funcionsCalcul.add(mitjana);
        JMenuItem mediana = new JMenuItem("Mediana");
        funcionsCalcul.add(mediana);
        JMenuItem variancia = new JMenuItem("Variancia");
        funcionsCalcul.add(variancia);
        JMenuItem covariancia = new JMenuItem("Covariancia");
        funcionsCalcul.add(covariancia);
        JMenuItem desvEstandard = new JMenuItem("Desviacio Estandard");
        funcionsCalcul.add(desvEstandard);
        JMenuItem pearson = new JMenuItem("Coeficient de Pearson");
        funcionsCalcul.add(pearson);
        fileMenu.add(funcionsCalcul);
        fileMenu.addSeparator();


        JMenu funcionsData = new JMenu("Operacions amb dates");
        JMenuItem any = new JMenuItem("Obtenir Any");
        funcionsData.add(any);
        JMenuItem mes = new JMenuItem("Obtenir Mes");
        funcionsData.add(mes);
        JMenuItem dia = new JMenuItem("Obtenir Dia");
        funcionsData.add(dia);
        JMenuItem diaSet = new JMenuItem("Obtenir Dia Setmana");
        funcionsData.add(diaSet);
        fileMenu.add(funcionsData);
        fileMenu.addSeparator();

        JMenu funcionsText = new JMenu("Operacions amb text");
        JMenuItem longitud = new JMenuItem("Obtenir Longitud");
        funcionsText.add(longitud);
        fileMenu.add(funcionsText); 
        
        return fileMenu;
    }

    /**
     * Menu Pop Up que surt quan volem remplaçar una paraula en la taula.
     * @return El menu que ens ajudarà a remplaçar les paraules.
     */
    private static JPopupMenu menuRemplazar(){
        JPopupMenu menu = new JPopupMenu("menu");

        JLabel text = new JLabel("Introdueix la paraula que vols buscar:");
        JTextField inp = new JTextField();
        inp.setPreferredSize(new Dimension(100, 20));

        JLabel text2 = new JLabel("Introdueix la paraula de remplas:");
        JTextField inp2 = new JTextField();
        inp2.setPreferredSize(new Dimension(100, 20));

        JPanel aux = new JPanel(new GridLayout(5, 1, 0, 0));

        aux.add(text);
        aux.add(inp);
        aux.add(text2);
        aux.add(inp2);

        JPanel btnContainer = new JPanel(new FlowLayout());
        JButton btn = new JButton("Remplasar");
        btnContainer.add(btn);
        JButton btnTot = new JButton("Remplasar Tot");
        btnContainer.add(btnTot);

        aux.add(btnContainer);

        menu.setLayout(new GridBagLayout());
        menu.setPreferredSize(new Dimension(275, 185));

        menu.add(aux);
        return menu;
    }

    /**
     * Menu Pop Up que surt quan volem Seleccionar un bloc en una taula.
     * @return El menu que ens ajudarà a seleccionar un bloc.
     */
    private static JPopupMenu seleccionarBloc(){
        JPopupMenu menu = new JPopupMenu("menu");

        JLabel text = new JLabel("Introdueix les coordenades de la primera cela:");
        JTextField inp = new JTextField("A1");
        JLabel text2 = new JLabel("Introdueix les coordenades de la segona cela:");
        JTextField inp2 = new JTextField("B1");

        JPanel aux = new JPanel(new GridLayout(5, 1, 5, 5));

        inp.setPreferredSize(new Dimension(100, 20));

        aux.add(text);
        aux.add(inp);
        aux.add(text2);
        aux.add(inp2);

        menu.setLayout(new GridBagLayout());
        menu.setPreferredSize(new Dimension(350,210));

        JButton btn = new JButton("Seleccionar Bloc");
        aux.add(btn);
        
        menu.add(aux);
        return menu;
    }

    /**
     * Menu Pop Up que surt quan volem buscar una paraula en la taula.
     * @return El menu que ens ajudarà a buscar la paraula.
     */
    private static JPopupMenu menuBuscar(){
        JPopupMenu menu = new JPopupMenu("menu");
        JLabel text = new JLabel("Introdueix la paraula que vols buscar:");
        JTextField inp = new JTextField();
        JPanel aux = new JPanel(new GridLayout(3, 1, 5, 10));

        inp.setPreferredSize(new Dimension(100, 20));

        aux.add(text);
        aux.add(inp);

        menu.setLayout(new GridBagLayout());
        menu.setPreferredSize(new Dimension(250,110));

        JButton btn = new JButton("Buscar");
        aux.add(btn);
        
        menu.add(aux);
        return menu;
    }

    /**
     * Menu Pop Up que surt quan volem canviar-li el nom a una fulla.
     * @return El menu que ens ajudarà a canvair el nom a la fulla.
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
