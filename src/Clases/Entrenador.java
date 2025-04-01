package Clases;

import java.util.ArrayList;

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

    public Pokemon elegirPokemonBatalla() {
        return null;
    }

    public void mostrarEquipo() {
        for (Pokemon pokemon : equipo_entrenador) {
            System.out.println("Nombre: " + pokemon.getNombre());
        }
    }


}
