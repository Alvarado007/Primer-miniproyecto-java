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
                    agregar_pokemones(sc, entrenador1);
                    break;
                    }

                case 2:{
                    Entrenador entrenador2 =entrenadores.get(1);
                    agregar_pokemones(sc, entrenador2);
                    break;
                }
                default:
                    System.out.println("Opción no válida.");
            }
        }
    } 
    public void agregar_pokemones(Scanner sc, Entrenador entrenador1){ 
        for (int i=0; i<3; i++){
            System.out.println("Ingrese el nombre del pokemon: ");
            String nombrePokemon = sc.nextLine();
            System.out.println("Ingrese la opcion de pokemon: ");
            System.out.println("1- Agua");
            System.out.println("2- Fuego");
            System.out.println("3- Electrico");
            System.out.println("4- Psiquico");
            TiposPokemon tipoPokemon = null;
            int opcionPokemon = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            if (opcionPokemon == 1){
                tipoPokemon = TiposPokemon.AGUA;
            } else if (opcionPokemon == 2){
                tipoPokemon = TiposPokemon.FUEGO;
            } else if (opcionPokemon == 3){
                tipoPokemon = TiposPokemon.ELECTRICO;
            } else if (opcionPokemon == 4){
                tipoPokemon = TiposPokemon.PSIQUICO;
            } else {
                System.out.println("Opción no válida.");
            }
            while(true){
                System.out.println("Ingrese la vida del pokemon: ");
                short vidaPokemon = sc.nextShort();
                sc.nextLine(); // Consumir el salto de línea
                if (vidaPokemon > 50 && vidaPokemon < 200){
                    Pokemon pokemon = new Pokemon(nombrePokemon, tipoPokemon, vidaPokemon);
                    entrenador1.agregarPokemonEquipo(pokemon);
                    break;
                } else {
                    System.out.println("La vida debe ser mayor a 0.");
                }
            }
        }
    }
}
