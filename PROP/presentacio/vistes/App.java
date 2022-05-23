package presentacio.vistes;

import presentacio.controladorsVistes.ControladorApp;

public class App {
    /**
     * Classe principal que reunirà el controlador i inicialitzà l'aplicació.
     */
    public static void main(String args[]){
        ControladorApp app = new ControladorApp();

        app.oberirBenvinguda();
    }
}
