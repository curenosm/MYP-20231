package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import java.rmi.Remote;
import java.util.Collection;

/**
 * Interfaz que simula un servicio de forma remota. Extiende de la clase Remote
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface ServicioRemoto extends Remote {

  Usuario login(String username, String password) throws Exception;

  Collection<Producto> cargarCatalogo() throws Exception;

  boolean compraSegura(Usuario usuario, Long cuentaBancaria, Collection<Producto> carrito)
      throws Exception;

  Producto compraProducto(Long codigoBarras);
}
