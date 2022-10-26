package com.bettercodesaul.repositorio;

import com.bettercodesaul.interfaces.Sujeto;
import com.bettercodesaul.modelos.Oferta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Clase que simula un repositorio de ofertas. Implementa las interfaces Sujeto y Repositorio 
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class RepositorioOferta implements Repositorio<Oferta>, Sujeto {

  private static volatile RepositorioOferta uniqueInstance;
  private RepositorioUsuario repositorioUsuario;
  private List<Oferta> ofertas;

  /**
   * Metodo que devuelve una instancia de la clase tras realizar un par de verificaciones
   * @return RepositorioOfera
   */
  public static RepositorioOferta getInstance() {
    if (uniqueInstance == null) {
      synchronized (RepositorioUsuario.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new RepositorioOferta();
        }
      }
    }

    return uniqueInstance;
  }

  /**
   * Metodo constructor sin parametros de la clase
   */
  private RepositorioOferta() {
    ofertas = new ArrayList<>();
    repositorioUsuario = RepositorioUsuario.getInstance();
  }

  /**
   * Metodo que guarda una oferta y notifica de la misma
   * @param oferta Instancia de la clase Oferta
   */
  public void save(Oferta oferta) {
    ofertas.add(oferta);
    notificar(oferta);
  }

  /**
   * Metodo que sobreescribe el metodo find de la interfaz Repositorio
   * @param primaryKey Long
   * @return null
   */
  @Override
  public Oferta find(Long primaryKey) {
    return null;
  }

   /**
   * Metodo que sobreescribe el metodo findAll de la interfaz Repositorio
   * @param primaryKey Long
   * @return Collection<Oferta>
   */
  @Override
  public Collection<Oferta> findAll() {
    return ofertas;
  }

  /**
   * Metodo que notifica de las ofertas a los usuarios con el mismo codigo de pais que el que tiene la oferta
   * @param oferta Instancia de la clase Object
   */
  @Override
  public void notificar(Object oferta) {

    if (oferta instanceof Oferta) {
      Oferta res = (Oferta) oferta;

      repositorioUsuario
          .findAll()
          .stream()
          .filter(u -> u.getCodigoPais().equals(res.getCodigoPaisOferta()))
          .forEach(
              u -> {
                u.actualizar(oferta);
              });
      ;
    }
  }
}
