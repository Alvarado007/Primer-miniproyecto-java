package Clases;

import java.util.ArrayList;
import java.util.Scanner;

import Enums.TiposPokemon;

public class Visualizacion {
    ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();

    public void iniciarJuego(Scanner sc) {
        System.out.println("Bienvenido al juego de Pokémon!");
        System.out.print("Ingrese el nombre del entrenador 1: ");
        String nombreEntrenador1 = sc.nextLine();
        System.out.print("Ingrese el nombre del entrenador 2: ");
        String nombreEntrenador2 = sc.nextLine();
        Entrenador entrenador1 = new Entrenador(nombreEntrenador1);
        Entrenador entrenador2 = new Entrenador(nombreEntrenador2);
        entrenadores.add(entrenador1);
        entrenadores.add(entrenador2);
        agregar_pokemon(sc);
    }
    public void agregar_pokemon(Scanner sc){
        while (true){
            System.out.println("1- Entrenador 1");
            System.out.println("2- Entrenador 2");
            System.out.println("3- Salir");
            System.out.println("Seleccione un entrenador para agregar un Pokémon: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            switch (opcion) {
                case 1:{
                    Entrenador entrenador1 =entrenadores.get(0);
                    System.out.println("Como  quieres elgir tus pokemones 1- Manual o 2- Automatico: ");
                    int opcionEleccion = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    if (opcionEleccion == 1){
                        entrenador1.elegirPokemonBatallaManual(sc);
                        entrenador1.agregarAtaquePokemonManual(sc);
                    } else if (opcionEleccion == 2){
                        entrenador1.elegirPokemonBatallaAutomatico(sc);
                        entrenador1.agregraAtaquesPokemonesAutomatico(sc);
                        // Aquí puedes agregar la lógica para agregar Pokémon automáticamente
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                    }

                case 2:{
                    Entrenador entrenador2 =entrenadores.get(1);
                    System.out.println("Como  quieres elegir tus pokemones 1- Manual o 2- Automatico: ");
                    int opcionEleccion = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea
                    if (opcionEleccion == 1){
                        entrenador2.elegirPokemonBatallaManual(sc);
                        entrenador2.agregarAtaquePokemonManual(sc);
                    } else if (opcionEleccion == 2){
                        entrenador2.elegirPokemonBatallaAutomatico(sc);
                        entrenador2.agregraAtaquesPokemonesAutomatico(sc);
                        // Aquí puedes agregar la lógica para agregar Pokémon automáticamente
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                }
                case 3:{
                    Entrenador entrenador1 =entrenadores.get(0);
                    entrenador1.mostrarEquipo();
                    return; // Salir del método y, por lo tanto, del juego
                }
                default:
                    System.out.println("Opción no válida.");
            }
        }
    } 
}
