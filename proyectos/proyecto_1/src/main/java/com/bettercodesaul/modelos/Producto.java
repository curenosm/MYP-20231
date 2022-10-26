package com.bettercodesaul.modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que simula un producto. Implementa las interfaces Cloneable y Serializable
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Getter
@Setter
public class Producto implements Cloneable, Serializable {

  private Long codigoBarras;
  private String nombre;
  private String departamento;
  private BigDecimal precio;

  /**
   * Metodo constructor parametros de la clase con
   *
   * @param codigoBarras codigo de barras que identifica al producto
   * @param nombre nombre del producto
   * @param departamento departamento al que pertenece el producto
   * @param precio precio del producto
   */
  public Producto(Long codigoBarras, String nombre, String departamento, BigDecimal precio) {
    this.codigoBarras = codigoBarras;
    this.nombre = nombre;
    this.departamento = departamento;
    this.precio = precio;
  }

  /**
   * Metodo que devuelve una copia del producto
   *
   * @return Object
   */
  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone(); // devuelve una copia superficial
  }

  /**
   * Metodo que representa en cadena a una instancia de la clase
   *
   * @return String
   */
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
