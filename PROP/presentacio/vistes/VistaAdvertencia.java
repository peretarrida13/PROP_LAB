package presentacio.vistes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VistaAdvertencia {
    /**
     * Classe encarregada de contenir el component i les funcionalitats del pop Up que surt per pantalla en cas que el
     * usuari intenti realitzar un gran canvi per tal que l'usuari no editi alguna cosa que no volia editar.
     */

    /**
     * Frame que conté la el missatge i els botons del pop Up d'advertencia.
     */
    JFrame advPopUp;

    /**
     * Funció creadora que inicialitza el frame pero no posa cap dels components que conté aquests.
     */
    public VistaAdvertencia(){
        advPopUp = new JFrame("Advertensia");
        advPopUp.getContentPane().setLayout(new GridBagLayout());

        advPopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        advPopUp.setSize(500, 200);
    }

    /**
     * Funció encarregada de posar els components en qüestió i donar el missatge indicat.
     * @param text Missatge que li vols mostrar el usuari per pantalla.
     * @param btn1 Botó que conté el nom i les funcionalitats passades per la classe que crida el pop up.
     * @param btn2 Botó que conté el nom i les funcionalitats passades per la classe que crida el pop up.
     */
    public void inicialitzar(String text, JButton btn1, JButton btn2){
        JPanel res = new JPanel(new GridBagLayout());

        JPanel aux = new JPanel(new GridLayout(2, 2, 10, 10));

        try{
            BufferedImage img = ImageIO.read(new File("adv.png"));
            JLabel pic = new JLabel(new ImageIcon(img));
            aux.add(pic);
        } catch(IOException e){
            System.out.println(e);
        }

        JLabel msg = new JLabel(text);

        aux.add(msg);
        aux.add(btn1);
        aux.add(btn2);
        res.add(aux);

        advPopUp.setVisible(true);
    }

    /**
     * Funció encarregada de tancar el pop up que se li apareix al usuari.
     */
    public void closeAdvertencia(){
        advPopUp.setVisible(false);
    }
}
