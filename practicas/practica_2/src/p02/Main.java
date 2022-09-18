package p02;

import p02.modelos.*;
import p02.util.Constantes;

import java.util.Scanner;
import static p02.util.Printer.*;
import static p02.util.Constantes.*;

public class Main {

    public static void main(String[] args) {

        println("");
        printProjectInformation();
        println("");


        Robot robot = new Robot();
        Scanner scanner = new Scanner(System.in);

        println(robot.getCarta().toString());

        int opcionElegida = -1;

        while(opcionElegida != 0){

            try {
                bold(properties.getProperty("menu.acciones"));

                opcionElegida = scanner.nextInt();
                
                switch(opcionElegida){
                    case 0:
                        System.exit(0);
                    break;
                    case 1: 
                    robot.getEstadoActual().encender();
                    break;
                    case 2: 
                    robot.getEstadoActual().caminar();
                    break;
                    case 3: 
                    robot.getEstadoActual().atender();
                    break;
                    case 4: 
                    robot.getEstadoActual().cocinar();
                    break;
                    case 5: 
                    robot.getEstadoActual().entregarComida();
                    break;
                    case 6: 
                    robot.getEstadoActual().suspender();
                    break;
                    case 7: 
                        robot.getEstadoActual().apagar();
                    break;
                    default:
                        error(properties.getProperty("error.opcion.incorrecta"));
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
