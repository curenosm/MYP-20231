package main.java.p04.modelos.armas;
import java.math.BigDecimal;

import main.java.p04.modelos.Componente;

public abstract class Arma implements Componente{
    protected BigDecimal precio;
    protected String descripcion;
    protected String nombre;

}
