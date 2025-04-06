package Clases;

import java.util.ArrayList;
import java.util.Scanner;

import Enums.TiposPokemon;

public class Entrenador {
    private String nombre_entrenador;
    private ArrayList<Pokemon> equipo_entrenador;
    static int contador_pokemones = 0;


    public String getNombre_entrenador() {
        return nombre_entrenador;
    }
    
    public ArrayList<Pokemon> getEquipo_entrenador() {
        return equipo_entrenador;
    }

    public Entrenador(String nombre_entrenador) {
        this.nombre_entrenador = nombre_entrenador;
        this.equipo_entrenador = new ArrayList<Pokemon>();
    }

    public void agregarPokemonEquipo(Pokemon pokemon) {
        if(contador_pokemones < 3) {
            equipo_entrenador.add(pokemon);
            contador_pokemones++;
        }
        else {
            System.out.println("No se pueden agregar más pokemones al equipo.");
        }

    }

    public void elegirPokemonBatallaManual(Scanner sc) {
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
                    agregarPokemonEquipo(pokemon);
                    break;
                } else {
                    System.out.println("La vida debe ser mayor a 0.");
                }
            }
        }
    }

    public void elegirPokemonBatallaAutomatico() {
        ArrayList<Pokemon> pokemones = new ArrayList<>();
            pokemones.add(new Pokemon("Pikachu", TiposPokemon.ELECTRICO, (short)100));
            pokemones.add(new Pokemon("Charmander", TiposPokemon.FUEGO,(short)120));
            pokemones.add(new Pokemon("Squirtle", TiposPokemon.AGUA, (short)110));
            pokemones.add(new Pokemon("Psyduck", TiposPokemon.PSIQUICO,(short) 90));
            pokemones.add(new Pokemon("Bulbasaur", TiposPokemon.AGUA, (short)130));
            pokemones.add(new Pokemon("Jigglypuff", TiposPokemon.PSIQUICO, (short)80));
            pokemones.add(new Pokemon("Meowth", TiposPokemon.ELECTRICO, (short)140));
            pokemones.add(new Pokemon("Snorlax", TiposPokemon.FUEGO, (short)150));
            pokemones.add(new Pokemon("Eevee", TiposPokemon.AGUA, (short)160));
            pokemones.add(new Pokemon("Mewtwo", TiposPokemon.PSIQUICO, (short)170));
            pokemones.add(new Pokemon("Gengar", TiposPokemon.ELECTRICO, (short)180));
            pokemones.add(new Pokemon("Charizard", TiposPokemon.FUEGO, (short)190));
            pokemones.add(new Pokemon("Blastoise", TiposPokemon.AGUA, (short)200));
            pokemones.add(new Pokemon("Alakazam", TiposPokemon.PSIQUICO, (short)200));
            pokemones.add(new Pokemon("Raichu", TiposPokemon.ELECTRICO, (short)180));
            pokemones.add(new Pokemon("Arcanine", TiposPokemon.FUEGO, (short)200));
            for (int i=0; i<3; i++){
                int randomIndex = (int) (Math.random() * pokemones.size());
                Pokemon pokemon = pokemones.get(randomIndex);
                agregarPokemonEquipo(pokemon);
                pokemones.remove(randomIndex);
            }
        }
    public void mostrarEquipo() {
        for (Pokemon pokemon : equipo_entrenador) {
            System.out.println("Nombre: " + pokemon.getNombre());
        }
    }


}
