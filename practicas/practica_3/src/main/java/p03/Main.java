package main.java.p03;

import static main.java.p03.util.Constantes.*;
import static main.java.p03.util.Printer.*;

import java.util.Scanner;
import main.java.p03.util.Constantes;
import main.java.p03.waysub.*;

public class Main {

  public static void main(String[] args) {
    version(property("version"));

    Scanner scanner = new Scanner(System.in);

    int opcionElegida = -1;

    while (opcionElegida != 0) {

      try {
        bold(property("menu.acciones"));

        opcionElegida = scanner.nextInt();

        Baguette pedido = null;

        switch (opcionElegida) {
          case 0:
            System.exit(0);
            break;
          case 1:
            warning("Eligio la preparación de un baguette ");

            boolean bobo = true;

            int tipoPan = 0;
            pedido = new BaguetteBlanco();
            do {
              try {
                bold(property("menu.baguette.pan"));
                tipoPan = scanner.nextInt();
                if (tipoPan == 1) {
                  pedido = new BaguetteAvena();
                  bobo = false;
                } else if (tipoPan == 2) {
                  pedido = new BaguetteTostado();
                  bobo = false;
                } else if (tipoPan == 3) {
                  pedido = new BaguetteBlanco();
                  bobo = false;
                } else {
                  error(property("error.opcion.incorrecta"));
                }

              } catch (Exception e) {
                error(property("error.opcion.incorrecta"));
                scanner.nextLine();
              }
            } while (bobo == true);

            bobo = true;
            int resp = 0;
            scanner.nextLine();

            do {

              bold(property("menu.agregar.ingrediente"));
              try {
                resp = scanner.nextInt();
                if (resp == 1) {
                  pedido = Constantes.agregarIngredientes(pedido);
                } else if (resp == 2) {
                  bold("Terminando pedido");
                  bobo = false;
                } else {
                  error(property("error.opcion.incorrecta"));
                }
              } catch (Exception e) {
                scanner.nextLine();
                error(property("error.opcion.incorrecta"));
              }
            } while (bobo == true);

            break;
          case 2:
            warning("Eligio la preparación de una pizza");

            pedido = Constantes.pedirPizza();

            break;
          default:
            error(property("error.opcion.incorrecta"));
            break;
        }

        warning("Su pedido está listo:");
        success(pedido.getDescripcion());
        success("-----------------------");
        success("Total: \t\t$" + redondear(pedido.getPrecio()) + "");

      } catch (NumberFormatException e) {
        scanner.next();
      } catch (Exception e) {
        scanner = new Scanner(System.in);
      }
    }
  }
}
