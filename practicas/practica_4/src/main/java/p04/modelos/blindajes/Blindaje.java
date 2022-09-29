package main.java.p04.modelos.blindajes;

import java.math.BigDecimal;

import main.java.p04.modelos.Componente;

public abstract class Blindaje implements Componente{
    protected BigDecimal precio;
    protected String descripcion;
    protected String nombre;
}
