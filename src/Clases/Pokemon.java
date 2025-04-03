package Clases;
import java.util.ArrayList;

import Enums.TipoDano;
import Enums.TiposPokemon;

public class Pokemon {
    private String nombre;
    private ArrayList<Ataque> ataques;
    private TiposPokemon tipo;
    private short vida;
    private byte ataque;

    
    public Pokemon(String nombre, TiposPokemon tipo, short vida, byte ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.ataque = ataque;
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
    public byte getAtaque() {
        return ataque;
    }
    public void setAtaque(byte ataque) {
        this.ataque = ataque;
    }
    public void addAtaque() {
        if (ataques.size() < 4) {
            Ataque ataque = new Ataque("Ataque" , TipoDano.Fisico, (short) 10,this.tipo);
            ataques.add(ataque);
        } else {
            System.out.println("No se pueden agregar más ataques.");
        }
    }
    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    
}
