package com.bettercodesaul.util;

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
              // run background code here
              do {
                try {
                  Thread.sleep(20 * 1000);
                  Oferta oferta = generarOfertaAleatoria();
                  repositorioOfertas.save(oferta);

                  System.out.println(
                      "Oferta generada para los usuarios con codigo de pais "
                          + oferta.getCodigoPaisOferta());
                } catch (InterruptedException e) {
                  System.out.println("1st");
                } catch (Exception e) {
                  e.printStackTrace();
                  System.out.println("2nd");
                }

              } while (true);
            })
        .start();
  }

  public Oferta generarOfertaAleatoria() throws Exception {
    Random random = new Random();

    int indexPaisYDepartamento = random.nextInt(0, departamentos.size());
    ArrayList<Producto> productos =
        (ArrayList<Producto>)
            repositorioProducto.findByDepartamento(departamentos.get(indexPaisYDepartamento));

    int randomIndex = random.nextInt(0, productos.size());
    Producto prod = productos.get(randomIndex);

    Oferta oferta = new Oferta();
    oferta.setCodigoPaisOferta(codigosPaises.get(indexPaisYDepartamento));
    oferta.setPorcentajeDescuento(new BigDecimal("0.3"));
    oferta.setProducto(prod);
    oferta.setValidaHasta(Date.from(Instant.now().plus(Duration.ofDays(30L))));

    return oferta;
  }
}
