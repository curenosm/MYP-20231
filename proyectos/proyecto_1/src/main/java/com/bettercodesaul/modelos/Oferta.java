package com.bettercodesaul.modelos;

import static com.bettercodesaul.util.Constantes.generarID;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
