
<h2 align="left">Hi 👋! My name is Samuel and I'm a Systems Engineer from Colombia</h2>

###

<div align="center">
  <img src="https://github-readme-stats.vercel.app/api/pin/?username=Alvarado007&repo=Primer-miniproyecto-java&theme=dracula" height="150" alt="project stats" />
</div>

###

<img align="right" height="150" src="https://i.gifer.com/origin/7d/7dab25c7b14a249bbc4790176883d1c5_w200.gif?cid=6c09b952llhupk66joic0ml8gbch148n2dfdqsvzj7z7f0em&ep=v1_gifs_search&rid=200w.gif&ct=g"  />

###

<div align="left">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="30" alt="java logo" />
  <img width="12" />
  <img src="https://skillicons.dev/icons?i=vscode" height="30" alt="vscode logo" />
</div>

###
## 📦 Proyecto: Simulador de Batallas Pokémon
Este proyecto es una simulación de combates entre Pokémon utilizando Java. El sistema permite que entrenadores elijan y enfrenten Pokémon con distintos ataques y tipos (agua, fuego, psíquico y eléctrico).

### ✨ Características:
- Simulación por consola de batallas entre Pokémon.
- Sistema de ataques con nombre, poder y tipo.
- Clases bien estructuradas: `Entrenador`, `Pokemon`, `Ataque`, `Visualizacion`.

### 📊 Relación entre Clases
```mermaid
classDiagram
    class SerVivo {
        <<abstract>>
        + felicidad() : void
        + tristeza() : void
    }

    class Entrenador {
        - nombre : String
        - equipo_pokemon : ArrayList<Pokemon>
        - contador_pokemones : int
        + getNombre_entrenador()
        + getEquipo_entrenador()
        + Entrenador()  // Constructor
        + agregarPokemonEquipo(Scanner sc)
        + elegirPokemonBatallaManual(Scanner sc)
        + elegirPokemonBatallaAutomatico(Scanner sc)
        + agregraAtaquesPokemonesAutomatico(Scanner sc)
        + agregarAtaquePokemonManual(Scanner sc)
        + mostrarEquipo(Scanner sc)
        + felicidad() : void
        + tristeza() : void
    }

    class Pokemon {
        - nombre : String
        - tipo : TiposPokemon
        - ataques : ArrayList<Ataque>
        - vida : short
        - contadorataques : int
        - counter : TiposPokemon
        + Pokemon(String nombre, TiposPokemon tipo, short vida, TiposPokemon counter)
        + getNombre()
        + setNombre(String nombre)
        + getTipo()
        + setTipo(TiposPokemon tipo)
        + getVida()
        + setVida(short vida)
        + getCounter()
        + setCounter(TiposPokemon counter)
        + addAtaque(Ataque ataque)
        + getAtaques()
        + mostrarAtaques()
    }

    class Ataque {
        - nombreAtaque : String
        - tipodano : TipoDano
        - potencia : short
        - tipoAtaque : TiposPokemon
        + Ataque(String nombreAtaque, TipoDano tipoDano, short potencia, TiposPokemon tipoAtaque)
        + getNombreAtaque()
        + setNombreAtaque(String nombreAtaque)
        + getTipoDano()
        + setTipoDano(TipoDano tipoDano)
        + getPotencia()
        + setPotencia(byte potencia)
        + getTipoAtaque()
        + setTipoAtaque(TiposPokemon tipoAtaque)
        + getAtaques() : static
    }

    class Visualizacion {
        + iniciarJuego(Scanner sc)
        + agregar_pokemon(Scanner sc)
        + batalla(Scanner sc)
    }

    SerVivo <|-- Entrenador
    Entrenador "1" --> "*" Pokemon
    Pokemon "1" --> "*" Ataque
    Visualizacion --> Entrenador

```
###
<img align="right" height="150" src="https://i.pinimg.com/originals/4e/fe/e1/4efee18cb06f3d2f8456a40d1e0460e7.gif?cid=6c09b952llhupk66joic0ml8gbch148n2dfdqsvzj7z7f0em&ep=v1_gifs_search&rid=200w.gif&ct=g"  />

###

### 🛠️ Tecnologías
- Java ☕
- Visual Studio Code 💻

### 🚀 Cómo Ejecutar
1. Clona el repositorio:
```bash
git clone https://github.com/Alvarado007/Primer-miniproyecto-java.git
```
2. Abre el proyecto en tu IDE favorito.
3. Asegúrate de tener Java instalado (Java 8+).
4. Ejecuta la clase `Main` (por implementar) o una clase de prueba que cree entrenadores y pokémon para simular batallas.

### 👥 Autores
- Samuel Alvarado – [GitHub](https://github.com/Alvarado007) 202459469
- Santiago Arboleda – [GitHub](https://github.com/SantiagoA0408) 202459463
- Juan Manuel Gómez – [GitHub](https://github.com/JuanManuelG26706) 202459450

### 📬 Contacto
Si quieres mejorar este proyecto o darme sugerencias, no dudes en escribirme.

<div align="left">
  <img src="https://img.shields.io/static/v1?message=Gmail&logo=gmail&label=&color=D14836&logoColor=white&labelColor=&style=for-the-badge" height="35" alt="gmail logo"  />
  <img src="https://img.shields.io/static/v1?message=LinkedIn&logo=linkedin&label=&color=0077B5&logoColor=white&labelColor=&style=for-the-badge" height="35" alt="linkedin logo"  />
</div>

---

> Este es un proyecto académico con potencial para expandirse a una app con interfaz gráfica y lógica más compleja para torneos, niveles y más estrategia.
