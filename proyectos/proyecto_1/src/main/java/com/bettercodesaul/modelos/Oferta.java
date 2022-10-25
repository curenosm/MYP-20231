package com.bettercodesaul.modelos;

import static com.bettercodesaul.util.Constantes.generarID;

import java.math.BigDecimal;
import java.util.Date;

public class Oferta {

  private Long id;
  private Producto producto;
  private BigDecimal porcentajeDescuento;
  private String codigoPaisOferta;
  private Date validaHasta;

  public Oferta() throws InterruptedException {
    this.id = generarID();
  }

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

  public Producto getProducto() {
    return producto;
  }

  public void setProducto(Producto producto) {
    this.producto = producto;
  }

  public BigDecimal getPorcentajeDescuento() {
    return porcentajeDescuento;
  }

  public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
    this.porcentajeDescuento = porcentajeDescuento;
  }

  public String getCodigoPaisOferta() {
    return codigoPaisOferta;
  }

  public void setCodigoPaisOferta(String codigoPaisOferta) {
    this.codigoPaisOferta = codigoPaisOferta;
  }

  public Date getValidaHasta() {
    return validaHasta;
  }

  public void setValidaHasta(Date validaHasta) {
    this.validaHasta = validaHasta;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
