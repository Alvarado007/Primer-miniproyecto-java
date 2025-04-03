package Clases;

import java.util.ArrayList;
import java.util.Scanner;

import Enums.TiposPokemon;

public class Visualizacion {
    ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
    public void iniciarJuego() {
        System.out.println("Bienvenido al juego de Pokémon!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del entrenador 1: ");
        String nombreEntrenador1 = scanner.nextLine();
        Entrenador entrenador1 = new Entrenador(nombreEntrenador1);
        System.out.print("Ingrese el nombre del entrenador 2: ");
        String nombreEntrenador2 = scanner.nextLine();
        Entrenador entrenador2 = new Entrenador(nombreEntrenador2);
        scanner.close();
        entrenadores.add(entrenador1);
        entrenadores.add(entrenador2);
        agregar_pokemon();

    }
    public void agregar_pokemon(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1- Entrenador 1");
            System.out.println("2- Entrenador 2");
            System.out.println("3- Salir");
            System.out.println("Seleccione un entrenador para agregar un Pokémon: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:{
                    Entrenador entrenador1 =entrenadores.get(0);
                    for (int i=0; i<3; i++){
                        System.out.println("Ingrese el nombre del pokemon: ");
                        String nombrePokemon = scanner.nextLine();
                        System.out.println("Ingrese la opcion de pokemon: ");
                        System.out.println("1- Agua");
                        System.out.println("2- Fuego");
                        System.out.println("3- Electrico");
                        System.out.println("4- Psiquico");
                        TiposPokemon tipoPokemon = null;
                        int opcionPokemon = scanner.nextInt();
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
                        System.out.println("Ingrese la vida del pokemon: ");
                        short vidaPokemon = scanner.nextShort();
                        System.out.println("Ingrese el ataque del pokemon: ");
                        Pokemon pokemon = new Pokemon(nombrePokemon, tipoPokemon, vidaPokemon);
                        entrenador1.agregarPokemonEquipo(pokemon);
                        break;
                    

                case 2:{
                    Entrenador entrenador2 =entrenadores.get(1);
                    break;
                }
                default:
                    System.out.println("Opción no válida.");
            }
        }
    } 
}
