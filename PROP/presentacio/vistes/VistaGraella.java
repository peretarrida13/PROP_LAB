package presentacio.vistes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.io.File;
import javax.swing.table.DefaultTableCellRenderer;

public class VistaGraella {
    /**
     * Classe encarregada de crear la graella on tenim totes les cel·les i les funcionalitats d'aquestes.
     */

    /**
     * Panel principal on ens mourem i tindrem les cel·les amb els respectius valors.
     */
    public JScrollPane mainGrid;


    /**
     * Funció creadora que crea una taula i la inicialitza amb tot de cel·les buides.
    */
    public VistaGraella() {
        int files = 100;
        int col = 26;
        
        String mat[][] = new String[files][col+1];
        
        //creacio contingut celes
        for(int i = 1; i <= files; ++i){
            mat[i-1][0] = "" + i;
        }
        String names[] = new String[col+1];
        char c = 'A';  
        
        names[0] = "-";
        for(int i = 1; i < 27; ++i){
            names[i] = ""+c;
            ++c;
        }

        //fem cel·les col0 no es puguin editar
        JTable grid = new JTable(mat, names){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column != 0 ? true : false;
            };
        };

        //posem el size de les cel·les.
        grid.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        grid.getTableHeader().setReorderingAllowed(false);

        grid.setRowHeight(25);
        
        for(int i = 0; i < col+1; ++i){
            if(i == 0) grid.getColumnModel().getColumn(i).setPreferredWidth(50);
            else grid.getColumnModel().getColumn(i).setPreferredWidth(100);
            
        }

        //canviar el color de la columna amb la classe de baix
        grid.getColumnModel().getColumn(0).setCellRenderer(new MyRenderer(Color.lightGray, Color.black));
        grid.getTableHeader().setBackground(Color.lightGray);

        //menu click dret
        JPopupMenu menu = menuClickDret();    
        grid.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //right mouse click event
                if (SwingUtilities.isRightMouseButton(e) && e.getClickCount() == 1){
                    menu.show(grid , e.getX(), e.getY());
                } else if(SwingUtilities.isLeftMouseButton(e)){

                    char c = int2char(grid.getSelectedColumn());

                    String out = "";
                    if(grid.getValueAt(grid.getSelectedRow(), grid.getSelectedColumn()) != null) out = "" + grid.getValueAt(grid.getSelectedRow(), grid.getSelectedColumn());
                    // topBarInp.setText(out);
                }
            }
        });

        grid.add(menu);

        mainGrid = new JScrollPane(grid);
    }

    /**
     * Funció creadora que donada una fulla farà el display d'aquesta.
     */
    public VistaGraella(Fulla f){}

    /**
     * Funció encarregada de crear el menu que apareix al fer el click dret en qualsevol lloc de la graella
     * @return retorna el menu que veiem al fer click dret a qualsevol part de la graella.
     */
    private static JPopupMenu menuClickDret(){
        JPopupMenu menu = new JPopupMenu("menu");
        
        JMenuItem copiar = new JMenuItem("Copiar");
        menu.add(copiar);

        JMenuItem enganxar = new JMenuItem("Enganxar");
        menu.add(enganxar);

        JMenuItem ret = new JMenuItem("Retallar");
        menu.add(ret);

        JMenuItem eli = new JMenuItem("Eliminar");
        menu.add(eli);

        menu.addSeparator();

        JMenuItem ordenar = new JMenuItem("Ordenar Bloc");
        menu.add(ordenar);

        JMenuItem copiarBloc = new JMenuItem("Retallar Bloc");
        menu.add(copiarBloc);

        JMenuItem enganxarBloc = new JMenuItem("Enganxar Bloc");
        menu.add(enganxarBloc);

        JMenuItem retBloc = new JMenuItem("Retallar Bloc");
        menu.add(retBloc);

        JMenuItem eliBloc = new JMenuItem("Eliminar Bloc");
        menu.add(eliBloc);
        
        menu.addSeparator();

        JMenuItem eliFila = new JMenuItem("Eliminar Fila");
        menu.add(eliFila);

        JMenuItem eliCol = new JMenuItem("Eliminar Columna");
        menu.add(eliCol);

        menu.addSeparator();

        JMenuItem buscar = new JMenuItem("Buscar Valor");
        menu.add(buscar);

        JMenuItem rempl = new JMenuItem("Remplazar Valor");
        menu.add(rempl);

        return menu;
    }

    /**
     * Funcio que ens ajuda a canviar de enter a caràcter.
     * @param i enter que volem convertir a caràcter.
     * @return retorna el caràcter que correspon el nom.
     */
    private static char int2char(int i){
        return (char)(i + 64);
    }


    /**
     * Classe creada per canviar el color del fons de les cel·les no té res de funcionalitat és només per estetica del
     * programa
     */
    class MyRenderer extends DefaultTableCellRenderer {
        /**
         * Colors tant del background de les cel·les com nom d'aquestes.
         */
        Color bg, fg;

        /**
         * Funció creadora que posa els nous colors.
         * @param bg color del fons de la cel·la.
         * @param fg color del text de la cel·la.
         */
        public MyRenderer(Color bg, Color fg) {
            super();
            this.bg = bg;
            this.fg = fg;
        }

        /**
         * Funció que canvia el clor del fons de la cel·la
         * @param table Taula que volem canviar el color de la cel·la
         * @param value Cel·la que li volem canviar el color
         * @param isSelected si esta seleccionada o no.
         * @param hasFocus si està enfocada o no.
         * @param row fila que pertany.
         * @param column columna que pertany
         * @return
         */
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, value, 
            isSelected, hasFocus, row, column);
            cell.setBackground(bg);
            cell.setForeground(fg);
            
            //centrar text columna dreta
            ((DefaultTableCellRenderer)cell).setHorizontalAlignment(JLabel.CENTER);
    
            return cell;
        }
    }
    
}
