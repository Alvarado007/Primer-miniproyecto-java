import Enums.TiposPokemon;

public class Pokemon {
    private String nombre;
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

    
}
