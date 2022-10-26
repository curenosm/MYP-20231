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

  /**
   * Metodo para obtener el valor del atributo producto
   *
   * @return Producto
   */
  public Producto getProducto() {
    return producto;
  }

  /**
   * Metodo para modificar el valor del atributo producto
   *
   * @param producto Instancia de la clase Producto
   */
  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  /**
   * Metodo para obtener el procentaje del descuento
   *
   * @return BigDecimal
   */
  public BigDecimal getPorcentajeDescuento() {
    return porcentajeDescuento;
  }

  /**
   * Metodo para modificar el valor del atributo porcentajeDescuento
   *
   * @param porcentajeDescuento nuevo valor del atributo (BigDecimal)
   */
  public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
    this.porcentajeDescuento = porcentajeDescuento;
  }

  /**
   * Metodo para obtener el valor del aributo codigoPaisOferta
   *
   * @return String
   */
  public String getCodigoPaisOferta() {
    return codigoPaisOferta;
  }

  /**
   * Metodo para modificar el valor del atributo codigoPaisOferta
   *
   * @param codigoPaisOferta nuevo valor del atributo
   */
  public void setCodigoPaisOferta(String codigoPaisOferta) {
    this.codigoPaisOferta = codigoPaisOferta;
  }

  /**
   * Metodo para obtener el valor del atributo validaHasta
   *
   * @return Date
   */
  public Date getValidaHasta() {
    return validaHasta;
  }

  /**
   * Metodo para modificar el valor del atributo validaHasta
   *
   * @param validaHasta Instancia de la clase Date que sera el nuevo valor
   */
  public void setValidaHasta(Date validaHasta) {
    this.validaHasta = validaHasta;
  }

  /**
   * Metodo para obtener el valor del atributo id
   *
   * @return Long
   */
  public Long getId() {
    return id;
  }

  /**
   * Metodo para modificar el valor del atributo id
   *
   * @param id Long que sera el nuevo valor
   */
  public void setId(Long id) {
    this.id = id;
  }
}
