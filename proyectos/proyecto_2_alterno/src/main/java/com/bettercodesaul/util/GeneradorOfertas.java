package com.bettercodesaul.util;

import static com.bettercodesaul.util.Constantes.*;
import static com.bettercodesaul.util.Printer.*;

import com.bettercodesaul.modelos.Oferta;
import com.bettercodesaul.modelos.Producto;
import com.bettercodesaul.repositorio.RepositorioOferta;
import com.bettercodesaul.repositorio.RepositorioProducto;
import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Clase para generar ofertas a los productos de los usuarios
 *
 * @author Alcantara Estrada Kevin Isaac
 * @author Curenio Sanchez Misael
 * @author Hernandez Paramo Elizabeth
 */
public class GeneradorOfertas {

  private RepositorioOferta repositorioOfertas;
  private RepositorioProducto repositorioProducto;
  private List<String> departamentos = List.of("Alimentos", "Electrodomesticos", "Electronica");

  private List<String> codigosPaises = List.of("es_MX", "es_ES", "en_US");

  public GeneradorOfertas(
      RepositorioOferta repositorioOfertas, RepositorioProducto repositorioProducto) {
    this.repositorioOfertas = repositorioOfertas;
    this.repositorioProducto = repositorioProducto;
  }

  /** Metodo que genera ofertas aleatorias cada determinado tiempo */
  public void simularGeneradorOfertas() {
    new Thread(
            () -> {
              do {
                try {
                  Thread.sleep(TIEMPO_ENTRE_OFERTAS);
                  Oferta oferta = generarOfertaAleatoria();
                  repositorioOfertas.save(oferta);

                  println(
                      "\nOferta generada para los usuarios con codigo de pais "
                          + oferta.getCodigoPaisOferta());
                } catch (InterruptedException e) {
                  e.printStackTrace();
                  error("Interrupted exception");
                } catch (Exception e) {
                  e.printStackTrace();
                  error("Exception");
                }

              } while (true);
            })
        .start();
  }

  /**
   * Metodo que genera de manera aleatoria una oferta
   *
   * @return Oferta
   * @throws Exception
   */
  public Oferta generarOfertaAleatoria() throws Exception {
    Random random = new Random();

    int indexPaisYDepartamento = random.nextInt(departamentos.size());
    ArrayList<Producto> productos =
        (ArrayList<Producto>)
            repositorioProducto.findByDepartamento(departamentos.get(indexPaisYDepartamento));

    int randomIndex = random.nextInt(productos.size());
    Producto prod = productos.get(randomIndex);

    Oferta oferta = new Oferta();
    oferta.setCodigoPaisOferta(codigosPaises.get(indexPaisYDepartamento));
    oferta.setPorcentajeDescuento(new BigDecimal(DESCUENTO_PREDETERMINADO));
    oferta.setProducto(prod);
    oferta.setValidaHasta(Date.from(Instant.now().plus(Duration.ofDays(30L))));

    return oferta;
  }
}
