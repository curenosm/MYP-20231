package com.bettercodesaul.modelos;

import java.math.BigDecimal;

public class Producto implements Cloneable {

  private String codigoBarras;
  private String nombre;
  private String departamento;
  private BigDecimal precio;

  public Producto(String codigoBarras, String nombre, String departamento, BigDecimal precio) {
    this.codigoBarras = codigoBarras;
    this.nombre = nombre;
    this.departamento = departamento;
    this.precio = precio;
  }

  public String getCodigoBarras() {
    return this.codigoBarras;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getDepartamento() {
    return this.departamento;
  }

  public BigDecimal getPrecio() {
    return this.precio;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone(); // devuelve una copia superficial
  }

  @Override
  public String toString() {
    return "Codigo de barras: "
        + this.codigoBarras
        + "\n"
        + "Nombre producto: "
        + this.nombre
        + "\n"
        + "Departamento "
        + this.departamento
        + "\n"
        + this.precio
        + "\n";
  }
}
