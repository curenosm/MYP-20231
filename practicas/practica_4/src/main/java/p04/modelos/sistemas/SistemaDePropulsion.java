package main.java.p04.modelos.sistemas;
import java.math.BigDecimal;

import main.java.p04.modelos.Componente;

/**
 *Clase abstracta que representa el sistema de propulsion de una nave. Implementa la interfaz Componente.
 *@author Alcantara Estrada Kevin Isaac
 *@author Curenio Sanchez Misael
 *@author Hernandez Paramo ELizabeth
 */
public abstract class SistemaDePropulsion implements Componente{
    protected BigDecimal precio;
    protected String descripcion;
    protected String nombre;
}