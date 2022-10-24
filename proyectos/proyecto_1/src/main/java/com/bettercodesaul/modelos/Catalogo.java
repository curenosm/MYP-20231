package com.bettercodesaul.modelos;

import java.math.BigDecimal;
import java.util.List;

public class Catalogo {
  private List<Producto> alimentos;
  private List<Producto> electronica;
  private List<Producto> electrodomesticos;

  public Catalogo() {
    this.alimentos =
        List.of(
            new Producto("001", "Cereal Niescuick", "Alimentos", new BigDecimal(30.45)),
            new Producto("002", "Duraznos en Almibar", "Alimentos", new BigDecimal(60.77)),
            new Producto("003", "Galletas Orio", "Alimentos", new BigDecimal(28.87)),
            new Producto("004", "Salsa Chihuahua", "Alimentos", new BigDecimal(11.25)),
            new Producto("005", "Pan de Morido gde", "Alimentos", new BigDecimal(113.13)));

    this.electronica =
        List.of(
            new Producto("010", "Celular Juawei", "Electronica", new BigDecimal(7898.55)),
            new Producto("020", "Laptop Cell", "Electronica", new BigDecimal(11999.99)),
            new Producto("030", "Audifonos Noisy", "Electronica", new BigDecimal(443.22)),
            new Producto("040", "Bateria Portatil", "Electronica", new BigDecimal(230.30)),
            new Producto("050", "Mouse Gamer Pro", "ELectronica", new BigDecimal(558.18)));

    this.electrodomesticos =
        List.of(
            new Producto("100", "Tostadora Coster", "Electrodomesticos", new BigDecimal(777.77)),
            new Producto("200", "Licuadora Master3000", "Electrodomesticos", new BigDecimal(850.5)),
            new Producto("300", "Sandwichera Guirpul", "Electrodomesticos", new BigDecimal(657.72)),
            new Producto("400", "Microondas Cooler", "Electrodomesticos", new BigDecimal(1090.45)),
            new Producto(
                "500", "Refrigerador Hieloco", "Electrodomesticos", new BigDecimal(3700.36)));
  }

  public List<Producto> getAlimentos() {
    return this.alimentos;
  }

  public List<Producto> getELectronica() {
    return this.electronica;
  }

  public List<Producto> getElectrodomesticos() {
    return this.electrodomesticos;
  }

  public Producto obtenerProducto(String codigoBarras) {
    try {
      for (Producto producto : this.alimentos) {
        if (producto.getCodigoBarras().equals(codigoBarras)) {
          return (Producto) producto.clone();
        }
      }

      for (Producto producto : this.electronica) {
        if (producto.getCodigoBarras().equals(codigoBarras)) {
          return (Producto) producto.clone();
        }
      }

      for (Producto producto : this.electrodomesticos) {
        if (producto.getCodigoBarras().equals(codigoBarras)) {
          return (Producto) producto.clone();
        }
      }
    } catch (CloneNotSupportedException e) {
      return null;
    }

    return null;
  }

  public String mostrarDepartamento(List<Producto> departamento) {
    String s = "";

    for (Producto producto : departamento) {
      s += producto.toString();
    }

    return s;
  }

  public String mostrarCatalogo() {
    String s = "";

    s = mostrarDepartamento(this.alimentos);
    s += "-----------------------------------\n";
    s += mostrarDepartamento(this.electrodomesticos);
    s += "-----------------------------------\n";
    s += mostrarDepartamento(this.electronica);
  }
}
