package main;

import controlador.ControladorItinerario;
import view.ViewMenu;
/*
 * Simula��o das listas nos c�digos
 */
public class Main {
    public static void main(String[] args) {
        ControladorItinerario controladorItinerario = new ControladorItinerario();
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "CORONEL", "Corumb�", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "CORONEL", "Corumb�", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Costa Rica", 12, "10/12/2002", "Lurdes", "Corumb�", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "CORONEL", "Corumb�", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "LS", "Corumb�", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Mangue", 12, "10/12/2002", "CORONEL", "Corumb�", "Rio de Janeiro", "ASIDJSAD");
        controladorItinerario.criaVoo("Congonhas", 12, "10/12/2002", "CORONEL", "Corumb�", "Rio de Janeiro", "ASIDJSAD");
        ViewMenu window = new ViewMenu();
        window.getOriginFrame().setVisible(true);
    }
}
