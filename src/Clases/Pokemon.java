package Clases;
import java.util.ArrayList;
import Enums.TiposPokemon;

public class Pokemon {
    private String nombre;
    private ArrayList<Ataque> ataques;
    private TiposPokemon tipo;
    private short vida;
    private byte contadorataques = 0;

    
    public Pokemon(String nombre, TiposPokemon tipo, short vida) {
        this.nombre = nombre;
        this.ataques = new ArrayList<Ataque>();
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
    public void addAtaque(Ataque ataque) {
        if (ataques == null || contadorataques < 4) {
            ataques.add(ataque);
            contadorataques++;
        } else {
            System.out.println("No se pueden agregar más ataques.");
        }
    }
    public ArrayList<Ataque> getAtaques() {
        return ataques;
    }

    public void mostarAtaques() {
        for (Ataque ataque : ataques) {
            System.out.println("Nombre: " + ataque.getNombreAtaque() + ", Potencia: " + ataque.getPotencia() + ", Tipo: " + ataque.getTipoAtaque() + ", Tipo de Daño: " + ataque.getTipoDano());
        }
    }

    
}
