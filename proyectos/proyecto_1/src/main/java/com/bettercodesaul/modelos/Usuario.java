package com.bettercodesaul.modelos;

import java.io.Serializable;

public class Usuario implements Serializable {

  private Long id;
  private String username;
  private String password;
  private String nombre;
  private String telefono;
  private String direccion;
  private Long cuentaBancaria;
  private String codigoPais;

  public Usuario(
      String username,
      String password,
      String nombre,
      String telefono,
      String direccion,
      Long cuentaBancaria,
      String codigoPais)
      throws InterruptedException {

    Thread.sleep(100);
    this.id = System.currentTimeMillis();
    this.username = username;
    this.password = password;
    this.nombre = nombre;
    this.telefono = telefono;
    this.direccion = direccion;
    this.cuentaBancaria = cuentaBancaria;
    this.codigoPais = codigoPais;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public Long getCuentaBancaria() {
    return cuentaBancaria;
  }

  public void setCuentaBancaria(Long cuentaBancaria) {
    this.cuentaBancaria = cuentaBancaria;
  }

  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

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
