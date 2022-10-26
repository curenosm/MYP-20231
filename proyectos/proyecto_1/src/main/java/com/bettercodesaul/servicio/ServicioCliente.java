package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;

/**
 * Interfaz que simula un servicio al clinete.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface ServicioCliente {
  String obtenerCatalogo();

  Producto comprarProducto(Long codigo);

  Usuario login(String username, String password);
}
