package com.bettercodesaul.modelos;

import static com.bettercodesaul.util.Constantes.generarID;

import com.bettercodesaul.interfaces.Observador;
import java.io.Serializable;
import java.util.Collection;

/**
 * Clase que simula a un usuario. Implementa las interfaces Serializable y Observador.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
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

  /**
   * Metodo constructor con parametros de la clase
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
      String codigoPais)
      throws InterruptedException {

    this.id = generarID();
    this.username = username;
    this.password = password;
    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion;
    this.cuentaBancaria = cuentaBancaria;
    this.codigoPais = codigoPais;
  }

  /**
   * Metodo para obtener el valor del atributo id
   * @return Long
   */
  public Long getId() {
    return id;
  }

  /**
   * Metodo para modificar el valor del atributo id
   * @param id Long que sera el nuevo valor del atributo
   */
  public void setId(Long id) {
    this.id = id;
  }

   /**
   * Metodo para obtener el valor del atributo username
   * @return String
   */
  public String getUsername() {
    return username;
  }

  /**
   * Metodo para modificar el valor del atributo username
   * @param username String que sera el nuevo valor del atributo
   */
  public void setUsername(String username) {
    this.username = username;
  }

   /**
   * Metodo para obtener el valor del atributo password
   * @return String
   */
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

   /**
   * Metodo para obtener el valor del atributo nombre
   * @return String
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Metodo para modificar el valor del atributo nombre
   * @param nombre String que sera el nuevo valor del atributo
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

   /**
   * Metodo para obtener el valor del atributo telefono
   * @return String
   */
  public String getTelefono() {
    return telefono;
  }

  /**
   * Metodo para modificar el valor del atributo telefono
   * @param telefono String que sera el nuevo valor del atributo
   */
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

   /**
   * Metodo para obtener el valor del atributo direccion
   * @return String
   */
  public String getDireccion() {
    return direccion;
  }

  /**
   * Metodo para modificar el valor del atributo direccion
   * @param direccion String que sera el nuevo valor del atributo
   */
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

   /**
   * Metodo para obtener el valor del atributo cuentaBancaria
   * @return Long
   */
  public Long getCuentaBancaria() {
    return cuentaBancaria;
  }

  /**
   * Metodo para modificar el valor del atributo cuentaBancaria
   * @param cuentaBancaria Long que sera el nuevo valor del atributo
   */
  public void setCuentaBancaria(Long cuentaBancaria) {
    this.cuentaBancaria = cuentaBancaria;
  }

   /**
   * Metodo para obtener el valor del atributo codigoPais
   * @return String
   */
  public String getCodigoPais() {
    return codigoPais;
  }

  /**
   * Metodo para modificar el valor del atributo codigoPais
   * @param codigoPais String que sera el nuevo valor del atributo
   */
  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

 /**
   * Metodo para obtener el valor del atributo ofertasDisponibles
   * @return Collection<Oferta>
   */
  public Collection<Oferta> getOfertasDisponibles() {
    return ofertasDisponibles;
  }

   /**
    * Metodo para modificar el valor del atributo ofertasDisponibles
    * @param ofertasDisponibles Collection<Oferta> que sera el nuevo valor del atributo
    */
  public void setOfertasDisponibles(Collection<Oferta> ofertasDisponibles) {
    this.ofertasDisponibles = ofertasDisponibles;
  }

  @Override
  public void actualizar(Object oferta) {
    if (oferta instanceof Oferta) {
      this.ofertasDisponibles.add((Oferta) oferta);
    }
  }

   /**
   * Metodo de representacion en cadena
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
