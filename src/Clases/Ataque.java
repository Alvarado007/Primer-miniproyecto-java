package Clases;
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
        Ataque ataque5 = new Ataque("Chispa", TipoDano.Fisico, (short) 40, TiposPokemon.ELECTRICO);
        Ataque ataque6 = new Ataque("Electrocañón", TipoDano.Fisico, (short) 85, TiposPokemon.ELECTRICO);
        Ataque ataque7 = new Ataque("Descarga", TipoDano.Fisico, (short) 70, TiposPokemon.ELECTRICO);
        Ataque ataque8 = new Ataque("Rayo Voltio", TipoDano.Fisico, (short) 65, TiposPokemon.ELECTRICO);
        Ataque ataque9 = new Ataque("Carga Salvaje", TipoDano.Fisico, (short) 90, TiposPokemon.ELECTRICO);
        Ataque ataque10 = new Ataque("Chispa Rápida", TipoDano.Fisico, (short) 30, TiposPokemon.ELECTRICO);
        Ataque ataque11 = new Ataque("Lanzallamas", TipoDano.Fisico, (short) 80, TiposPokemon.FUEGO);
        Ataque ataque12 = new Ataque("Giro Fuego", TipoDano.Fisico, (short) 35, TiposPokemon.FUEGO);
        Ataque ataque13 = new Ataque("Fuego Fatuo", TipoDano.Fisico, (short) 40, TiposPokemon.FUEGO);
        Ataque ataque14 = new Ataque("Rueda Fuego", TipoDano.Fisico, (short) 60, TiposPokemon.FUEGO);
        Ataque ataque15 = new Ataque("Colmillo Ígneo", TipoDano.Fisico, (short) 65, TiposPokemon.FUEGO);
        Ataque ataque16 = new Ataque("Llama Ardiente", TipoDano.Fisico, (short) 70, TiposPokemon.FUEGO);
        Ataque ataque17 = new Ataque("Pistola Agua", TipoDano.Fisico, (short) 40, TiposPokemon.AGUA);
        Ataque ataque18 = new Ataque("Hidropulso", TipoDano.Fisico, (short) 60, TiposPokemon.AGUA);
        Ataque ataque19 = new Ataque("Surf", TipoDano.Fisico, (short) 80, TiposPokemon.AGUA);
        Ataque ataque20 = new Ataque("Aqua Cola", TipoDano.Fisico, (short) 75, TiposPokemon.AGUA);
        Ataque ataque21 = new Ataque("Torrente", TipoDano.Fisico, (short) 90, TiposPokemon.AGUA);
        Ataque ataque22 = new Ataque("Aqua Impacto", TipoDano.Fisico, (short) 65, TiposPokemon.AGUA);
        Ataque ataque23 = new Ataque("Psicocorte", TipoDano.Fisico, (short) 70, TiposPokemon.PSIQUICO);
        Ataque ataque24 = new Ataque("Onda Mental", TipoDano.Fisico, (short) 60, TiposPokemon.PSIQUICO);
        Ataque ataque25 = new Ataque("Psico Golpe", TipoDano.Fisico, (short) 75, TiposPokemon.PSIQUICO);
        Ataque ataque26 = new Ataque("Confusión", TipoDano.Fisico, (short) 50, TiposPokemon.PSIQUICO);
        Ataque ataque27 = new Ataque("Cabeza Zen", TipoDano.Fisico, (short) 65, TiposPokemon.PSIQUICO);
        Ataque ataque28 = new Ataque("Corte Mental", TipoDano.Fisico, (short) 80, TiposPokemon.PSIQUICO);
        Ataque ataque29 = new Ataque("Trueno Cortante", TipoDano.Fisico, (short) 85, TiposPokemon.ELECTRICO);
        Ataque ataque30 = new Ataque("Explosión Ígnea", TipoDano.Fisico, (short) 95, TiposPokemon.FUEGO);
        Ataque ataque31 = new Ataque("Ráfaga Psíquica", TipoDano.Fisico, (short) 90, TiposPokemon.PSIQUICO);
        Ataque ataque32 = new Ataque("Tsunami", TipoDano.Fisico, (short) 100, TiposPokemon.AGUA);
        Ataque ataque33 = new Ataque("Tormenta Eléctrica", TipoDano.Fisico, (short) 95, TiposPokemon.ELECTRICO);
        Ataque ataque34 = new Ataque("Explosión de Vapor", TipoDano.Fisico, (short) 85, TiposPokemon.AGUA);

        ataques.add(ataque1);
        ataques.add(ataque2);
        ataques.add(ataque3);
        ataques.add(ataque4);
        ataques.add(ataque5);
        ataques.add(ataque6);
        ataques.add(ataque7);
        ataques.add(ataque8);
        ataques.add(ataque9);
        ataques.add(ataque10);
        ataques.add(ataque11);
        ataques.add(ataque12);
        ataques.add(ataque13);
        ataques.add(ataque14);
        ataques.add(ataque15);
        ataques.add(ataque16);
        ataques.add(ataque17);
        ataques.add(ataque18);
        ataques.add(ataque19);
        ataques.add(ataque20);
        ataques.add(ataque21);
        ataques.add(ataque22);
        ataques.add(ataque23);
        ataques.add(ataque24);
        ataques.add(ataque25);
        ataques.add(ataque26);
        ataques.add(ataque27);
        ataques.add(ataque28);
        ataques.add(ataque29);
        ataques.add(ataque30);
        ataques.add(ataque31);
        ataques.add(ataque32);
        ataques.add(ataque33);
        ataques.add(ataque34);
        
        return ataques;
    }

}
