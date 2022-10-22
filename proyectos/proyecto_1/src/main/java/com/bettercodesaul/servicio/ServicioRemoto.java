package com.bettercodesaul.servicio;

import com.bettercodesaul.modelos.Usuario;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicioRemoto extends Remote {

  String sayHello() throws RemoteException;

  Usuario login(String username, String password) throws RemoteException, InterruptedException;
}
