package Clases;
import Enums.TipoDano;

public class Ataque {
    private String nombre;
    private TipoDano tipo;
    private short potencia;
    
    public Ataque(String nombre, TipoDano tipo, short potencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoDano getTipo() {
        return tipo;
    }

    public void setTipo(TipoDano tipo) {
        this.tipo = tipo;
    }

    public short getPotencia() {
        return potencia;
    }

    public void setPotencia(byte potencia) {
        this.potencia = potencia;
    }

    
}
