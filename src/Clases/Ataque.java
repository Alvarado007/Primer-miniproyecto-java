package Clases;
import Enums.TipoDano;
import Enums.TiposPokemon;

public class Ataque {
    private String nombreAtaque;
    private TipoDano tipoDano;
    private short potencia;
    private TiposPokemon tipoAtaque;
    
    public Ataque(String nombreAtaque, TipoDano tipoDano, short potencia, TiposPokemon tipoAtaque) {
        this.nombreAtaque = nombreAtaque;
        this.tipoDano = tipoDano;
        this.potencia = potencia;
        this.tipoAtaque = tipoAtaque;
    }

    public String getNombreAtaque() {
        return nombreAtaque;
    }

    public void setNombreAtaque(String nombreAtaque) {
        this.nombreAtaque = nombreAtaque;
    }

    public TipoDano getTipoDano() {
        return tipoDano;
    }

    public void setTipoDano(TipoDano tipoDano) {
        this.tipoDano = tipoDano;
    }

    public short getPotencia() {
        return potencia;
    }

    public void setPotencia(byte potencia) {
        this.potencia = potencia;
    }

    public TiposPokemon getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(TiposPokemon tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

}
