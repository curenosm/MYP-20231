package com.bettercodesaul;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicioRemotoCargarCatalogo extends UnicastRemoteObject implements ServicioRemoto {

  protected ServicioRemotoCargarCatalogo() throws RemoteException {
    super();
  }

  @Override
  public String sayHello() throws RemoteException {
    return "Server says hello";
  }
}
