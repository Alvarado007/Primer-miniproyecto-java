package Clases;

import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println("Seleccione un entrenador para agregar un Pokémon: ");
            System.out.println("1- Entrenador 1");
            System.out.println("2- Entrenador 2");
            System.out.println("3- Mostrar equipos de los entrenadores");
            System.out.println("4- Batalla");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:{
                    Entrenador entrenador1 =entrenadores.get(0);
                    System.out.println("Como  quieres elegir tus pokemones 1- Manual o 2- Automatico: ");
                    int opcionEleccion = sc.nextInt();
                    sc.nextLine();
                    if (opcionEleccion == 1){
                        entrenador1.elegirPokemonBatallaManual(sc);
                        entrenador1.agregarAtaquePokemonManual(sc);
                    } else if (opcionEleccion == 2){
                        entrenador1.elegirPokemonBatallaAutomatico(sc);
                        entrenador1.agregraAtaquesPokemonesAutomatico(sc);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                    }

                case 2:{
                    Entrenador entrenador2 =entrenadores.get(1);
                    System.out.println("Como  quieres elegir tus pokemones 1- Manual o 2- Automatico: ");
                    int opcionEleccion = sc.nextInt();
                    sc.nextLine();
                    if (opcionEleccion == 1){
                        entrenador2.elegirPokemonBatallaManual(sc);
                        entrenador2.agregarAtaquePokemonManual(sc);
                    } else if (opcionEleccion == 2){
                        entrenador2.elegirPokemonBatallaAutomatico(sc);
                        entrenador2.agregraAtaquesPokemonesAutomatico(sc);
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    break;
                }
                case 3:{
                    Entrenador entrenador1 =entrenadores.get(0);
                    entrenador1.mostrarEquipo();
                    Entrenador entrenador2 =entrenadores.get(1);
                    entrenador2.mostrarEquipo();
                    return;
                }
                case 4:{
                    System.out.println("Iniciando batalla...");
                    batalla(sc);
                    break;
                }
                default:
                    System.out.println("Opción no válida.");
            }
        }
    } 
    public void batalla(Scanner sc) {
        System.out.println(entrenadores.get(0).getNombre_entrenador() + " vs " + entrenadores.get(1).getNombre_entrenador()); 
        ArrayList<Pokemon> peleaPokemon = new ArrayList<Pokemon>();

        for (byte i = 0; i < entrenadores.size(); i++) {
            System.out.println(entrenadores.get(i).getNombre_entrenador() + " elige su Pokémon: ");
            entrenadores.get(i).mostrarEquipo();
            System.out.println("Seleccione el Pokémon que desea usar: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            Pokemon pokemonElegido = entrenadores.get(i).getEquipo_entrenador().get(opcion - 1);
            System.out.println(entrenadores.get(i).getNombre_entrenador() + " ha elegido a " + pokemonElegido.getNombre());
            peleaPokemon.add(pokemonElegido);
        }

        System.out.println("¡La batalla ha comenzado!");
        int vidaPokemon0 = peleaPokemon.get(0).getVida();
        int vidaPokemon1 = peleaPokemon.get(1).getVida();
        while (true) {
            if (vidaPokemon0 <= 0) {
                System.out.println(entrenadores.get(1).getNombre_entrenador() + " ha ganado la batalla!");
                Entrenador entrenadorGanador = entrenadores.get(1);
                Entrenador entrenadorPerdedor = entrenadores.get(0);
                entrenadorGanador.felcidad();
                entrenadorPerdedor.triteza();
                System.exit(0);
            } 
            else if (vidaPokemon1 <= 0) {
                System.out.println(entrenadores.get(0).getNombre_entrenador() + " ha ganado la batalla!");
                Entrenador entrenadorGanador = entrenadores.get(0);
                Entrenador entrenadorPerdedor = entrenadores.get(1);    
                entrenadorGanador.felcidad();
                entrenadorPerdedor.triteza();
                System.exit(0);
            } 
            else if (vidaPokemon0 < vidaPokemon1) {
                System.out.println(entrenadores.get(0).getNombre_entrenador() + " Tiene el primer turno ");
                while (vidaPokemon0 > 0 && vidaPokemon1 > 0) {
                    
                    System.out.println(peleaPokemon.get(0).getNombre() + " " + vidaPokemon0 + "HP");
                    System.out.println(entrenadores.get(0).getNombre_entrenador() + " elige un ataque: ");
                    peleaPokemon.get(0).mostrarAtaques();
                    int ataqueElegido0 = sc.nextInt();
                    sc.nextLine();
                    Ataque ataque0 = peleaPokemon.get(0).getAtaques().get(ataqueElegido0 - 1);
                    System.out.println(peleaPokemon.get(0).getNombre() + " ha usado " + ataque0.getNombreAtaque());
                    if(peleaPokemon.get(0).getTipo() == peleaPokemon.get(1).getCounter()){
                        vidaPokemon1 -= ataque0.getPotencia() + (ataque0.getPotencia() * 0.3);
                    }
                    else {
                        vidaPokemon1 -= ataque0.getPotencia();
                    }
                    
                    System.out.println(peleaPokemon.get(1).getNombre() + " ha recibido " + ataque0.getPotencia());

                    if (vidaPokemon1 <= 0) {
                        System.out.println(peleaPokemon.get(1).getNombre() + " ha caído!");
                        break;
                    } else {
                        System.out.println("Vida restante: " + vidaPokemon1);
                    }
                    

                    System.out.println(peleaPokemon.get(1).getNombre() + " " + vidaPokemon1 + "HP");
                    System.out.println(entrenadores.get(1).getNombre_entrenador() + " elige un ataque: ");
                    peleaPokemon.get(1).mostrarAtaques();
                    int ataqueElegido1 = sc.nextInt();
                    sc.nextLine();
                    Ataque ataque1 = peleaPokemon.get(1).getAtaques().get(ataqueElegido1 - 1);
                    System.out.println(peleaPokemon.get(1).getNombre() + " ha usado " + ataque1.getNombreAtaque());
                    if (peleaPokemon.get(1).getTipo() == peleaPokemon.get(0).getCounter()){
                        vidaPokemon0 -= ataque1.getPotencia() + (ataque1.getPotencia() * 0.3);
                    }
                    else {
                        vidaPokemon0 -= ataque1.getPotencia();
                    }

                    System.out.println(peleaPokemon.get(0).getNombre() + " ha recibido " + ataque1.getPotencia());
                    if (vidaPokemon0 <= 0) {
                        System.out.println(peleaPokemon.get(0).getNombre() + " ha caído!");
                        break;
                    } else {
                        System.out.println("Vida restante: " + vidaPokemon0);
                    }
                }
            }
            else if (vidaPokemon0 > vidaPokemon1) {
                System.out.println(entrenadores.get(1).getNombre_entrenador() + " Tiene el primer turno ");
                while (vidaPokemon0 > 0 && vidaPokemon1 > 0) {
                        
                    System.out.println(peleaPokemon.get(1).getNombre() + " " + vidaPokemon1 + "HP");
                    System.out.println(entrenadores.get(1).getNombre_entrenador() + " elige un ataque: ");
                    peleaPokemon.get(1).mostrarAtaques();
                    int ataqueElegido0 = sc.nextInt();
                    sc.nextLine();
                    Ataque ataque0 = peleaPokemon.get(1).getAtaques().get(ataqueElegido0 - 1);
                    System.out.println(peleaPokemon.get(1).getNombre() + " ha usado " + ataque0.getNombreAtaque());
                    if (peleaPokemon.get(1).getTipo() == peleaPokemon.get(0).getCounter()){
                        vidaPokemon0 -= ataque0.getPotencia() + (ataque0.getPotencia() * 0.3);
                        System.out.println(peleaPokemon.get(0).getNombre() + " ha recibido " + (ataque0.getPotencia() + (ataque0.getPotencia() * 0.3)));
                    }
                    else {
                        vidaPokemon0 -= ataque0.getPotencia();
                        System.out.println(peleaPokemon.get(0).getNombre() + " ha recibido " + ataque0.getPotencia());
                    }
    
                    if (vidaPokemon0 <= 0) {
                        System.out.println(peleaPokemon.get(1).getNombre() + " ha caído!");
                        break;
                    } else {
                        System.out.println("Vida restante: " + vidaPokemon0);
                    }
                        
    
                    System.out.println(peleaPokemon.get(0).getNombre() + " " + vidaPokemon0 + "HP");
                    System.out.println(entrenadores.get(0).getNombre_entrenador() + " elige un ataque: ");
                    peleaPokemon.get(0).mostrarAtaques();
                    int ataqueElegido1 = sc.nextInt();
                    sc.nextLine();
                    Ataque ataque1 = peleaPokemon.get(0).getAtaques().get(ataqueElegido1 - 1);
                    System.out.println(peleaPokemon.get(0).getNombre() + " ha usado " + ataque1.getNombreAtaque());
                    if (peleaPokemon.get(0).getTipo() == peleaPokemon.get(1).getCounter()){
                        vidaPokemon1 -= ataque1.getPotencia() + (ataque1.getPotencia() * 0.3);
                        System.out.println(peleaPokemon.get(1).getNombre() + " ha recibido " + (ataque1.getPotencia() + (ataque1.getPotencia() * 0.3)));
                    }
                    else {
                        vidaPokemon1 -= ataque1.getPotencia();
                        System.out.println(peleaPokemon.get(1).getNombre() + " ha recibido " + ataque1.getPotencia());
                    }

                    if (vidaPokemon1 <= 0) {
                        System.out.println(peleaPokemon.get(1).getNombre() + " ha caído!");
                        break;
                    } else {
                        System.out.println("Vida restante: " + vidaPokemon1);
                    }
            }
        } 
    }
}
}
