import java.util.Scanner;

import Clases.Visualizacion;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Visualizacion visualizacion = new Visualizacion();
        visualizacion.iniciarJuego(sc);
        sc.close();
    }
}
