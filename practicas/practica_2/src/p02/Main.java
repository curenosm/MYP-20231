package p02;

import p02.modelos.*;
import java.util.Scanner;
import static p02.util.Printer.*;

public class Main {

    
    public static void main(String[] args) {
        Robot robot = new Robot();
        Scanner esc = new Scanner(System.in);
        int elec=0;
        while(true){
            try {
                System.out.println("Que desea hacer?");
                System.out.println("1.Encender");
                System.out.println("2.Suspender");
                System.out.println("3.Caminar");
                System.out.println("4.Atender");
                System.out.println("5.Cocinar");
                System.out.println("6.Entregar comida");
                System.out.println("7.Apagar");
                elec= esc.nextInt();
               
               
                switch(elec){
                    case 1: 
                    robot.getEstadoActual().encender();
                    break;

                    case 2: 
                    robot.getEstadoActual().suspender();
                    break;

                    case 3: 
                    robot.getEstadoActual().caminar();
                    break;

                    case 4: 
                    robot.getEstadoActual().atender();
                    break;

                    case 5: 
                    robot.getEstadoActual().cocinar();
                    break;

                    case 6: 
                    robot.getEstadoActual().entregarComida();
                    break;

                    case 7: 
                    robot.getEstadoActual().apagar();
                    break;

                    default:
                    System.out.println("Elige una opcion correcta");
                    break;
                }
           
               

                
            } catch (Exception e) {
                esc.next();
            }

        
    }
    
        
       /*  println("\n\n\n");
        
        printProjectInformation();
        
        println("\n\n\n");*/
    }

}
