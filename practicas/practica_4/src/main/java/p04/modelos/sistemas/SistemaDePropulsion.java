package main.java.p04.modelos.sistemas;
import java.math.BigDecimal;

import main.java.p04.modelos.Componente;

public abstract class SistemaDePropulsion implements Componente{
    protected BigDecimal precio;
    protected String descripcion;
    protected String nombre;
}