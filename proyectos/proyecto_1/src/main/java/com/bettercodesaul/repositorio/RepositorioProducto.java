package com.bettercodesaul.repositorio;

import com.bettercodesaul.modelos.Producto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioProducto implements Repositorio<Producto> {

  private static volatile RepositorioProducto uniqueInstance;
  private static List<Producto> productos;

  public static RepositorioProducto getInstance() {

    if (uniqueInstance == null) {
      synchronized (RepositorioUsuario.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new RepositorioProducto();
        }
      }
    }

    return uniqueInstance;
  }

  private RepositorioProducto() {
    try {
      productos =
          List.of(
              new Producto(1L, "Cereal Niescuick", "Alimentos", new BigDecimal("30.45")),
              new Producto(2L, "Duraznos en Almibar", "Alimentos", new BigDecimal("60.77")),
              new Producto(3L, "Galletas Orio", "Alimentos", new BigDecimal("28.87")),
              new Producto(4L, "Salsa Chihuahua", "Alimentos", new BigDecimal("11.25")),
              new Producto(5L, "Pan de Morido gde", "Alimentos", new BigDecimal("113.13")),
              new Producto(10L, "Celular Juawei", "Electronica", new BigDecimal("7898.55")),
              new Producto(20L, "Laptop Cell", "Electronica", new BigDecimal("11999.99")),
              new Producto(30L, "Audifonos Noisy", "Electronica", new BigDecimal("443.22")),
              new Producto(40L, "Bateria Portatil", "Electronica", new BigDecimal("230.30")),
              new Producto(50L, "Mouse Gamer Pro", "ELectronica", new BigDecimal("558.18")),
              new Producto(100L, "Tostadora Coster", "Electrodomesticos", new BigDecimal("777.77")),
              new Producto(
                  200L, "Licuadora Master3000", "Electrodomesticos", new BigDecimal("850.5")),
              new Producto(
                  300L, "Sandwichera Guirpul", "Electrodomesticos", new BigDecimal("657.72")),
              new Producto(
                  400L, "Microondas Cooler", "Electrodomesticos", new BigDecimal("1090.45")),
              new Producto(
                  500L, "Refrigerador Hieloco", "Electrodomesticos", new BigDecimal("3700.36")));
    } catch (Exception e) {
      productos = new ArrayList<>();
    }
  }

  public Producto obtenerProducto(int codigoBarras) {
    try {
      for (Producto producto : RepositorioProducto.productos) {
        if (producto.getCodigoBarras() == codigoBarras) {
          return (Producto) producto.clone();
        }
      }
    } catch (CloneNotSupportedException e) {
      return null;
    }

    return null;
  }

  public Collection<Producto> findByDepartamento(String departamento) {
    return productos
        .stream()
        .filter(p -> p.getDepartamento().equals(departamento))
        .collect(Collectors.toList());
  }

  public String mostrarDepartamento(Collection<Producto> departamento) {
    String s = "";

    for (Producto producto : departamento) {
      s += producto.toString();
    }

    return s;
  }

  public String mostrarCatalogo() {
    String s = "";

    s = mostrarDepartamento(findByDepartamento("Alimentos"));
    s += "-----------------------------------\n";
    s += mostrarDepartamento(findByDepartamento("Electrodomesticos"));
    s += "-----------------------------------\n";
    s += mostrarDepartamento(findByDepartamento("Electronica"));
    return s;
  }

  @Override
  public Collection<Producto> findAll() {
    return productos;
  }

  @Override
  public Producto find(Long primaryKey) {
    return productos
        .stream()
        .filter(p -> primaryKey == p.getCodigoBarras())
        .findFirst()
        .orElse(null);
  }

  public Collection<Producto> getAlimentos() {
    return findByDepartamento("Alimentos");
  }

  public Collection<Producto> getELectronica() {
    return findByDepartamento("Electronica");
  }

  public Collection<Producto> getElectrodomesticos() {
    return findByDepartamento("Electrodomesticos");
  }
}
