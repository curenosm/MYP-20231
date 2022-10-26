package com.bettercodesaul.modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto implements Cloneable, Serializable {

  private Long codigoBarras;
  private String nombre;
  private String departamento;
  private BigDecimal precio;

  public Producto(Long codigoBarras, String nombre, String departamento, BigDecimal precio) {
    this.codigoBarras = codigoBarras;
    this.nombre = nombre;
    this.departamento = departamento;
    this.precio = precio;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone(); // devuelve una copia superficial
  }

  @Override
  public String toString() {
    return "\nCodigo de barras: "
        + this.codigoBarras
        + "\n"
        + "Nombre producto: "
        + this.nombre
        + "\n"
        + "Departamento "
        + this.departamento
        + "\n"
        + this.precio
        + "\n\n";
  }
}
