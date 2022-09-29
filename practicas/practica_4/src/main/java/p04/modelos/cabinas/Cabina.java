package main.java.p04.modelos.cabinas;
import java.math.BigDecimal;

import main.java.p04.modelos.Componente;

public abstract class Cabina implements Componente{
    protected BigDecimal precio;
    protected String descripcion;
    protected String nombre;
}