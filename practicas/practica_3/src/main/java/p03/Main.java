package main.java.p03;

import static main.java.p03.util.Constantes.*;
import static main.java.p03.util.Printer.*;

import java.util.Scanner;
import main.java.p03.pizzas.Pizza;
import main.java.p03.pizzas.PizzaAdapter;
import main.java.p03.pizzas.PizzaAmericana;
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

            // TODO: Mostrar menu para eligir el pan

            int tipoPan = 1;
            pedido = new BaguetteBlanco();

            bold(property("menu.baguette.pan"));

            if (tipoPan == 1) {
              pedido = new BaguetteAvena();
            } else if (tipoPan == 2) {
              pedido = new BaguetteTostado();
            } else if (tipoPan == 3) {
              pedido = new BaguetteBlanco();
            }

            // TODO: Mientras el pedido no esté listo, sigue agregandole ingredientes
            // para verificar si puedes seguir poniendo de un ingrediente manda a llamar
            // pedido.puedoAgregarIngrediente(INGREDIENTES_BAGUETTE.get(i))
            bold(property("menu.baguette.ingredientes"));

            pedido = new Cebolla(pedido);
            pedido = new Cebolla(pedido);
            pedido = new Cebolla(pedido);
            pedido = new Lechuga(pedido);
            pedido = new Jitomate(pedido);
            pedido = new Jamon(pedido);

            break;
          case 2:
            warning("Eligio la preparación de una pizza");

            Pizza pizza = new PizzaAmericana();
            pedido = new PizzaAdapter(pizza);

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
