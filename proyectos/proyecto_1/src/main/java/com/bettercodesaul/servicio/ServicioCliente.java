package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;

public interface ServicioCliente {
  String obtenerCatalogo();

  Producto comprarProducto(Long codigo);

  Usuario login(String username, String password);
}
