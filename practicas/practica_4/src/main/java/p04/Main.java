package main.java.p04;

import static main.java.p04.util.Constantes.*;
import static main.java.p04.util.Printer.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import main.java.p04.modelos.Builder;
import main.java.p04.modelos.Componente;
import main.java.p04.modelos.Nave;
import main.java.p04.modelos.armas.*;
import main.java.p04.modelos.blindajes.*;
import main.java.p04.modelos.cabinas.*;
import main.java.p04.modelos.sistemas.*;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  // Lista con las naves del catalogo que estan hechas por default
  public static List<Nave> catalogoNaves =
      List.of(
          new Nave(
              new ArmaLaserSimple(),
              new BlindajeReforzado(),
              new Cabina1Piloto(),
              new ViajeInterplanetario()),
          new Nave(
              new ArmaMisilesDePlasma(),
              new BlindajeReforzado(),
              new CabinaTripulacionPequena(),
              new ViajeIntercontinental()),
          new Nave(
              new ArmaLaserDestructorDePlanetas(),
              new BlindajeFortaleza(),
              new CabinaEjercito(),
              new ViajeIntergalactico()));

  public static void main(String[] args) {

    info(property("project.info"));

    int opcionElegida = 0;
    info("Bienvenido al sistema de ventas de naves");
    BigDecimal presupuesto = leerPresupuesto(scanner);
    success(presupuesto.toString());
    do {

      // elegirNave();
      Nave nave = elegirNave();

      // warning(nave.toString());
      BigDecimal costo = nave.obtenerCosto();

      if ((costo.compareTo(presupuesto) > 0)) {
        error(property("mensajes.costo.excedido"));

        do {
          try {
            opcionElegida = scanner.nextInt();

            if (opcionElegida == 2) {
              mostrarCatalogo(presupuesto);
            } else if (opcionElegida != 1) {
              error(property("error.opcion.incorrecta"));
              opcionElegida = 0;
            }
          } catch (Exception e) {
            error(property("error.opcion.incorrecta"));
            scanner = new Scanner(System.in);
            opcionElegida = 0;
          }
        } while (opcionElegida == 0);

      } else {
        success(property("mensajes.final") + nave.obtenerCosto());
        warning("CARACTERISTICAS:\n\n" + repeat('=', 50) + "\n" + nave.toString());
        System.exit(0);
      }

    } while (true);
  }

  /**
   * Metodo para leer el presupuesto del usuario
   *
   * @param scanner Instancia de la clase Scanner
   * @return BigDecimal
   */
  public static BigDecimal leerPresupuesto(Scanner scanner) {

    info(property("mensajes.presupuesto"));
    BigDecimal res = null;

    try {
      String input = scanner.nextLine();
      res = new BigDecimal(input);
    } catch (Exception e) {
      error(property("error.opcion.incorrecta"));
      scanner = new Scanner(System.in);
      return leerPresupuesto(scanner);
    }

    return res;
  }

  /**
   * Metodo para que el usuario arme su nave
   *
   * @return Nave
   */
  public static Nave elegirNave() {

    Builder builder = new Builder();

    builder = builder.arma(elegirArma());
    builder = builder.blindaje(elegirBlindaje());
    builder = builder.cabina(elegirCabina());
    builder = builder.sistemaDePropulsion(elegirSistema());

    return builder.build();
  }

  /**
   * Metodo para que el usuario elija el Arma que desea para su nave
   *
   * @return Arma
   */
  public static Componente elegirArma() {
    int resp = 0;

    do {
      bold(property("menu.armas"));
      try {
        resp = scanner.nextInt();

        switch (resp) {
          case 1:
            return new ArmaLaserSimple();
          case 2:
            return new ArmaMisilesDePlasma();
          case 3:
            return new ArmaLaserDestructorDePlanetas();
          default:
            error(property("error.opcion.incorrecta"));
            scanner = new Scanner(System.in);
            break;
        }

      } catch (Exception e) {
        error(property("error.opcion.incorrecta"));
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  /**
   * Metodo para que el usuario elija el blindaje que desea para su nave
   *
   * @return Blindaje
   */
  public static Componente elegirBlindaje() {
    int resp = 0;

    do {
      bold(property("menu.blindajes"));
      try {
        resp = scanner.nextInt();

        switch (resp) {
          case 1:
            return new BlindajeSimple();
          case 2:
            return new BlindajeReforzado();
          case 3:
            return new BlindajeFortaleza();
          default:
            error(property("error.opcion.incorrecta"));
            scanner = new Scanner(System.in);
            break;
        }

      } catch (Exception e) {
        error(property("error.opcion.incorrecta"));
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  /**
   * Metodo para que el usuario elija la cabina que desea para su nave
   *
   * @return Cabina
   */
  public static Componente elegirCabina() {
    int resp = 0;

    do {
      bold(property("menu.cabinas"));

      try {
        resp = scanner.nextInt();

        return switch (resp) {
          case 1 -> new Cabina1Piloto();
          case 2 -> new CabinaTripulacionPequena();
          case 3 -> new CabinaEjercito();
          default -> throw new Exception();
        };

      } catch (Exception e) {
        error(property("error.opcion.incorrecta"));
        scanner = new Scanner(System.in);
      }

    } while (true);
  }

  /**
   * Metodo para elegir el Sistema de Propulsion que el usuario quiere para su nave
   *
   * @return SistemaDePropulsion
   */
  public static Componente elegirSistema() {
    int resp = 0;

    do {
      bold(property("menu.sistemas"));
      try {
        resp = scanner.nextInt();

        switch (resp) {
          case 1:
            return new ViajeIntercontinental();
          case 2:
            return new ViajeInterplanetario();
          case 3:
            return new ViajeIntergalactico();
          default:
            error(property("error.opcion.incorrecta"));
            scanner = new Scanner(System.in);
            break;
        }

      } catch (Exception e) {
        error(property("error.opcion.incorrecta"));
        scanner = new Scanner(System.in);
      }
    } while (true);
  }

  /**
   * Metodo para mostrar en pantalla el catalogo de naves hechas por default y permitir al usuario
   * comprar una
   */
  public static void mostrarCatalogo(BigDecimal presupuesto) {
    int contador = 0, resp = 0;

    // Este codigo es para conocer cuantas naves resultan impagables para el usuario
    for (Nave nave : catalogoNaves) {
      if (nave.obtenerCosto().compareTo(presupuesto) > 0) {
        contador++;
      }
    }

    if (contador == catalogoNaves.size()) {
      error(property("error.pesimo.presupuesto"));
      System.exit(0);
    } else {
      do {
        bold(property("menu.catalogo"));

        try {
          resp = scanner.nextInt();
          if ((resp >= 1) && (resp <= catalogoNaves.size())) {
            Nave navesin = catalogoNaves.get((resp - 1));
            if ((navesin.obtenerCosto().compareTo(presupuesto) > 0)) {
              error(property("error.presupuesto"));
              resp = 0;
              scanner = new Scanner(System.in);
            } else {
              success(property("mensajes.final") + navesin.obtenerCosto());
              warning("Caracteristicas:\n" + navesin.toString());
              System.exit(0);
            }
          } else {
            error(property("error.opcion.incorrecta"));
            resp = 0;
            scanner = new Scanner(System.in);
          }
        } catch (Exception e) {
          error(property("error.opcion.incorrecta"));
          resp = 0;
          scanner = new Scanner(System.in);
        }

      } while (true);
    }
  }
}
