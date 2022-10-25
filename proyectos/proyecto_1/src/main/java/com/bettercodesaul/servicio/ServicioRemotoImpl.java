package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.repositorio.RepositorioOferta;
import com.bettercodesaul.repositorio.RepositorioProducto;
import com.bettercodesaul.repositorio.RepositorioUsuario;
import java.rmi.RemoteException;
import java.util.Collection;

public class ServicioRemotoImpl implements ServicioRemoto {

  private RepositorioUsuario repositorioUsuarios;
  private RepositorioProducto repositorioProductos;
  private RepositorioOferta repositorioOfertas;

  public ServicioRemotoImpl() throws RemoteException {
    super();
    this.repositorioUsuarios = RepositorioUsuario.getInstance();
    this.repositorioProductos = RepositorioProducto.getInstance();
    this.repositorioOfertas = RepositorioOferta.getInstance();
  }

  @Override
  public Usuario login(String username, String password)
      throws RemoteException, InterruptedException {

    Usuario usuario = repositorioUsuarios.findByUsername(username);

    if (usuario != null) {
      if (usuario.getPassword().equals(password)) {
        return usuario;
      }

      usuario = null;
    }

    return usuario;
  }

  @Override
  public Collection<Producto> cargarCatalogo() throws RemoteException, InterruptedException {
    return repositorioProductos.findAll();
  }

  @Override
  public Producto compraSegura(Long codigoBarras) throws RemoteException, InterruptedException {
    return this.repositorioProductos.find(codigoBarras);
  }
}
