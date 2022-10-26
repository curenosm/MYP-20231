package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import java.util.Collection;

public interface ServicioRemoto {

  Usuario login(String username, String password) throws Exception;

  Collection<Producto> cargarCatalogo() throws Exception;

  Producto compraSegura(Usuario usuario, Long cuentaBancaria, Long codigoBarras) throws Exception;
}
