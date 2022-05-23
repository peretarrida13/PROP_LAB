package presentacio.vistes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VistaError {
    /**
     * Classe encarregada de contenir el component i les funcionalitats del pop Up que surt per pantalla en cas que el
     * usuari intenti realitzar una operació o funció i aquesta tingui un error.
     */

    /**
     * Frame que conté la el missatge que es mostrarà quan es fagi visible.
     */
    public JFrame errorPopUp;

    /**
     * Funció creadora que inicialitza tots els parametres del frame.
     */
    public VistaError(){
        errorPopUp = new JFrame("ERROR");
        errorPopUp.getContentPane().setLayout(new GridBagLayout());


        errorPopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        errorPopUp.setSize(500, 200);
    }

    /**
     * Funció encarrregada de inicialitzar el text d'error que li surt al usuari per pantalla.
     * @param text missatge d'error que mostrarà el frame.
     */
    public void inicialitzar(String text){
        JPanel res = new JPanel(new GridBagLayout());

        JPanel aux = new JPanel(new GridLayout(1, 2, 10, 10));
        try{
            BufferedImage img = ImageIO.read(new File("error.png"));

            JLabel pic = new JLabel(new ImageIcon(img));
            aux.add(pic);
        } catch(IOException e){
            System.out.println(e);
        }

        JLabel msg = new JLabel(text);

        aux.add(msg);

        res.add(aux);
    }


}
