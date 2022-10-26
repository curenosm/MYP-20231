package com.bettercodesaul.modelos;

import static com.bettercodesaul.util.Constantes.generarID;

import com.bettercodesaul.interfaces.Observador;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que simula a un usuario. Implementa las interfaces Serializable y Observador.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
@Getter
@Setter
public class Usuario implements Serializable, Observador {

  private Long id;
  private String username;
  private String password;
  private String nombre;
  private String telefono;
  private String direccion;
  private Long cuentaBancaria;
  private String codigoPais;
  private Collection<Oferta> ofertasDisponibles;
  private BigDecimal saldoDisponible;

  /**
   * Metodo constructor con parametros de la clase
   *
   * @param username nombre de usuario (nickname)
   * @param password contrasenia asociada a la cuenta del usuario
   * @param nombre nombre real del usuario
   * @param telefono telefono del usuario
   * @param direccion direccion del usuario
   * @param cuentaBancaria cuentaBancaria asociada al usuario
   * @param codigoPais codigo que identifiva el pais del cual proviene el usuario
   * @throws InterruptedException
   */
  public Usuario(
      String username,
      String password,
      String nombre,
      String telefono,
      String direccion,
      Long cuentaBancaria,
      String codigoPais,
      BigDecimal saldoInicial)
      throws InterruptedException {

    this.id = generarID();
    this.username = username;
    this.password = password;
    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion;
    this.cuentaBancaria = cuentaBancaria;
    this.codigoPais = codigoPais;
    this.saldoDisponible = saldoInicial;
    this.ofertasDisponibles = new ArrayList<>();
  }

  @Override
  public void actualizar(Object oferta) {
    if (oferta instanceof Oferta) {
      this.ofertasDisponibles.add((Oferta) oferta);
    }
  }

  /**
   * Metodo de representacion en cadena
   *
   * @return String
   */
  @Override
  public String toString() {
    return "Usuario [id="
        + id
        + ", username="
        + username
        + ", password="
        + password
        + ", nombre="
        + nombre
        + ", telefono="
        + telefono
        + ", direccion="
        + direccion
        + ", cuentaBancaria="
        + cuentaBancaria
        + ", codigoPais="
        + codigoPais
        + "]";
  }
}
