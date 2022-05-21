package presentacio.vistes;

public class App {

    public static void main(String args[]){
        VistaPrincipal vp = new VistaPrincipal();
        VistaBenvinguda vb = new VistaBenvinguda(vp);

        vb.setMainWSVisible(true);
        vp.setMainVPVisible(false);
        System.out.println("Hello world");
    }
}
