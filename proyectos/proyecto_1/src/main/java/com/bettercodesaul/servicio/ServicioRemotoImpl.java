package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Usuario;
import com.bettercodesaul.repositorio.UsuarioRepositorio;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicioRemotoImpl extends UnicastRemoteObject implements ServicioRemoto {

  private UsuarioRepositorio usuarioRepositorio;

  public ServicioRemotoImpl() throws RemoteException {
    super();
    this.usuarioRepositorio = UsuarioRepositorio.getInstance();
  }

  @Override
  public String sayHello() throws RemoteException {
    return "Server says hello";
  }

  @Override
  public Usuario login(String username, String password)
      throws RemoteException, InterruptedException {

    Usuario usuario = usuarioRepositorio.find(username);

    if (usuario != null) {
      if (usuario.getPassword().equals(password)) {
        return usuario;
      }

      usuario = null;
    }

    return usuario;
  }
}
