package com.bettercodesaul.generadores;

import static com.bettercodesaul.generadores.GeneradorComponentes.*;

import com.bettercodesaul.modelos.barcos.*;

/**
 * Clase que se encarga de generar los diferentes tipos de enemigos
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class GeneradorEnemigos {

  public GeneradorEnemigos() {}

  /**
   * Metodo que generar una Instancia de la clase Submarino
   * @return Nave
   */
  public static Nave generarSubmarino() {
    Nave submarino = new Submarino(generarArma(), generarBlindaje(), generarEmblema());
    return submarino;
  }

   /**
   * Metodo que generar una Instancia de la clase Acorazado
   * @return Nave
   */
  public static Nave generarAcorazado() {
    Nave acorazado = new Acorazado(generarArma(), generarBlindaje(), generarEmblema());
    return acorazado;
  }

   /**
   * Metodo que generar una Instancia de la clase PortaAviones
   * @return Nave
   */
  public static Nave generarPortaAviones() {
    Nave portaAviones = new PortaAviones(generarArma(), generarBlindaje(), generarEmblema());
    return portaAviones;
  }
}
