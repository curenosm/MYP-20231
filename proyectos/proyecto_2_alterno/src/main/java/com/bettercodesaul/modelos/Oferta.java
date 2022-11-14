package com.bettercodesaul.modelos;

import static com.bettercodesaul.util.Constantes.generarID;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que simula una oferta en los productos
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Getter
@Setter
public class Oferta {

  private Long id;
  private Producto producto;
  private BigDecimal porcentajeDescuento;
  private String codigoPaisOferta;
  private Date validaHasta;

  /**
   * Constructor sin parametros de la clase
   *
   * @throws InterruptedException
   */
  public Oferta() throws InterruptedException {
    this.id = generarID();
  }

  /**
   * Constructor con parametros de la clase
   *
   * @param id Long
   * @param producto instancia de la clase Producto
   * @param porcentajeDescuento instancia de la clase BigDecimal
   * @param codigoPaisOferta String
   * @param validaHasta instancia de la clase Date
   * @throws InterruptedException
   */
  public Oferta(
      Long id,
      Producto producto,
      BigDecimal porcentajeDescuento,
      String codigoPaisOferta,
      Date validaHasta)
      throws InterruptedException {
    this.id = generarID();
    this.producto = producto;
    this.porcentajeDescuento = porcentajeDescuento;
    this.codigoPaisOferta = codigoPaisOferta;
    this.validaHasta = validaHasta;
  }

  @Override
  public String toString() {

    return "Oferta [producto="
        + producto.getNombre()
        + ", descuento="
        + porcentajeDescuento
        + ", validez="
        + validaHasta
        + "]";
  }
}
