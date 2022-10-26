package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Collection;

/**
 * Interfaz que simula un servicio de forma remota. Extiende de la clase Remote
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public interface ServicioRemoto extends Remote {

  Usuario login(String username, String password) throws RemoteException, InterruptedException;

  Collection<Producto> cargarCatalogo() throws RemoteException, InterruptedException;

  Producto compraSegura(Long codigoBarras) throws RemoteException, InterruptedException;
}
