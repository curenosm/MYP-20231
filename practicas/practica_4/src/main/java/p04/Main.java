package main.java.p04;

import static main.java.p04.util.Constantes.*;
import static main.java.p04.util.Printer.*;

import java.math.BigDecimal;
import java.util.Scanner;
import main.java.p04.modelos.Nave;

public class Main {

  public static void main(String[] args) {

    info(property("project.info"));

    Scanner scanner = new Scanner(System.in);

    int opcionElegida = 0;
    do {
      info("Bienvenido al sistema de ventas de naves");
      BigDecimal presupuesto = leerPresupuesto(scanner);
      success(presupuesto.toString());

      Nave nave = new Nave();

      info(property("mensajes.final"));
      error(property("mensajes.costo.excedido") + nave.obtenerCosto());

    } while (opcionElegida != 0);
  }

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
}
