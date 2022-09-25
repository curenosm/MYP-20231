package main.java.p03;

import static main.java.p03.util.Constantes.*;
import static main.java.p03.util.Printer.*;

import java.util.Scanner;
import main.java.p03.modelos.*;

public class Main {

  public static void main(String[] args) {
    version(property("version"));

    Scanner scanner = new Scanner(System.in);

    int opcionElegida = -1;

    while (opcionElegida != 0) {

      try {
        bold(property("menu.acciones"));

        opcionElegida = scanner.nextInt();

        switch (opcionElegida) {
          case 0:
            System.exit(0);
            break;
          case 1:
            success("Eligio " + opcionElegida);

            // TODO: Mostrar menu para eligir el pan

            int tipoPan = 1;
            Baguette baguette = new BaguetteBlanco();

            bold(property("menu.baguette.pan"));

            if (tipoPan == 1) {
              baguette = new BaguetteAvena();
            } else if (tipoPan == 2) {
              baguette = new BaguetteTostado();
            } else if (tipoPan == 3) {
              baguette = new BaguetteBlanco();
            }

            // TODO: Mientras el pedido no esté listo, sigue agregandole ingredientes
            bold(property("menu.baguette.pan"));

            baguette = new Cebolla(baguette);
            baguette = new Lechuga(baguette);
            baguette = new Jitomate(baguette);
            baguette = new Jamon(baguette);

            warning(baguette.getDescripcion());
            success(baguette.getPrecio() + "");

            break;
          case 2:
            warning("Eligio " + opcionElegida);
            break;
          default:
            error(property("error.opcion.incorrecta"));
            break;
        }

      } catch (NumberFormatException e) {
        scanner.next();
      } catch (Exception e) {
        scanner = new Scanner(System.in);
      }
    }
  }
}
