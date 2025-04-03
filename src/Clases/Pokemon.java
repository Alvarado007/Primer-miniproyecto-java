package Clases;
import java.util.ArrayList;

import Enums.TipoDano;
import Enums.TiposPokemon;

public class Pokemon {
    private String nombre;
    private ArrayList<Ataque> ataques;
    private TiposPokemon tipo;
    private short vida;

    
    public Pokemon(String nombre, TiposPokemon tipo, short vida) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TiposPokemon getTipo() {
        return tipo;
    }
    public void setTipo(TiposPokemon tipo) {
        this.tipo = tipo;
    }
    public short getVida() {
        return vida;
    }
    public void setVida(short vida) {
        this.vida = vida;
    }
    public void addAtaque() {
        if (ataques.size() < 4) {
            Ataque ataque = new Ataque("NombreAtaque", TipoDano.Fisico, (short) 50, TiposPokemon.FUEGO);
            ataques.add(ataque);
        } else {
            System.out.println("No se pueden agregar más ataques.");
        }
    }
    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    
}
