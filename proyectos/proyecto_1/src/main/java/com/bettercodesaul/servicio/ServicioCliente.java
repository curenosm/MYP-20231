package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import java.util.Collection;

/**
 * Interfaz que simula un servicio para el cliente.
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface ServicioCliente {
  String obtenerCatalogo() throws Exception;

  boolean comprarProductoSeguro(Usuario usuario, Long cuentaBancaria, Collection<Producto> carrito)
      throws Exception;

  Usuario login(String username, String password) throws Exception;
}
