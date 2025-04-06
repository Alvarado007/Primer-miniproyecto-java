package Clases;
import java.lang.reflect.Array;
import java.util.ArrayList;

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

    static public ArrayList<Ataque> getAtaques() {
        ArrayList<Ataque> ataques = new ArrayList<Ataque>();
        Ataque ataque1 = new Ataque("Rayo", TipoDano.Fisico, (short) 50, TiposPokemon.ELECTRICO);
        Ataque ataque2 = new Ataque("Llamarada", TipoDano.Fisico, (short) 60, TiposPokemon.FUEGO);
        Ataque ataque3 = new Ataque("Burbuja", TipoDano.Fisico, (short) 40, TiposPokemon.AGUA);
        Ataque ataque4 = new Ataque("Confusion", TipoDano.Fisico, (short) 55, TiposPokemon.PSIQUICO);
        
        ataques.add(ataque1);
        ataques.add(ataque2);
        ataques.add(ataque3);
        ataques.add(ataque4);
        
        return ataques;
    }

}
